package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;

/* loaded from: classes4.dex */
public final class PointerEventKt {
    public static final boolean a(PointerInputChange pointerInputChange) {
        return !pointerInputChange.f15594h && pointerInputChange.d;
    }

    public static final boolean b(PointerInputChange pointerInputChange) {
        return (pointerInputChange.b() || !pointerInputChange.f15594h || pointerInputChange.d) ? false : true;
    }

    public static final boolean c(PointerInputChange pointerInputChange) {
        return pointerInputChange.f15594h && !pointerInputChange.d;
    }

    public static final boolean d(PointerInputChange pointerInputChange, long j2) {
        long j3 = pointerInputChange.f15591c;
        float g2 = Offset.g(j3);
        float h2 = Offset.h(j3);
        return g2 < 0.0f || g2 > ((float) ((int) (j2 >> 32))) || h2 < 0.0f || h2 > ((float) ((int) (j2 & 4294967295L)));
    }

    public static final boolean e(PointerInputChange pointerInputChange, long j2, long j3) {
        if (!PointerType.a(pointerInputChange.f15595i, 1)) {
            return d(pointerInputChange, j2);
        }
        long j4 = pointerInputChange.f15591c;
        float g2 = Offset.g(j4);
        float h2 = Offset.h(j4);
        return g2 < (-Size.d(j3)) || g2 > Size.d(j3) + ((float) ((int) (j2 >> 32))) || h2 < (-Size.b(j3)) || h2 > Size.b(j3) + ((float) ((int) (j2 & 4294967295L)));
    }

    public static final long f(PointerInputChange pointerInputChange, boolean z2) {
        long j2 = Offset.j(pointerInputChange.f15591c, pointerInputChange.f15593g);
        if (z2 || !pointerInputChange.b()) {
            return j2;
        }
        return 0L;
    }
}
