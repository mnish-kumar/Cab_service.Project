package OOPs.Project;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Cab_Service {
    String car_type;
    double kiloMeter;
    double bill;

    Cab_Service() {
        this.car_type = "";
        this.kiloMeter = 0.0;
        this.bill = 0.0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CAR type AC/NON AC.");
        car_type = sc.nextLine();
        System.out.println("Enter kilometer travel.");
        kiloMeter = sc.nextDouble();
    }

    void calculator() {
        if (car_type.compareTo("AC") == 0) {
            if (kiloMeter <= 5) bill = 150;
            else bill = 150 + (kiloMeter - 5) * 10;
        } else if (kiloMeter <= 5) bill = 120;
        else bill = 150 + (kiloMeter - 5) * 8;
    }

    void display() {
        System.out.println("CAR type : " + car_type);
        System.out.println("Kilo meter : " + kiloMeter);
        System.out.println("Your Bill : " + bill);
    }

    public static void main(String[] args) {
        //92- Design Private Cab Service - Graphic
        Cab_Service object = new Cab_Service();
        object.accept();
        object.calculator();
        object.display();
    }
}
