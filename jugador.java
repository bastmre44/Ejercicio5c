//Universidad del Valle de Guatemala
//Mishell Ciprian 231169
//poo Ejercicio 5 Herencia 



//se crea la super clase Jugador que tiene los atributos de la clase padre
// que se utilizan en la subclase libero,opuesto, auxiliar, pasador 

public class jugador {
    private String nombre;
    private String pais;
    private double errores;
    private double aces;
    private double totalServicios;

    //se crea el constructor de la clase jugadorinicializa las variables de instancia de la clase 
    //se crea el constructor de la clase jugador
    
    public void Jugador(String nombre, String pais, double errores, double aces, double totalServicios) {
        this.nombre = nombre;
        this.pais = pais;
        this.errores = errores;
        this.aces = aces;
        this.totalServicios = totalServicios;
    }
    public String getNombre(){
        return nombre;

    }
    public String getPais(){
        return pais;

    }
    public double getErrores(){
        return errores;


    }
    public double getAces() {
        return aces;
    }
    public double getTotalServicios() {
        return totalServicios;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public void setErrores(double errores){
        this.errores = errores;
    }
    public void setAces(double aces){
        this.aces = aces;

    }
    public void setTotalServicios(double totalServicios){
        this.totalServicios = totalServicios;

    }
    public double efectividad(){
        return 0;

     }
     }
