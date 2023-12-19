package ru.kuzinatra.seaportrevenuecalculator.entity;

public class SeaPortShipsMaintenanceIncome extends SeaPortIncome {
    private int shipsNumber;

    public SeaPortShipsMaintenanceIncome(String incomeName, int shipsNumber, int monthIncome) {
        super(incomeName, monthIncome);
        this.shipsNumber = shipsNumber;
    }

    @Override
    public int compute() {
        return super.compute() * shipsNumber;
    }
}
