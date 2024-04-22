public class StatePendAprobacion implements PedidoState{
    @Override
    public PedidoState aprobarSolicitud() {
        return this;
    }

    @Override
    public PedidoState aprobarPedido() {
        return new StateAprobado();
    }

    @Override
    public PedidoState rechazarPedido() {
        return new StateRechazado();
    }
}
