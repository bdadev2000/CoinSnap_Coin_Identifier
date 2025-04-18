package com.cooldev.gba.emulator.gameboy.features.home.models.touch_config;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.HapticConfig;
import com.cooldev.gba.emulator.gameboy.features.home.models.KindGame;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import com.google.zxing.aztec.encoder.Encoder;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TouchConfigs {
    public static final int $stable = 0;

    @NotNull
    public static final TouchConfigs INSTANCE = new TouchConfigs();
    public static final int MOTION_SOURCE_DPAD = 0;
    public static final int MOTION_SOURCE_DPAD_AND_LEFT_STICK = 3;
    public static final int MOTION_SOURCE_LEFT_STICK = 1;
    public static final int MOTION_SOURCE_RIGHT_DPAD = 4;
    public static final int MOTION_SOURCE_RIGHT_STICK = 2;

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GamePadTheme.values().length];
            try {
                iArr[GamePadTheme.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamePadTheme.ThreeDStyle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GamePadTheme.NewStyle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GamePadTheme.FutureTech.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KindGame.values().length];
            try {
                iArr2[KindGame.GB_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[KindGame.GB_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[KindGame.NES_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[KindGame.NES_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[KindGame.DESMUME_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[KindGame.DESMUME_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[KindGame.MELONDS_NDS_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[KindGame.MELONDS_NDS_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[KindGame.PSX_LEFT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[KindGame.PSX_RIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[KindGame.PSX_DUALSHOCK_LEFT.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[KindGame.PSX_DUALSHOCK_RIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[KindGame.PSP_LEFT.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[KindGame.PSP_RIGHT.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[KindGame.SNES_LEFT.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[KindGame.SNES_RIGHT.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[KindGame.GBA_LEFT.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[KindGame.GBA_RIGHT.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[KindGame.SMS_LEFT.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[KindGame.SMS_RIGHT.ordinal()] = 20;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[KindGame.GG_LEFT.ordinal()] = 21;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[KindGame.GG_RIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[KindGame.LYNX_LEFT.ordinal()] = 23;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[KindGame.LYNX_RIGHT.ordinal()] = 24;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[KindGame.PCE_LEFT.ordinal()] = 25;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[KindGame.PCE_RIGHT.ordinal()] = 26;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[KindGame.DOS_LEFT.ordinal()] = 27;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[KindGame.DOS_RIGHT.ordinal()] = 28;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[KindGame.NGP_LEFT.ordinal()] = 29;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[KindGame.NGP_RIGHT.ordinal()] = 30;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[KindGame.WS_LANDSCAPE_LEFT.ordinal()] = 31;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[KindGame.WS_LANDSCAPE_RIGHT.ordinal()] = 32;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[KindGame.WS_PORTRAIT_LEFT.ordinal()] = 33;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[KindGame.WS_PORTRAIT_RIGHT.ordinal()] = 34;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[KindGame.N64_LEFT.ordinal()] = 35;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[KindGame.N64_RIGHT.ordinal()] = 36;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[KindGame.GENESIS_3_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[KindGame.GENESIS_3_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[KindGame.GENESIS_6_LEFT.ordinal()] = 39;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr2[KindGame.GENESIS_6_RIGHT.ordinal()] = 40;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[KindGame.ATARI2600_LEFT.ordinal()] = 41;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[KindGame.ATARI2600_RIGHT.ordinal()] = 42;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[KindGame.ARCADE_4_LEFT.ordinal()] = 43;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr2[KindGame.ARCADE_4_RIGHT.ordinal()] = 44;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr2[KindGame.ARCADE_6_LEFT.ordinal()] = 45;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr2[KindGame.ARCADE_6_RIGHT.ordinal()] = 46;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr2[KindGame.ATARI7800_LEFT.ordinal()] = 47;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr2[KindGame.ATARI7800_RIGHT.ordinal()] = 48;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr2[KindGame.NINTENDO_3DS_LEFT.ordinal()] = 49;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr2[KindGame.NINTENDO_3DS_RIGHT.ordinal()] = 50;
            } catch (NoSuchFieldError unused54) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private TouchConfigs() {
    }

    private final RadialGamePadConfig getGamePadThemeDefault(KindGame kindGame, RadialGamePadTheme radialGamePadTheme) {
        switch (WhenMappings.$EnumSwitchMapping$1[kindGame.ordinal()]) {
            case 1:
                return TouchConfigDefault.INSTANCE.getGBLeft(radialGamePadTheme);
            case 2:
                return TouchConfigDefault.INSTANCE.getGBRight(radialGamePadTheme);
            case 3:
                return TouchConfigDefault.INSTANCE.getNESLeft(radialGamePadTheme);
            case 4:
                return TouchConfigDefault.INSTANCE.getNESRight(radialGamePadTheme);
            case 5:
                return TouchConfigDefault.INSTANCE.getDesmumeLeft(radialGamePadTheme);
            case 6:
                return TouchConfigDefault.INSTANCE.getDesmumeRight(radialGamePadTheme);
            case 7:
                return TouchConfigDefault.INSTANCE.getMelondsLeft(radialGamePadTheme);
            case 8:
                return TouchConfigDefault.INSTANCE.getMelondsRight(radialGamePadTheme);
            case 9:
                return TouchConfigDefault.INSTANCE.getPSXLeft(radialGamePadTheme);
            case 10:
                return TouchConfigDefault.INSTANCE.getPSXRight(radialGamePadTheme);
            case 11:
                return TouchConfigDefault.INSTANCE.getPSXDualshockLeft(radialGamePadTheme);
            case 12:
                return TouchConfigDefault.INSTANCE.getPSXDualshockRight(radialGamePadTheme);
            case 13:
                return TouchConfigDefault.INSTANCE.getPSPLeft(radialGamePadTheme);
            case 14:
                return TouchConfigDefault.INSTANCE.getPSPRight(radialGamePadTheme);
            case 15:
                return TouchConfigDefault.INSTANCE.getSNESLeft(radialGamePadTheme);
            case 16:
                return TouchConfigDefault.INSTANCE.getSNESRight(radialGamePadTheme);
            case 17:
                return TouchConfigDefault.INSTANCE.getGBALeft(radialGamePadTheme);
            case 18:
                return TouchConfigDefault.INSTANCE.getGBARight(radialGamePadTheme);
            case 19:
                return TouchConfigDefault.INSTANCE.getSMSLeft(radialGamePadTheme);
            case 20:
                return TouchConfigDefault.INSTANCE.getSMSRight(radialGamePadTheme);
            case 21:
                return TouchConfigDefault.INSTANCE.getGGLeft(radialGamePadTheme);
            case 22:
                return TouchConfigDefault.INSTANCE.getGGRight(radialGamePadTheme);
            case 23:
                return TouchConfigDefault.INSTANCE.getLynxLeft(radialGamePadTheme);
            case 24:
                return TouchConfigDefault.INSTANCE.getLynxRight(radialGamePadTheme);
            case 25:
                return TouchConfigDefault.INSTANCE.getPCELeft(radialGamePadTheme);
            case 26:
                return TouchConfigDefault.INSTANCE.getPCERight(radialGamePadTheme);
            case 27:
                return TouchConfigDefault.INSTANCE.getDOSLeft(radialGamePadTheme);
            case 28:
                return TouchConfigDefault.INSTANCE.getDOSRight(radialGamePadTheme);
            case 29:
                return TouchConfigDefault.INSTANCE.getNGPLeft(radialGamePadTheme);
            case 30:
                return TouchConfigDefault.INSTANCE.getNGPRight(radialGamePadTheme);
            case 31:
                return TouchConfigDefault.INSTANCE.getWSLandscapeLeft(radialGamePadTheme);
            case 32:
                return TouchConfigDefault.INSTANCE.getWSLandscapeRight(radialGamePadTheme);
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                return TouchConfigDefault.INSTANCE.getWSPortraitLeft(radialGamePadTheme);
            case 34:
                return TouchConfigDefault.INSTANCE.getWSPortraitRight(radialGamePadTheme);
            case 35:
                return TouchConfigDefault.INSTANCE.getN64Left(radialGamePadTheme);
            case 36:
                return TouchConfigDefault.INSTANCE.getN64Right(radialGamePadTheme);
            case 37:
                return TouchConfigDefault.INSTANCE.getGenesis3Left(radialGamePadTheme);
            case 38:
                return TouchConfigDefault.INSTANCE.getGenesis3Right(radialGamePadTheme);
            case 39:
                return TouchConfigDefault.INSTANCE.getGenesis6Left(radialGamePadTheme);
            case 40:
                return TouchConfigDefault.INSTANCE.getGenesis6Right(radialGamePadTheme);
            case 41:
                return TouchConfigDefault.INSTANCE.getAtari2600Left(radialGamePadTheme);
            case 42:
                return TouchConfigDefault.INSTANCE.getAtari2600Right(radialGamePadTheme);
            case 43:
                return TouchConfigDefault.INSTANCE.getArcade4Left(radialGamePadTheme);
            case 44:
                return TouchConfigDefault.INSTANCE.getArcade4Right(radialGamePadTheme);
            case 45:
                return TouchConfigDefault.INSTANCE.getArcade6Left(radialGamePadTheme);
            case 46:
                return TouchConfigDefault.INSTANCE.getArcade6Right(radialGamePadTheme);
            case 47:
                return TouchConfigDefault.INSTANCE.getAtari7800Left(radialGamePadTheme);
            case 48:
                return TouchConfigDefault.INSTANCE.getAtari7800Right(radialGamePadTheme);
            case 49:
                return TouchConfigDefault.INSTANCE.getNintendo3DSLeft(radialGamePadTheme);
            case 50:
                return TouchConfigDefault.INSTANCE.getNintendo3DSRight(radialGamePadTheme);
            default:
                throw new RuntimeException();
        }
    }

    private final RadialGamePadConfig getGamePadThemeFutureTech(KindGame kindGame, RadialGamePadTheme radialGamePadTheme) {
        switch (WhenMappings.$EnumSwitchMapping$1[kindGame.ordinal()]) {
            case 1:
                return TouchConfigFutureTech.INSTANCE.getGBLeft(radialGamePadTheme);
            case 2:
                return TouchConfigFutureTech.INSTANCE.getGBRight(radialGamePadTheme);
            case 3:
                return TouchConfigFutureTech.INSTANCE.getNESLeft(radialGamePadTheme);
            case 4:
                return TouchConfigFutureTech.INSTANCE.getNESRight(radialGamePadTheme);
            case 5:
                return TouchConfigFutureTech.INSTANCE.getDesmumeLeft(radialGamePadTheme);
            case 6:
                return TouchConfigFutureTech.INSTANCE.getDesmumeRight(radialGamePadTheme);
            case 7:
                return TouchConfigFutureTech.INSTANCE.getMelondsLeft(radialGamePadTheme);
            case 8:
                return TouchConfigFutureTech.INSTANCE.getMelondsRight(radialGamePadTheme);
            case 9:
                return TouchConfigFutureTech.INSTANCE.getPSXLeft(radialGamePadTheme);
            case 10:
                return TouchConfigFutureTech.INSTANCE.getPSXRight(radialGamePadTheme);
            case 11:
                return TouchConfigFutureTech.INSTANCE.getPSXDualshockLeft(radialGamePadTheme);
            case 12:
                return TouchConfigFutureTech.INSTANCE.getPSXDualshockRight(radialGamePadTheme);
            case 13:
                return TouchConfigFutureTech.INSTANCE.getPSPLeft(radialGamePadTheme);
            case 14:
                return TouchConfigFutureTech.INSTANCE.getPSPRight(radialGamePadTheme);
            case 15:
                return TouchConfigFutureTech.INSTANCE.getSNESLeft(radialGamePadTheme);
            case 16:
                return TouchConfigFutureTech.INSTANCE.getSNESRight(radialGamePadTheme);
            case 17:
                return TouchConfigFutureTech.INSTANCE.getGBALeft(radialGamePadTheme);
            case 18:
                return TouchConfigFutureTech.INSTANCE.getGBARight(radialGamePadTheme);
            case 19:
                return TouchConfigFutureTech.INSTANCE.getSMSLeft(radialGamePadTheme);
            case 20:
                return TouchConfigFutureTech.INSTANCE.getSMSRight(radialGamePadTheme);
            case 21:
                return TouchConfigFutureTech.INSTANCE.getGGLeft(radialGamePadTheme);
            case 22:
                return TouchConfigFutureTech.INSTANCE.getGGRight(radialGamePadTheme);
            case 23:
                return TouchConfigFutureTech.INSTANCE.getLynxLeft(radialGamePadTheme);
            case 24:
                return TouchConfigFutureTech.INSTANCE.getLynxRight(radialGamePadTheme);
            case 25:
                return TouchConfigFutureTech.INSTANCE.getPCELeft(radialGamePadTheme);
            case 26:
                return TouchConfigFutureTech.INSTANCE.getPCERight(radialGamePadTheme);
            case 27:
                return TouchConfigFutureTech.INSTANCE.getDOSLeft(radialGamePadTheme);
            case 28:
                return TouchConfigFutureTech.INSTANCE.getDOSRight(radialGamePadTheme);
            case 29:
                return TouchConfigFutureTech.INSTANCE.getNGPLeft(radialGamePadTheme);
            case 30:
                return TouchConfigFutureTech.INSTANCE.getNGPRight(radialGamePadTheme);
            case 31:
                return TouchConfigFutureTech.INSTANCE.getWSLandscapeLeft(radialGamePadTheme);
            case 32:
                return TouchConfigFutureTech.INSTANCE.getWSLandscapeRight(radialGamePadTheme);
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                return TouchConfigFutureTech.INSTANCE.getWSPortraitLeft(radialGamePadTheme);
            case 34:
                return TouchConfigFutureTech.INSTANCE.getWSPortraitRight(radialGamePadTheme);
            case 35:
                return TouchConfigFutureTech.INSTANCE.getN64Left(radialGamePadTheme);
            case 36:
                return TouchConfigFutureTech.INSTANCE.getN64Right(radialGamePadTheme);
            case 37:
                return TouchConfigFutureTech.INSTANCE.getGenesis3Left(radialGamePadTheme);
            case 38:
                return TouchConfigFutureTech.INSTANCE.getGenesis3Right(radialGamePadTheme);
            case 39:
                return TouchConfigFutureTech.INSTANCE.getGenesis6Left(radialGamePadTheme);
            case 40:
                return TouchConfigFutureTech.INSTANCE.getGenesis6Right(radialGamePadTheme);
            case 41:
                return TouchConfigFutureTech.INSTANCE.getAtari2600Left(radialGamePadTheme);
            case 42:
                return TouchConfigFutureTech.INSTANCE.getAtari2600Right(radialGamePadTheme);
            case 43:
                return TouchConfigFutureTech.INSTANCE.getArcade4Left(radialGamePadTheme);
            case 44:
                return TouchConfigFutureTech.INSTANCE.getArcade4Right(radialGamePadTheme);
            case 45:
                return TouchConfigFutureTech.INSTANCE.getArcade6Left(radialGamePadTheme);
            case 46:
                return TouchConfigFutureTech.INSTANCE.getArcade6Right(radialGamePadTheme);
            case 47:
                return TouchConfigFutureTech.INSTANCE.getAtari7800Left(radialGamePadTheme);
            case 48:
                return TouchConfigFutureTech.INSTANCE.getAtari7800Right(radialGamePadTheme);
            case 49:
                return TouchConfigFutureTech.INSTANCE.getNintendo3DSLeft(radialGamePadTheme);
            case 50:
                return TouchConfigFutureTech.INSTANCE.getNintendo3DSRight(radialGamePadTheme);
            default:
                throw new RuntimeException();
        }
    }

    private final RadialGamePadConfig getGamePadThemeNewStyle(KindGame kindGame, RadialGamePadTheme radialGamePadTheme) {
        switch (WhenMappings.$EnumSwitchMapping$1[kindGame.ordinal()]) {
            case 1:
                return TouchConfigNewStyle.INSTANCE.getGBLeft(radialGamePadTheme);
            case 2:
                return TouchConfigNewStyle.INSTANCE.getGBRight(radialGamePadTheme);
            case 3:
                return TouchConfigNewStyle.INSTANCE.getNESLeft(radialGamePadTheme);
            case 4:
                return TouchConfigNewStyle.INSTANCE.getNESRight(radialGamePadTheme);
            case 5:
                return TouchConfigNewStyle.INSTANCE.getDesmumeLeft(radialGamePadTheme);
            case 6:
                return TouchConfigNewStyle.INSTANCE.getDesmumeRight(radialGamePadTheme);
            case 7:
                return TouchConfigNewStyle.INSTANCE.getMelondsLeft(radialGamePadTheme);
            case 8:
                return TouchConfigNewStyle.INSTANCE.getMelondsRight(radialGamePadTheme);
            case 9:
                return TouchConfigNewStyle.INSTANCE.getPSXLeft(radialGamePadTheme);
            case 10:
                return TouchConfigNewStyle.INSTANCE.getPSXRight(radialGamePadTheme);
            case 11:
                return TouchConfigNewStyle.INSTANCE.getPSXDualshockLeft(radialGamePadTheme);
            case 12:
                return TouchConfigNewStyle.INSTANCE.getPSXDualshockRight(radialGamePadTheme);
            case 13:
                return TouchConfigNewStyle.INSTANCE.getPSPLeft(radialGamePadTheme);
            case 14:
                return TouchConfigNewStyle.INSTANCE.getPSPRight(radialGamePadTheme);
            case 15:
                return TouchConfigNewStyle.INSTANCE.getSNESLeft(radialGamePadTheme);
            case 16:
                return TouchConfigNewStyle.INSTANCE.getSNESRight(radialGamePadTheme);
            case 17:
                return TouchConfigNewStyle.INSTANCE.getGBALeft(radialGamePadTheme);
            case 18:
                return TouchConfigNewStyle.INSTANCE.getGBARight(radialGamePadTheme);
            case 19:
                return TouchConfigNewStyle.INSTANCE.getSMSLeft(radialGamePadTheme);
            case 20:
                return TouchConfigNewStyle.INSTANCE.getSMSRight(radialGamePadTheme);
            case 21:
                return TouchConfigNewStyle.INSTANCE.getGGLeft(radialGamePadTheme);
            case 22:
                return TouchConfigNewStyle.INSTANCE.getGGRight(radialGamePadTheme);
            case 23:
                return TouchConfigNewStyle.INSTANCE.getLynxLeft(radialGamePadTheme);
            case 24:
                return TouchConfigNewStyle.INSTANCE.getLynxRight(radialGamePadTheme);
            case 25:
                return TouchConfigNewStyle.INSTANCE.getPCELeft(radialGamePadTheme);
            case 26:
                return TouchConfigNewStyle.INSTANCE.getPCERight(radialGamePadTheme);
            case 27:
                return TouchConfigNewStyle.INSTANCE.getDOSLeft(radialGamePadTheme);
            case 28:
                return TouchConfigNewStyle.INSTANCE.getDOSRight(radialGamePadTheme);
            case 29:
                return TouchConfigNewStyle.INSTANCE.getNGPLeft(radialGamePadTheme);
            case 30:
                return TouchConfigNewStyle.INSTANCE.getNGPRight(radialGamePadTheme);
            case 31:
                return TouchConfigNewStyle.INSTANCE.getWSLandscapeLeft(radialGamePadTheme);
            case 32:
                return TouchConfigNewStyle.INSTANCE.getWSLandscapeRight(radialGamePadTheme);
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                return TouchConfigNewStyle.INSTANCE.getWSPortraitLeft(radialGamePadTheme);
            case 34:
                return TouchConfigNewStyle.INSTANCE.getWSPortraitRight(radialGamePadTheme);
            case 35:
                return TouchConfigNewStyle.INSTANCE.getN64Left(radialGamePadTheme);
            case 36:
                return TouchConfigNewStyle.INSTANCE.getN64Right(radialGamePadTheme);
            case 37:
                return TouchConfigNewStyle.INSTANCE.getGenesis3Left(radialGamePadTheme);
            case 38:
                return TouchConfigNewStyle.INSTANCE.getGenesis3Right(radialGamePadTheme);
            case 39:
                return TouchConfigNewStyle.INSTANCE.getGenesis6Left(radialGamePadTheme);
            case 40:
                return TouchConfigNewStyle.INSTANCE.getGenesis6Right(radialGamePadTheme);
            case 41:
                return TouchConfigNewStyle.INSTANCE.getAtari2600Left(radialGamePadTheme);
            case 42:
                return TouchConfigNewStyle.INSTANCE.getAtari2600Right(radialGamePadTheme);
            case 43:
                return TouchConfigNewStyle.INSTANCE.getArcade4Left(radialGamePadTheme);
            case 44:
                return TouchConfigNewStyle.INSTANCE.getArcade4Right(radialGamePadTheme);
            case 45:
                return TouchConfigNewStyle.INSTANCE.getArcade6Left(radialGamePadTheme);
            case 46:
                return TouchConfigNewStyle.INSTANCE.getArcade6Right(radialGamePadTheme);
            case 47:
                return TouchConfigNewStyle.INSTANCE.getAtari7800Left(radialGamePadTheme);
            case 48:
                return TouchConfigNewStyle.INSTANCE.getAtari7800Right(radialGamePadTheme);
            case 49:
                return TouchConfigNewStyle.INSTANCE.getNintendo3DSLeft(radialGamePadTheme);
            case 50:
                return TouchConfigNewStyle.INSTANCE.getNintendo3DSRight(radialGamePadTheme);
            default:
                throw new RuntimeException();
        }
    }

    private final RadialGamePadConfig getGamePadThemeThreeDStyle(KindGame kindGame, RadialGamePadTheme radialGamePadTheme) {
        switch (WhenMappings.$EnumSwitchMapping$1[kindGame.ordinal()]) {
            case 1:
                return TouchConfigThreeDStyle.INSTANCE.getGBLeft(radialGamePadTheme);
            case 2:
                return TouchConfigThreeDStyle.INSTANCE.getGBRight(radialGamePadTheme);
            case 3:
                return TouchConfigThreeDStyle.INSTANCE.getNESLeft(radialGamePadTheme);
            case 4:
                return TouchConfigThreeDStyle.INSTANCE.getNESRight(radialGamePadTheme);
            case 5:
                return TouchConfigThreeDStyle.INSTANCE.getDesmumeLeft(radialGamePadTheme);
            case 6:
                return TouchConfigThreeDStyle.INSTANCE.getDesmumeRight(radialGamePadTheme);
            case 7:
                return TouchConfigThreeDStyle.INSTANCE.getMelondsLeft(radialGamePadTheme);
            case 8:
                return TouchConfigThreeDStyle.INSTANCE.getMelondsRight(radialGamePadTheme);
            case 9:
                return TouchConfigThreeDStyle.INSTANCE.getPSXLeft(radialGamePadTheme);
            case 10:
                return TouchConfigThreeDStyle.INSTANCE.getPSXRight(radialGamePadTheme);
            case 11:
                return TouchConfigThreeDStyle.INSTANCE.getPSXDualshockLeft(radialGamePadTheme);
            case 12:
                return TouchConfigThreeDStyle.INSTANCE.getPSXDualshockRight(radialGamePadTheme);
            case 13:
                return TouchConfigThreeDStyle.INSTANCE.getPSPLeft(radialGamePadTheme);
            case 14:
                return TouchConfigThreeDStyle.INSTANCE.getPSPRight(radialGamePadTheme);
            case 15:
                return TouchConfigThreeDStyle.INSTANCE.getSNESLeft(radialGamePadTheme);
            case 16:
                return TouchConfigThreeDStyle.INSTANCE.getSNESRight(radialGamePadTheme);
            case 17:
                return TouchConfigThreeDStyle.INSTANCE.getGBALeft(radialGamePadTheme);
            case 18:
                return TouchConfigThreeDStyle.INSTANCE.getGBARight(radialGamePadTheme);
            case 19:
                return TouchConfigThreeDStyle.INSTANCE.getSMSLeft(radialGamePadTheme);
            case 20:
                return TouchConfigThreeDStyle.INSTANCE.getSMSRight(radialGamePadTheme);
            case 21:
                return TouchConfigThreeDStyle.INSTANCE.getGGLeft(radialGamePadTheme);
            case 22:
                return TouchConfigThreeDStyle.INSTANCE.getGGRight(radialGamePadTheme);
            case 23:
                return TouchConfigThreeDStyle.INSTANCE.getLynxLeft(radialGamePadTheme);
            case 24:
                return TouchConfigThreeDStyle.INSTANCE.getLynxRight(radialGamePadTheme);
            case 25:
                return TouchConfigThreeDStyle.INSTANCE.getPCELeft(radialGamePadTheme);
            case 26:
                return TouchConfigThreeDStyle.INSTANCE.getPCERight(radialGamePadTheme);
            case 27:
                return TouchConfigThreeDStyle.INSTANCE.getDOSLeft(radialGamePadTheme);
            case 28:
                return TouchConfigThreeDStyle.INSTANCE.getDOSRight(radialGamePadTheme);
            case 29:
                return TouchConfigThreeDStyle.INSTANCE.getNGPLeft(radialGamePadTheme);
            case 30:
                return TouchConfigThreeDStyle.INSTANCE.getNGPRight(radialGamePadTheme);
            case 31:
                return TouchConfigThreeDStyle.INSTANCE.getWSLandscapeLeft(radialGamePadTheme);
            case 32:
                return TouchConfigThreeDStyle.INSTANCE.getWSLandscapeRight(radialGamePadTheme);
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                return TouchConfigThreeDStyle.INSTANCE.getWSPortraitLeft(radialGamePadTheme);
            case 34:
                return TouchConfigThreeDStyle.INSTANCE.getWSPortraitRight(radialGamePadTheme);
            case 35:
                return TouchConfigThreeDStyle.INSTANCE.getN64Left(radialGamePadTheme);
            case 36:
                return TouchConfigThreeDStyle.INSTANCE.getN64Right(radialGamePadTheme);
            case 37:
                return TouchConfigThreeDStyle.INSTANCE.getGenesis3Left(radialGamePadTheme);
            case 38:
                return TouchConfigThreeDStyle.INSTANCE.getGenesis3Right(radialGamePadTheme);
            case 39:
                return TouchConfigThreeDStyle.INSTANCE.getGenesis6Left(radialGamePadTheme);
            case 40:
                return TouchConfigThreeDStyle.INSTANCE.getGenesis6Right(radialGamePadTheme);
            case 41:
                return TouchConfigThreeDStyle.INSTANCE.getAtari2600Left(radialGamePadTheme);
            case 42:
                return TouchConfigThreeDStyle.INSTANCE.getAtari2600Right(radialGamePadTheme);
            case 43:
                return TouchConfigThreeDStyle.INSTANCE.getArcade4Left(radialGamePadTheme);
            case 44:
                return TouchConfigThreeDStyle.INSTANCE.getArcade4Right(radialGamePadTheme);
            case 45:
                return TouchConfigThreeDStyle.INSTANCE.getArcade6Left(radialGamePadTheme);
            case 46:
                return TouchConfigThreeDStyle.INSTANCE.getArcade6Right(radialGamePadTheme);
            case 47:
                return TouchConfigThreeDStyle.INSTANCE.getAtari7800Left(radialGamePadTheme);
            case 48:
                return TouchConfigThreeDStyle.INSTANCE.getAtari7800Right(radialGamePadTheme);
            case 49:
                return TouchConfigThreeDStyle.INSTANCE.getNintendo3DSLeft(radialGamePadTheme);
            case 50:
                return TouchConfigThreeDStyle.INSTANCE.getNintendo3DSRight(radialGamePadTheme);
            default:
                throw new RuntimeException();
        }
    }

    public static /* synthetic */ RadialGamePadConfig getRadialGamePadConfig$default(TouchConfigs touchConfigs, KindGame kindGame, HapticConfig hapticConfig, RadialGamePadTheme radialGamePadTheme, GamePadTheme gamePadTheme, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            gamePadTheme = GamePadTheme.FutureTech;
        }
        return touchConfigs.getRadialGamePadConfig(kindGame, hapticConfig, radialGamePadTheme, gamePadTheme);
    }

    @NotNull
    public final RadialGamePadConfig getRadialGamePadConfig(@NotNull KindGame kindGame, @NotNull HapticConfig hapticConfig, @NotNull RadialGamePadTheme radialGamePadTheme, @NotNull GamePadTheme gamePadTheme) {
        RadialGamePadConfig gamePadThemeDefault;
        a.s(kindGame, "kindGame");
        a.s(hapticConfig, "haptic");
        a.s(radialGamePadTheme, RouterName.THEME);
        a.s(gamePadTheme, "gamePadTheme");
        int i2 = WhenMappings.$EnumSwitchMapping$0[gamePadTheme.ordinal()];
        if (i2 == 1) {
            gamePadThemeDefault = getGamePadThemeDefault(kindGame, radialGamePadTheme);
        } else if (i2 == 2) {
            gamePadThemeDefault = getGamePadThemeThreeDStyle(kindGame, radialGamePadTheme);
        } else if (i2 == 3) {
            gamePadThemeDefault = getGamePadThemeNewStyle(kindGame, radialGamePadTheme);
        } else {
            if (i2 != 4) {
                throw new RuntimeException();
            }
            gamePadThemeDefault = getGamePadThemeFutureTech(kindGame, radialGamePadTheme);
        }
        return RadialGamePadConfig.copy$default(gamePadThemeDefault, 0, null, null, hapticConfig, null, Build.VERSION.SDK_INT < 33, null, 87, null);
    }
}
