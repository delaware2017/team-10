package com.example.nidhi.wholesomewave.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by nidhi on 11/3/17.
 */

public class User implements Parcelable {

    public static final ArrayList<User> usersList = new ArrayList<>();

    private String username;
    private String password;

    private String famName;
    private int memNum;
    private int totalAmount;

    private String email;

    public User(String username, String password, String famName, int memNum, int totalAmount) {
        this.username = username;
        this.password = password;
        this.famName = famName;
        this.memNum = memNum;
        this.totalAmount = totalAmount;
    }


    private User (Parcel in) {
        username = in.readString();
        password = in.readString();
        famName = in.readString();
        memNum = in.readInt();
        totalAmount = in.readInt();


    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(username);
        parcel.writeString(password);
        parcel.writeString(famName);
        parcel.writeInt(memNum);
        parcel.writeInt(totalAmount);
        //parcel.writeSerializable(userType);
    }


    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {

        /**
         * Creates a user based on the parcel
         * @param in the parcel from which to create the user.
         * @return the created user
         */
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        /**
         * Creates an array of users
         * @param i The size of the array
         * @return the array of users
         */
        @Override
        public User[] newArray(int i) {
            return new User[i];
        }
    };




}
