package com.cooldev.gba.emulator.gameboy.features.game_pad.paint;

import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class FillStrokePaint {
    public static final int $stable = 0;

    @NotNull
    private final BasePaint fillPaint;

    @Nullable
    private final BasePaint strokePaint;

    public FillStrokePaint(int i2, int i3, float f2) {
        this.fillPaint = buildFillPaint(i2, f2);
        this.strokePaint = buildStrokePaint(i3, f2);
    }

    private final BasePaint buildFillPaint(int i2, float f2) {
        BasePaint basePaint = new BasePaint();
        basePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        basePaint.setColor(i2);
        basePaint.setStrokeCap(Paint.Cap.ROUND);
        basePaint.setStrokeWidth(f2);
        return basePaint;
    }

    private final BasePaint buildStrokePaint(int i2, float f2) {
        if (i2 == 0) {
            return null;
        }
        BasePaint basePaint = new BasePaint();
        basePaint.setStyle(Paint.Style.STROKE);
        basePaint.setColor(i2);
        basePaint.setStrokeCap(Paint.Cap.ROUND);
        basePaint.setStrokeWidth(f2);
        return basePaint;
    }

    @NotNull
    public final BasePaint getFillPaint() {
        return this.fillPaint;
    }

    @Nullable
    public final BasePaint getStrokePaint() {
        return this.strokePaint;
    }

    public final void paint(@NotNull l lVar) {
        a.s(lVar, "paintLambda");
        lVar.invoke(getFillPaint());
        BasePaint strokePaint = getStrokePaint();
        if (strokePaint != null) {
            lVar.invoke(strokePaint);
        }
    }
}
