package com.cooldev.gba.emulator.gameboy.features.home.models;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SystemID {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SystemID[] $VALUES;

    @NotNull
    private final String dbname;
    public static final SystemID NES = new SystemID("NES", 0, "nes");
    public static final SystemID SNES = new SystemID("SNES", 1, "snes");
    public static final SystemID GENESIS = new SystemID("GENESIS", 2, "md");
    public static final SystemID GB = new SystemID("GB", 3, "gb");
    public static final SystemID GBC = new SystemID("GBC", 4, "gbc");
    public static final SystemID GBA = new SystemID("GBA", 5, "gba");
    public static final SystemID N64 = new SystemID("N64", 6, "n64");
    public static final SystemID SMS = new SystemID("SMS", 7, "sms");
    public static final SystemID PSP = new SystemID("PSP", 8, "psp");
    public static final SystemID NDS = new SystemID("NDS", 9, "nds");
    public static final SystemID GG = new SystemID("GG", 10, "gg");
    public static final SystemID ATARI2600 = new SystemID("ATARI2600", 11, "atari2600");
    public static final SystemID PSX = new SystemID("PSX", 12, "psx");
    public static final SystemID FBNEO = new SystemID("FBNEO", 13, "fbneo");
    public static final SystemID MAME2003PLUS = new SystemID("MAME2003PLUS", 14, "mame2003plus");
    public static final SystemID PC_ENGINE = new SystemID("PC_ENGINE", 15, "pce");
    public static final SystemID LYNX = new SystemID("LYNX", 16, "lynx");
    public static final SystemID ATARI7800 = new SystemID("ATARI7800", 17, "atari7800");
    public static final SystemID SEGACD = new SystemID("SEGACD", 18, "scd");
    public static final SystemID NGP = new SystemID("NGP", 19, "ngp");
    public static final SystemID NGC = new SystemID("NGC", 20, "ngc");
    public static final SystemID WS = new SystemID("WS", 21, "ws");
    public static final SystemID WSC = new SystemID("WSC", 22, "wsc");
    public static final SystemID DOS = new SystemID("DOS", 23, "dos");
    public static final SystemID NINTENDO_3DS = new SystemID("NINTENDO_3DS", 24, "3ds");

    private static final /* synthetic */ SystemID[] $values() {
        return new SystemID[]{NES, SNES, GENESIS, GB, GBC, GBA, N64, SMS, PSP, NDS, GG, ATARI2600, PSX, FBNEO, MAME2003PLUS, PC_ENGINE, LYNX, ATARI7800, SEGACD, NGP, NGC, WS, WSC, DOS, NINTENDO_3DS};
    }

    static {
        SystemID[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private SystemID(String str, int i2, String str2) {
        this.dbname = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SystemID valueOf(String str) {
        return (SystemID) Enum.valueOf(SystemID.class, str);
    }

    public static SystemID[] values() {
        return (SystemID[]) $VALUES.clone();
    }

    @NotNull
    public final String getDbname() {
        return this.dbname;
    }
}
