package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class S implements View.OnAttachStateChangeListener {
    public final /* synthetic */ w0 b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f4686c;

    public S(T t9, w0 w0Var) {
        this.f4686c = t9;
        this.b = w0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        w0 w0Var = this.b;
        Fragment fragment = w0Var.f4797c;
        w0Var.k();
        r.n((ViewGroup) fragment.mView.getParent(), this.f4686c.b).m();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
