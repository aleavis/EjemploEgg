
package ejercicio4;

public class Yate extends Barco{
    
 private Integer cv;
 private Integer camarotes;

    public Yate() {
        super();      
    }

    public Yate(Integer cv, Integer camarotes, String matricula, Integer metros, Integer añoFabricacion) {
        super(matricula, metros, añoFabricacion);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        
        System.out.print("Caballos de fuerza: ");
        cv = leer.nextInt();
        
        System.out.print("Camarotes: ");
        camarotes = leer.nextInt();
        
    }
    
    @Override
    public int calcularModulo(){
        return super.calcularModulo() + cv + camarotes;
    }
 
 
    
    
    
}
