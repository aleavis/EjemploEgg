/*
 * Siguiendo el ejercicio anterior, en el main vamos a crear un arrayList de Electrodomésticos para guardar 4 electrodomésticos, 
 * ya sean lavadoras o televisores, con valores ya asignados.
 * Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 
 * Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los televisores, por un lado, el de las lavadoras por
 * otro, y al final, la suma del precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000 y 
 * un televisor de 5000, el resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y 5000 para televisor.
 * 
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Electrodomestico {

    protected Float precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Float precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nPrecio: " + precio + "\nColor: " + color + "\nConsumoEnergetico: " + consumoEnergetico + "\nPeso: " + peso;
    }

    public void crearElectrodomestico() {

        precio = 1000f;

        System.out.print("Ingrese color: ");
        color = leer.next();

        System.out.print("Ingrese consumo energetico: ");
        consumoEnergetico = leer.next().charAt(0);

        System.out.print("Ingrese peso del electrodomestico: ");
        peso = leer.nextInt();

        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public void comprobarConsumoEnergetico(char letra) {
        Character.toUpperCase(letra);

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color) {

        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }

    }

    public void precioFinal() {
        float precioConsumo = 0f;
        float pesoConsumo = 0f;

        // creo una variable donde guardo el precio acorde al consumo, al final se lo suma 
        switch (consumoEnergetico) {
            case 'A':
                precioConsumo = 1000f;
                break;
            case 'B':
                precioConsumo = 800f;
                break;
            case 'C':
                precioConsumo = 600f;
                break;
            case 'D':
                precioConsumo = 500f;
                break;
            case 'E':
                precioConsumo = 300f;
                break;
            case 'F':
                precioConsumo = 100f;
                break;
        }

        // creo una variable donde guardo el precio acorde al peso, al final se lo suma
        if (peso >= 1 && peso <= 19) {
            pesoConsumo = 100f;
        } else if (peso >= 20 && peso <= 49) {
            pesoConsumo = 500f;
        } else if (peso >= 50 && peso <= 79) {
            pesoConsumo = 800f;
        } else if (peso >= 80) {
            pesoConsumo = 1000f;
        }

        precio = precio + precioConsumo + pesoConsumo; //el getPrecio trae el precio base de 1000 + lo ingresado por el usuario y 
        //le agrego el precio segun el consumo y el peso

    }

    public void mostrar() {
        System.out.println("Precio final: " + precio);
        System.out.println("Color: " + color);
        System.out.println("Consumo energetico: " + consumoEnergetico);
        System.out.println("Peso: " + peso);

    }

    public List<Electrodomestico> listaElectrodomesticos() {
        /*
 * Siguiendo el ejercicio anterior, en el main vamos a crear un arrayList de Electrodomésticos para guardar 4 electrodomésticos, 
 * ya sean lavadoras o televisores, con valores ya asignados.
 * Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 
 * Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los televisores, por un lado, el de las lavadoras por
 * otro, y al final, la suma del precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000 y 
 * un televisor de 5000, el resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y 5000 para televisor.
 * 
         */
        List<Electrodomestico> lista = new ArrayList();
        Lavadora l1 = new Lavadora(50f, 1000f, "celeste", 'A', 50);
        Lavadora l2 = new Lavadora(10f, 1000f, "negro", 'P', 80);

        Televisor t1 = new Televisor(50, true, 1000f, "negro", 'E', 80);
        Televisor t2 = new Televisor(30, false, 1000f, "rojo", 'A', 50);

        lista.add(l1);
        lista.add(l2);
        lista.add(t1);
        lista.add(t2);

        return lista;
    }

    public void electrodomesticos() {

        float totalTv = 0;
        float totalLavadora = 0;

        for (Electrodomestico e : listaElectrodomesticos()) {

            if (e instanceof Lavadora) {
                e.precioFinal();
                System.out.println("Precio de la lavadora es " + e.getPrecio());

                totalLavadora += e.getPrecio();
            } else {
                e.precioFinal();
                System.out.println("Precio de las tv es : " + e.getPrecio());

                totalTv += e.getPrecio();
            }
        }

        System.out.println("Total lavadoras: " + totalLavadora);
        System.out.println("Total tvs: " + totalTv);
    }

    public void programa() {
        electrodomesticos();

//        for (Electrodomestico elec : listaElectrodomesticos()) {
//            System.out.println(elec);
//        }
    }

}
