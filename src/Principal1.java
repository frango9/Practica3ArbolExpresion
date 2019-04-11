public class Principal1 {
    public static void main(String[] args) {

        Arbol a1 = new Arbol();
        MetodosAE m = new MetodosAE();

        a1 = m.notacInfija("((5+2)*(8-3))/4");
        a1.impPostOrden();
        System.out.println(a1.PostOrden());

    }
}
