package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class v extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f1724b;

    public v(Fragment fragment) {
        this.f1724b = fragment;
    }

    @Override // androidx.fragment.app.f0
    public final View b(int i10) {
        Fragment fragment = this.f1724b;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException(a4.j.g("Fragment ", fragment, " does not have a view"));
    }

    @Override // androidx.fragment.app.f0
    public final boolean c() {
        return this.f1724b.mView != null;
    }
}
