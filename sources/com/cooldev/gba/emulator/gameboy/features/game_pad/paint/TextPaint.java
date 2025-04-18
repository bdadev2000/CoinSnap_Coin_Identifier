package com.cooldev.gba.emulator.gameboy.features.game_pad.paint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.KotlinUtilsKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class TextPaint {
    public static final int $stable = 8;

    @NotNull
    private final BasePaint textPaint;

    @NotNull
    private Rect textBounds = new Rect();

    @NotNull
    private final l cachedTextAspectRatio = KotlinUtilsKt.memoize(new TextPaint$cachedTextAspectRatio$1(this));

    public TextPaint() {
        BasePaint basePaint = new BasePaint();
        basePaint.setTypeface(Typeface.DEFAULT_BOLD);
        basePaint.setStyle(Paint.Style.FILL);
        this.textPaint = basePaint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float computeTextAspectRatio(String str) {
        this.textPaint.setTextSize(20.0f);
        this.textPaint.getTextBounds(str, 0, str.length(), this.textBounds);
        return this.textBounds.width() / this.textBounds.height();
    }

    public final void paintText(@NotNull RectF rectF, @NotNull String str, @NotNull Canvas canvas, @NotNull RadialGamePadTheme radialGamePadTheme) {
        a.s(rectF, "rectF");
        a.s(str, "text");
        a.s(canvas, "canvas");
        a.s(radialGamePadTheme, RouterName.THEME);
        paintText(rectF.left, rectF.top, rectF.width(), rectF.height(), str, canvas, radialGamePadTheme);
    }

    private final void paintText(float f2, float f3, float f4, float f5, String str, Canvas canvas, RadialGamePadTheme radialGamePadTheme) {
        float floatValue = ((Number) this.cachedTextAspectRatio.invoke(str)).floatValue();
        this.textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        this.textPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setTextSize(Math.min(f5 / 2, f4 / floatValue));
        this.textPaint.setColor(radialGamePadTheme.getTextColor());
        canvas.drawText(str, (f4 / 2.0f) + (f2 - (this.textPaint.measureText(str) / 2.0f)), ((f5 / 2.0f) + f3) - ((this.textPaint.ascent() + this.textPaint.descent()) / 2.0f), this.textPaint);
    }
}
