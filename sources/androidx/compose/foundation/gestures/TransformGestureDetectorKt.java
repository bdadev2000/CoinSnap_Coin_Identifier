package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;

/* loaded from: classes4.dex */
public final class TransformGestureDetectorKt {
    public static final float a(long j2) {
        if (Offset.g(j2) == 0.0f && Offset.h(j2) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.g(j2), Offset.h(j2)))) * 180.0f) / 3.1415927f;
    }

    public static final long b(PointerEvent pointerEvent, boolean z2) {
        List list = pointerEvent.f15569a;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i3);
            if (pointerInputChange.d && pointerInputChange.f15594h) {
                j2 = Offset.k(j2, z2 ? pointerInputChange.f15591c : pointerInputChange.f15593g);
                i2++;
            }
        }
        if (i2 == 0) {
            return 9205357640488583168L;
        }
        return Offset.c(j2, i2);
    }

    public static final float c(PointerEvent pointerEvent, boolean z2) {
        long b2 = b(pointerEvent, z2);
        float f2 = 0.0f;
        if (Offset.d(b2, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = pointerEvent.f15569a;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i3);
            if (pointerInputChange.d && pointerInputChange.f15594h) {
                i2++;
                f2 = Offset.e(Offset.j(z2 ? pointerInputChange.f15591c : pointerInputChange.f15593g, b2)) + f2;
            }
        }
        return f2 / i2;
    }

    public static final float d(PointerEvent pointerEvent) {
        List list = pointerEvent.f15569a;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
            if (!pointerInputChange.f15594h || !pointerInputChange.d) {
                i4 = 0;
            }
            i3 += i4;
            i2++;
        }
        if (i3 < 2) {
            return 0.0f;
        }
        long b2 = b(pointerEvent, true);
        long b3 = b(pointerEvent, false);
        int size2 = list.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i5 = 0; i5 < size2; i5++) {
            PointerInputChange pointerInputChange2 = (PointerInputChange) list.get(i5);
            if (pointerInputChange2.d && pointerInputChange2.f15594h) {
                long j2 = Offset.j(pointerInputChange2.f15593g, b3);
                long j3 = Offset.j(pointerInputChange2.f15591c, b2);
                float a2 = a(j3) - a(j2);
                float e = Offset.e(Offset.k(j3, j2)) / 2.0f;
                if (a2 > 180.0f) {
                    a2 -= 360.0f;
                } else if (a2 < -180.0f) {
                    a2 += 360.0f;
                }
                f3 += a2 * e;
                f2 += e;
            }
        }
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f3 / f2;
    }
}
