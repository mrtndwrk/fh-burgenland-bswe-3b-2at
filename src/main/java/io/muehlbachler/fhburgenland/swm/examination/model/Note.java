package io.muehlbachler.fhburgenland.swm.examination.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;


/**
 * Represents a note that is associated with a person.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.NONE)
    private String id;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;
    private String content;

    /**
     * Creates a new Note.
     *
     * @param number   The unique identifier of the Note.
     * @param someNote The content of the Note.
     */
    public Note(String number, String someNote) {
        this.id = number;
        this.content = someNote;
    }

    /**
     * Creates a new Note.
     *
     * @param someNote The content of the Note.
     */
    public Note(String someNote) {
    }

    /**
     * Retrieves the Person that this Note belongs to.
     *
     * @return The Person that this Note belongs to.
     */
    @Override
    public String toString() {
        return "Note [belongsTo=" + this.person + ", text=" + this.content + "]";
    }
}
