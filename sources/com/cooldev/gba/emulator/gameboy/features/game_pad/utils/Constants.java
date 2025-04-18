package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;

@StabilityInferred
/* loaded from: classes3.dex */
public final class Constants {
    public static final int $stable = 0;
    private static final int DEFAULT_COLOR_BACKGROUND_STROKE = 0;
    private static final int DEFAULT_COLOR_LIGHT_STROKE = 0;
    private static final int DEFAULT_COLOR_NORMAL_STROKE = 0;
    public static final float PI = 3.1415927f;
    public static final float PI2 = 6.2831855f;

    @NotNull
    public static final Constants INSTANCE = new Constants();
    private static final int DEFAULT_COLOR_NORMAL = Color.argb(Opcodes.LUSHR, Opcodes.LUSHR, Opcodes.LUSHR, Opcodes.LUSHR);
    private static final int DEFAULT_COLOR_PRESSED = Color.argb(255, Opcodes.LUSHR, Opcodes.LUSHR, Opcodes.LUSHR);
    private static final int DEFAULT_COLOR_TEXT = Color.argb(Opcodes.LUSHR, 255, 255, 255);
    private static final int DEFAULT_COLOR_BACKGROUND = Color.argb(50, Opcodes.LUSHR, Opcodes.LUSHR, Opcodes.LUSHR);
    private static final int DEFAULT_COLOR_LIGHT = Color.argb(30, Opcodes.LUSHR, Opcodes.LUSHR, Opcodes.LUSHR);

    private Constants() {
    }

    public final int getDEFAULT_COLOR_BACKGROUND() {
        return DEFAULT_COLOR_BACKGROUND;
    }

    public final int getDEFAULT_COLOR_BACKGROUND_STROKE() {
        return DEFAULT_COLOR_BACKGROUND_STROKE;
    }

    public final int getDEFAULT_COLOR_LIGHT() {
        return DEFAULT_COLOR_LIGHT;
    }

    public final int getDEFAULT_COLOR_LIGHT_STROKE() {
        return DEFAULT_COLOR_LIGHT_STROKE;
    }

    public final int getDEFAULT_COLOR_NORMAL() {
        return DEFAULT_COLOR_NORMAL;
    }

    public final int getDEFAULT_COLOR_NORMAL_STROKE() {
        return DEFAULT_COLOR_NORMAL_STROKE;
    }

    public final int getDEFAULT_COLOR_PRESSED() {
        return DEFAULT_COLOR_PRESSED;
    }

    public final int getDEFAULT_COLOR_TEXT() {
        return DEFAULT_COLOR_TEXT;
    }
}
