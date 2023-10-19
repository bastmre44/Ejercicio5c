//Universidad del Valle de Guatemala
//Mishell Ciprian 231169
//poo Ejercicio 5 Herencia 



//se crea la super clase Jugador que tiene los atributos de la clase padre
// que se utilizan en la subclase libero,opuesto, auxiliar, pasador 

public class jugador {
//metodos de la super clase que se existen en la subclases libero,opuesto, auxiliar, pasador
    private String nombre;
    private String pais;
    private double errores;
    private double aces;
    private double totalServicios;

    //se crea el constructor de la clase jugadorinicializa las variables de instancia de la clase 
    //se crea el constructor de la clase jugador
    
    public jugador(String nombre2, String pais2, double errores2, double aces2, double totalServicios2) {
    }
    
   // se crea el constructor de la subclase jugador 
    public void Jugador(String nombre, String pais, double errores, double aces, double totalServicios) {
        this.nombre = nombre;
        this.pais = pais;
        this.errores = errores;
        this.aces = aces;
        this.totalServicios = totalServicios;
    }
    //// Métodos getter para los atributos de la clase Jugador
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
     // Métodos setter para los atributos de la clase Jugador
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
    // Método efectividad: calcula la efectividad del jugador en función de su posición en el campo (se sobrescribe en cada subclase)
    public double efectividad(){
        return 0;

     }
     }


     // sub clase pasador 
     class pasador extends jugador{
        //atributos de la clase pasador 
        private double pasesEfectivos;
        private double fintasEfectivas;

        //constructor de la clase pasador
   public pasador(String nombre, String pais, double errores, double aces, double totalServicios, double pasesEfectivos, double fintasEfectivas) {
    super(nombre, pais, errores, aces, totalServicios);
    this.pasesEfectivos = pasesEfectivos;
    this.fintasEfectivas = fintasEfectivas;
}
 public double getPasesEfectivos() {
        return pasesEfectivos;
    }

    public double getFintasEfectivas() {
        return fintasEfectivas;
    }

    public void setPasesEfectivos(double pasesEfectivos) {
        this.pasesEfectivos = pasesEfectivos;
    }

    public void setFintasEfectivas(double fintasEfectivas) {
        this.fintasEfectivas = fintasEfectivas;
    }

    @Override
    public double efectividad() {
        return ((pasesEfectivos + fintasEfectivas - getErrores()) * 100 / (pasesEfectivos + fintasEfectivas + getErrores())) + (getAces() * 100 / getTotalServicios());
    }
}
// se crea la subclase auxiliar
class Auxiliar extends jugador{
    //atributos de la subclase auxiliar
      private double ataquesEfectivos;
    private double bloqueosEfectivos;
    private double bloqueosFallidos;


    public Auxiliar(String nombre, String pais, double errores, double aces, double totalServicios, double ataquesEfectivos, double bloqueosEfectivos, double bloqueosFallidos) {
        super(nombre, pais, errores, aces, totalServicios);
        this.ataquesEfectivos = ataquesEfectivos;
        this.bloqueosEfectivos = bloqueosEfectivos;
        this.bloqueosFallidos = bloqueosFallidos;
    }
    //metodos getter para los atributos de la subclase auxiliar
           public double getAtaquesEfectivos() {
        return ataquesEfectivos;
    }

    public void setAtaquesEfectivos(double ataquesEfectivos) {
        this.ataquesEfectivos = ataquesEfectivos;
    }

    @Override
    public double efectividad() {
        return ((ataquesEfectivos + bloqueosEfectivos - bloqueosFallidos - getErrores()) * 100 / (ataquesEfectivos + bloqueosEfectivos + bloqueosFallidos + getErrores())) + (getAces() * 100 / getTotalServicios());
    }
}
    
    //se crea la clase libero  
    class Libero extends jugador {
        //atributos de la subclase libero
    private double recibosEfectivos;

  // Constructor de la clase Libero
    public Libero(String nombre, String pais, double errores, double aces, double totalServicios, double recibosEfectivos) {
        super(nombre, pais, errores, aces, totalServicios);
        this.recibosEfectivos = recibosEfectivos;
    }
// Método getter para el atributo recibosEfectivos de la clase Libero
    public double getRecibosEfectivos() {
        return recibosEfectivos;
    }

    public void setRecibosEfectivos(double recibosEfectivos) {
        this.recibosEfectivos = recibosEfectivos;
    }

    @Override
    public double efectividad() {
        return ((recibosEfectivos - getErrores()) * 100 / (recibosEfectivos + getErrores())) + (getAces() * 100 / getTotalServicios());
    }
}
// clase opuesto 
class Opuesto extends jugador {
    private double ataquesEfectivos;
    private double bloqueosEfectivos;

    //constructor de la clase opuesto
    public Opuesto(String nombre, String pais, double errores, double aces, double totalServicios, double ataquesEfectivos, double bloqueosEfectivos) {
        super(nombre, pais, errores, aces, totalServicios);
        this.ataquesEfectivos = ataquesEfectivos;
        this.bloqueosEfectivos = bloqueosEfectivos;
    }

    public double getAtaquesEfectivos() {
        return ataquesEfectivos;
    }

   

}


