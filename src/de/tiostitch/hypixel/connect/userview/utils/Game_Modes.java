package de.tiostitch.hypixel.connect.userview.utils;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum Game_Modes {
    normal("Normal"),
    island("Ilha"),
    ironman("Iron Man"),
    bingo("Bingo");

    private final String name;

    public static String getMode(Game_Modes modes) {
        boolean hasMode = Arrays.stream(values()).anyMatch(mode -> mode == modes);
        return hasMode ? modes.name : normal.name;
    }
}
