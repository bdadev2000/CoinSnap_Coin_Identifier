package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ l a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2 f1653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f1654e;

    public j(l lVar, View view, boolean z10, c2 c2Var, g gVar) {
        this.a = lVar;
        this.f1651b = view;
        this.f1652c = z10;
        this.f1653d = c2Var;
        this.f1654e = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.a.a;
        View viewToAnimate = this.f1651b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z10 = this.f1652c;
        c2 c2Var = this.f1653d;
        if (z10) {
            b2 b2Var = c2Var.a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            b2Var.a(viewToAnimate);
        }
        this.f1654e.a();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + c2Var + " has ended.");
        }
    }
}
