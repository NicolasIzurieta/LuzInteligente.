package sistemadeiluminacion;

public class Luzinteligente {
    /*
    Asignacion de atributos
     */
    private String idLuz;
    private int niveldeluz;
    private boolean encendido;

    public int getNiveldeluz() {
        return niveldeluz;
    }

    public String getIdLuz() {
        return idLuz;
    }
    public boolean getEncendido(){
        return encendido;
    }

    public void setNiveldeluz(int niveldeluz) {
        if (niveldeluz<0){
            this.niveldeluz = niveldeluz;
        }
    }

    public void setIdLuz(String idLuz) {
        if(idLuz!=null && idLuz.trim().isEmpty()){
            this.idLuz = idLuz;
        }
    }

    public void enceder(){
        if (encendido==false){
            encendido=true;
            System.out.println("El led se prendio");
            System.out.println("-----------------------");
        }else {
            System.out.println("Ya esta encendido");
            System.out.println("-----------------------");
        }
    }
    public void apagar(){
        if (encendido==true){
            encendido=false;
            System.out.println("El led se apago");
            System.out.println("-----------------------");
        }else {
            System.out.println("Ya esta apagado");
            System.out.println("-----------------------");
        }
    }
    public void ajustarBrillo(int nuevoNivel){
        if (encendido==true){

        }
    }
}
