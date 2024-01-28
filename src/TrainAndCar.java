class TrainCar {
    private int capacity;

    public TrainCar(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}


class Locomotive extends TrainCar {
    public Locomotive(int capacity) {
        super(capacity);
    }
}


class PassengerCar extends TrainCar {
    public PassengerCar(int capacity) {
        super(capacity);
    }
}


class FreightCar extends TrainCar {
    public FreightCar(int capacity) {
        super(capacity);
    }
}


class Train {
    private TrainCar[] cars;

    public Train(TrainCar[] cars) {
        this.cars = cars;
    }


    public int SumCap() {
        int totalCapacity = 0;
        for (TrainCar car : cars) {
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }
}

public class TrainAndCar {
    public static void main(String[] args) {
        Locomotive locomotive = new Locomotive(100);
        PassengerCar passengerCar1 = new PassengerCar(50);
        PassengerCar passengerCar2 = new PassengerCar(60);
        FreightCar freightCar1 = new FreightCar(200);


        TrainCar[] trainCars = {locomotive, passengerCar1, passengerCar2, freightCar1};
        Train myTrain = new Train(trainCars);


        System.out.println("Total Carrying Capacity of the Train: " + myTrain.SumCap());
    }
}
