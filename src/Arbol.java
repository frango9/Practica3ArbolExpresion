public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public Arbol(char clave) {
        raiz = new NodoArbol(clave);
    }

    // Escribe las claves del arbol binario de raiz a en preorden.
    private void preOrden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print (nodo.getClave() + " "); // Nodo
            preOrden(nodo.getIz()); // Izquierda
            preOrden(nodo.getDe()); // Derecha
        }
    }
    public void preOrden() {
        System.out.print ("Preorden: ");
        preOrden(raiz);
        System.out.println();
    }

    // Escribe las claves del �rbol binario de raiz a en postorden.
    private void impPostOrden(NodoArbol nodo) {
        if (nodo != null) {
            impPostOrden(nodo.getIz()); // Izquierda
            impPostOrden(nodo.getDe()); // Derecha
            System.out.print(nodo.getClave() + " "); // Nodo
        }
    }
    public void impPostOrden() {
        System.out.print ("Post orden: ");
        impPostOrden(raiz);
        System.out.println();
    }

    // Escribe las claves del �rbol binario de raiz a en orden central.
    private void ordenCentral(NodoArbol nodo) {
        if (nodo != null) {
            ordenCentral(nodo.getIz()); // Izquierda
            System.out.print(nodo.getClave() + " "); // Nodo
            ordenCentral(nodo.getDe()); // Derecha
        }
    }
    public void ordenCentral() {
        System.out.print ("Orden central: ");
        ordenCentral(raiz);
        System.out.println();
    }

     public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol nodo) {
        raiz = nodo;
    }
	
	public void juntar(char clave, Arbol a1, Arbol a2) {
        if (a1.raiz == a2.raiz && a1.raiz != null)
            System.out.println("no se pueden mezclar, a1 y a2 son iguales");
        else {
            // Crear el nodo nuevo
            raiz = new NodoArbol(clave, a1.raiz, a2.raiz);
            // Borrar los �rboles a1 y a2
            if (this != a1)
                a1.raiz = null;
            if (this != a2)
                a2.raiz = null;
        }
    }

    private String PostOrden(NodoArbol nodo) {
        String neu = "";
        if (nodo != null) {
            neu = neu + PostOrden(nodo.getIz()); // Izquierda
            neu = neu + PostOrden(nodo.getDe()); // Derecha
            char aux = nodo.getClave();// Nodo
            neu = neu + aux + " ";

        }

        return neu;
    }
    public String PostOrden() {

        return PostOrden(raiz);

    }


}
