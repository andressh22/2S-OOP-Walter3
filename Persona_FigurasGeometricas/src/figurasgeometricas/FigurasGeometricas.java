
package figurasgeometricas;


public abstract class FigurasGeometricas {
    /*Fields----------*/    
    double volumen;
    double superficie;
    
     
    /*Methods*/
    
    public double getVolumen(){
        return volumen;
    }
    public double getSuperficie(){
        return volumen;
    }
    
    
    public abstract double calcularVolumen();
    public abstract double calcularSuperficie();
}
    

