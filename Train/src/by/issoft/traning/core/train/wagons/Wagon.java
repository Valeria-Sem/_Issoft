package by.issoft.traning.core.train.wagons;

public abstract class Wagon {

    private final WagonType type; // ToDo подумать удалить ???
    private final String route;
    private Wagon next;
    private int wagonNumber;
    private Wagon previous;

    protected Wagon(WagonType type, String route) {
        this.type = type;
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public WagonType getType() {
        return type;
    }

    public Wagon getNext() {
        return next;
    }

    public void setNext(Wagon next) {
        this.next = next;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }

    public void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    public Wagon getPrevious() {
        return previous;
    }

    public void setPrevious(Wagon previous) {
        this.previous = previous;
    }

    public String getInfo(){
        return getRoute() + " " + getType() + " " + getWagonNumber();
    }
}
