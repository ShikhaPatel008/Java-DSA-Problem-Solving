package OOP;

public class PassingClassesToMethods {
    public static class Car {
        int seats, torque;
        String name, type;
        double length;

        //print() method is declared inside the user defined class and can be used to print value of multiple object by calling the method into main method to print the details of object
         void print(){
            System.out.println(seats+" "+name+" "+length+"m "+type+" "+torque+"Nm ");
        }
    }

    static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonnet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        change(c);  // passing object c to change method : objects are passed by reference to methods,, same as in array (shallow copy)
        System.out.println(c.seats); // seats changed from 5 to 4
        c.print();
    }

    private static void change(Car c){
        c.seats = 4;
    }

}

