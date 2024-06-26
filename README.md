# JSON SKU Sum Calculator

Este projeto é um aplicativo Java simples que lê arquivos JSON contendo detalhes do SKU de produtos armazenados na pasta `input` e calcula a soma total de todos os SKUs listados.

## Tecnologia Usada
Este projeto utiliza a linguagem de programação [Java](https://www.java.com/pt-BR/):

- **Versão**: 17
- **Gerenciador de Dependências**: [Maven](https://maven.apache.org/)

## Estrutura do Projeto

O projeto segue esta estrutura básica:

- `src/`: Contém o código fonte do programa.
- `input/`: Pasta onde os arquivos JSON de entrada devem ser colocados.
- `README.md`: Este arquivo.

## Dependências

Este projeto depende das seguintes bibliotecas:

- Jackson Databind: Para deserialização dos arquivos JSON.

Para adicionar as dependências com Maven, inclua o seguinte no seu `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.17.0</version>
    </dependency>
</dependencies>
```
## Entrada de dados
O json de entrada deve seguir o mesmo padrão do `data.json` que está na pasta `input`:
``` json
{
  "pedidos": {
    "pedido1": {
      "caixa1": [{ "sku": "pendrive", "qtd": 3 }],
      "caixa2": [
        { "sku": "mouse", "qtd": 2 },
        { "sku": "pendrive", "qtd": 2 }
      ]
    },
    "pedido2": {
      "caixa1": [
        { "sku": "pendrive", "qtd": 2 },
        { "sku": "mouse", "qtd": 2 },
        { "sku": "keyboard", "qtd": 2 }
      ]
    },
    "pedido3": {
      "caixa1": [{ "sku": "pendrive", "qtd": 2 }],
      "caixa2": [{ "sku": "mouse", "qtd": 2 }],
      "caixa3": [{ "sku": "monitor", "qtd": 1 }]
    }
  },
  "pesoPorSku": {
    "pendrive": 50,
    "mouse": 210,
    "keyboard": 730,
    "monitor": 3100
  }
}
```

## Autor

- **[Anthony Guerra](https://github.com/TonyGuerra122)**