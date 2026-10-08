package br.senai.sagsa.SAGSA.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sagsa.SAGSA.models.PPC;
import br.senai.sagsa.SAGSA.services.PPCService;

@RestController
@RequestMapping("/ppcs")
public class PPCController {

    private final PPCService ppcService;

    public PPCController(PPCService ppcService) {
        this.ppcService = ppcService;
    }

    @PostMapping
    public PPC salvar(@RequestBody PPC ppc) {
        return ppcService.salvar(ppc);
    }
}