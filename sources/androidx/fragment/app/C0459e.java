package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459e extends K0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0461f f4714c;

    public C0459e(C0461f c0461f) {
        this.f4714c = c0461f;
    }

    @Override // androidx.fragment.app.K0
    public final void b(ViewGroup viewGroup) {
        G7.j.e(viewGroup, "container");
        C0461f c0461f = this.f4714c;
        L0 l02 = c0461f.f4731a;
        View view = l02.f4667c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        c0461f.f4731a.c(this);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + l02 + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.K0
    public final void c(ViewGroup viewGroup) {
        G7.j.e(viewGroup, "container");
        C0461f c0461f = this.f4714c;
        boolean a6 = c0461f.a();
        L0 l02 = c0461f.f4731a;
        if (a6) {
            l02.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = l02.f4667c.mView;
        G7.j.d(context, "context");
        L b = c0461f.b(context);
        if (b != null) {
            Animation animation = b.f4665a;
            if (animation != null) {
                if (l02.f4666a != 1) {
                    view.startAnimation(animation);
                    l02.c(this);
                    return;
                }
                viewGroup.startViewTransition(view);
                M m = new M(animation, viewGroup, view);
                m.setAnimationListener(new AnimationAnimationListenerC0457d(l02, viewGroup, view, this));
                view.startAnimation(m);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Animation from operation " + l02 + " has started.");
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
