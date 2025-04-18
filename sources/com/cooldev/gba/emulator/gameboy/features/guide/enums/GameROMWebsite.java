package com.cooldev.gba.emulator.gameboy.features.guide.enums;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class GameROMWebsite {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GameROMWebsite[] $VALUES;

    @NotNull
    private final String title;

    @NotNull
    private final String url;
    public static final GameROMWebsite RETROGAMESAPP = new GameROMWebsite("RETROGAMESAPP", 0, "retrogamesapp.com", "https://www.retrogamesapp.com");
    public static final GameROMWebsite EMULATOR_GAMES = new GameROMWebsite("EMULATOR_GAMES", 1, "emulatorgames.net", "https://www.emulatorgames.net");
    public static final GameROMWebsite WOWROMS = new GameROMWebsite("WOWROMS", 2, "wowroms.com", "https://www.wowroms.com");
    public static final GameROMWebsite RETROSTIC = new GameROMWebsite("RETROSTIC", 3, "retrostic.com", "https://www.retrostic.com");
    public static final GameROMWebsite COOLROM = new GameROMWebsite("COOLROM", 4, "coolrom.com", "https://www.coolrom.com");
    public static final GameROMWebsite FREEROMS = new GameROMWebsite("FREEROMS", 5, "freeroms.com", "https://www.freeroms.com");
    public static final GameROMWebsite EMUPARADISE = new GameROMWebsite("EMUPARADISE", 6, "emuparadise.me", "https://www.emuparadise.me");
    public static final GameROMWebsite ROMULATION = new GameROMWebsite("ROMULATION", 7, "romulation.org", "https://www.romulation.org/");

    private static final /* synthetic */ GameROMWebsite[] $values() {
        return new GameROMWebsite[]{RETROGAMESAPP, EMULATOR_GAMES, WOWROMS, RETROSTIC, COOLROM, FREEROMS, EMUPARADISE, ROMULATION};
    }

    static {
        GameROMWebsite[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private GameROMWebsite(String str, int i2, String str2, String str3) {
        this.title = str2;
        this.url = str3;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GameROMWebsite valueOf(String str) {
        return (GameROMWebsite) Enum.valueOf(GameROMWebsite.class, str);
    }

    public static GameROMWebsite[] values() {
        return (GameROMWebsite[]) $VALUES.clone();
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
