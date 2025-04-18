package com.cooldev.gba.emulator.gameboy.features.game_pad.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CompositeButtonPaint {
    public static final int $stable = 8;

    @NotNull
    private final PainterPalette painterPalette;
    private float radius;

    public CompositeButtonPaint(@NotNull Context context, @NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(context, "context");
        a.s(radialGamePadTheme, RouterName.THEME);
        this.painterPalette = new PainterPalette(context, radialGamePadTheme);
    }

    public final void drawCompositeButton(@NotNull Canvas canvas, float f2, float f3, boolean z2) {
        a.s(canvas, "canvas");
        FillStrokePaint pressed = z2 ? this.painterPalette.getPressed() : this.painterPalette.getLight();
        canvas.drawCircle(f2, f3, this.radius, pressed.getFillPaint());
        BasePaint strokePaint = pressed.getStrokePaint();
        if (strokePaint != null) {
            canvas.drawCircle(f2, f3, this.radius, strokePaint);
        }
    }

    public final void drawCompositeButton1(@NotNull Canvas canvas, float f2, float f3, boolean z2) {
        a.s(canvas, "canvas");
        PainterPalette painterPalette = this.painterPalette;
        FillStrokePaint pressed = z2 ? painterPalette.getPressed() : painterPalette.getLight();
        int parseColor = Color.parseColor("#374049");
        BasePaint fillPaint = pressed.getFillPaint();
        fillPaint.setColor(parseColor);
        fillPaint.setStyle(z2 ? Paint.Style.FILL : Paint.Style.STROKE);
        fillPaint.setStrokeWidth(4.0f);
        fillPaint.setAntiAlias(true);
        canvas.drawCircle(f2, f3, this.radius, fillPaint);
        BasePaint strokePaint = pressed.getStrokePaint();
        if (strokePaint != null) {
            strokePaint.setColor(parseColor);
            strokePaint.setStyle(z2 ? Paint.Style.FILL : Paint.Style.STROKE);
            strokePaint.setStrokeWidth(4.0f);
            strokePaint.setAntiAlias(true);
            canvas.drawCircle(f2, f3, this.radius, strokePaint);
        }
    }

    public final void updateDrawingBox(@NotNull RectF rectF) {
        a.s(rectF, "drawingBox");
        this.radius = Math.min(rectF.width(), rectF.height()) / 30.0f;
    }
}
