package com.ProjetoIntermediario.ProjetoIntermediario.Services;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@Service
public class FatoService {

    private static final String CAT_FACT_URL = "https://catfact.ninja/fact";

    public Map<String, Object> obterFatoAleatorio() {
        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<Map> response = restTemplate.getForEntity(CAT_FACT_URL, Map.class);
            return response.getBody();
        } catch (Exception e) {
            return Map.of("erro", "Erro ao obter fato: " + e.getMessage());
        }
    }

    public String tratarFato(String fato) {
        return "Aqui está um fato curioso sobre gatos: " + fato;
    }
}
