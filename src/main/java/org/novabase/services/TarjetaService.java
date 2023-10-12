package org.novabase.services;

import jakarta.transaction.Transactional;
import org.novabase.controller.TarjetasController;
import org.novabase.entity.tarhab.Tarjeta;
import org.novabase.repository.ITarjetaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class TarjetaService {

    @Autowired
    private ITarjetaRepository iTarjetaRepository;

    public Tarjeta consultarTarjeta(Integer tarjetaId) {
        return iTarjetaRepository.findById(tarjetaId).get();
    }

    public List<String> consultarTarjetasAbonos(Integer pkEntCodigoEmp, Integer pkCampanCodigo) {
        return iTarjetaRepository.consultarTarjetasAbonos(pkEntCodigoEmp, pkCampanCodigo);
    }
}
