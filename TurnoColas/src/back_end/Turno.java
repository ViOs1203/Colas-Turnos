// Victor Osvaldo Piña Becerra, Santiago Moreno Sotelo, Oscar Uriel Pedraza Alvarez
package back_end;


public class Turno {
    private int numeroTurno;
    private String nombreCliente;
    private String tramite;

    public Turno(int numeroTurno, String nombreCliente, String tramite) {
        this.numeroTurno = numeroTurno;
        this.nombreCliente = nombreCliente;
        this.tramite = tramite;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    @Override
    public String toString() {
        return "Numero de Turno: " + numeroTurno + "----Nombre: " + nombreCliente + "----Tramite: " + tramite;
    }
    
    
}
