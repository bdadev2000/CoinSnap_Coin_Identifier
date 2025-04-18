package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class t extends a0 {
    public final /* synthetic */ Fragment a;

    public t(Fragment fragment) {
        this.a = fragment;
    }

    @Override // androidx.fragment.app.a0
    public final void a() {
        Bundle bundle;
        Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a();
        jb.g.e(fragment);
        Bundle bundle2 = fragment.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        fragment.mSavedStateRegistryController.b(bundle);
    }
}
