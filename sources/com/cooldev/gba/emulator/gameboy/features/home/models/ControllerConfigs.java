package com.cooldev.gba.emulator.gameboy.features.home.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.R;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ControllerConfigs {
    public static final int $stable = 0;

    @NotNull
    private static final ControllerConfig ATARI7800;

    @NotNull
    private static final ControllerConfig DESMUME;

    @NotNull
    private static final ControllerConfig DOS_AUTO;

    @NotNull
    private static final ControllerConfig DOS_MOUSE_LEFT;

    @NotNull
    private static final ControllerConfig DOS_MOUSE_RIGHT;

    @NotNull
    private static final ControllerConfig FB_NEO_4;

    @NotNull
    private static final ControllerConfig FB_NEO_6;

    @NotNull
    private static final ControllerConfig LYNX;

    @NotNull
    private static final ControllerConfig MAME_2003_4;

    @NotNull
    private static final ControllerConfig MAME_2003_6;

    @NotNull
    private static final ControllerConfig MELONDS;

    @NotNull
    private static final ControllerConfig NGP;

    @NotNull
    private static final ControllerConfig NINTENDO_3DS;

    @NotNull
    private static final ControllerConfig PCE;

    @NotNull
    private static final ControllerConfig WS_LANDSCAPE;

    @NotNull
    private static final ControllerConfig WS_PORTRAIT;

    @NotNull
    public static final ControllerConfigs INSTANCE = new ControllerConfigs();

    @NotNull
    private static final ControllerConfig ATARI_2600 = new ControllerConfig("default", R.string.controller_default, TouchControllerID.ATARI2600, false, false, true, null, null, 216, null);

    @NotNull
    private static final ControllerConfig NES = new ControllerConfig("default", R.string.controller_default, TouchControllerID.NES, false, false, true, null, null, 216, null);

    @NotNull
    private static final ControllerConfig SNES = new ControllerConfig("default", R.string.controller_default, TouchControllerID.SNES, false, false, true, null, null, 216, null);

    @NotNull
    private static final ControllerConfig SMS = new ControllerConfig("default", R.string.controller_default, TouchControllerID.SMS, false, false, true, null, null, 216, null);

    @NotNull
    private static final ControllerConfig GENESIS_6 = new ControllerConfig("default_6", R.string.controller_genesis_6, TouchControllerID.GENESIS_6, false, false, true, "MD Joypad 6 Button", null, Opcodes.DCMPG, null);

    @NotNull
    private static final ControllerConfig GENESIS_3 = new ControllerConfig("default_3", R.string.controller_genesis_3, TouchControllerID.GENESIS_3, false, false, true, "MD Joypad 3 Button", null, Opcodes.DCMPG, null);

    @NotNull
    private static final ControllerConfig GG = new ControllerConfig("default", R.string.controller_default, TouchControllerID.GG, false, false, true, null, null, 216, null);

    @NotNull
    private static final ControllerConfig GB = new ControllerConfig("default", R.string.controller_default, TouchControllerID.GB, false, false, true, null, null, 216, null);

    @NotNull
    private static final ControllerConfig GBA = new ControllerConfig("default", R.string.controller_default, TouchControllerID.GBA, false, false, true, null, null, 216, null);

    @NotNull
    private static final ControllerConfig N64 = new ControllerConfig("default", R.string.controller_default, TouchControllerID.N64, true, false, false, null, null, 240, null);

    @NotNull
    private static final ControllerConfig PSX_STANDARD = new ControllerConfig("standard", R.string.controller_standard, TouchControllerID.PSX, false, false, true, "standard", null, Opcodes.DCMPG, null);

    @NotNull
    private static final ControllerConfig PSX_DUALSHOCK = new ControllerConfig("dualshock", R.string.controller_dualshock, TouchControllerID.PSX_DUALSHOCK, true, false, false, "dualshock", null, Opcodes.ARETURN, null);

    @NotNull
    private static final ControllerConfig PSP = new ControllerConfig("default", R.string.controller_default, TouchControllerID.PSP, true, false, false, null, null, 240, null);

    static {
        int i2 = R.string.controller_arcade_4;
        TouchControllerID touchControllerID = TouchControllerID.ARCADE_4;
        FB_NEO_4 = new ControllerConfig("default_4", i2, touchControllerID, false, false, true, null, null, 216, null);
        int i3 = R.string.controller_arcade_6;
        TouchControllerID touchControllerID2 = TouchControllerID.ARCADE_6;
        FB_NEO_6 = new ControllerConfig("default_6", i3, touchControllerID2, false, false, true, null, null, 216, null);
        MAME_2003_4 = new ControllerConfig("default_4", R.string.controller_arcade_4, touchControllerID, false, false, true, null, null, 216, null);
        MAME_2003_6 = new ControllerConfig("default_6", R.string.controller_arcade_6, touchControllerID2, false, false, true, null, null, 216, null);
        DESMUME = new ControllerConfig("default", R.string.controller_default, TouchControllerID.DESMUME, false, false, false, null, null, 232, null);
        MELONDS = new ControllerConfig("default", R.string.controller_default, TouchControllerID.MELONDS, false, false, true, null, null, 200, null);
        LYNX = new ControllerConfig("default", R.string.controller_default, TouchControllerID.LYNX, false, false, true, null, null, 216, null);
        ATARI7800 = new ControllerConfig("default", R.string.controller_default, TouchControllerID.ATARI7800, false, false, true, null, null, 216, null);
        PCE = new ControllerConfig("default", R.string.controller_default, TouchControllerID.PCE, false, false, true, null, null, 216, null);
        NGP = new ControllerConfig("default", R.string.controller_default, TouchControllerID.NGP, false, false, true, null, null, 216, null);
        int i4 = R.string.controller_dos_auto;
        TouchControllerID touchControllerID3 = TouchControllerID.DOS;
        DOS_AUTO = new ControllerConfig("auto", i4, touchControllerID3, true, false, false, null, 1, 112, null);
        DOS_MOUSE_LEFT = new ControllerConfig("mouse_left", R.string.controller_dos_mouse_left, touchControllerID3, true, false, false, null, 513, 112, null);
        DOS_MOUSE_RIGHT = new ControllerConfig("mouse_right", R.string.controller_dos_mouse_right, touchControllerID3, true, false, false, null, 769, 112, null);
        WS_LANDSCAPE = new ControllerConfig("landscape", R.string.controller_landscape, TouchControllerID.WS_LANDSCAPE, false, false, true, null, null, 216, null);
        WS_PORTRAIT = new ControllerConfig("portrait", R.string.controller_portrait, TouchControllerID.WS_PORTRAIT, false, false, true, null, null, 216, null);
        NINTENDO_3DS = new ControllerConfig("default", R.string.controller_default, TouchControllerID.NINTENDO_3DS, false, false, false, null, null, 232, null);
    }

    private ControllerConfigs() {
    }

    @NotNull
    public final ControllerConfig getATARI7800() {
        return ATARI7800;
    }

    @NotNull
    public final ControllerConfig getATARI_2600() {
        return ATARI_2600;
    }

    @NotNull
    public final ControllerConfig getDESMUME() {
        return DESMUME;
    }

    @NotNull
    public final ControllerConfig getDOS_AUTO() {
        return DOS_AUTO;
    }

    @NotNull
    public final ControllerConfig getDOS_MOUSE_LEFT() {
        return DOS_MOUSE_LEFT;
    }

    @NotNull
    public final ControllerConfig getDOS_MOUSE_RIGHT() {
        return DOS_MOUSE_RIGHT;
    }

    @NotNull
    public final ControllerConfig getFB_NEO_4() {
        return FB_NEO_4;
    }

    @NotNull
    public final ControllerConfig getFB_NEO_6() {
        return FB_NEO_6;
    }

    @NotNull
    public final ControllerConfig getGB() {
        return GB;
    }

    @NotNull
    public final ControllerConfig getGBA() {
        return GBA;
    }

    @NotNull
    public final ControllerConfig getGENESIS_3() {
        return GENESIS_3;
    }

    @NotNull
    public final ControllerConfig getGENESIS_6() {
        return GENESIS_6;
    }

    @NotNull
    public final ControllerConfig getGG() {
        return GG;
    }

    @NotNull
    public final ControllerConfig getLYNX() {
        return LYNX;
    }

    @NotNull
    public final ControllerConfig getMAME_2003_4() {
        return MAME_2003_4;
    }

    @NotNull
    public final ControllerConfig getMAME_2003_6() {
        return MAME_2003_6;
    }

    @NotNull
    public final ControllerConfig getMELONDS() {
        return MELONDS;
    }

    @NotNull
    public final ControllerConfig getN64() {
        return N64;
    }

    @NotNull
    public final ControllerConfig getNES() {
        return NES;
    }

    @NotNull
    public final ControllerConfig getNGP() {
        return NGP;
    }

    @NotNull
    public final ControllerConfig getNINTENDO_3DS() {
        return NINTENDO_3DS;
    }

    @NotNull
    public final ControllerConfig getPCE() {
        return PCE;
    }

    @NotNull
    public final ControllerConfig getPSP() {
        return PSP;
    }

    @NotNull
    public final ControllerConfig getPSX_DUALSHOCK() {
        return PSX_DUALSHOCK;
    }

    @NotNull
    public final ControllerConfig getPSX_STANDARD() {
        return PSX_STANDARD;
    }

    @NotNull
    public final ControllerConfig getSMS() {
        return SMS;
    }

    @NotNull
    public final ControllerConfig getSNES() {
        return SNES;
    }

    @NotNull
    public final ControllerConfig getWS_LANDSCAPE() {
        return WS_LANDSCAPE;
    }

    @NotNull
    public final ControllerConfig getWS_PORTRAIT() {
        return WS_PORTRAIT;
    }
}
