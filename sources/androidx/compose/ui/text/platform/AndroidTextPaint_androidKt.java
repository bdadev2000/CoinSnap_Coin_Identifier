package androidx.compose.ui.text.platform;

import android.text.TextPaint;

/* loaded from: classes3.dex */
public final class AndroidTextPaint_androidKt {
    public static final void a(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255));
    }
}
