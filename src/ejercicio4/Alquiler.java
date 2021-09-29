/*
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el nombre, documento del cliente, 
 * la fecha de alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará.
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 * Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
 * • Número de mástiles para veleros.
 * • Potencia en CV para barcos a motor.
 * • Potencia en CV y número de camarotes para yates de lujo.
 * Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución), 
 * por un valor módulo de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco, se calcula sacando el modulo normal y sumándole el atributo particular de cada barco. 
 * En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
 * el número de camarotes.
 * Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los métodos necesarios que permitan al usuario elegir 
 * el barco que quiera alquilar y mostrarle el precio final de su alquiler. 
 */
package ejercicio4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Alquiler {

    private String nombre;
    private Integer dni;
    private Calendar fechaAlquiler;
    private Calendar fechaDevolucion;
    private Integer posicionAmarre;
    private Barco barco;

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, Calendar fechaAlquiler, Calendar fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Calendar getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Calendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void crearAlquiler() {
//        Calendar sameDate = new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44);
//        System.out.println("Some Date : " + sameDate.getTime());
        int day;
        int month;
        int year;
        Calendar fechaA = GregorianCalendar.getInstance();
        Calendar fechaB = GregorianCalendar.getInstance();

        System.out.println("ALQUILER DE BARCOS");
        System.out.print("Nombre: ");
        nombre = leer.next();

        System.out.print("DNI: ");
        dni = leer.nextInt();
        
        System.out.println("Ingrese fecha de alquiler. dd/mm/yy");
        day = leer.nextInt();
        month = leer.nextInt();
        year = leer.nextInt();

        fechaA.set(year, month, day);
        setFechaAlquiler(fechaA);

        System.out.println("Ingrese fecha de devolucion. dd/mm/yy");
        day = leer.nextInt();
        month = leer.nextInt();
        year = leer.nextInt();

        fechaB.set(year, month, day);
        setFechaDevolucion(fechaB);

        System.out.println("Fecha de alquiler: " + getFechaAlquiler().get(Calendar.DATE) + "/" + getFechaAlquiler().get(Calendar.MONTH) + "/" 
                + getFechaAlquiler().get(Calendar.YEAR));
        System.out.println("Fecha de devolucion: " + getFechaDevolucion().get(Calendar.DATE) + "/" + getFechaDevolucion().get(Calendar.MONTH) 
                + "/" + getFechaDevolucion().get(Calendar.YEAR));
        System.out.println("Cantidad de dias: " + calcularDias());

        System.out.println("");

        int opc;
        do {
            menu();
            System.out.println("Que barco desea alquilar? ");
            opc = leer.nextInt();
            System.out.println("");

            switch (opc) {
                case 1:
                    Barco bm = new BarcoMotor();
                    bm.crearBarco();
                    System.out.println("");
                    System.out.println("El precio del barco a motor es de: " + calcularPrecio(bm) + "$");
                    System.out.println("");
//                    setBarco(bm);
                    break;
                case 2:
                    Barco v = new Velero();
                    v.crearBarco();
                    System.out.println("");
                    System.out.println("El precio del velero es de: " + calcularPrecio(v) + "$");
                    System.out.println("");
                    break;
                case 3:
                    Barco y = new Yate();
                    y.crearBarco();
                    System.out.println("");
                    System.out.println("El precio del yate es de: " + calcularPrecio(y) + "$");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opc != 4);

    }

    public int calcularDias() {
        long milisegundos = getFechaDevolucion().getTimeInMillis() - getFechaAlquiler().getTimeInMillis();

        return (int) (milisegundos / 1000 / 60 / 60 / 24);
    }

    public int calcularPrecio(Barco b) {
        return b.calcularModulo() * calcularDias();
    }

    public void menu() {
        System.out.println("1. Barco a motor");
        System.out.println("2. Velero ");
        System.out.println("3. Yate");
        System.out.println("4. Salir");
    }

}
