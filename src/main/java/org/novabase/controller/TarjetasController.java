package org.novabase.controller;

import org.novabase.entity.tarhab.Tarjeta;
import org.novabase.services.TarjetaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarjetas")
public class TarjetasController {

    private final Logger log = LoggerFactory.getLogger(TarjetasController.class);

    @Autowired
    private TarjetaService tarjetaService;

    @GetMapping("/obtenerTarjeta")
    public Tarjeta obtenerTarjeta(@RequestBody Tarjeta tarjeta) {
        return tarjetaService.consultarTarjeta(tarjeta.getPkTarjetCodigo());
    }

    @GetMapping("/consultarTarjetasAbonos")
    public List<String> consultarTarjetasAbonos() {
        return tarjetaService.consultarTarjetasAbonos(28803, 501);
    }
}
