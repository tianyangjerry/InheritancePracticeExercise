package org.example;

import java.util.Scanner;
public class Main {
    static public double sum = 0.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many events would you like to organize?");
        int numberOfEvents = scanner.nextInt();
        for (int i = 0; i < numberOfEvents; ++ i) {
            System.out.println("Enter the type of event you would like to organize: ");
            System.out.println("1. Conference Event");
            System.out.println("2. Music Concert Event");
            int eventType = scanner.nextInt();
            if (eventType == 1) { //choose conference event
                System.out.println("Enter the event ID: ");
                String eventID = scanner.next();
                System.out.println("Enter the event name: ");
                String eventName = scanner.next();
                System.out.println("Enter the event location: ");
                String eventLocation = scanner.next();
                System.out.println("Enter the event point of contact: ");
                String eventPointOfContact = scanner.next();
                System.out.println("Enter the event cost: ");
                double eventCost = scanner.nextDouble();
                System.out.println("Enter the total number of participants: ");
                int totalParticipants = scanner.nextInt();
                System.out.println("Enter the total number of event days: ");
                int totalEventDays = scanner.nextInt();
                System.out.println("Is breakfast required? (true/false): ");
                boolean breakfastRequired = scanner.nextBoolean();
                double breakfastCost = 0;
                if (breakfastRequired) {
                    System.out.println("Enter the cost of organizing breakfast: ");
                    breakfastCost = scanner.nextDouble();
                }
                System.out.println("Is lunch required? (true/false): ");
                boolean lunchRequired = scanner.nextBoolean();
                double lunchCost = 0;
                if (lunchRequired) {
                    System.out.println("Enter the cost of organizing lunch: ");
                    lunchCost = scanner.nextDouble();
                }
                System.out.println("Is dinner required? (true/false): ");
                boolean dinnerRequired = scanner.nextBoolean();
                double dinnerCost = 0;
                if (dinnerRequired) {
                    System.out.println("Enter the cost of organizing dinner: ");
                    dinnerCost = scanner.nextDouble();
                }
                ConferenceEvent conferenceEvent = new ConferenceEvent(eventID, eventName, eventLocation,
                        eventPointOfContact, eventCost, totalParticipants, totalEventDays,
                        breakfastRequired, breakfastCost, lunchRequired, lunchCost, dinnerRequired, dinnerCost);
                sum += conferenceEvent.calculateEventCost();
                System.out.println(conferenceEvent);
                //System.out.println("The total cost of organizing the conference event is: " + conferenceEvent.calculateEventCost());
            }
            else if (eventType == 2) { //choose music concert event
                System.out.println("Enter the event ID: ");
                String eventID = scanner.next();
                System.out.println("Enter the event name ");
                String eventName = scanner.next();
                System.out.println("Enter the event location: ");
                String eventLocation = scanner.next();
                System.out.println("Enter the event point of contact: ");
                String eventPointOfContact = scanner.next();
                System.out.println("Enter the event cost: ");
                double eventCost = scanner.nextDouble();
                System.out.println("Enter the total number of participants: ");
                int totalParticipants = scanner.nextInt();
                System.out.println("Enter the total number of event days: ");
                int totalEventDays = scanner.nextInt();
                System.out.println("Is merchandise required? (true/false): ");
                boolean merchandiseRequired = scanner.nextBoolean();
                double merchandiseCost = 0;
                if (merchandiseRequired) {
                    System.out.println("Enter the cost of providing merchandise: ");
                    merchandiseCost = scanner.nextDouble();
                }
                MusicConcertEvent musicConcertEvent = new MusicConcertEvent(eventID, eventName,
                        eventLocation, eventPointOfContact, eventCost, totalParticipants,
                        totalEventDays, merchandiseRequired, merchandiseCost);
                sum += musicConcertEvent.calculateEventCost();
                System.out.println(musicConcertEvent);
                //System.out.println("The total cost of organizing the music concert event is: " + musicConcertEvent.calculateEventCost());
            }
        }
        System.out.println("The total cost of organizing all events is: " + sum);
    }
}
