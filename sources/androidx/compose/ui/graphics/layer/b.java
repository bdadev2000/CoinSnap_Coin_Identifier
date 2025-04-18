package androidx.compose.ui.graphics.layer;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText j(Spannable spannable) {
        return (PrecomputedText) spannable;
    }

    public static /* bridge */ /* synthetic */ boolean x(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
