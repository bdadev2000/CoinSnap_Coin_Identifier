package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class ShadowSpan extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f17166a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17167b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17168c;
    public final float d;

    public ShadowSpan(float f2, float f3, float f4, int i2) {
        this.f17166a = i2;
        this.f17167b = f2;
        this.f17168c = f3;
        this.d = f4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.d, this.f17167b, this.f17168c, this.f17166a);
    }
}
