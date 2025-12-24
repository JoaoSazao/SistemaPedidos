# 📦 Sistema de Pedidos com Enum (Java)

## 📌 Descrição

Este projeto tem como objetivo consolidar conceitos fundamentais de **Programação Orientada a Objetos em Java**, com foco em **modelagem de domínio**, **controle de estados** e uso correto do tipo especial `enum`.

O sistema simula o fluxo de vida de um pedido, garantindo que **transições inválidas de estado sejam bloqueadas**, exatamente como ocorre em sistemas reais de backend.

## 🎯 Objetivos de Aprendizado

- Entender quando e por que utilizar `enum`
- Aplicar encapsulamento e regras de negócio
- Controlar estados de um objeto de forma segura
- Separar responsabilidades entre domínio e aplicação
- Criar um projeto organizado e apresentável no GitHub

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- `enum` como tipo seguro
- Encapsulamento
- Regras de negócio
- Controle de estados
- Métodos com validação de contexto
- Organização em pacotes

## 🗂️ Estrutura do Projeto

src/ <br>
└── br/ <br>
└── com/ <br>
└── pedidos/ <br>
├── model/ <br>
│ ├── Pedido.java <br>
│ └── StatusPedido.java <br>
└── app/ <br>
└── Main.java <br>

## 📊 Status do Pedido (`enum`)

O status do pedido é representado por um `enum`, garantindo que apenas valores válidos possam ser utilizados.

```java
public enum StatusPedido {
    CRIADO,
    PAGO,
    ENVIADO,
    ENTREGUE,
    CANCELADO
}
```
## 📦 Classe Pedido

A classe `Pedido` representa o domínio principal do sistema.
Ela controla seus próprios estados e define as regras de transição.

Atributos:
- Número do pedido
- Valor do pedido
- Status atual

Regras de Negócio:
- Todo pedido nasce com status CRIADO
- Um pedido só pode:
    - Ser pago se estiver CRIADO
    - Ser enviado se estiver PAGO
    - Ser entregue se estiver ENVIADO
    - Ser cancelado se estiver CRIADO ou PAGO

**Transições inválidas são bloqueadas automaticamente**

## ▶️ Classe Main

A classe Main simula o uso real do sistema, criando pedidos e executando ações válidas e inválidas 
para demonstrar o funcionamento das regras de negócio.

Exemplo de fluxo:
- Criar pedido
- Pagar
- Enviar
- Entregar
- Tentar operações inválidas

## 🧪 Exemplo de Saída no Console

```markdown
Status atual: CRIADO
Pedido pago com sucesso.
Pedido enviado com sucesso.
Pedido entregue com sucesso.
Status atual: ENTREGUE
----------
Pedido cancelado com sucesso.
Pedido não pode ser enviado.
```

## 🚀 Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git & GitHub

👨‍💻 Autor

João Sá | Estudante de Engenharia de Software
