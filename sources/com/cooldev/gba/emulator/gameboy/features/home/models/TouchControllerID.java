package com.cooldev.gba.emulator.gameboy.features.home.models;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import k0.a;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TouchControllerID {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TouchControllerID[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final TouchControllerID GB = new TouchControllerID("GB", 0);
    public static final TouchControllerID NES = new TouchControllerID("NES", 1);
    public static final TouchControllerID DESMUME = new TouchControllerID("DESMUME", 2);
    public static final TouchControllerID MELONDS = new TouchControllerID("MELONDS", 3);
    public static final TouchControllerID PSX = new TouchControllerID("PSX", 4);
    public static final TouchControllerID PSX_DUALSHOCK = new TouchControllerID("PSX_DUALSHOCK", 5);
    public static final TouchControllerID N64 = new TouchControllerID("N64", 6);
    public static final TouchControllerID PSP = new TouchControllerID("PSP", 7);
    public static final TouchControllerID SNES = new TouchControllerID("SNES", 8);
    public static final TouchControllerID GBA = new TouchControllerID("GBA", 9);
    public static final TouchControllerID GENESIS_3 = new TouchControllerID("GENESIS_3", 10);
    public static final TouchControllerID GENESIS_6 = new TouchControllerID("GENESIS_6", 11);
    public static final TouchControllerID ATARI2600 = new TouchControllerID("ATARI2600", 12);
    public static final TouchControllerID SMS = new TouchControllerID("SMS", 13);
    public static final TouchControllerID GG = new TouchControllerID("GG", 14);
    public static final TouchControllerID ARCADE_4 = new TouchControllerID("ARCADE_4", 15);
    public static final TouchControllerID ARCADE_6 = new TouchControllerID("ARCADE_6", 16);
    public static final TouchControllerID LYNX = new TouchControllerID("LYNX", 17);
    public static final TouchControllerID ATARI7800 = new TouchControllerID("ATARI7800", 18);
    public static final TouchControllerID PCE = new TouchControllerID("PCE", 19);
    public static final TouchControllerID NGP = new TouchControllerID("NGP", 20);
    public static final TouchControllerID DOS = new TouchControllerID("DOS", 21);
    public static final TouchControllerID WS_LANDSCAPE = new TouchControllerID("WS_LANDSCAPE", 22);
    public static final TouchControllerID WS_PORTRAIT = new TouchControllerID("WS_PORTRAIT", 23);
    public static final TouchControllerID NINTENDO_3DS = new TouchControllerID("NINTENDO_3DS", 24);

    /* loaded from: classes4.dex */
    public static final class Companion {

        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TouchControllerID.values().length];
                try {
                    iArr[TouchControllerID.GB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TouchControllerID.NES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TouchControllerID.DESMUME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TouchControllerID.MELONDS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TouchControllerID.PSX.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TouchControllerID.PSX_DUALSHOCK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TouchControllerID.N64.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TouchControllerID.PSP.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TouchControllerID.SNES.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TouchControllerID.GBA.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[TouchControllerID.GENESIS_3.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[TouchControllerID.GENESIS_6.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[TouchControllerID.ATARI2600.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[TouchControllerID.SMS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[TouchControllerID.GG.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[TouchControllerID.ARCADE_4.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[TouchControllerID.ARCADE_6.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[TouchControllerID.LYNX.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[TouchControllerID.ATARI7800.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[TouchControllerID.PCE.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[TouchControllerID.NGP.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[TouchControllerID.DOS.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[TouchControllerID.WS_LANDSCAPE.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[TouchControllerID.WS_PORTRAIT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[TouchControllerID.NINTENDO_3DS.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final Config getConfig(@NotNull TouchControllerID touchControllerID) {
            p0.a.s(touchControllerID, "id");
            switch (WhenMappings.$EnumSwitchMapping$0[touchControllerID.ordinal()]) {
                case 1:
                    return new Config(KindGame.GB_LEFT, KindGame.GB_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 2:
                    return new Config(KindGame.NES_LEFT, KindGame.NES_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 3:
                    return new Config(KindGame.DESMUME_LEFT, KindGame.DESMUME_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 4:
                    return new Config(KindGame.MELONDS_NDS_LEFT, KindGame.MELONDS_NDS_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 5:
                    return new Config(KindGame.PSX_LEFT, KindGame.PSX_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 6:
                    return new Config(KindGame.PSX_DUALSHOCK_LEFT, KindGame.PSX_DUALSHOCK_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 7:
                    return new Config(KindGame.N64_LEFT, KindGame.N64_RIGHT, 0.0f, 0.0f, 8.0f, 12, null);
                case 8:
                    return new Config(KindGame.PSP_LEFT, KindGame.PSP_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 9:
                    return new Config(KindGame.SNES_LEFT, KindGame.SNES_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 10:
                    return new Config(KindGame.GBA_LEFT, KindGame.GBA_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 11:
                    return new Config(KindGame.GENESIS_3_LEFT, KindGame.GENESIS_3_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 12:
                    return new Config(KindGame.GENESIS_6_LEFT, KindGame.GENESIS_6_RIGHT, 1.0f, 1.2f, 0.0f, 16, null);
                case 13:
                    return new Config(KindGame.ATARI2600_LEFT, KindGame.ATARI2600_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 14:
                    return new Config(KindGame.SMS_LEFT, KindGame.SMS_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 15:
                    return new Config(KindGame.GG_LEFT, KindGame.GG_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 16:
                    return new Config(KindGame.ARCADE_4_LEFT, KindGame.ARCADE_4_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 17:
                    return new Config(KindGame.ARCADE_6_LEFT, KindGame.ARCADE_6_RIGHT, 1.0f, 1.2f, 0.0f, 16, null);
                case 18:
                    return new Config(KindGame.LYNX_LEFT, KindGame.LYNX_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 19:
                    return new Config(KindGame.ATARI7800_LEFT, KindGame.ATARI7800_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 20:
                    return new Config(KindGame.PCE_LEFT, KindGame.PCE_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 21:
                    return new Config(KindGame.NGP_LEFT, KindGame.NGP_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 22:
                    return new Config(KindGame.DOS_LEFT, KindGame.DOS_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 23:
                    return new Config(KindGame.WS_LANDSCAPE_LEFT, KindGame.WS_LANDSCAPE_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 24:
                    return new Config(KindGame.WS_PORTRAIT_LEFT, KindGame.WS_PORTRAIT_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                case 25:
                    return new Config(KindGame.NINTENDO_3DS_LEFT, KindGame.NINTENDO_3DS_RIGHT, 0.0f, 0.0f, 0.0f, 28, null);
                default:
                    throw new RuntimeException();
            }
        }
    }

    @StabilityInferred
    /* loaded from: classes4.dex */
    public static final class Config {
        public static final int $stable = 0;

        @NotNull
        private final KindGame leftConfig;
        private final float leftScale;

        @NotNull
        private final KindGame rightConfig;
        private final float rightScale;
        private final float verticalMarginDP;

        public Config(@NotNull KindGame kindGame, @NotNull KindGame kindGame2, float f2, float f3, float f4) {
            p0.a.s(kindGame, "leftConfig");
            p0.a.s(kindGame2, "rightConfig");
            this.leftConfig = kindGame;
            this.rightConfig = kindGame2;
            this.leftScale = f2;
            this.rightScale = f3;
            this.verticalMarginDP = f4;
        }

        @NotNull
        public final KindGame getLeftConfig() {
            return this.leftConfig;
        }

        public final float getLeftScale() {
            return this.leftScale;
        }

        @NotNull
        public final KindGame getRightConfig() {
            return this.rightConfig;
        }

        public final float getRightScale() {
            return this.rightScale;
        }

        public final float getVerticalMarginDP() {
            return this.verticalMarginDP;
        }

        public /* synthetic */ Config(KindGame kindGame, KindGame kindGame2, float f2, float f3, float f4, int i2, k kVar) {
            this(kindGame, kindGame2, (i2 & 4) != 0 ? 1.0f : f2, (i2 & 8) != 0 ? 1.0f : f3, (i2 & 16) != 0 ? 0.0f : f4);
        }
    }

    private static final /* synthetic */ TouchControllerID[] $values() {
        return new TouchControllerID[]{GB, NES, DESMUME, MELONDS, PSX, PSX_DUALSHOCK, N64, PSP, SNES, GBA, GENESIS_3, GENESIS_6, ATARI2600, SMS, GG, ARCADE_4, ARCADE_6, LYNX, ATARI7800, PCE, NGP, DOS, WS_LANDSCAPE, WS_PORTRAIT, NINTENDO_3DS};
    }

    static {
        TouchControllerID[] $values = $values();
        $VALUES = $values;
        $ENTRIES = f0.l($values);
        Companion = new Companion(null);
    }

    private TouchControllerID(String str, int i2) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TouchControllerID valueOf(String str) {
        return (TouchControllerID) Enum.valueOf(TouchControllerID.class, str);
    }

    public static TouchControllerID[] values() {
        return (TouchControllerID[]) $VALUES.clone();
    }
}
