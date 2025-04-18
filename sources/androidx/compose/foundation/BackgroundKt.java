package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* loaded from: classes4.dex */
public final class BackgroundKt {
    public static final Modifier a(Modifier modifier, long j2, Shape shape) {
        return modifier.T0(new BackgroundElement(j2, shape));
    }
}
