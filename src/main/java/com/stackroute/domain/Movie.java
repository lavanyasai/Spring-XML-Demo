package com.stackroute.domain;

/*
Displays actor information for respective movies.
 */

public class Movie {

    private Actor actor;

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
