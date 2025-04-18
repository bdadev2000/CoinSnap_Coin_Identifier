package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes4.dex */
public final class OffsetKt {
    public static final Modifier a(Modifier modifier, l lVar) {
        return modifier.T0(new OffsetPxElement(lVar));
    }

    public static final Modifier b(Modifier modifier, float f2, float f3) {
        return modifier.T0(new OffsetElement(f2, f3));
    }

    public static Modifier c(Modifier modifier, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0;
        }
        if ((i2 & 2) != 0) {
            f3 = 0;
        }
        return b(modifier, f2, f3);
    }
}
