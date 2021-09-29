/*
 * Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en pulgadas) y sintonizador TDT (booleano), 
 * además de los atributos heredados.
 * Los constructores que se implementarán serán:
 * • Un constructor vacío.
 * • Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
 * Los métodos que se implementara serán:
 * • Método get y set de los atributos resolución y sintonizador TDT.
 * • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos los atributos del televisor.
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, 
 * se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en la clase
 * Electrodomestico también deben afectar al precio.
 * Finalmente, en el main debemos realizar lo siguiente: Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
 * para mostrar el precio final de los dos electrodomésticos.
 */
package ejercicio2;

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
    public void crearElectrodomestico() {
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
