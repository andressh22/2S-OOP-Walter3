
package Notas;


public class Notas {
    /*Fields*/
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double nota5;
    
    
    
    public Notas(double nota1, double nota2, double nota3, double nota4, double nota5){
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
        this.nota5=nota5;

    }
    
    public double calcularPromedio(){
        double promedio=(nota1+ nota2+nota3+nota4+nota5)/5;
        return promedio;
    }

    public double calcularNotaMayor(){
        double notaMayor=Math.max(Math.max(nota1, nota2),Math.max(Math.max(nota3, nota4),nota5));
        return notaMayor;
    }

    public double calcularNotaMenor(){
        double notaMenor=Math.min(Math.min(nota1, nota2),Math.min(Math.min(nota3, nota4),nota5));
        return notaMenor;
    }

    public double calcularDesviacionEstandar(){
        double resultadoPromedio=calcularPromedio();
        double suma=Math.pow((nota1-resultadoPromedio),2)+
                Math.pow((nota2-resultadoPromedio),2)+
                Math.pow((nota3-resultadoPromedio),2)+
                Math.pow((nota4-resultadoPromedio),2)+
                Math.pow((nota5-resultadoPromedio),2);
        double desviacionEstandar=Math.sqrt(suma/5);
        return desviacionEstandar;
    }
}
