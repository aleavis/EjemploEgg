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

public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("RECTANGULO");
        Rectangulo r = new Rectangulo(5.5f, 10f);
        System.out.println("El area del rectangulo es de: " + r.calcularArea());
        System.out.println("El perimetro del rectangulo es de: " + r.calcularPerimetro());

        System.out.println("CIRCULO");
        Circulo c = new Circulo(5f);
        System.out.println("El area del circulo es de "+c.calcularArea());
        System.out.println("El perimetro del circulo es de "+c.calcularPerimetro());

    }

}
