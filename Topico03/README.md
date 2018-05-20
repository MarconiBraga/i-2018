# Projeto 3 - Implementação da lista de exercícios de XML

## Executando
Todos os exercícios se encontram neste mesmo projeto, separado por pacotes.
Para gerar os jars, utilize o comando

```
mvn clean install
```

Será gerado 5 jars (questão 3 possui dois jars).

Para executar qualquer um dos jars, segue instruções:

### Exercício Um
```
java -jar ".../exercicioUm.jar" "caminho-arquivo.csv"
```

### Exercício Dois
```
java -jar ".../exercicioDois.jar" "caminho-arquivo.xml"
```

### Exercício Três
```
java -jar ".../exercicioTres1.jar" 
java -jar ".../exercicioTres2.jar" "caminho-arquivo.xml" 
```

### Exercício Quatro
Argumentos:
* tipo-operacao - 1 para serialização ou 2 para deserialização
* nome-classe - Nome da classe que sera serializada/deserializada
* caminho-arquivo - Caminho do arquivo a ser lido/gravado
```
java -jar ".../exercicioQuatro.jar" "tipo-operacao" "nome-classe" "caminho-arquivo"
```

