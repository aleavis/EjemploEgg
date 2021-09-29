
package ejercicio1grupo;

public class Gato extends Animal {
    
     public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse(){
        System.out.println("El gato esta alimentandose de "+super.getAlimento());
    }
}
