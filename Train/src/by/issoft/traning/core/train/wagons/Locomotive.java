package by.issoft.traning.core.train.wagons;

import by.issoft.traning.core.userInfo.User;

public class Locomotive extends Wagon {

    private final int speed;
    private final User driver;

    public Locomotive( String route, User driver, int speed) {
        super(WagonType.LOCOMOTIVE, route);
        this.driver = driver;
        this.speed = speed;
    }

    public User getDriver() {
        return driver;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getInfo(){
        return getRoute() + " " + getType() + " " + getWagonNumber() + " " + getDriver() + " " + getSpeed();
    }

}
