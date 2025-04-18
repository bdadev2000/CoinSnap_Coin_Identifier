package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LifecycleStartStopEffectScope implements LifecycleOwner {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f20225a;

    public LifecycleStartStopEffectScope(Lifecycle lifecycle) {
        this.f20225a = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f20225a;
    }
}
