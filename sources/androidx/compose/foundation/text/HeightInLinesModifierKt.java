package androidx.compose.foundation.text;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
public final class HeightInLinesModifierKt {
    public static final void a(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException(d.l("both minLines ", i2, " and maxLines ", i3, " must be greater than zero").toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(d.k("minLines ", i2, " must be less than or equal to maxLines ", i3).toString());
        }
    }
}
