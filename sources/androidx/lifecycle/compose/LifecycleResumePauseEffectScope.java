package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LifecycleResumePauseEffectScope implements LifecycleOwner {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f20224a;

    public LifecycleResumePauseEffectScope(Lifecycle lifecycle) {
        this.f20224a = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f20224a;
    }
}
