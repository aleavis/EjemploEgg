/*
 * A continuación se debe crear una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados.
 * Los constructores que se implementarán serán:
 * • Un constructor vacío.
 * • Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
 * Los métodos que se implementara serán:
 * • Método get y set del atributo carga.
 * • Método crearLavadora (): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos el atributo propio de la lavadora.
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. 
 * Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se incrementará el precio. Este método debe
 * llamar al método padre y añadir el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben
 * afectar al precio.
 */
package ejercicio2;

public class Lavadora extends Electrodomestico {

    private Float carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Float carga, Float precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Float getCarga() {
        return carga;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){

        super.crearElectrodomestico();
        System.out.print("Ingrese carga de la lavadora: ");
        carga = leer.nextFloat();

    }
//
//    @Override
//    public void crearElectrodomestico() {
//
//        //traigo el metodo de electrodomestico
//        super.crearElectrodomestico();
//
//        System.out.print("Ingrese carga de la lavadora: ");
//        carga = leer.nextFloat();
//
//    }


    @Override
    public void precioFinal() {

        super.precioFinal();

        Float precioCarga = 0f;

        if (carga > 30) {
            precioCarga = 500f;
        }
        
        super.setPrecio(super.getPrecio() + precioCarga);
    }

}
