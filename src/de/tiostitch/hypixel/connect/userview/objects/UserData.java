package de.tiostitch.hypixel.connect.userview.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public final class UserData {

    @SerializedName("success")
    private boolean success;

    @SerializedName("profiles")
    ArrayList<ProfilesData> profiles;
}
