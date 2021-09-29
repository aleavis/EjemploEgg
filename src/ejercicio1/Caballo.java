
package ejercicio1;

public class Caballo extends Animal {

    public Caballo() {
        super();
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse(){
        System.out.println("El caballo esta alimendandose de "+super.getAlimento());
    }
     
    
}
