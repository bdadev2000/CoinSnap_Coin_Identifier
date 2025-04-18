package com.google.android.material.behavior;

import a4.j;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.a;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v8.u0;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {
    public final LinkedHashSet a;

    /* renamed from: b, reason: collision with root package name */
    public int f11553b;

    /* renamed from: c, reason: collision with root package name */
    public int f11554c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f11555d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f11556e;

    /* renamed from: f, reason: collision with root package name */
    public int f11557f;

    /* renamed from: g, reason: collision with root package name */
    public int f11558g;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f11559h;

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet();
        this.f11557f = 0;
        this.f11558g = 2;
    }

    @Override // b0.a
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f11557f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f11553b = u0.g0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f11554c = u0.g0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f11555d = u0.h0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, s9.a.f24935d);
        this.f11556e = u0.h0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, s9.a.f24934c);
        return false;
    }

    @Override // b0.a
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        boolean z10;
        LinkedHashSet linkedHashSet = this.a;
        boolean z11 = true;
        if (i10 > 0) {
            if (this.f11558g == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator = this.f11559h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f11558g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    w(view, this.f11557f + 0, this.f11554c, this.f11556e);
                    return;
                } else {
                    j.t(it.next());
                    throw null;
                }
            }
            return;
        }
        if (i10 < 0) {
            if (this.f11558g != 2) {
                z11 = false;
            }
            if (!z11) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f11559h;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f11558g = 2;
                Iterator it2 = linkedHashSet.iterator();
                if (!it2.hasNext()) {
                    w(view, 0, this.f11553b, this.f11555d);
                } else {
                    j.t(it2.next());
                    throw null;
                }
            }
        }
    }

    @Override // b0.a
    public boolean t(View view, int i10, int i11) {
        return i10 == 2;
    }

    public final void w(View view, int i10, long j3, TimeInterpolator timeInterpolator) {
        this.f11559h = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j3).setListener(new d(this, 3));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.a = new LinkedHashSet();
        this.f11557f = 0;
        this.f11558g = 2;
    }
}
