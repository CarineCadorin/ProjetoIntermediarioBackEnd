package com.ProjetoIntermediario.ProjetoIntermediario.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/sobre")
public class SobreController {

@GetMapping
    public Map<String, String> getSobre() {
        return Map.of(
                "Estudante", "Carine Ghisi Cadorin",
                "Projeto", "Projeto de fatos aleatórios sobre Gatos"
        );
    }
}
