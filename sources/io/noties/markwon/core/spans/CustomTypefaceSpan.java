package io.noties.markwon.core.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes5.dex */
public class CustomTypefaceSpan extends MetricAffectingSpan {
    private final Typeface typeface;

    public static CustomTypefaceSpan create(Typeface typeface) {
        return new CustomTypefaceSpan(typeface);
    }

    public CustomTypefaceSpan(Typeface typeface) {
        this.typeface = typeface;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        updatePaint(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        updatePaint(textPaint);
    }

    private void updatePaint(TextPaint textPaint) {
        textPaint.setTypeface(this.typeface);
    }
}
