package ejercicio3;

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

    @Override
    public String toString() {
        return " \nLavadora: " + "\nCarga: " + carga + super.toString();
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
    public void crearLavadora() {

        super.crearElectrodomestico();
        System.out.print("Ingrese carga de la lavadora: ");
        carga = leer.nextFloat();

    }

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
