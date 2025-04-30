package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465h extends K0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0461f f4724c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f4725d;

    public C0465h(C0461f c0461f) {
        this.f4724c = c0461f;
    }

    @Override // androidx.fragment.app.K0
    public final void b(ViewGroup viewGroup) {
        String str;
        G7.j.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f4725d;
        C0461f c0461f = this.f4724c;
        if (animatorSet == null) {
            c0461f.f4731a.c(this);
            return;
        }
        L0 l02 = c0461f.f4731a;
        if (l02.f4671g) {
            if (Build.VERSION.SDK_INT >= 26) {
                C0469j.f4730a.a(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(l02);
            sb.append(" has been canceled");
            if (l02.f4671g) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb.append(str);
            sb.append(' ');
            Log.v(FragmentManager.TAG, sb.toString());
        }
    }

    @Override // androidx.fragment.app.K0
    public final void c(ViewGroup viewGroup) {
        G7.j.e(viewGroup, "container");
        L0 l02 = this.f4724c.f4731a;
        AnimatorSet animatorSet = this.f4725d;
        if (animatorSet == null) {
            l02.c(this);
            return;
        }
        animatorSet.start();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + l02 + " has started.");
        }
    }

    @Override // androidx.fragment.app.K0
    public final void d(f.b bVar, ViewGroup viewGroup) {
        G7.j.e(bVar, "backEvent");
        G7.j.e(viewGroup, "container");
        L0 l02 = this.f4724c.f4731a;
        AnimatorSet animatorSet = this.f4725d;
        if (animatorSet == null) {
            l02.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && l02.f4667c.mTransitioning) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Adding BackProgressCallbacks for Animators to operation " + l02);
            }
            long a6 = C0467i.f4727a.a(animatorSet);
            long j7 = bVar.f20211c * ((float) a6);
            if (j7 == 0) {
                j7 = 1;
            }
            if (j7 == a6) {
                j7 = a6 - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Setting currentPlayTime to " + j7 + " for Animator " + animatorSet + " on operation " + l02);
            }
            C0469j.f4730a.b(animatorSet, j7);
        }
    }

    @Override // androidx.fragment.app.K0
    public final void e(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        boolean z8;
        G7.j.e(viewGroup, "container");
        C0461f c0461f = this.f4724c;
        if (c0461f.a()) {
            return;
        }
        Context context = viewGroup.getContext();
        G7.j.d(context, "context");
        L b = c0461f.b(context);
        if (b != null) {
            animatorSet = b.b;
        } else {
            animatorSet = null;
        }
        this.f4725d = animatorSet;
        L0 l02 = c0461f.f4731a;
        Fragment fragment = l02.f4667c;
        if (l02.f4666a == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z9 = z8;
        View view = fragment.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet2 = this.f4725d;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new C0463g(viewGroup, view, z9, l02, this));
        }
        AnimatorSet animatorSet3 = this.f4725d;
        if (animatorSet3 != null) {
            animatorSet3.setTarget(view);
        }
    }
}
