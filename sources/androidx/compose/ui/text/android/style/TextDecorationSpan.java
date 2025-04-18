package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextDecorationSpan extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17170a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17171b;

    public TextDecorationSpan(boolean z2, boolean z3) {
        this.f17170a = z2;
        this.f17171b = z3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f17170a);
        textPaint.setStrikeThruText(this.f17171b);
    }
}
