/*
 * Se plantea desarrollar un programa que nos permita calcular el área y el
 * perímetro de formas geométricas, en este caso un circulo y un rectángulo. Ya
 * que este calculo se va a repetir en las dos formas geométricas, vamos a crear
 * una Interfaz, llamada calculosFormas que tendrá, los dos métodos para calcular
 * el área, el perímetro y el valor de PI como constante. Desarrollar el ejercicio para
 * que las formas implementen los métodos de la interfaz y se calcule el área y el
 * perímetro de los dos. En el main se crearán las formas y se mostrará el resultado final.
 * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 * Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicio5;

public class Rectangulo implements calculosFormas{
    
    private float base;
    private float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    } 

    @Override
    public float calcularArea() {
        return base*altura;
    }

    @Override
    public float calcularPerimetro() {
       return (base+altura)*2;
    }
    
}
