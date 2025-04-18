package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;
import w0.g;

@StabilityInferred
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<g> {

    /* renamed from: a, reason: collision with root package name */
    public final int f4820a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4821b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4822c;
    public int d;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public LazyLayoutNearestRangeState(int i2, int i3, int i4) {
        this.f4820a = i3;
        this.f4821b = i4;
        int i5 = (i2 / i3) * i3;
        this.f4822c = SnapshotStateKt.f(a.F0(Math.max(i5 - i4, 0), i5 + i3 + i4), SnapshotStateKt.m());
        this.d = i2;
    }

    public final void a(int i2) {
        if (i2 != this.d) {
            this.d = i2;
            int i3 = this.f4820a;
            int i4 = (i2 / i3) * i3;
            int i5 = this.f4821b;
            this.f4822c.setValue(a.F0(Math.max(i4 - i5, 0), i4 + i3 + i5));
        }
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return (g) this.f4822c.getValue();
    }
}
