package main.java.de.tuberlin.tkn.lit.model.actors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.tuberlin.tkn.lit.model.Actor;

import javax.persistence.*;
@Entity
@Table(name = "persons")
public class Person extends Actor {

    private String first_name;
    private String last_name;
    private String user_name;

    @JsonIgnore
    private static final String TYPE_NAME = "Person";

    public Person() {
    }

    //# Konstruktoren
    public Person(String name) {
        super(name);
    }

    public Person(Actor actor) {
        super(actor);
    }

    //# Last Name
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    //# First Name
    public String getFirst_name() { return first_name; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }

    //# User Name
    public String getUser_name() { return user_name; }

    public void setUser_name(String user_name) { this.user_name = user_name; }

}
