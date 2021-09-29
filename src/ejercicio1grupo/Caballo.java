
package ejercicio1grupo;

public class Caballo extends Animal {
    
    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse(){
        System.out.println("El caballo esta alimendandose de "+super.getAlimento());
    }
    
}
