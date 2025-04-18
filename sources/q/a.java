package q;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import b1.h1;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f31232a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f31233b;

    public a(Lifecycle lifecycle, h1 h1Var) {
        this.f31232a = lifecycle;
        this.f31233b = h1Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f31233b.a(null);
    }
}
