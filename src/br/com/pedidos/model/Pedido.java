package br.com.pedidos.model;

public class Pedido {
    private int numeroPedido;
    private double valorPedido;
    private StatusPedido status;

    public Pedido(int numeroPedido, double valorPedido) {
        this.numeroPedido = numeroPedido;
        this.valorPedido = valorPedido;
        this.status = StatusPedido.CRIADO;
    }

    public void pagar() {
        if (status != StatusPedido.CRIADO) {
            System.out.println("Pedido não pode ser pago, tente novamente mais tarde...");
            return;
        }
        status = StatusPedido.PAGO;
        System.out.println("Pedido pago com sucesso!");
    }

    public void enviar() {
        if (status != StatusPedido.PAGO) {
            System.out.println("Pedido não pode ser enviado, verifique se o motivo...");
            return;
        }
        status = StatusPedido.ENVIADO;
        System.out.println("Pedido enviado com sucesso!");
    }

    public void entregar() {
        if (status != StatusPedido.ENVIADO) {
            System.out.println("Pedido não pode ser entregue, tente novamente mais tarde...");
            return;
        }
        status = StatusPedido.ENTREGUE;
        System.out.println("Pedido entregue com sucesso!");
    }

    public void cancelar() {
        if (status != StatusPedido.CRIADO && status != StatusPedido.PAGO) {
            System.out.println("Pedido não pode ser cancelado, tente novamente mais tarde...");
            return;
        }
        status = StatusPedido.CANCELADO;
        System.out.println("Pedido cancelado com sucesso!");
    }

    public void exibirStatus() {
        System.out.println("Status do pedido: " + status);
    }
}
