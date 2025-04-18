package androidx.compose.foundation;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;

/* loaded from: classes3.dex */
public final class BorderKt {
    public static final long a(long j2, float f2) {
        return CornerRadiusKt.a(Math.max(0.0f, CornerRadius.b(j2) - f2), Math.max(0.0f, CornerRadius.c(j2) - f2));
    }
}
