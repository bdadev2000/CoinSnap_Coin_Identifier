package com.google.android.material.behavior;

import B3.c;
import G.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x3.AbstractC2920a;
import y2.AbstractC2947c;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f13901c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f13902d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f13903e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f13906h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f13900a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f13904f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f13905g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // G.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        this.f13904f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = AbstractC2947c.u(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f13901c = AbstractC2947c.u(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f13902d = AbstractC2947c.v(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2920a.f24228d);
        this.f13903e = AbstractC2947c.v(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2920a.f24227c);
        return false;
    }

    @Override // G.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f13900a;
        if (i9 > 0) {
            if (this.f13905g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f13906h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f13905g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    this.f13906h = view.animate().translationY(this.f13904f).setInterpolator(this.f13903e).setDuration(this.f13901c).setListener(new c(this, 9));
                    return;
                }
                o.v(it.next());
                throw null;
            }
            return;
        }
        if (i9 < 0 && this.f13905g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f13906h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f13905g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.f13906h = view.animate().translationY(0).setInterpolator(this.f13902d).setDuration(this.b).setListener(new c(this, 9));
                return;
            }
            o.v(it2.next());
            throw null;
        }
    }

    @Override // G.b
    public boolean s(View view, int i9, int i10) {
        if (i9 == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
