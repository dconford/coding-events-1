package org.launchcode.codingevents.models;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
=======
import javax.validation.constraints.*;
import java.util.Objects;
>>>>>>> 37d0ed2ea8ff116cac622f86179a4df9e9ce7a91

/**
 * Created by Chris Bay
 */
@Entity
public class Event extends AbstractEntity {
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotEmpty(message = "for testing, enter a non character please.")
    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

<<<<<<< HEAD
    @ManyToOne
    @NotNull(message = "Category is required")
    private EventCategory eventCategory;

    public Event(String name, String description, String contactEmail, EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.eventCategory = eventCategory;
=======
    //Add a field to collect information about where the event will take place. This field should not be null or blank.
    @NotBlank(message = "Location is required! Please enter Event Location.")
    @Size(min = 2, max = 256, message = "Location Description should be between 2 and 256 characters." )
    private String eventLocation;

    //Add a field to collect information about whether an attendee must register for the event or not.
    // For the purposes of validation practice, make this field only able to be marked as true.
    @AssertTrue(message = "Registration is Mandatory!")
    private Boolean registrationRequired;

    //Add a field to collect information about the number of attendees for the event.
    // Valid values for this field should be any number over zero.
    @NotNull(message = "Must be at least 1 attending.")
    @Min(value = 1, message = "minimum of 1. Event creator must commit to attending event.")
    private Integer numberAttending;

    public Event(String name, String description, String contactEmail, String eventLocation,
                 Boolean registrationRequired, Integer numberAttending ) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.eventLocation = eventLocation;
        this.registrationRequired = registrationRequired;
        this.numberAttending = numberAttending;
    }

    public Event() {
        this.id = nextId;
        nextId++;
>>>>>>> 37d0ed2ea8ff116cac622f86179a4df9e9ce7a91
    }

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

<<<<<<< HEAD
    public EventCategory getEventCategory() {
        return eventCategory;
=======
    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public Integer getNumberAttending() {
        return numberAttending;
    }

    public void setNumberAttending(Integer numberAttending) {
        this.numberAttending = numberAttending;
    }

    public int getId() {
        return id;
>>>>>>> 37d0ed2ea8ff116cac622f86179a4df9e9ce7a91
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return name;
    }

}
