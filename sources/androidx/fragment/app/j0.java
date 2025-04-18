package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class j0 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1655b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f1656c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1657d;

    public j0(k0 k0Var, k1 k1Var) {
        this.f1657d = k0Var;
        this.f1656c = k1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f1655b;
        Object obj = this.f1657d;
        switch (i10) {
            case 0:
                k1 k1Var = this.f1656c;
                Fragment fragment = k1Var.f1677c;
                k1Var.k();
                e2.j((ViewGroup) fragment.mView.getParent(), ((k0) obj).f1675b).i();
                return;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                ViewCompat.requestApplyInsets(view2);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public j0(k1 k1Var, View view) {
        this.f1656c = k1Var;
        this.f1657d = view;
    }
}
