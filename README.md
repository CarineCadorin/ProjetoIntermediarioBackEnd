# ProjetoIntermediarioBackEnd
# Projeto Fatos Aleatórios sobre Gatos

## Descrição
Este projeto é um web service em Spring Boot que consome a API pública de fatos sobre gatos: https://catfact.ninja/fact

## Endpoints
- `GET /fatos/aleatorio` - Retorna um fato aleatório sobre gatos.
- `POST /fatos/tratar` - Envia um fato sobre gatos no corpo da requisição e o serviço retorna o fato tratado.
- `GET /sobre` - Informações sobre o estudante e o projeto.


## Exemplo de Uso
- **GET** `/fatos/aleatorio`
  ```json
  {
    "fact": "Os gatos podem fazer mais de 100 sons diferentes.",
    "length": 45
  }


##Exemplo de uso
- **POST**
```json
{
   "fato": "String"
}
```
- **Retorno**
```json 
{
    "fatoTratado": "Aqui está um fato curioso sobre gatos: String"
}
```

- **Erro ao Nao postar corpo no metodo post deve retornar:
```json
{
    "error": "Corpo da requisição inválido ou 'fato' ausente"
}
```