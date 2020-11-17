package by.issoft.traning.core.train.wagons;

import by.issoft.traning.core.train.Cargo;

import java.util.HashSet;
import java.util.Set;

public class CargoWagon extends Wagon {

    private final int carryingCapacity = 400;
    private double loading = 0;
    Set<Cargo> loadedCargos = new HashSet<>();


    public CargoWagon(String route) {
        super(WagonType.CARGO_WAGON, route);
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }


    public void setRailwayCarriageNumber(int railwayCarriageNumber) {      //todo валидация
    }

    public void loadCargo(Cargo... cargos){ //todo убрать эксепшины, реализовать автоматическую погрузку грузов и досоздание вагонов
        for (Cargo cargo : cargos) {
            if (carryingCapacity < loading + cargo.getTotalWeight()) {
                throw new RuntimeException("Cargos: " + cargo.getDescription() + " with total weight = " +
                        cargo.getTotalWeight() + " too heavy for this railway carriage - " );
            }
            System.out.println("Cargos: " + cargo.getDescription() + " with total weight = " +
                    cargo.getTotalWeight() + " was loaded into railway carriage № " +
                    " with carrying capacity = " + carryingCapacity);
            this.loadedCargos.add(cargo);
            loading += cargo.getTotalWeight();
            System.out.println("Now loading = " + loading);
        }
    }

    @Override
    public String getInfo(){
        return getRoute() + " " + getType() + " " + getWagonNumber() + " " + getCarryingCapacity();
    }
}

