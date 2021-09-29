/* 
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
 * La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
 * Animal.
 * Crear un método en la clase Animal a través del cual cada clase hija deberá
 * mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
 * una clase Main que realice lo siguiente:
 */
package ejercicio1grupo;

import java.util.ArrayList;

public class Ejercicio1 {

    public static ArrayList<Animal> animales = new ArrayList<Animal>();

    public static void main(String[] args) {
        //Declaracion del objeto perro
        Animal perro = new Perro("Stich", "Carne", 15, "Doberman");
//    perro.Alimentarse();

        //Declaración de otro objeto perro
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
//    perro1.Alimentarse();
//    
        //Declaracion del objeto gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
//   gato.Alimentarse();

        //Declaracion del objeto caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
//    caballo.Alimentarse();

        animales.add(perro);
        animales.add(perro1);
        animales.add(gato);
        animales.add(caballo);

        for (Animal animal : animales) {
            animal.Alimentarse();
            System.out.println(animal.getAlimento());
        }
//    
    }
}


