package com.applovin.impl;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.applovin.impl.InterfaceC0736p1;

/* loaded from: classes.dex */
public final /* synthetic */ class G1 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6397d;

    public /* synthetic */ G1(Object obj, long j7, int i9) {
        this.b = i9;
        this.f6397d = obj;
        this.f6396c = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((InterfaceC0736p1.a) this.f6397d).a(this.f6396c);
                return;
            case 1:
                com.applovin.impl.sdk.j.b((com.applovin.impl.sdk.j) this.f6397d, this.f6396c);
                return;
            case 2:
                com.vungle.ads.internal.presenter.q.m69processCommand$lambda11((com.vungle.ads.internal.presenter.q) this.f6397d, this.f6396c);
                return;
            default:
                View view = (View) this.f6397d;
                G7.j.e(view, "$this_circularRevealed");
                if (view.isAttachedToWindow()) {
                    view.setVisibility(0);
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, 0.0f, Math.max(view.getWidth(), view.getHeight()));
                    createCircularReveal.setDuration(this.f6396c);
                    createCircularReveal.start();
                    return;
                }
                return;
        }
    }
}
