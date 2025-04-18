package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2128a;

    /* renamed from: b, reason: collision with root package name */
    public Easing f2129b;

    public KeyframeBaseEntity(Float f2, Easing easing) {
        this.f2128a = f2;
        this.f2129b = easing;
    }
}
