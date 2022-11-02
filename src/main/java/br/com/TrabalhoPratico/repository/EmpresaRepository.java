package br.com.TrabalhoPratico.repository;

import models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("empresaRepository")
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
