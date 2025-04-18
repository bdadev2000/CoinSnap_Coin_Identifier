package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.Velocity;
import h0.g;

/* loaded from: classes.dex */
public interface NestedScrollConnection {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    default long E0(int i2, long j2, long j3) {
        return 0L;
    }

    default Object W0(long j2, g gVar) {
        return new Velocity(0L);
    }

    default long g0(int i2, long j2) {
        return 0L;
    }

    default Object h1(long j2, long j3, g gVar) {
        return new Velocity(0L);
    }
}
