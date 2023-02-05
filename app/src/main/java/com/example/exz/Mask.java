package com.example.exz;

import android.os.Parcel;
import android.os.Parcelable;

public class Mask implements Parcelable{
    private  int ID;
    private String Name;
    private String Power;
    private String Image;
    public Mask(int ID, String Name, String Power, String Image){
        this.ID = ID;
        this.Image = Image;
        this.Name = Name;
        this.Power = Power;
    }

    protected Mask(Parcel in) {
        ID = in.readInt();
        Name = in.readString();
        Power = in.readString();
        Image = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ID);
        dest.writeString(Name);
        dest.writeString(Power);
        dest.writeString(Image);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Mask> CREATOR = new Creator<Mask>() {
        @Override
        public Mask createFromParcel(Parcel in) {
            return new Mask(in);
        }

        @Override
        public Mask[] newArray(int size) {
            return new Mask[size];
        }
    };

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}