package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import d0.b0;
import h0.g;
import i0.a;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class NoOpOverscrollEffect implements OverscrollEffect {

    /* renamed from: a, reason: collision with root package name */
    public static final NoOpOverscrollEffect f2835a = new Object();

    @Override // androidx.compose.foundation.OverscrollEffect
    public final long a(long j2, int i2, l lVar) {
        return ((Offset) lVar.invoke(new Offset(j2))).f14913a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean b() {
        return false;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final Modifier c() {
        return Modifier.Companion.f14687a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final Object d(long j2, p pVar, g gVar) {
        Object invoke = pVar.invoke(new Velocity(j2), gVar);
        return invoke == a.f30806a ? invoke : b0.f30125a;
    }
}
