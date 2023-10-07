package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return this.letras.length;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString(){
        String thing = "";
        for (String elem : this.letras){
            if (elem.equals(this.letras[this.letras.length-1])){
                thing += elem;
            } else {
                thing += elem + ", ";
            }

        }
        return thing;
    }
}
