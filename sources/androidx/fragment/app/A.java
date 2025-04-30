package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class A extends N {
    public final /* synthetic */ Fragment b;

    public A(Fragment fragment) {
        this.b = fragment;
    }

    @Override // androidx.fragment.app.N
    public final View b(int i9) {
        Fragment fragment = this.b;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i9);
        }
        throw new IllegalStateException(Q7.n0.i("Fragment ", fragment, " does not have a view"));
    }

    @Override // androidx.fragment.app.N
    public final boolean c() {
        if (this.b.mView != null) {
            return true;
        }
        return false;
    }
}
