package n0;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class c0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f22252b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f22253c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f22254d;

    public c0(View view, Runnable runnable) {
        this.f22252b = view;
        this.f22253c = view.getViewTreeObserver();
        this.f22254d = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                c0 c0Var = new c0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(c0Var);
                view.addOnAttachStateChangeListener(c0Var);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f22253c.isAlive();
        View view = this.f22252b;
        if (isAlive) {
            this.f22253c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f22254d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f22253c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f22253c.isAlive();
        View view2 = this.f22252b;
        if (isAlive) {
            this.f22253c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
