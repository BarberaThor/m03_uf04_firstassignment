package cat.copernic.review;

/**
 *
 * @author jbarb
 */
public class Triangulo {
    
    //IMPORTANT S'HA DE COMPROVAR QUE LA BASE I LALTURA NO SIGUIN NEGATIUS
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double area() {
        return 0.0;
    }
    
    public double perimetro() {
        return 0.0;
    }
}
