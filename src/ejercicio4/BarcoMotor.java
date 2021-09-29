
package ejercicio4;

public class BarcoMotor extends Barco {
    
    private Integer cv;

    public BarcoMotor() {
        super();
    }

    public BarcoMotor(Integer cv, String matricula, Integer metros, Integer añoFabricacion) {
        super(matricula, metros, añoFabricacion);
        this.cv = cv;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        
        System.out.print("Caballos de fuerza: ");
        cv = leer.nextInt();
    }

    
    @Override
    public int calcularModulo(){
        return super.calcularModulo() + cv;
    }
    
    
    
    
    
    
}
