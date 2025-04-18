package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public class SkewXSpan extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f17169a;

    public SkewXSpan(float f2) {
        this.f17169a = f2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f17169a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f17169a);
    }
}
