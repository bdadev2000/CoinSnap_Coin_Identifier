package com.cooldev.gba.emulator.gameboy.features.home.utils;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextDrawable extends Drawable {
    private static final int DEFAULT_COLOR = -1;
    private final int color;

    @NotNull
    private final TextPaint mPaint;

    @NotNull
    private final Rect mTextBounds;

    @NotNull
    private final String text;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public TextDrawable(@NotNull String str, int i2) {
        a.s(str, "text");
        this.text = str;
        this.color = i2;
        Rect rect = new Rect();
        this.mTextBounds = rect;
        TextPaint textPaint = new TextPaint(1);
        this.mPaint = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.getTextBounds(str, 0, str.length(), rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        a.s(canvas, "canvas");
        this.mPaint.setColor(this.color);
        canvas.drawRect(getBounds(), this.mPaint);
        this.mPaint.setColor(-1);
        this.mPaint.setTextSize(getBounds().height() * 0.3f);
        float f2 = 2;
        canvas.drawText(this.text, getBounds().width() / f2, (getBounds().height() / f2) - ((this.mPaint.ascent() + this.mPaint.descent()) / f2), this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    @d0.a
    public int getOpacity() {
        return this.mPaint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.mPaint.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
