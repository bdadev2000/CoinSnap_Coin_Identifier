package com.cooldev.gba.emulator.gameboy.features.home.models;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class KindGame {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ KindGame[] $VALUES;
    public static final KindGame GB_LEFT = new KindGame("GB_LEFT", 0);
    public static final KindGame GB_RIGHT = new KindGame("GB_RIGHT", 1);
    public static final KindGame NES_LEFT = new KindGame("NES_LEFT", 2);
    public static final KindGame NES_RIGHT = new KindGame("NES_RIGHT", 3);
    public static final KindGame DESMUME_LEFT = new KindGame("DESMUME_LEFT", 4);
    public static final KindGame DESMUME_RIGHT = new KindGame("DESMUME_RIGHT", 5);
    public static final KindGame MELONDS_NDS_LEFT = new KindGame("MELONDS_NDS_LEFT", 6);
    public static final KindGame MELONDS_NDS_RIGHT = new KindGame("MELONDS_NDS_RIGHT", 7);
    public static final KindGame PSX_LEFT = new KindGame("PSX_LEFT", 8);
    public static final KindGame PSX_RIGHT = new KindGame("PSX_RIGHT", 9);
    public static final KindGame PSX_DUALSHOCK_LEFT = new KindGame("PSX_DUALSHOCK_LEFT", 10);
    public static final KindGame PSX_DUALSHOCK_RIGHT = new KindGame("PSX_DUALSHOCK_RIGHT", 11);
    public static final KindGame PSP_LEFT = new KindGame("PSP_LEFT", 12);
    public static final KindGame PSP_RIGHT = new KindGame("PSP_RIGHT", 13);
    public static final KindGame SNES_LEFT = new KindGame("SNES_LEFT", 14);
    public static final KindGame SNES_RIGHT = new KindGame("SNES_RIGHT", 15);
    public static final KindGame GBA_LEFT = new KindGame("GBA_LEFT", 16);
    public static final KindGame GBA_RIGHT = new KindGame("GBA_RIGHT", 17);
    public static final KindGame SMS_LEFT = new KindGame("SMS_LEFT", 18);
    public static final KindGame SMS_RIGHT = new KindGame("SMS_RIGHT", 19);
    public static final KindGame GG_LEFT = new KindGame("GG_LEFT", 20);
    public static final KindGame GG_RIGHT = new KindGame("GG_RIGHT", 21);
    public static final KindGame LYNX_LEFT = new KindGame("LYNX_LEFT", 22);
    public static final KindGame LYNX_RIGHT = new KindGame("LYNX_RIGHT", 23);
    public static final KindGame PCE_LEFT = new KindGame("PCE_LEFT", 24);
    public static final KindGame PCE_RIGHT = new KindGame("PCE_RIGHT", 25);
    public static final KindGame DOS_LEFT = new KindGame("DOS_LEFT", 26);
    public static final KindGame DOS_RIGHT = new KindGame("DOS_RIGHT", 27);
    public static final KindGame NGP_LEFT = new KindGame("NGP_LEFT", 28);
    public static final KindGame NGP_RIGHT = new KindGame("NGP_RIGHT", 29);
    public static final KindGame WS_LANDSCAPE_LEFT = new KindGame("WS_LANDSCAPE_LEFT", 30);
    public static final KindGame WS_LANDSCAPE_RIGHT = new KindGame("WS_LANDSCAPE_RIGHT", 31);
    public static final KindGame WS_PORTRAIT_LEFT = new KindGame("WS_PORTRAIT_LEFT", 32);
    public static final KindGame WS_PORTRAIT_RIGHT = new KindGame("WS_PORTRAIT_RIGHT", 33);
    public static final KindGame N64_LEFT = new KindGame("N64_LEFT", 34);
    public static final KindGame N64_RIGHT = new KindGame("N64_RIGHT", 35);
    public static final KindGame GENESIS_3_LEFT = new KindGame("GENESIS_3_LEFT", 36);
    public static final KindGame GENESIS_3_RIGHT = new KindGame("GENESIS_3_RIGHT", 37);
    public static final KindGame GENESIS_6_LEFT = new KindGame("GENESIS_6_LEFT", 38);
    public static final KindGame GENESIS_6_RIGHT = new KindGame("GENESIS_6_RIGHT", 39);
    public static final KindGame ATARI2600_LEFT = new KindGame("ATARI2600_LEFT", 40);
    public static final KindGame ATARI2600_RIGHT = new KindGame("ATARI2600_RIGHT", 41);
    public static final KindGame ARCADE_4_LEFT = new KindGame("ARCADE_4_LEFT", 42);
    public static final KindGame ARCADE_4_RIGHT = new KindGame("ARCADE_4_RIGHT", 43);
    public static final KindGame ARCADE_6_LEFT = new KindGame("ARCADE_6_LEFT", 44);
    public static final KindGame ARCADE_6_RIGHT = new KindGame("ARCADE_6_RIGHT", 45);
    public static final KindGame ATARI7800_LEFT = new KindGame("ATARI7800_LEFT", 46);
    public static final KindGame ATARI7800_RIGHT = new KindGame("ATARI7800_RIGHT", 47);
    public static final KindGame NINTENDO_3DS_LEFT = new KindGame("NINTENDO_3DS_LEFT", 48);
    public static final KindGame NINTENDO_3DS_RIGHT = new KindGame("NINTENDO_3DS_RIGHT", 49);

    private static final /* synthetic */ KindGame[] $values() {
        return new KindGame[]{GB_LEFT, GB_RIGHT, NES_LEFT, NES_RIGHT, DESMUME_LEFT, DESMUME_RIGHT, MELONDS_NDS_LEFT, MELONDS_NDS_RIGHT, PSX_LEFT, PSX_RIGHT, PSX_DUALSHOCK_LEFT, PSX_DUALSHOCK_RIGHT, PSP_LEFT, PSP_RIGHT, SNES_LEFT, SNES_RIGHT, GBA_LEFT, GBA_RIGHT, SMS_LEFT, SMS_RIGHT, GG_LEFT, GG_RIGHT, LYNX_LEFT, LYNX_RIGHT, PCE_LEFT, PCE_RIGHT, DOS_LEFT, DOS_RIGHT, NGP_LEFT, NGP_RIGHT, WS_LANDSCAPE_LEFT, WS_LANDSCAPE_RIGHT, WS_PORTRAIT_LEFT, WS_PORTRAIT_RIGHT, N64_LEFT, N64_RIGHT, GENESIS_3_LEFT, GENESIS_3_RIGHT, GENESIS_6_LEFT, GENESIS_6_RIGHT, ATARI2600_LEFT, ATARI2600_RIGHT, ARCADE_4_LEFT, ARCADE_4_RIGHT, ARCADE_6_LEFT, ARCADE_6_RIGHT, ATARI7800_LEFT, ATARI7800_RIGHT, NINTENDO_3DS_LEFT, NINTENDO_3DS_RIGHT};
    }

    static {
        KindGame[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private KindGame(String str, int i2) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static KindGame valueOf(String str) {
        return (KindGame) Enum.valueOf(KindGame.class, str);
    }

    public static KindGame[] values() {
        return (KindGame[]) $VALUES.clone();
    }
}
