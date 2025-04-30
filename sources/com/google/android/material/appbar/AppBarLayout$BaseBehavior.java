package com.google.android.material.appbar;

import Q7.n0;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import y3.AbstractC2950a;

/* loaded from: classes2.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC2950a {

    /* renamed from: c, reason: collision with root package name */
    public boolean f13888c;

    /* renamed from: d, reason: collision with root package name */
    public int f13889d;

    /* renamed from: e, reason: collision with root package name */
    public int f13890e;

    /* renamed from: f, reason: collision with root package name */
    public int f13891f;

    /* renamed from: g, reason: collision with root package name */
    public VelocityTracker f13892g;

    public AppBarLayout$BaseBehavior() {
        this.f13889d = -1;
        this.f13891f = -1;
    }

    @Override // G.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f13891f < 0) {
            this.f13891f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f13888c) {
            int i9 = this.f13889d;
            if (i9 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i9)) == -1) {
                return false;
            }
            int y4 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y4 - this.f13890e) > this.f13891f) {
                this.f13890e = y4;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f13892g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f13889d = -1;
        motionEvent.getX();
        motionEvent.getY();
        n0.r(view);
        throw null;
    }

    @Override // y3.AbstractC2950a, G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr, int i11) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int[] iArr) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final void q(View view, Parcelable parcelable) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final Parcelable r(View view) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final boolean s(View view, int i9, int i10) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final void t(View view, View view2, int i9) {
        n0.r(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    @Override // G.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == r2) goto L41
            r5 = 2
            if (r0 == r5) goto L2d
            r7 = 3
            if (r0 == r7) goto L45
            r7 = 6
            if (r0 == r7) goto L14
            goto L52
        L14:
            int r7 = r8.getActionIndex()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r4
        L1c:
            int r7 = r8.getPointerId(r2)
            r6.f13889d = r7
            float r7 = r8.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r7 = (int) r7
            r6.f13890e = r7
            goto L52
        L2d:
            int r0 = r6.f13889d
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r4
        L36:
            float r8 = r8.getY(r0)
            int r8 = (int) r8
            r6.f13890e = r8
            com.mbridge.msdk.foundation.entity.o.v(r7)
            throw r3
        L41:
            android.view.VelocityTracker r0 = r6.f13892g
            if (r0 != 0) goto L5c
        L45:
            r6.f13888c = r4
            r6.f13889d = r1
            android.view.VelocityTracker r7 = r6.f13892g
            if (r7 == 0) goto L52
            r7.recycle()
            r6.f13892g = r3
        L52:
            android.view.VelocityTracker r7 = r6.f13892g
            if (r7 == 0) goto L59
            r7.addMovement(r8)
        L59:
            boolean r7 = r6.f13888c
            return r7
        L5c:
            r0.addMovement(r8)
            android.view.VelocityTracker r8 = r6.f13892g
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r0)
            android.view.VelocityTracker r8 = r6.f13892g
            int r0 = r6.f13889d
            r8.getYVelocity(r0)
            com.mbridge.msdk.foundation.entity.o.v(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.u(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f13889d = -1;
        this.f13891f = -1;
    }
}
