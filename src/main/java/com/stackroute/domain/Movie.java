package com.stackroute.domain;

import java.util.List;

/*
Displays actor information for respective movies.
 */

public class Movie {

    private Actor actor;

    public Movie() {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayInformation() {
        actor.display();
    }
}
