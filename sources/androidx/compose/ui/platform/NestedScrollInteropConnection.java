package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;

@StabilityInferred
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long E0(int i2, long j2, long j3) {
        NestedScrollInteropConnectionKt.a(j3);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object W0(long j2, h0.g gVar) {
        Velocity.b(j2);
        Velocity.c(j2);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long g0(int i2, long j2) {
        NestedScrollInteropConnectionKt.a(j2);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object h1(long j2, long j3, h0.g gVar) {
        Velocity.b(j3);
        Velocity.c(j3);
        throw null;
    }
}
