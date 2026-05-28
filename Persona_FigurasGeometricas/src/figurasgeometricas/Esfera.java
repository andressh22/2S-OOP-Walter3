
package figurasgeometricas;


public class Esfera extends FigurasGeometricas {
    /*Fields----------*/
    double radio;
    
    /*Methods*/
    public Esfera(double radio){
        this.radio=radio;
    }
    
    @Override
    public double calcularVolumen(){
    double volumen = (4.0/3.0)*Math.PI*Math.pow(radio, 3);
        return volumen;
    } 
    @Override
    public double calcularSuperficie(){
        double superficie=4*Math.PI*Math.pow(radio,2);
        return superficie;
    }
}

