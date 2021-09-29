
package ejercicio4;

public class Velero extends Barco{
    
    private Integer mastiles;

    public Velero() {
        super();
    }

    public Velero(Integer mastiles, String matricula, Integer metros, Integer añoFabricacion) {
        super(matricula, metros, añoFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        
        System.out.print("Cantidad de mastiles: ");
        mastiles = leer.nextInt();
    }
    
   @Override
    public int calcularModulo(){
        return super.calcularModulo() + mastiles;
    }
    
    
    

   



   
    
    
    
}
