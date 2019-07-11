package com.stackroute.domain;

import java.util.List;

/*
Displays actor information for respective movies.
 */

public class Movie {

    private List<Actor> actor;

    public Movie(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public void displayInformation() {
        for(Actor actor: actor) {
            actor.display();
        }
    }
}
