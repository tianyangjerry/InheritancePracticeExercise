package org.example;

public class MusicConcertEvent extends Event implements CalculateEventCostInterface {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    public MusicConcertEvent() {
    }

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    public double calculateEventCost() {
        double totalCost = super.getEventCost();
        if (merchandiseRequired) {
            totalCost += merchandiseCost * super.getTotalParticipants() * super.getTotalEventDays();
        }
        System.out.println("Total cost of the event is: " + totalCost);
        return totalCost;
    }

    @Override
    public String toString() {
        return "MusicConcertEvent{" +
                "merchandiseRequired=" + merchandiseRequired +
                ", merchandiseCost=" + merchandiseCost +
                '}';
    }
}
