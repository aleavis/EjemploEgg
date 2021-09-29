package ejercicio3;

public class Televisor extends Electrodomestico {

    private Integer pulgadas;
    private Boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(Integer pulgadas, Boolean sintonizadorTDT, Float precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return " \nTelevisor: " + "\nPulgadas: " + pulgadas + "\nSintonizadorTDT: " + sintonizadorTDT + super.toString();
    }

//    @Override
//    public void crearElectrodomestico() {
//        char c = ' ';
//        int check = 0;
//
//        //traigo el metodo de electrodomestico
//        super.crearElectrodomestico();
//
//        System.out.print("Ingrese pulgadas de TV: ");
//        pulgadas = leer.nextInt();
//
//        System.out.print("Indicar si tiene sintonizador TDT (s/n): ");
//
//        do {
//            c = leer.next().charAt(0);
//            if (c == 's') {
//                sintonizadorTDT = true;
//                check = 1;
//            } else if (c == 'n') {
//                sintonizadorTDT = false;
//                check = 1;
//            }
//
//            if (check == 0) {
//                System.out.print("Error. Ingrese s/n: ");
//            }
//        } while (check != 1);
//
//    }
    public void crearTelevisor() {
        char c = ' ';
        int check = 0;

        //traigo el metodo de electrodomestico
        super.crearElectrodomestico();

        System.out.print("Ingrese pulgadas de TV: ");
        pulgadas = leer.nextInt();

        System.out.print("Indicar si tiene sintonizador TDT (s/n): ");

        do {
            c = leer.next().charAt(0);
            if (c == 's') {
                sintonizadorTDT = true;
                check = 1;
            } else if (c == 'n') {
                sintonizadorTDT = false;
                check = 1;
            }

            if (check == 0) {
                System.out.print("Error. Ingrese s/n: ");
            }
        } while (check != 1);
    }

    @Override
    public void precioFinal() {

        super.precioFinal();

        Float precioPulgadas = 0f;
        Float precioSintonizador = 0f;

        if (pulgadas > 40) {
            precioPulgadas = getPrecio() * 0.3f;

        }

        if (sintonizadorTDT) {
            precioSintonizador = 500f;
        }

        setPrecio(getPrecio() + precioPulgadas + precioSintonizador);
    }
}
