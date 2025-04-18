package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputChange;

/* loaded from: classes3.dex */
final class TouchSlopDetector {

    /* renamed from: a, reason: collision with root package name */
    public final Orientation f3583a;

    /* renamed from: b, reason: collision with root package name */
    public long f3584b = 0;

    public TouchSlopDetector(Orientation orientation) {
        this.f3583a = orientation;
    }

    public final Offset a(PointerInputChange pointerInputChange, float f2) {
        float abs;
        long a2;
        long k2 = Offset.k(this.f3584b, Offset.j(pointerInputChange.f15591c, pointerInputChange.f15593g));
        this.f3584b = k2;
        Orientation orientation = Orientation.f3395b;
        Orientation orientation2 = this.f3583a;
        if (orientation2 == null) {
            abs = Offset.e(k2);
        } else {
            abs = Math.abs(orientation2 == orientation ? Offset.g(k2) : Offset.h(k2));
        }
        if (abs < f2) {
            return null;
        }
        if (orientation2 == null) {
            long j2 = this.f3584b;
            a2 = Offset.j(this.f3584b, Offset.l(Offset.c(j2, Offset.e(j2)), f2));
        } else {
            long j3 = this.f3584b;
            float g2 = orientation2 == orientation ? Offset.g(j3) : Offset.h(j3);
            long j4 = this.f3584b;
            float signum = g2 - (Math.signum(orientation2 == orientation ? Offset.g(j4) : Offset.h(j4)) * f2);
            long j5 = this.f3584b;
            float h2 = orientation2 == orientation ? Offset.h(j5) : Offset.g(j5);
            a2 = orientation2 == orientation ? OffsetKt.a(signum, h2) : OffsetKt.a(h2, signum);
        }
        return new Offset(a2);
    }
}
