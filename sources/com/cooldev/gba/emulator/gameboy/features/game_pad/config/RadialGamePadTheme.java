package com.cooldev.gba.emulator.gameboy.features.game_pad.config;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.Constants;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes2.dex */
public final class RadialGamePadTheme {
    public static final int $stable = 0;
    private final int backgroundColor;
    private final int backgroundStrokeColor;
    private final int lightColor;
    private final int lightStrokeColor;
    private final int normalColor;
    private final int normalStrokeColor;
    private final int pressedColor;
    private final int simulatedColor;
    private final float strokeWidthDp;
    private final int textColor;

    public RadialGamePadTheme() {
        this(0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 1023, null);
    }

    public final int component1() {
        return this.normalColor;
    }

    public final int component10() {
        return this.backgroundStrokeColor;
    }

    public final int component2() {
        return this.pressedColor;
    }

    public final int component3() {
        return this.simulatedColor;
    }

    public final int component4() {
        return this.textColor;
    }

    public final int component5() {
        return this.backgroundColor;
    }

    public final int component6() {
        return this.lightColor;
    }

    public final float component7() {
        return this.strokeWidthDp;
    }

    public final int component8() {
        return this.normalStrokeColor;
    }

    public final int component9() {
        return this.lightStrokeColor;
    }

    @NotNull
    public final RadialGamePadTheme copy(int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8, int i9, int i10) {
        return new RadialGamePadTheme(i2, i3, i4, i5, i6, i7, f2, i8, i9, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGamePadTheme)) {
            return false;
        }
        RadialGamePadTheme radialGamePadTheme = (RadialGamePadTheme) obj;
        return this.normalColor == radialGamePadTheme.normalColor && this.pressedColor == radialGamePadTheme.pressedColor && this.simulatedColor == radialGamePadTheme.simulatedColor && this.textColor == radialGamePadTheme.textColor && this.backgroundColor == radialGamePadTheme.backgroundColor && this.lightColor == radialGamePadTheme.lightColor && Float.compare(this.strokeWidthDp, radialGamePadTheme.strokeWidthDp) == 0 && this.normalStrokeColor == radialGamePadTheme.normalStrokeColor && this.lightStrokeColor == radialGamePadTheme.lightStrokeColor && this.backgroundStrokeColor == radialGamePadTheme.backgroundStrokeColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundStrokeColor() {
        return this.backgroundStrokeColor;
    }

    public final int getLightColor() {
        return this.lightColor;
    }

    public final int getLightStrokeColor() {
        return this.lightStrokeColor;
    }

    public final int getNormalColor() {
        return this.normalColor;
    }

    public final int getNormalStrokeColor() {
        return this.normalStrokeColor;
    }

    public final int getPressedColor() {
        return this.pressedColor;
    }

    public final int getSimulatedColor() {
        return this.simulatedColor;
    }

    public final float getStrokeWidthDp() {
        return this.strokeWidthDp;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.backgroundStrokeColor) + d.c(this.lightStrokeColor, d.c(this.normalStrokeColor, d.b(this.strokeWidthDp, d.c(this.lightColor, d.c(this.backgroundColor, d.c(this.textColor, d.c(this.simulatedColor, d.c(this.pressedColor, Integer.hashCode(this.normalColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RadialGamePadTheme(normalColor=");
        sb.append(this.normalColor);
        sb.append(", pressedColor=");
        sb.append(this.pressedColor);
        sb.append(", simulatedColor=");
        sb.append(this.simulatedColor);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", lightColor=");
        sb.append(this.lightColor);
        sb.append(", strokeWidthDp=");
        sb.append(this.strokeWidthDp);
        sb.append(", normalStrokeColor=");
        sb.append(this.normalStrokeColor);
        sb.append(", lightStrokeColor=");
        sb.append(this.lightStrokeColor);
        sb.append(", backgroundStrokeColor=");
        return d.o(sb, this.backgroundStrokeColor, ')');
    }

    public RadialGamePadTheme(int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8, int i9, int i10) {
        this.normalColor = i2;
        this.pressedColor = i3;
        this.simulatedColor = i4;
        this.textColor = i5;
        this.backgroundColor = i6;
        this.lightColor = i7;
        this.strokeWidthDp = f2;
        this.normalStrokeColor = i8;
        this.lightStrokeColor = i9;
        this.backgroundStrokeColor = i10;
    }

    public /* synthetic */ RadialGamePadTheme(int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8, int i9, int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_NORMAL() : i2, (i11 & 2) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_PRESSED() : i3, (i11 & 4) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_NORMAL() : i4, (i11 & 8) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_TEXT() : i5, (i11 & 16) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_BACKGROUND() : i6, (i11 & 32) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_LIGHT() : i7, (i11 & 64) != 0 ? 2.0f : f2, (i11 & 128) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_NORMAL_STROKE() : i8, (i11 & 256) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_LIGHT_STROKE() : i9, (i11 & 512) != 0 ? Constants.INSTANCE.getDEFAULT_COLOR_BACKGROUND_STROKE() : i10);
    }
}
