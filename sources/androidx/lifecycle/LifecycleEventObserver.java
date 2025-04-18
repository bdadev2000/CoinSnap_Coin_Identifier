package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes3.dex */
public interface LifecycleEventObserver extends LifecycleObserver {
    void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event);
}
