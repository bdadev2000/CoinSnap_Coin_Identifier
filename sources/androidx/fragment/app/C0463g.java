package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4720a;
    public final /* synthetic */ View b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L0 f4722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0465h f4723e;

    public C0463g(ViewGroup viewGroup, View view, boolean z8, L0 l02, C0465h c0465h) {
        this.f4720a = viewGroup;
        this.b = view;
        this.f4721c = z8;
        this.f4722d = l02;
        this.f4723e = c0465h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        G7.j.e(animator, "anim");
        ViewGroup viewGroup = this.f4720a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z8 = this.f4721c;
        L0 l02 = this.f4722d;
        if (z8) {
            int i9 = l02.f4666a;
            G7.j.d(view, "viewToAnimate");
            Q7.n0.a(i9, view, viewGroup);
        }
        C0465h c0465h = this.f4723e;
        c0465h.f4724c.f4731a.c(c0465h);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + l02 + " has ended.");
        }
    }
}
