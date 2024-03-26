package org.example;

/*
Now, go to your ConferenceEvent class and do the following changes:
o Create the variables (eventID, eventName, eventLocation, pointOfContact) that you had in the
Event class

Inside the ConferenceEvent() constructor, instantiate the above object.
 */

public class ConferenceEvent extends Event implements CalculateEventCostInterface{
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private boolean breakfastRequired;
    private double breakfastCost;

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventPointOfContact() {
        return eventPointOfContact;
    }

    public void setEventPointOfContact(String eventPointOfContact) {
        this.eventPointOfContact = eventPointOfContact;
    }

    public boolean isBreakfastRequired() {
        return breakfastRequired;
    }

    public void setBreakfastRequired(boolean breakfastRequired) {
        this.breakfastRequired = breakfastRequired;
    }

    public double getBreakfastCost() {
        return breakfastCost;
    }

    public void setBreakfastCost(double breakfastCost) {
        this.breakfastCost = breakfastCost;
    }

    public boolean isLunchRequired() {
        return lunchRequired;
    }

    public void setLunchRequired(boolean lunchRequired) {
        this.lunchRequired = lunchRequired;
    }

    public double getLunchCost() {
        return lunchCost;
    }

    public void setLunchCost(double lunchCost) {
        this.lunchCost = lunchCost;
    }

    public boolean isDinnerRequired() {
        return dinnerRequired;
    }

    public void setDinnerRequired(boolean dinnerRequired) {
        this.dinnerRequired = dinnerRequired;
    }

    public double getDinnerCost() {
        return dinnerCost;
    }

    public void setDinnerCost(double dinnerCost) {
        this.dinnerCost = dinnerCost;
    }

    public CalculateEventCostClass getCalculateEventCostObject() {
        return calculateEventCostObject;
    }

    public void setCalculateEventCostObject(CalculateEventCostClass calculateEventCostObject) {
        this.calculateEventCostObject = calculateEventCostObject;
    }

    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    CalculateEventCostClass calculateEventCostObject = new CalculateEventCostClass();

    public ConferenceEvent() {
    }

    public ConferenceEvent(String eventID, String eventName,
                           String eventLocation, String eventPointOfContact,
                           double eventCost, int totalParticipants, int totalEventDays,
                           boolean breakfastRequired, double breakfastCost, boolean lunchRequired,
                           double lunchCost, boolean dinnerRequired, double dinnerCost) {
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

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

    /*public double calculateEventCost() {
        double totalCost = super.getEventCost();
        //System.out.println(totalCost);
        if (breakfastRequired) {
            totalCost += breakfastCost * super.getTotalParticipants() * super.getTotalEventDays();
        }
        if (lunchRequired) {
            totalCost += lunchCost * super.getTotalEventDays() * super.getTotalParticipants();
        }
        if (dinnerRequired) {
            totalCost += dinnerCost * super.getTotalEventDays() * super.getTotalParticipants();
        }
        return totalCost;
    }*/

    public double calculateEventCost(){
        return calculateEventCostObject.calculateEventCost() +
                (calculateEventCostObject.calculateEventCost() * 0.3);
    }
}
