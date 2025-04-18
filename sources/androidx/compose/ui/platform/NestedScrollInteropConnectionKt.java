package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Offset;

/* loaded from: classes2.dex */
public final class NestedScrollInteropConnectionKt {
    public static final void a(long j2) {
        Math.abs(Offset.g(j2));
        Math.abs(Offset.h(j2));
    }

    public static final int b(float f2) {
        return ((int) (f2 >= 0.0f ? Math.ceil(f2) : Math.floor(f2))) * (-1);
    }
}
