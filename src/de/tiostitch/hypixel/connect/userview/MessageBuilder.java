package de.tiostitch.hypixel.connect.userview;

import de.tiostitch.hypixel.connect.userview.objects.ProfilesData;
import de.tiostitch.hypixel.connect.userview.utils.Game_Modes;
import de.tiostitch.hypixel.connect.userview.utils.Colors;

public final class MessageBuilder {

    public static void sendProfile(ProfilesData profileData, int profile) {
        final StringBuilder stringBuilder = new StringBuilder();

        final String AQUA = Colors.AQUA.getANSI();
        final String GOLDEN = Colors.RED.getANSI();
        final String GRAY = Colors.DARK_GRAY.getANSI();
        final String PINK = Colors.RGB("243","145", "255");

        stringBuilder.append(AQUA).append("PERFIL ").append(profile).append("\n\n");

        stringBuilder.append(GOLDEN).append(" Id do Perfil: ").append(PINK)
                .append(profileData.getProfile_id()).append("\n");

        stringBuilder.append(GOLDEN).append(" Nome do Perfil: ").append(PINK)
                .append(profileData.getCute_name()).append("\n");

        stringBuilder.append(GOLDEN).append(" Modo de Jogo: ").append(PINK)
                .append(Game_Modes.getMode(profileData.getGame_mode())).append("\n\n");

        System.out.println(stringBuilder);
    }
}
