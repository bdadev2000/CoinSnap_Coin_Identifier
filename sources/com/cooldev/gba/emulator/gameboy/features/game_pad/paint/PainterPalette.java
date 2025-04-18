package com.cooldev.gba.emulator.gameboy.features.game_pad.paint;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.PaintUtils;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PainterPalette {
    public static final int $stable = 0;

    @NotNull
    private final FillStrokePaint background;

    @NotNull
    private final FillStrokePaint light;

    @NotNull
    private final FillStrokePaint normal;

    @NotNull
    private final FillStrokePaint pressed;

    @NotNull
    private final FillStrokePaint simulated;
    private final float strokeSizePx;

    public PainterPalette(@NotNull Context context, @NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(context, "context");
        a.s(radialGamePadTheme, RouterName.THEME);
        this.strokeSizePx = PaintUtils.INSTANCE.convertDpToPixel(radialGamePadTheme.getStrokeWidthDp(), context);
        this.normal = standard(radialGamePadTheme.getNormalColor(), radialGamePadTheme.getNormalStrokeColor());
        this.pressed = standard(radialGamePadTheme.getPressedColor(), radialGamePadTheme.getNormalStrokeColor());
        this.simulated = standard(radialGamePadTheme.getSimulatedColor(), radialGamePadTheme.getNormalStrokeColor());
        this.background = standard(radialGamePadTheme.getBackgroundColor(), radialGamePadTheme.getBackgroundStrokeColor());
        this.light = standard(radialGamePadTheme.getLightColor(), radialGamePadTheme.getLightStrokeColor());
    }

    private final FillStrokePaint standard(int i2, int i3) {
        return new FillStrokePaint(i2, i3, this.strokeSizePx);
    }

    @NotNull
    public final FillStrokePaint getBackground() {
        return this.background;
    }

    @NotNull
    public final FillStrokePaint getLight() {
        return this.light;
    }

    @NotNull
    public final FillStrokePaint getNormal() {
        return this.normal;
    }

    @NotNull
    public final FillStrokePaint getPressed() {
        return this.pressed;
    }

    @NotNull
    public final FillStrokePaint getSimulated() {
        return this.simulated;
    }
}
