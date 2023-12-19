package ru.kuzinatra.seaportrevenuecalculator.entity;

public abstract class SeaPortIncome implements Income {
    private String incomeName;
    private int monthIncome;

    public SeaPortIncome(String incomeName, int monthIncome) {
        this.incomeName = incomeName;
        this.monthIncome = monthIncome;
    }

    public String getIncomeName() {
        return incomeName;
    }

    @Override
    public int compute() {
        return monthIncome;
    }
}
