package estructuras;

public class Cola {
    private alumnos cola;

    public Cola() {
        cola = null;
    }

    public void Encolar (int data){
        alumnos nuevo = new alumnos(data);
        if (isVacio()) {
            cola  = nuevo;
        }else{
            alumnos aux = cola;
            while (aux.getNext()!= null) {
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }        
    }
    public String recorrer(){
        alumnos aux = cola;
        String valores = "";
        if (isVacio()) {
            valores += "la cola esta vacia";
            return valores;
        }
        valores+= "----------------------------------------------\n";
        while (aux != null){
            valores+= "registro, pero en cola: "+aux.getRegistro()+"\n";
            aux = aux.getNext();
        }
        return valores;
    }
    public String Desencolar(){
        alumnos aux = cola;
        String valores = "";
        if (isVacio()) {
            valores = "la cola esta vacia";
            return valores;
        }
        if (aux.getNext()== null) {
            cola = null;
        }else{
            cola = aux.getNext();
        }
        valores = recorrer();
        return valores;
    }
    
    public boolean isVacio(){
        boolean vacio = false;
        alumnos aux = cola;
        if(aux == null){
            return vacio = true;
        }
        
        return vacio;
    }
}
