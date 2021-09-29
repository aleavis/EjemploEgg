/* 
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
 * La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
 * Animal.
 * Crear un método en la clase Animal a través del cual cada clase hija deberá
 * mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
 * una clase Main que realice lo siguiente:
 */
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Perro perro = new Perro("Sasha", "carne", 14, "Labradora");
        perro.alimentarse();
        
        Animal perro1 = new Perro("Coco", "balanceado", 3, "Bichon");
        perro1.alimentarse();
        
        Gato gato = new Gato("Michy", "ratas", 5, "Siames");
        gato.alimentarse();
        
        Caballo caballo = new Caballo("Tornado", "pasto", 12, "Fino");
        caballo.alimentarse();
        
    }
    
}


