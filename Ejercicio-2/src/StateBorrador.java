public class StateBorrador implements PedidoState{
    @Override
    public PedidoState aprobarSolicitud() {
        return new StatePendAprobacion();
    }

    @Override
    public PedidoState aprobarPedido() {
        return this;
    }

    @Override
    public PedidoState rechazarPedido() {
        return this;

    }
}
