package T;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class A implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f2848c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f2849d;

    public A(View view, Runnable runnable) {
        this.b = view;
        this.f2848c = view.getViewTreeObserver();
        this.f2849d = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                A a6 = new A(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(a6);
                view.addOnAttachStateChangeListener(a6);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f2848c.isAlive();
        View view = this.b;
        if (isAlive) {
            this.f2848c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2849d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2848c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f2848c.isAlive();
        View view2 = this.b;
        if (isAlive) {
            this.f2848c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
