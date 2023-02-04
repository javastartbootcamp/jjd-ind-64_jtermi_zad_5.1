package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        Point point = new Point();
        System.out.println("Wprowadź współrzędne punktu");
        System.out.println("Podaj X");
        point.setX(scanner.nextInt());
        System.out.println("Podaj Y");
        point.setY(scanner.nextInt());

        System.out.println(check(point));
    }

    String check(Point point) {

        if (point.getX() == 0 && point.getY() == 0) {
            return (pointToString(point) + "leży na środku układu współrzędnych");
        } else if (point.getX() == 0) {
            return (pointToString(point) + "leży na osi X");
        } else if (point.getY() == 0) {
            return (pointToString(point) + "leży na osi Y");
        } else if ((point.getX() > 0) && (point.getY() > 0)) {
            return (pointToString(point) + "leży w I ćwiartce");
        } else if ((point.getX() > 0) && (point.getY() < 0)) {
            return (pointToString(point) + "leży w II ćwiartce");
        } else if ((point.getX() < 0) && (point.getY() < 0)) {
            return (pointToString(point) + "leży w III ćwiartce");
        } else {
            return (pointToString(point) + "leży w IV ćwiartce");
        }
    }

    String pointToString(Point point) {
        return ("Punkt (" + point.getX() + ", " + point.getY() + ") ");
    }
}
