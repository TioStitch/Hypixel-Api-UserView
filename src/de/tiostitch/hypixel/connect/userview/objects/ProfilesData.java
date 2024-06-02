package de.tiostitch.hypixel.connect.userview.objects;

import com.google.gson.annotations.SerializedName;
import de.tiostitch.hypixel.connect.userview.utils.Game_Modes;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public final class ProfilesData {

    @SerializedName("profile_id")
    private String profile_id;

    @SerializedName("cute_name")
    private String cute_name;

    @SerializedName("selected")
    private boolean selected;

    @SerializedName("banking")
    private Banking banking;

    @SerializedName("game_mode")
    private Game_Modes game_mode;
}
