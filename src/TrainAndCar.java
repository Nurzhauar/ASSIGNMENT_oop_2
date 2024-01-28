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

class PassengerCountCar extends TrainCar {
    private int passengerCount;

    public PassengerCountCar (int capacity, int passengerCount) {
        super(capacity);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCountCar () {
        return passengerCount;
    }

    public void setPassengerCountCar (int passengerCount) {
        this.passengerCount = passengerCount;
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


    public int totalPassengerCount() {
        int totalPassengers = 0;
        for (TrainCar car : cars) {
            if (car instanceof PassengerCountCar) {
                totalPassengers += ((PassengerCountCar) car).getPassengerCountCar();
            }
        }
        return totalPassengers;
    }
}

public class TrainAndCar {
    public static void main(String[] args) {
        Locomotive locomotive = new Locomotive(100);
        PassengerCar passengerCar1 = new PassengerCar(50);
        PassengerCar passengerCar2 = new PassengerCar(60);
        PassengerCountCar passengerCountCar1 = new PassengerCountCar(50, 12);
        PassengerCountCar passengerCountCar2 = new PassengerCountCar(60, 28);
        FreightCar freightCar1 = new FreightCar(200);

        TrainCar[] trainCars = {locomotive, passengerCountCar1, passengerCountCar2 ,passengerCar1, passengerCar2, freightCar1};
        Train myTrain = new Train(trainCars);

        System.out.println("Total Passenger Count of the Train: " + myTrain.totalPassengerCount());
    }
}