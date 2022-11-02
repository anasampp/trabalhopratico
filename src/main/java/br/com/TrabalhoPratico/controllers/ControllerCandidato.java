package br.com.TrabalhoPratico.controllers;

import models.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidatos")
public class ControllerCandidato {
    @Autowired
    private CandidatoService candidatoService;

    @GetMapping("/{codigo}")
    public ResponseEntity<Candidato> getCandidato(@PathVariable("codigo") int codigo){
        if(codigo < 0)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        Candidato candidato = candidatoService.getCandidato(codigo);

        if(candidato == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(candidato, HttpStatus.OK);
    }
    @PostMapping("/novo")
    public ResponseEntity<Candidato> addCandidato(@NonNull @Validated @RequestBody Candidato candidato){
        candidatoService.saveCandidato(candidato);
        return new ResponseEntity<>(candidato, HttpStatus.OK);
    }
    @PutMapping("/update/{codigo}")
    public ResponseEntity<Candidato> editCandidato(@NonNull @Validated @RequestBody Candidato candidato, @PathVariable int codigo){
        Candidato candidatoSearch = candidatoService.getCandidato(codigo);

        if(candidatoSearch == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        candidato.setId(candidatoSearch.getId());
        candidatoService.saveCandidato(candidatoSearch);
        return new ResponseEntity<>(candidato, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{codigo}")
    public ResponseEntity<Candidato> deleteCandidato(@NonNull @Validated @PathVariable int codigo)
    {
        Candidato candidato = candidatoService.getCandidato(codigo);
        if(candidato == null)
        {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        candidatoService.removerCandidato(candidato);
        return new ResponseEntity<>(candidato, HttpStatus.OK);
    }
}
