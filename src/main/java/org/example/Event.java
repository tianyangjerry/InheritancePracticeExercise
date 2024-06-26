package org.example;
public class Event {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;

    public Event() {
    }

    public Event(String eventID, String eventName, String eventLocation,
                 String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }

    public double getEventCost() {
        return eventCost;
    }
    public int getTotalParticipants() {
        return totalParticipants;
    }

    public int getTotalEventDays() {
        return totalEventDays;
    }

    //public abstract double calculateEventCost();

    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventLocation='" + eventLocation + '\'' +
                ", eventPointOfContact='" + eventPointOfContact + '\'' +
                ", eventCost=" + eventCost +
                ", totalParticipants=" + totalParticipants +
                ", totalEventDays=" + totalEventDays +
                '}';
    }
}
