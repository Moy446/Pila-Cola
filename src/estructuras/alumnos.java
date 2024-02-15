package estructuras;

public class alumnos {
    private int registro;
    private alumnos next;

    public alumnos(int registro) {
        this.registro = registro;
        this.next = null;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public alumnos getNext() {
        return next;
    }

    public void setNext(alumnos next) {
        this.next = next;
    }
    
}
