
package figurasgeometricas;


public class Cilindro extends FigurasGeometricas {
    /*Fields----------*/
    double radio;
    double altura;
    
    /*Methods*/
    public Cilindro(double radio, double altura){
        this.radio=radio;
        this.altura=altura;
    }
    
    @Override
    public double calcularVolumen(){
        double volumen=Math.PI*Math.pow(this.radio,2)*this.altura;
        return volumen;
    } 
    @Override
    public double calcularSuperficie(){
        double superficie=(2*Math.PI*this.radio*this.altura)+(2*Math.PI*Math.pow(this.radio,2));
        return superficie;
    }
}

