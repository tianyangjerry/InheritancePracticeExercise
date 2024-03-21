package org.example;

public class ConferenceEvent extends Event{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    public ConferenceEvent() {
    }

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost, boolean dinnerRequired, double dinnerCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    @Override
    public String toString() {
        return "ConferenceEvent{" +
                "breakfastRequired=" + breakfastRequired +
                ", breakfastCost=" + breakfastCost +
                ", lunchRequired=" + lunchRequired +
                ", lunchCost=" + lunchCost +
                ", dinnerRequired=" + dinnerRequired +
                ", dinnerCost=" + dinnerCost +
                '}';
    }

    @Override
    public double calculateEventCost() {
        double totalCost = super.getEventCost();
        if (breakfastRequired) {
            totalCost += breakfastCost;
        }
        if (lunchRequired) {
            totalCost += lunchCost;
        }
        if (dinnerRequired) {
            totalCost += dinnerCost;
        }
        return totalCost;
    }
}
