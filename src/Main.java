import com.vehicles.project.Bike;
import com.vehicles.project.Car;
import com.vehicles.project.Vehicle;
import com.vehicles.project.Wheel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Car car = createCar();
        List<Wheel>backWheels = createTwoWheels();
        List<Wheel>frontWheels = createTwoWheels();
        car.addWheels(frontWheels, backWheels);
 //       Vehicle vehicleUser = createVehicle();
    }

//    private static Vehicle createVehicle() throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Qué tipo de vehiculo deseas crear?: Bike (1), Car (2)");
//        int vehicle = sc.nextInt();
//        sc.nextLine();
//    // como son los mismos atributos para todos, puedo preguntarlos solo una vez arriba del if
//        System.out.println("Indique la matrícula");
//        String plate= sc.nextLine();
//        System.out.println("Indique la marca");
//        String brand= sc.nextLine();
//        System.out.println("Indique el color");
//        String color= sc.nextLine();
//        // el null puede ir en cualquier lado arriba del if
//        Vehicle miVehicle = null;
//
//        if (vehicle == 1){
//            miVehicle = new Bike(plate, brand, color);
//        }else if (vehicle == 2){
//            miVehicle = new Car(plate, brand, color);
//
//        }
//        return miVehicle;
//    }


    private static List<Wheel> createTwoWheels() throws Exception {

        List<Wheel> twoWheels=new ArrayList<>();

        twoWheels.add(createWheel());
        twoWheels.add(createWheel());
        return twoWheels;
    }


    //aquì estoy creando un car, dentro del parentesis pongo las variables que yo he creado aqui mismo
    private static Car createCar() throws Exception {
        String plate= askPlate();
        String brand= askBrand();
        String color = askColor();
        Car car= new Car(plate, brand, color);
        return car;
    }

    private static String askColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es el color del coche?: ");
        return sc.nextLine();
    }

    private static String askBrand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es la marca del coche?: ");
        return sc.nextLine();
    }

    private static String askPlate() {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es la matricula del coche?: ");
        return sc.nextLine();
    }
    //aquí creo una rueda
    private static Wheel createWheel() throws Exception {
        String brand=askWheelBrand();
        double diameter=askWheelDiameter();
        Wheel wheel = new Wheel(brand,diameter);
        return wheel;
    }

    private static double askWheelDiameter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es el diámetro de la rueda?: ");
        return sc.nextInt();
    }

    private static String askWheelBrand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es la marca de la rueda?: ");
        return sc.nextLine();

    }


}
