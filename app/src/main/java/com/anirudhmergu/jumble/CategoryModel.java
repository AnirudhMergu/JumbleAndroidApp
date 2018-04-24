package com.anirudhmergu.jumble;

public class CategoryModel {
    private int image;
    private String category, description;

    public CategoryModel(int image, String category, String description) {
        this.image = image;
        this.category = category;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
