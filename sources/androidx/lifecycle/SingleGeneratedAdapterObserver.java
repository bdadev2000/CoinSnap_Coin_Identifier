package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes4.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final GeneratedAdapter f20117a;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.f20117a = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        GeneratedAdapter generatedAdapter = this.f20117a;
        generatedAdapter.a();
        generatedAdapter.a();
    }
}
