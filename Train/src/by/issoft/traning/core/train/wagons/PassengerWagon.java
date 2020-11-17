package by.issoft.traning.core.train.wagons;

import by.issoft.traning.core.userInfo.User;

public class PassengerWagon extends Wagon {

    private final Integer numberOfSeats = 16;
    private final User[] passengers = new User[numberOfSeats];
    private int countOfPassengers = 0;

    public PassengerWagon(String route) {
        super(WagonType.PASSENGER_WAGON, route);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void addPassengers (User... passengers){ // todo как в карго и добавить комент что метод принимает - возвращает
        for(int i = 0; i < passengers.length; i++){
            this.passengers[i] = passengers[i];
            countOfPassengers++;
        }
    }

    @Override
    public String getInfo(){
        return "RailwayCarriage - " + getType() + " go to - " + getRoute() + " get "  + getNumberOfSeats()
                + " seats and " + countOfPassengers + " passenger(s)" + " " + getWagonNumber();
    }
}
