public class StateAprobado implements PedidoState{
    @Override
    public PedidoState aprobarSolicitud() {
        throw new IllegalStateException("No se puede volver a un estado anterior");
    }

    @Override
    public PedidoState aprobarPedido() {
        return this;
    }

    @Override
    public PedidoState rechazarPedido() {
        throw new IllegalStateException("No se puede rechazar un pedido que ya esta aprobado");
    }
}
