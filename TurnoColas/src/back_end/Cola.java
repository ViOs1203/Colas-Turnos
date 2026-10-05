// Victor Osvaldo Piña Becerra, Santiago Moreno Sotelo, Oscar Uriel Pedraza Alvarez
package back_end;

public class Cola {
    
    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;
    
    public Cola(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    public void encolar(Turno dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(estaVacia()){
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            
        } else {
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
            tamaño++;
        }
        
    }
    
    public Turno desencolar(){
        if(estaVacia()){
            return null;
        
        }
        Turno datoExtraido = primero.getDato();
        primero = primero.getSiguiente();
        
        if(primero == null){
            ultimo = null;
        
        }
        tamaño--;
        return datoExtraido;
            
    }
    
    public Turno consultarPrimero(){
        if(estaVacia()){
            return null;
        
        }
        return primero.getDato();
        
    }
    
    public boolean estaVacia(){
        return primero == null;
    
    }
    
    public int obtenerTamaño(){
        return tamaño;
    }
    
    public void vaciar() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    public Nodo getPrimero(){
        return primero;
    
    }
    
    public Nodo getUltimo(){
        return ultimo;
    
    }

    @Override
    public String toString() {
        return "Cola{" + "primero=" + primero + ", ultimo=" + ultimo + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
