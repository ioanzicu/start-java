package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;
    private String color;

    public Car(String name, int cylinders, int doors, String color) {
        this.name = name;
        this.cylinders = cylinders;
        this.doors = doors;
        this.color = color;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }
}

class LandRover extends Car {
    public LandRover() {
        super("Land Rover", 6, 5, "Dark blue");
    }

    @Override
    public String startEngine() {
        return "Land Rover -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Land Rover -> accelerate()";
    }

    @Override
    public String brake() {
        return "Land Rover -> brake()";
    }
}

class ChevroletCamaro extends Car {
    public ChevroletCamaro() {
        super("Chevrolet Camaro", 6, 2, "Yellow");
    }

    @Override
    public String startEngine() {
        return "Bumbelby -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Bumbelby -> accelerate()";
    }

    @Override
    public String brake() {
        return "Bumbelby -> brake()";
    }
}

class FordMustang extends Car {
    public FordMustang() {
        super("Ford Mustand", 6, 2, "Red");
    }

    @Override
    public String startEngine() {
        return "Ford Mustang -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford Mustang -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford Mustang -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	    for(int i=1;i <11; i++){
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName() + "\n" +
                    "Start Engine: " + car.startEngine() + "\n" +
                    "Accelerate: " + car.accelerate() + "\n" +
                    "Brake: " + car.brake());
            System.out.println("=================================");
        }
    }

    public static Car randomCar() {
        int randomCar = (int) (Math.random() * 3) + 1;
        switch (randomCar) {
            case 1:
                return new LandRover();
            case 2:
                return new ChevroletCamaro();
            case 3:
                return new FordMustang();
        }

        return null;
    }
}
