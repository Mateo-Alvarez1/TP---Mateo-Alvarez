public class StateRechazado implements PedidoState {
    @Override
    public PedidoState aprobarSolicitud() {
        throw new IllegalStateException("No se puede volver a un estado anterior");
    }

    @Override
    public PedidoState aprobarPedido() {
        throw new IllegalStateException("No se puede aprobar un pedido que ya fue rechazado");
    }

    @Override
    public PedidoState rechazarPedido() {
        return this;
    }
}
