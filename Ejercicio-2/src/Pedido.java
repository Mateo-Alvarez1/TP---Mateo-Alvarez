public class Pedido {

    private String tipoPedido;
    private PedidoState pedidoState;

    public Pedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
        pedidoState = new StateBorrador();
    }

    public void aprobarSolicitud() {
        pedidoState = pedidoState.aprobarSolicitud();
    }

    public void aprobarPedido() {
        validarTransicion();
        pedidoState = pedidoState.aprobarPedido();
    }

    public void rechazarPedido() {
       validarTransicion();
        pedidoState = pedidoState.rechazarPedido();

    }

    public void validarTransicion() {
        if (pedidoState instanceof StateBorrador) {
            throw new IllegalStateException("No se puede pasar de borrador a Aprobado/Rechazado sin pasar por pendiente de aprobacion");
        }
    }



}
