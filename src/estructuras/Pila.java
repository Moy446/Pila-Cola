package estructuras;


public class Pila {
    public alumnos pila;

    public Pila() {
        this.pila = null;
    }
    public void push (int data){
        alumnos newAlumno = new alumnos(data);
        if(isVacio()){
            pila = newAlumno;
        }else{
            alumnos aux = pila;
            while (aux.getNext()!= null) {
                aux = aux.getNext();
            }
            aux.setNext(newAlumno);
        }
    }
    
    public String printf(){
        alumnos aux = pila;
        String valores = "";
        if (isVacio()) {
            valores ="ta vacio";
            return valores;
        }
        valores+= "----------------------------------------------\n";
        while (aux != null){
            valores+= "alumno: "+aux.getRegistro()+"\n";
            aux = aux.getNext();
        }
        return valores;
    }
    public String pop(){
        alumnos aux = pila;
        String valores = "";
        if (isVacio()) {
            valores = "la pila esta vacia";
            return valores;
        }
        if (aux.getNext()== null) {
            pila = null;
        }else{
            while (aux.getNext().getNext() != null){
                    aux = aux.getNext();
            }
            aux.setNext(null);
        }
        valores = printf();
        return valores;
    }
    
    public boolean isVacio(){
        boolean vacio = false;
        alumnos aux = pila;
        if(aux == null){
            return vacio = true;
        }
        
        return vacio;
    }
}
