package ru.ifmo.se.programming.kastricyn.people;


import ru.ifmo.se.programming.kastricyn.ActionStatus;
import ru.ifmo.se.programming.kastricyn.City;
import ru.ifmo.se.programming.kastricyn.people.face.Cheeks;
import ru.ifmo.se.programming.kastricyn.people.face.Eyes;
import ru.ifmo.se.programming.kastricyn.people.face.Face;
import ru.ifmo.se.programming.kastricyn.people.face.Nose;
import ru.ifmo.se.programming.kastricyn.Saleable;

public class Person extends Human implements IPerson {

    private String accost = "";
    private String lastName = "";
    private City homeCity = City.Other;
    private String ambassador = "";
    private Face face = new Face(new Eyes(), new Nose(), new Cheeks());

    public void setFace(Face face) {
        this.face = face;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public void setHomeCity(City homeCity) {
        this.homeCity = homeCity;
    }

    @Override
    public City getHomeCity() {
        return homeCity;
    }

    @Override
    public String inhabitantCity(City city) {
        if (homeCity.equals(city))
            return "житель " + city.toString() + "а";
        else return "приезжий из другого города";
    }

    @Override
    public String buy(String verb, Saleable thing) {
        String answ = verb;
        if (!thing.toString().isEmpty())
            answ += " " + thing.toString();
        return answ;
    }


    public void setAccost(String accost) {
        this.accost = accost;
    }

    public String getAccost() {
        return accost;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAmbassador(String ambassador) {
        this.ambassador = ambassador;
    }

    public String getAmbassador() {
        return ambassador;
    }



    public String toString() {
        return accost + " " + lastName + " " + ambassador;
    }

    public String toStringWithoutAmbassador() {
        return accost + " " + lastName;
    }

    public String smile(ActionStatus status) {
        return status + " улыбается";
    }

}
