package v;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import d0.b0;

/* loaded from: classes3.dex */
public final class d implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1.k f31376a;

    public d(b1.l lVar) {
        this.f31376a = lVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f31376a.resumeWith(b0.f30125a);
    }
}
