package org.novabase.repository;

import org.novabase.entity.tarhab.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer> {
    @Procedure(name = "consultarTarjetasAbonos")
    public List<String> consultarTarjetasAbonos(
            @Param("P_PK_ENT_CODIGO_EMP") Integer pkEntCodigoEmp,
            @Param("P_PK_CAMPAN_CODIGO") Integer pkCampanCodigo
    );
}
