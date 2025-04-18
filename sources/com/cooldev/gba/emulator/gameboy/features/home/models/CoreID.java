package com.cooldev.gba.emulator.gameboy.features.home.models;

import b1.f0;
import k0.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CoreID {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CoreID[] $VALUES;

    @NotNull
    private final String coreDisplayName;

    @NotNull
    private final String coreName;

    @NotNull
    private final String libretroFileName;
    public static final CoreID STELLA = new CoreID("STELLA", 0, "stella", "Stella", "libstella_libretro_android.so");
    public static final CoreID FCEUMM = new CoreID("FCEUMM", 1, "fceumm", "FCEUmm", "libfceumm_libretro_android.so");
    public static final CoreID SNES9X = new CoreID("SNES9X", 2, "snes9x", "Snes9x", "libsnes9x_libretro_android.so");
    public static final CoreID GENESIS_PLUS_GX = new CoreID("GENESIS_PLUS_GX", 3, "genesis_plus_gx", "Genesis Plus GX", "libgenesis_plus_gx_libretro_android.so");
    public static final CoreID GAMBATTE = new CoreID("GAMBATTE", 4, "gambatte", "Gambatte", "libgambatte_libretro_android.so");
    public static final CoreID MGBA = new CoreID("MGBA", 5, "mgba", "mGBA", "libmgba_libretro_android.so");
    public static final CoreID MUPEN64_PLUS_NEXT = new CoreID("MUPEN64_PLUS_NEXT", 6, "mupen64plus_next_gles3", "Mupen64Plus", "libmupen64plus_next_gles3_libretro_android.so");
    public static final CoreID PCSX_REARMED = new CoreID("PCSX_REARMED", 7, "pcsx_rearmed", "PCSXReARMed", "libpcsx_rearmed_libretro_android.so");
    public static final CoreID PPSSPP = new CoreID("PPSSPP", 8, "ppsspp", "PPSSPP", "libppsspp_libretro_android.so");
    public static final CoreID FBNEO = new CoreID("FBNEO", 9, "fbneo", "FBNeo", "libfbneo_libretro_android.so");
    public static final CoreID MAME2003PLUS = new CoreID("MAME2003PLUS", 10, "mame2003_plus", "MAME2003 Plus", "libmame2003_plus_libretro_android.so");
    public static final CoreID DESMUME = new CoreID("DESMUME", 11, "desmume", "DeSmuME", "libdesmume_libretro_android.so");
    public static final CoreID MELONDS = new CoreID("MELONDS", 12, "melonds", "MelonDS", "libmelonds_libretro_android.so");
    public static final CoreID HANDY = new CoreID("HANDY", 13, "handy", "Handy", "libhandy_libretro_android.so");
    public static final CoreID MEDNAFEN_PCE_FAST = new CoreID("MEDNAFEN_PCE_FAST", 14, "mednafen_pce_fast", "PCEFast", "libmednafen_pce_fast_libretro_android.so");
    public static final CoreID PROSYSTEM = new CoreID("PROSYSTEM", 15, "prosystem", "ProSystem", "libprosystem_libretro_android.so");
    public static final CoreID MEDNAFEN_NGP = new CoreID("MEDNAFEN_NGP", 16, "mednafen_ngp", "Mednafen NGP", "libmednafen_ngp_libretro_android.so");
    public static final CoreID MEDNAFEN_WSWAN = new CoreID("MEDNAFEN_WSWAN", 17, "mednafen_wswan", "Beetle Cygne", "libmednafen_wswan_libretro_android.so");
    public static final CoreID CITRA = new CoreID("CITRA", 18, "citra", "Citra", "libcitra_libretro_android.so");
    public static final CoreID DOSBOX_PURE = new CoreID("DOSBOX_PURE", 19, "dosbox_pure", "DosBox Pure", "libdosbox_pure_libretro_android.so");

    private static final /* synthetic */ CoreID[] $values() {
        return new CoreID[]{STELLA, FCEUMM, SNES9X, GENESIS_PLUS_GX, GAMBATTE, MGBA, MUPEN64_PLUS_NEXT, PCSX_REARMED, PPSSPP, FBNEO, MAME2003PLUS, DESMUME, MELONDS, HANDY, MEDNAFEN_PCE_FAST, PROSYSTEM, MEDNAFEN_NGP, MEDNAFEN_WSWAN, CITRA, DOSBOX_PURE};
    }

    static {
        CoreID[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
    }

    private CoreID(String str, int i2, String str2, String str3, String str4) {
        this.coreName = str2;
        this.coreDisplayName = str3;
        this.libretroFileName = str4;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CoreID valueOf(String str) {
        return (CoreID) Enum.valueOf(CoreID.class, str);
    }

    public static CoreID[] values() {
        return (CoreID[]) $VALUES.clone();
    }

    @NotNull
    public final String getCoreDisplayName() {
        return this.coreDisplayName;
    }

    @NotNull
    public final String getCoreName() {
        return this.coreName;
    }

    @NotNull
    public final String getLibretroFileName() {
        return this.libretroFileName;
    }
}
