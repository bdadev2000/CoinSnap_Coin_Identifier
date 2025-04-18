package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final GeneratedAdapter[] f19943a;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.f19943a = generatedAdapterArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        new HashMap();
        GeneratedAdapter[] generatedAdapterArr = this.f19943a;
        for (GeneratedAdapter generatedAdapter : generatedAdapterArr) {
            generatedAdapter.a();
        }
        for (GeneratedAdapter generatedAdapter2 : generatedAdapterArr) {
            generatedAdapter2.a();
        }
    }
}
