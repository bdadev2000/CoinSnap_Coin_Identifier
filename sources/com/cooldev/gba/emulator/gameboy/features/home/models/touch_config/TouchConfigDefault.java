package com.cooldev.gba.emulator.gameboy.features.home.models.touch_config;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.ButtonConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.CrossConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.CrossContentDescription;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.PrimaryDialConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.SecondaryDialConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import com.facebook.appevents.AppEventsConstants;
import e0.w;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class TouchConfigDefault {
    public static final int $stable;

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_L;

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_L1;

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_L2;

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_R;

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_R1;

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_R2;
    private static final float DEFAULT_STICK_ROTATION = 8.0f;

    @NotNull
    private static final PrimaryDialConfig.Cross PRIMARY_DIAL_CROSS;

    @NotNull
    private static final PrimaryDialConfig.Cross PRIMARY_DIAL_CROSS_MERGED;

    @NotNull
    public static final TouchConfigDefault INSTANCE = new TouchConfigDefault();

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_START = new ButtonConfig(108, null, false, Integer.valueOf(R.drawable.button_start), "Start", null, false, null, null, 486, null);

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_SELECT = new ButtonConfig(109, null, false, Integer.valueOf(R.drawable.button_select), "Select", null, false, null, null, 486, null);

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_MENU = new ButtonConfig(110, null, false, Integer.valueOf(R.drawable.button_menu), "Menu", null, false, null, null, 486, null);

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_CROSS = new ButtonConfig(97, null, false, Integer.valueOf(R.drawable.psx_cross), "Cross", null, false, null, null, 486, null);

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_SQUARE = new ButtonConfig(100, null, false, Integer.valueOf(R.drawable.psx_square), "Square", null, false, null, null, 486, null);

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_TRIANGLE = new ButtonConfig(99, null, false, Integer.valueOf(R.drawable.psx_triangle), "Triangle", null, false, null, null, 486, null);

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_CIRCLE = new ButtonConfig(96, null, false, Integer.valueOf(R.drawable.psx_circle), "Circle", null, false, null, null, 486, null);

    @NotNull
    private static final ButtonConfig BUTTON_CONFIG_COIN = new ButtonConfig(109, null, false, Integer.valueOf(R.drawable.button_coin), "Coin", null, false, null, null, 486, null);

    static {
        GestureType gestureType = GestureType.TRIPLE_TAP;
        GestureType gestureType2 = GestureType.FIRST_TOUCH;
        BUTTON_CONFIG_L = new ButtonConfig(102, "L", false, null, null, f0.C(gestureType, gestureType2), false, null, null, 476, null);
        BUTTON_CONFIG_R = new ButtonConfig(103, "R", false, null, null, f0.C(gestureType, gestureType2), false, null, null, 476, null);
        BUTTON_CONFIG_L1 = new ButtonConfig(102, "L1", false, null, null, f0.C(gestureType, gestureType2), false, null, null, 476, null);
        BUTTON_CONFIG_R1 = new ButtonConfig(103, "R1", false, null, null, f0.C(gestureType, gestureType2), false, null, null, 476, null);
        BUTTON_CONFIG_L2 = new ButtonConfig(104, "L2", false, null, null, f0.C(gestureType, gestureType2), false, null, null, 476, null);
        BUTTON_CONFIG_R2 = new ButtonConfig(105, "R2", false, null, null, f0.C(gestureType, gestureType2), false, null, null, 476, null);
        CrossConfig.Shape shape = CrossConfig.Shape.CIRCLE;
        PRIMARY_DIAL_CROSS = new PrimaryDialConfig.Cross(new CrossConfig(0, shape, Integer.valueOf(R.drawable.direction_alt_foreground), f0.C(gestureType, gestureType2), null, false, null, null, 240, null));
        PRIMARY_DIAL_CROSS_MERGED = new PrimaryDialConfig.Cross(new CrossConfig(3, shape, Integer.valueOf(R.drawable.direction_alt_foreground), f0.C(gestureType, gestureType2), null, false, null, null, 240, null));
        $stable = 8;
    }

    private TouchConfigDefault() {
    }

    private final SecondaryDialConfig buildMenuButtonConfig(int i2, RadialGamePadTheme radialGamePadTheme) {
        return new SecondaryDialConfig.SingleButton(i2, 1.0f, 0.0f, BUTTON_CONFIG_MENU, radialGamePadTheme, rotationInvert());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.cooldev.gba.emulator.gameboy.features.home.models.touch_config.TouchConfigDefault$rotationInvert$1] */
    private final TouchConfigDefault$rotationInvert$1 rotationInvert() {
        return new SecondaryDialConfig.RotationProcessor() { // from class: com.cooldev.gba.emulator.gameboy.features.home.models.touch_config.TouchConfigDefault$rotationInvert$1
            @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.config.SecondaryDialConfig.RotationProcessor
            public float getRotation(float f2) {
                return -f2;
            }
        };
    }

    private final SecondaryDialConfig.RotationProcessor rotationOffset(final float f2) {
        return new SecondaryDialConfig.RotationProcessor() { // from class: com.cooldev.gba.emulator.gameboy.features.home.models.touch_config.TouchConfigDefault$rotationOffset$1
            @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.config.SecondaryDialConfig.RotationProcessor
            public float getRotation(float f3) {
                return f3 + f2;
            }
        };
    }

    @NotNull
    public final RadialGamePadConfig getArcade4Left(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS_MERGED, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_COIN, null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getArcade4Right(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(99, null, false, null, "X", null, false, null, null, 494, null), new ButtonConfig(100, null, false, null, "Y", null, false, null, null, 494, null), new ButtonConfig(97, null, false, null, "B", null, false, null, null, 494, null), new ButtonConfig(96, null, false, null, "A", null, false, null, null, 494, null)), null, 60.0f, false, null, 26, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getArcade6Left(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS_MERGED, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_COIN, null, null, 48, null), new SecondaryDialConfig.SingleButton(3, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(8, radialGamePadTheme), new SecondaryDialConfig.Empty(9, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getArcade6Right(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(103, null, false, null, "R1", null, false, null, null, 494, null), new ButtonConfig(102, null, false, null, "L1", null, false, null, null, 494, null), new ButtonConfig(99, null, false, null, "X", null, false, null, null, 494, null), new ButtonConfig(100, null, false, null, "Y", null, false, null, null, 494, null), new ButtonConfig(97, null, false, null, "B", null, false, null, null, 494, null), new ButtonConfig(0, null, false, null, null, null, false, null, null, 506, null)), new ButtonConfig(96, null, false, null, null, null, false, null, null, 510, null), 0.0f, false, null, 28, null), f0.v(new SecondaryDialConfig.Empty(9, 1, 0.5f, 0.0f, null, 16, null), new SecondaryDialConfig.Empty(3, 1, 0.5f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getAtari2600Left(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, new ButtonConfig(102, "DIFF.A", false, null, null, null, false, null, null, 508, null), null, null, 48, null), new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, new ButtonConfig(104, "DIFF.B", false, null, null, null, false, null, null, 508, null), null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getAtari2600Right(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(w.f30218a, new ButtonConfig(97, null, false, null, "Action", null, false, null, null, 494, null), 0.0f, false, null, 28, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, new ButtonConfig(108, "RESET", false, null, null, null, false, null, null, 508, null), null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, new ButtonConfig(109, "SELECT", false, null, null, null, false, null, null, 508, null), null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getAtari7800Left(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getAtari7800Right(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "2", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, AppEventsConstants.EVENT_PARAM_VALUE_YES, false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getDOSLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.SingleButton(3, 1.0f, 0.0f, BUTTON_CONFIG_L1, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_L2, null, null, 48, null), new SecondaryDialConfig.SingleButton(8, 1.0f, 0.0f, new ButtonConfig(106, null, false, Integer.valueOf(R.drawable.button_keyboard), "Keyboard", null, false, null, null, 486, null), null, rotationInvert(), 16, null), new SecondaryDialConfig.Stick(9, 2, 2.2f, 0.0f, 1, null, null, f0.C(GestureType.TRIPLE_TAP, GestureType.FIRST_TOUCH), "Left Stick", rotationOffset(-8.0f), 96, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getDOSRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(99, "X", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "Y", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_R2, null, null, 48, null), new SecondaryDialConfig.SingleButton(3, 1.0f, 0.0f, BUTTON_CONFIG_R1, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme), new SecondaryDialConfig.Stick(8, 2, 2.2f, 0.0f, 2, 107, null, f0.C(GestureType.TRIPLE_TAP, GestureType.FIRST_TOUCH), "Right Stick", rotationOffset(DEFAULT_STICK_ROTATION), 64, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getDesmumeLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(8, 1.0f, 0.0f, new ButtonConfig(106, null, false, Integer.valueOf(R.drawable.button_mic), "Microphone", null, false, null, null, 486, null), null, null, 48, null), new SecondaryDialConfig.SingleButton(10, 1.0f, 0.0f, new ButtonConfig(104, null, false, Integer.valueOf(R.drawable.button_close_screen), "Close", null, false, null, null, 486, null), null, null, 48, null), new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_L, null, null, 48, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getDesmumeRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(99, "X", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "Y", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_R, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGBALeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.DoubleButton(3, 0.0f, BUTTON_CONFIG_L, null, null, 24, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGBARight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 30.0f, false, null, 26, null), f0.v(new SecondaryDialConfig.DoubleButton(2, 0.0f, BUTTON_CONFIG_R, null, null, 24, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGBLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGBRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 30.0f, false, null, 26, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGGLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.Empty(4, 1, 1.0f, 0.0f, null, 16, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGGRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "2", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, AppEventsConstants.EVENT_PARAM_VALUE_YES, false, null, null, null, false, null, null, 508, null)), null, 30.0f, false, null, 26, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGenesis3Left(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGenesis3Right(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "C", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "A", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGenesis6Left(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.SingleButton(3, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(8, radialGamePadTheme), new SecondaryDialConfig.Empty(9, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getGenesis6Right(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "C", false, null, null, null, false, null, null, 508, null), new ButtonConfig(103, "Z", false, null, null, null, false, null, null, 508, null), new ButtonConfig(99, "Y", false, null, null, null, false, null, null, 508, null), new ButtonConfig(102, "X", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(0, null, false, null, null, null, false, null, null, 506, null)), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null), 0.0f, false, null, 28, null), f0.v(new SecondaryDialConfig.Empty(9, 1, 0.5f, 0.0f, null, 16, null), new SecondaryDialConfig.Empty(3, 1, 0.5f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getLynxLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, new ButtonConfig(102, "OPTION 1", false, null, null, null, false, null, null, 508, null), null, null, 48, null), new SecondaryDialConfig.SingleButton(8, 1.0f, 0.0f, new ButtonConfig(103, "OPTION 2", false, null, null, null, false, null, null, 508, null), null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getLynxRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 15.0f, false, null, 26, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getMelondsLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(8, 1.0f, 0.0f, new ButtonConfig(104, null, false, Integer.valueOf(R.drawable.button_mic), "Microphone", null, false, null, null, 486, null), null, null, 48, null), new SecondaryDialConfig.SingleButton(10, 1.0f, 0.0f, new ButtonConfig(106, null, false, Integer.valueOf(R.drawable.button_close_screen), "Close", null, false, null, null, 486, null), null, null, 48, null), new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_L, null, null, 48, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getMelondsRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(99, "X", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "Y", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_R, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getN64Left(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, new ButtonConfig(104, "Z", false, null, null, null, false, null, null, 508, null), null, null, 48, null), new SecondaryDialConfig.DoubleButton(3, 0.0f, BUTTON_CONFIG_L, null, null, 24, null), new SecondaryDialConfig.Stick(9, 2, 2.2f, 0.1f, 1, null, null, f0.C(GestureType.TRIPLE_TAP, GestureType.FIRST_TOUCH), null, rotationOffset(-8.0f), 352, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getN64Right(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        PrimaryDialConfig.PrimaryButtons primaryButtons = new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(104, "Z", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "B", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "A", false, null, null, null, false, null, null, 508, null)), null, 60.0f, false, null, 26, null);
        CrossConfig.Shape shape = CrossConfig.Shape.CIRCLE;
        int i2 = R.drawable.direction_alt_foreground;
        return new RadialGamePadConfig(12, primaryButtons, f0.v(new SecondaryDialConfig.DoubleButton(2, 0.0f, BUTTON_CONFIG_R, null, null, 24, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), new SecondaryDialConfig.SingleButton(10, 1.0f, -0.1f, BUTTON_CONFIG_MENU, radialGamePadTheme, new SecondaryDialConfig.RotationProcessor() { // from class: com.cooldev.gba.emulator.gameboy.features.home.models.touch_config.TouchConfigDefault$getN64Right$1
            @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.config.SecondaryDialConfig.RotationProcessor
            public float getRotation(float f2) {
                return -f2;
            }
        }), new SecondaryDialConfig.Cross(8, 2, 2.2f, 0.1f, new CrossConfig(4, shape, Integer.valueOf(i2), f0.C(GestureType.TRIPLE_TAP, GestureType.FIRST_TOUCH), new CrossContentDescription("c", null, null, null, null, 30, null), false, null, null, Opcodes.CHECKCAST, null), rotationOffset(DEFAULT_STICK_ROTATION))), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getNESLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getNESRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getNGPLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.Empty(4, 1, 1.0f, 0.0f, null, 16, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getNGPRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "B", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "A", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getNintendo3DSLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.DoubleButton(3, 0.0f, BUTTON_CONFIG_L, null, null, 24, null), new SecondaryDialConfig.Stick(9, 2, 2.2f, 0.0f, 1, null, null, f0.C(GestureType.TRIPLE_TAP, GestureType.FIRST_TOUCH), null, rotationOffset(-8.0f), 352, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getNintendo3DSRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(99, "X", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "Y", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.DoubleButton(2, 0.0f, BUTTON_CONFIG_R, null, null, 24, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme), new SecondaryDialConfig.Empty(8, 2, 2.2f, 0.0f, rotationOffset(DEFAULT_STICK_ROTATION))), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getPCELeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getPCERight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "II", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "I", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getPSPLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.DoubleButton(3, 0.0f, BUTTON_CONFIG_L, null, null, 24, null), new SecondaryDialConfig.Stick(9, 2, 2.2f, 0.0f, 1, null, null, f0.C(GestureType.TRIPLE_TAP, GestureType.FIRST_TOUCH), null, rotationOffset(-8.0f), 352, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getPSPRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(BUTTON_CONFIG_CIRCLE, BUTTON_CONFIG_TRIANGLE, BUTTON_CONFIG_SQUARE, BUTTON_CONFIG_CROSS), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.DoubleButton(2, 0.0f, BUTTON_CONFIG_R, null, null, 24, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme), new SecondaryDialConfig.Empty(8, 2, 2.2f, 0.0f, rotationOffset(DEFAULT_STICK_ROTATION))), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getPSXDualshockLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.SingleButton(3, 1.0f, 0.0f, BUTTON_CONFIG_L1, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_L2, null, null, 48, null), new SecondaryDialConfig.Stick(9, 2, 2.2f, 0.0f, 1, 106, null, f0.C(GestureType.TRIPLE_TAP, GestureType.FIRST_TOUCH), "Left Stick", rotationOffset(-8.0f), 64, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getPSXDualshockRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(BUTTON_CONFIG_CIRCLE, BUTTON_CONFIG_TRIANGLE, BUTTON_CONFIG_SQUARE, BUTTON_CONFIG_CROSS), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_R2, null, null, 48, null), new SecondaryDialConfig.SingleButton(3, 1.0f, 0.0f, BUTTON_CONFIG_R1, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme), new SecondaryDialConfig.Stick(8, 2, 2.2f, 0.0f, 2, 107, null, f0.C(GestureType.TRIPLE_TAP, GestureType.FIRST_TOUCH), "Right Stick", rotationOffset(DEFAULT_STICK_ROTATION), 64, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getPSXLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.SingleButton(3, 1.0f, 0.0f, BUTTON_CONFIG_L1, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_L2, null, null, 48, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getPSXRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(BUTTON_CONFIG_CIRCLE, BUTTON_CONFIG_TRIANGLE, BUTTON_CONFIG_SQUARE, BUTTON_CONFIG_CROSS), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_R2, null, null, 48, null), new SecondaryDialConfig.SingleButton(3, 1.0f, 0.0f, BUTTON_CONFIG_R1, null, null, 48, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getSMSLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.Empty(4, 1, 1.0f, 0.0f, null, 16, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getSMSRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "2", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, AppEventsConstants.EVENT_PARAM_VALUE_YES, false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getSNESLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_SELECT, null, null, 48, null), new SecondaryDialConfig.DoubleButton(3, 0.0f, BUTTON_CONFIG_L, null, null, 24, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getSNESRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(99, "X", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "Y", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.DoubleButton(2, 0.0f, BUTTON_CONFIG_R, null, null, 24, null), new SecondaryDialConfig.SingleButton(4, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getWSLandscapeLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.Empty(4, 1, 1.0f, 0.0f, null, 16, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getWSLandscapeRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "A", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "B", false, null, null, null, false, null, null, 508, null)), null, 30.0f, false, null, 26, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getWSPortraitLeft(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, PRIMARY_DIAL_CROSS, f0.v(new SecondaryDialConfig.Empty(4, 1, 1.0f, 0.0f, null, 16, null), new SecondaryDialConfig.Empty(8, 1, 1.0f, 0.0f, null, 16, null)), null, radialGamePadTheme, false, null, 104, null);
    }

    @NotNull
    public final RadialGamePadConfig getWSPortraitRight(@NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(radialGamePadTheme, RouterName.THEME);
        return new RadialGamePadConfig(12, new PrimaryDialConfig.PrimaryButtons(f0.v(new ButtonConfig(96, "X3", false, null, null, null, false, null, null, 508, null), new ButtonConfig(99, "X2", false, null, null, null, false, null, null, 508, null), new ButtonConfig(100, "X1", false, null, null, null, false, null, null, 508, null), new ButtonConfig(97, "X4", false, null, null, null, false, null, null, 508, null)), null, 0.0f, false, null, 30, null), f0.v(new SecondaryDialConfig.SingleButton(2, 1.0f, 0.0f, BUTTON_CONFIG_START, null, null, 48, null), buildMenuButtonConfig(10, radialGamePadTheme)), null, radialGamePadTheme, false, null, 104, null);
    }
}
