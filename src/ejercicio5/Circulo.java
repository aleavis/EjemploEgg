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

public class Circulo implements calculosFormas {

    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float) (PI*Math.pow(radio, 2));
    }

    @Override
    public float calcularPerimetro() {
        return PI*(radio*2);
    }

}
