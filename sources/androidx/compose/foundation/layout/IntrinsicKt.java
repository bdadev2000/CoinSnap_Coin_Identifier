package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

/* loaded from: classes2.dex */
public final class IntrinsicKt {
    public static final Modifier a() {
        return new IntrinsicHeightElement();
    }

    public static final Modifier b(Modifier modifier, IntrinsicSize intrinsicSize) {
        return modifier.T0(new IntrinsicWidthElement(intrinsicSize));
    }
}
