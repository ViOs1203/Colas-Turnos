// Victor Osvaldo Piña Becerra, Santiago Moreno Sotelo, Oscar Uriel Pedraza Alvarez
package back_end;


public class Nodo {
    
    private Turno dato;
    private Nodo siguiente;
    
    public Nodo(Turno dato ){
     this.dato = dato;
     this.siguiente = null;
     
    }

    public Turno getDato() {
        return dato;
    }

    public void setDato(Turno dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }
    
    
    
}
