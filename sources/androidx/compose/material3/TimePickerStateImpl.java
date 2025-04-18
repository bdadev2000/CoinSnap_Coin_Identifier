package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;

/* loaded from: classes3.dex */
final class TimePickerStateImpl implements TimePickerState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12501a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f12502b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f12503c;
    public final ParcelableSnapshotMutableIntState d;
    public final ParcelableSnapshotMutableIntState e;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public TimePickerStateImpl(int i2, int i3, boolean z2) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        if (i2 < 0 || i2 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (i3 < 0 || i3 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.f12501a = z2;
        f2 = SnapshotStateKt.f(new TimePickerSelectionMode(0), StructuralEqualityPolicy.f14078a);
        this.f12502b = f2;
        f3 = SnapshotStateKt.f(Boolean.valueOf(i2 >= 12), StructuralEqualityPolicy.f14078a);
        this.f12503c = f3;
        this.d = SnapshotIntStateKt.a(i2 % 12);
        this.e = SnapshotIntStateKt.a(i3);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void a(boolean z2) {
        this.f12503c.setValue(Boolean.valueOf(z2));
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void b(int i2) {
        this.f12502b.setValue(new TimePickerSelectionMode(i2));
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int c() {
        return ((TimePickerSelectionMode) this.f12502b.getValue()).f12500a;
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void d(int i2) {
        a(i2 >= 12);
        this.d.b(i2 % 12);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void e(int i2) {
        this.e.b(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int f() {
        return this.e.g();
    }

    @Override // androidx.compose.material3.TimePickerState
    public final boolean g() {
        return this.f12501a;
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int h() {
        return this.d.g() + (i() ? 12 : 0);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final boolean i() {
        return ((Boolean) this.f12503c.getValue()).booleanValue();
    }
}
