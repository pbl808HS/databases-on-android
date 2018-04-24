package com.dpc_team.pbl.myrecipes.Models;

public class Recipe {
    // variables de la receta
    private String id,
            name,
            description,
            image,
            making;
    private int people,
            fav;

    // constructor
    public Recipe(String id, String name, String description, String image, String making, int people, int fav) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.making = making;
        this.people = people;
        this.fav = fav;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMaking() {
        return making;
    }

    public void setMaking(String making) {
        this.making = making;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getFav() {
        return fav;
    }

    public void setFav(int fav) {
        this.fav = fav;
    }
}
