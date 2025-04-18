package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AnalogTimePickerState implements TimePickerState {

    /* renamed from: a, reason: collision with root package name */
    public final TimePickerState f7571a;

    /* renamed from: b, reason: collision with root package name */
    public float f7572b;

    /* renamed from: c, reason: collision with root package name */
    public float f7573c;
    public Animatable d;
    public final MutatorMutex e = new MutatorMutex();

    public AnalogTimePickerState(TimePickerState timePickerState) {
        this.f7571a = timePickerState;
        this.f7572b = ((timePickerState.h() % 12) * 0.5235988f) - 1.5707964f;
        this.f7573c = (timePickerState.f() * 0.10471976f) - 1.5707964f;
        this.d = AnimatableKt.a(this.f7572b);
    }

    public static float k(float f2) {
        double d = f2 % 6.283185307179586d;
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void a(boolean z2) {
        this.f7571a.a(z2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void b(int i2) {
        this.f7571a.b(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int c() {
        return this.f7571a.c();
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void d(int i2) {
        this.f7572b = ((i2 % 12) * 0.5235988f) - 1.5707964f;
        TimePickerState timePickerState = this.f7571a;
        timePickerState.d(i2);
        if (TimePickerSelectionMode.a(timePickerState.c(), 0)) {
            this.d = AnimatableKt.a(this.f7572b);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void e(int i2) {
        this.f7573c = (i2 * 0.10471976f) - 1.5707964f;
        TimePickerState timePickerState = this.f7571a;
        timePickerState.e(i2);
        if (TimePickerSelectionMode.a(timePickerState.c(), 1)) {
            this.d = AnimatableKt.a(this.f7573c);
        }
        Snapshot a2 = Snapshot.Companion.a();
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            timePickerState.e(timePickerState.f());
        } finally {
            Snapshot.Companion.f(a2, c2, f2);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int f() {
        return this.f7571a.f();
    }

    @Override // androidx.compose.material3.TimePickerState
    public final boolean g() {
        return this.f7571a.g();
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int h() {
        return this.f7571a.h();
    }

    @Override // androidx.compose.material3.TimePickerState
    public final boolean i() {
        return this.f7571a.i();
    }

    public final float j(float f2) {
        float floatValue = ((Number) this.d.d()).floatValue() - f2;
        while (floatValue > 3.1415927f) {
            floatValue -= 6.2831855f;
        }
        while (floatValue <= -3.1415927f) {
            floatValue += 6.2831855f;
        }
        return ((Number) this.d.d()).floatValue() - floatValue;
    }
}
