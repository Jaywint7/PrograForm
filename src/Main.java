
//This: Contexto donde se ejecuta
// Siempre se refiere al dueño de la funcion
// Objeto o contexto en el cual se ejecita el codigo en ese momento
// this referencia al objeto goblal


// Clase: Modelo que define como se debe crear y comportar objetos
// Atributos: datos del objeto
// Metodos: acciones del objeto = Funcion


//Intsanciar es CREAR___
// ejemplo Gatos se instancia a Gato_1
// y se llena con caracteristicas que el gato uno
// se quiere que tenga
//Objeto = Instanciacion

//Uso de todo solo en el Main
/*import java.util.Scanner;
public class Main {
    public String nombre; public String posicion;
    public int edad, num_camiseta;
    public Main (String nombre, String posicion, int edad, int camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.num_camiseta = camiseta;
    }
    public void mostrar () {
        System.out.println("-------Jugador de Futbol---------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Posicion: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de Camiseta: " + num_camiseta);
    }

    public static void main (String[]args){
        Main jugador1 = new Main("Julian", "Delantero", 22, 19);
        Main jugador2 = new Main("Pau", "Defensa", 17, 33);
        Main jugador3 = new Main("Ederson", "Portero", 30, 31);
        jugador1.mostrar();
        jugador2.mostrar();
        jugador3.mostrar();
    }
}*/

/*import java.util.Scanner;
public class Main {

    public String nombre; public String posicion;
    public int edad, num_cam;

    public Main (String nombre, String posicion, int edad, int camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.num_cam = camiseta;
    }

    public static void main (String[]args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("-------Ingreso de Datos Futbolista N°1---------");
        System.out.print("Ingrese el nombre: ");
        String nombre1  = ingreso.nextLine();
        System.out.print("Ingrese la posicion: ");
        String posicion1  = ingreso.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad1  = ingreso.nextInt();
        System.out.print("Ingrese el numero de camiseta: ");
        int num_cam1  = ingreso.nextInt();
            ingreso.nextLine(); // Limpiar el buffer de entrada

        System.out.println("-------Ingreso de Datos Futbolista N°2---------");
        System.out.print("Ingrese el nombre: ");
        String nombre2  = ingreso.nextLine();
        System.out.print("Ingrese la posicion: ");
        String posicion2  = ingreso.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad2  = ingreso.nextInt();
        System.out.print("Ingrese el numero de camiseta: ");
        int num_cam2  = ingreso.nextInt();
            ingreso.nextLine(); // Limpiar el buffer de entrada

        System.out.println("-------Ingreso de Datos Futbolista N°3---------");
        System.out.print("Ingrese el nombre: ");
        String nombre3  = ingreso.nextLine();
        System.out.print("Ingrese la posicion: ");
        String posicion3  = ingreso.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad3  = ingreso.nextInt();
        System.out.print("Ingrese el numero de camiseta: ");
        int num_cam3  = ingreso.nextInt();
            ingreso.nextLine(); // Limpiar el buffer de entrada

        Main jugador1 = new Main(nombre1,posicion1,edad1,num_cam1);
        Main jugador2 = new Main(nombre2,posicion2,edad2,num_cam2);
        Main jugador3 = new Main(nombre3,posicion3,edad3,num_cam3);
        jugador1.mostrar();
        jugador2.mostrar();
        jugador3.mostrar();
    }
    public void mostrar () {
        System.out.println("-------Jugador de Futbol---------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Posicion: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de Camiseta: " + num_cam);
    }
}*/
import java.util.Scanner;
/*public class Main {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("-------Ingreso de Datos del Empelado N°1---------");
        System.out.print("Ingrese el nombre: ");
        String nombre1  = ingreso.nextLine();
        System.out.print("Ingrese el cargo: ");
        String cargo1  = ingreso.nextLine();
        System.out.print("Ingrese el monto del salario: ");
        double salario1  = ingreso.nextDouble();
        ingreso.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese la fecha de ingreso a la empresa (D/M/A): ");
        String fecha1  = ingreso.nextLine();

        System.out.println("-------Ingreso de Datos del Empelado N°2---------");
        System.out.print("Ingrese el nombre: ");
        String nombre2  = ingreso.nextLine();
        System.out.print("Ingrese el cargo: ");
        String cargo2  = ingreso.nextLine();
        System.out.print("Ingrese el monto del salario: ");
        double salario2  = ingreso.nextDouble();
        ingreso.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese la fecha de ingreso a la empresa (D/M/A): ");
        String fecha2  = ingreso.nextLine();

        System.out.println("-------Ingreso de Datos del Empelado N°3---------");
        System.out.print("Ingrese el nombre: ");
        String nombre3  = ingreso.nextLine();
        System.out.print("Ingrese el cargo: ");
        String cargo3  = ingreso.nextLine();
        System.out.print("Ingrese el monto del salario: ");
        double salario3  = ingreso.nextDouble();
        ingreso.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese la fecha de ingreso a la empresa (D/M/A): ");
        String fecha = ingreso.nextLine();

        Empleado empleado1 = new Empleado(nombre1,cargo1,salario1,fecha1);
        Empleado empleado2 = new Empleado(nombre2,cargo2,salario2,fecha2);
        Empleado empleado3 = new Empleado(nombre3,cargo3,salario3,fecha);
        empleado1.mostrar();
        empleado2.mostrar();
        empleado3.mostrar();
    }
}*/

import java.util.Scanner;
