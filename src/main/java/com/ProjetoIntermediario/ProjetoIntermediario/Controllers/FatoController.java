package com.ProjetoIntermediario.ProjetoIntermediario.Controllers;
import com.ProjetoIntermediario.ProjetoIntermediario.Services.FatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/fatos")
public class FatoController {

    @Autowired
    private FatoService fatoService;

    @GetMapping("/aleatorio")
    public Map<String, Object> getFatoAleatorio() {
        return fatoService.obterFatoAleatorio();
    }

    @PostMapping("/tratar")
    public ResponseEntity<Map<String, Object>> tratarFato(@RequestBody(required = false) Map<String, Object> dado) {
        if (dado == null || !dado.containsKey("fato")) {
            return ResponseEntity
                    .badRequest()
                    .body(Map.of("error", "Corpo da requisição inválido ou 'fato' ausente"));
        }
        String fato = (String) dado.get("fato");
        String fatoTratado = fatoService.tratarFato(fato);
        return ResponseEntity.ok(Map.of("fatoTratado", fatoTratado));
    }

}
