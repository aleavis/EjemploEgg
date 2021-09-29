/*
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 * precio, color, consumo energético (letras entre A y F) y peso.
 * Los constructores que se deben implementar son los siguientes:
 * • Un constructor vacío.
 * • Un constructor con todos los atributos pasados por parámetro.
 * Los métodos a implementar son:
 * • Métodos getters y setters de todos los atributos.
 * • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. 
 * Este método se debe invocar al crear el objeto y no será visible.
 * • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. 
 * Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
 * está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible.
 *
 * • Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico, 
 * también llama los métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000.
 * • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios:
 * LETRA PRECIO         PESO                    PRECIO
 *  A   $1000           Entre 1 y 19 kg         $100    
 *  B   $800            Entre 20 y 49 kg        $500
 *  C   $600            Entre 50 y 79 kg        $800
 *  D   $500            Mayor que 80 kg         $1000
 *  E   $300
 *  F   $100
 * 
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
 *
 */
package ejercicio2;

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
        letra = Character.toUpperCase(letra);
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

    public void programa() {

        System.out.println("LAVADORA");
        Lavadora lavadora = new Lavadora();

        lavadora.crearLavadora();
        lavadora.precioFinal();
        lavadora.mostrar();

        System.out.println("");

////-----------CREAR CON EL OVERRIDE-----------------------------//
//        System.out.println("LAVADORA");
//        Electrodomestico lavadora = new Lavadora();
//
//        lavadora.crearElectrodomestico();
//        lavadora.precioFinal();
//        lavadora.mostrar();
//------------------------------------------------------------------//
        System.out.println("TELEVISOR");
        Televisor televisor = new Televisor();

        televisor.crearElectrodomestico();
        televisor.precioFinal();
        televisor.mostrar();
    }

}
