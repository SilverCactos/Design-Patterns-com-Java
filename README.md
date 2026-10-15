# Lab - Padrões de Projeto em Java

## Desafio DIO - Explorando Padrões de Projetos na Prática com Java

Projeto baseado no [lab-padroes-projeto-java](https://github.com/digitalinnovationone/lab-padroes-projeto-java) da Digital Innovation One, reproduzido e evoluído com o padrão **Chain of Responsibility**.

## Padrões Implementados

### Padrões do Lab Original (Reproduzidos)
- **Singleton** — Garante que uma classe tenha apenas uma instância (Lazy, Eager, Lazy Holder)
- **Strategy** — Define uma família de algoritmos intercambiáveis em tempo de execução
- **Facade** — Simplifica a interface de subsistemas complexos

### Evolução: Chain of Responsibility
- **Chain of Responsibility** — Permite que múltiplos handlers processem uma requisição em cadeia, onde cada handler decide se processa ou passa adiante

#### Cenário: Sistema de Suporte ao Cliente
Um ticket de suporte passa por uma cadeia de atendimentos:
1. **Atendente** (Nível 1) — Resolve problemas simples (senha, dúvidas básicas)
2. **Supervisor** (Nível 2) — Resolve problemas de nível intermediário (reembolso, reclamações)
3. **Gerente** (Nível 3) — Resolve problemas complexos (processos jurídicos, cancelamento VIP)
4. **Diretor** (Nível 4) — Última instância, resolve qualquer problema restante

## Como Compilar e Executar

```bash
# Compilar
javac -d bin src/one/digitalinnovation/gof/**/*.java

# Executar cada padrão
java -cp bin one.digitalinnovation.gof.singleton.Test
java -cp bin one.digitalinnovation.gof.strategy.Test
java -cp bin one.digitalinnovation.gof.facade.Test
java -cp bin one.digitalinnovation.gof.chainofresponsibility.Test
```

## Estrutura do Projeto

```
src/one/digitalinnovation/gof/
├── singleton/
│   ├── SingletonLazy.java
│   ├── SingletonEager.java
│   ├── SingletonLazyHolder.java
│   └── Test.java
├── strategy/
│   ├── Comportamento.java
│   ├── ComportamentoNormal.java
│   ├── ComportamentoDefensivo.java
│   ├── ComportamentoAgressivo.java
│   ├── Robo.java
│   └── Test.java
├── facade/
│   ├── Facade.java
│   ├── subsistema1/
│   │   └── CrmService.java
│   ├── subsistema2/
│   │   └── CepApi.java
│   └── Test.java
└── chainofresponsibility/
    ├── NivelPrioridade.java
    ├── TicketSuporte.java
    ├── Handler.java
    ├── AtendenteHandler.java
    ├── SupervisorHandler.java
    ├── GerenteHandler.java
    ├── DiretorHandler.java
    └── Test.java
```

## Tecnologias
- Java 21
- Java Puro (sem frameworks)

## Autor
Desafio DIO - Padrões de Projeto
