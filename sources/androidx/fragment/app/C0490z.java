package androidx.fragment.app;

import android.os.Bundle;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490z extends F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f4813a;

    public C0490z(Fragment fragment) {
        this.f4813a = fragment;
    }

    @Override // androidx.fragment.app.F
    public final void a() {
        Bundle bundle;
        Fragment fragment = this.f4813a;
        fragment.mSavedStateRegistryController.a();
        androidx.lifecycle.V.e(fragment);
        Bundle bundle2 = fragment.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        fragment.mSavedStateRegistryController.b(bundle);
    }
}
