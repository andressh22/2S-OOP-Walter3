
package figurasgeometricas;


public class Piramide extends FigurasGeometricas {
    /*Fields----------*/
    double base;
    double altura;
    double apotema;
    
    /*Methods*/

    public Piramide(double base, double altura, double apotema){
        this.base=base;
        this.altura=altura;
        this.apotema=apotema;
    }
    
    public double calcularAreaBase(){
        double areaBase=Math.pow(base,2);
        return areaBase;
    }
    
    @Override
    public double calcularVolumen(){
        double areaBase=calcularAreaBase();
        double volumen=(areaBase*altura)/3;
        return volumen;
    }
    
    @Override
    public double calcularSuperficie(){
        double superficie=Math.pow(base,2)+2*base*apotema;
        return superficie;
    }
    
    
}

