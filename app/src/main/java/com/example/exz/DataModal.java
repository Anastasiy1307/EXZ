package com.example.exz;

public class DataModal {

    private String Power;
    private String Name;
    private String Image;

    public DataModal(String Power, String Name, String Image)
    {
        this.Power= Power;
        this.Name= Name;
        this.Image = Image;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}