package by.issoft.traning.core.train.wagons;

import by.issoft.traning.core.userInfo.User;

public class WagonData {
    private final WagonType type;
    private final String route;
    private Integer speed;
    private User driver;

    public WagonData(WagonType type, String route) {
        this.type = type;
        this.route = route;
    }

    public WagonData(WagonType type, String route, Integer speed, User driver) {
        this.type = type;
        this.route = route;
        this.speed = speed;
        this.driver = driver;
    }

    public WagonType getType() {
        return type;
    }

    public String getRoute() {
        return route;
    }

    public Integer getSpeed() {
        return speed;
    }

    public User getDriver() {
        return driver;
    }

}
