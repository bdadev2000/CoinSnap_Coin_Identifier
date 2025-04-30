package O3;

import android.graphics.Typeface;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.webkit.TracingConfig;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ int a(Typeface typeface) {
        return typeface.getWeight();
    }

    public static /* bridge */ /* synthetic */ Typeface d(Typeface typeface, int i9, boolean z8) {
        return Typeface.create(typeface, i9, z8);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ void q() {
        new TracingConfig.Builder();
    }
}
