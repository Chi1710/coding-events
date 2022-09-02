package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;
    @NotBlank(message = "Name is required.")
    @Size(min=3, max=50, message = "Name must be between 3 and 5 characters.")
    private String name;
    @Size(max=500, message = "Description is too long.")
    private String description;
    @Email(message = "Invalid email.Try again.")
    @NotBlank(message = "Email is required.")
    private String contactEmail;

    @NotBlank(message = "Location cannot be blank.")
    private String location;

    @AssertTrue(message = "This event must have attendees register.")
    private boolean register = true;
    @Positive(message = "Number of attendees must be one or more")
    private int numOfAttendees;

    private EventType eventType;



    public Event(String name, String description, String contactEmail, String location,
                  Integer numOfAttendees, EventType type) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.numOfAttendees = numOfAttendees;
        this.eventType = eventType;

    }

    public Event() { this.id=nextId; nextId++;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getRegister() {
        return register;
    }

    public void setRegister(Boolean register) {
        this.register = register;
    }

    public int getNumOfAttendees() {
        return numOfAttendees;
    }

    public void setNumOfAttendees(int numOfAttendees) {
        this.numOfAttendees = numOfAttendees;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
