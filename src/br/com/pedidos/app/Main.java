package br.com.pedidos.app;

import br.com.pedidos.model.Pedido;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(1, 250.0);

        pedido1.exibirStatus();

        pedido1.pagar();
        pedido1.enviar();
        pedido1.entregar();

        pedido1.exibirStatus();

        System.out.println("----------");

        Pedido pedido2 = new Pedido(2, 150.0);

        pedido2.exibirStatus();
        pedido2.cancelar();
        pedido2.enviar();

        pedido2.exibirStatus();


    }
}
