package by.issoft.traning.core.train;

import by.issoft.traning.core.train.wagons.*;

public class WagonFactory {

    public Wagon getTrain(WagonData data){
        switch (data.getType()){
            case CARGO_WAGON:
                return new CargoWagon(data.getRoute());
            case LOCOMOTIVE:
                return new Locomotive(data.getRoute(), data.getDriver(), data.getSpeed());
            case PASSENGER_WAGON:
                return new PassengerWagon(data.getRoute());
            default:
                throw new IllegalArgumentException("Wrong railwayCarriage type: " + data.getType());
        }
    }
}
