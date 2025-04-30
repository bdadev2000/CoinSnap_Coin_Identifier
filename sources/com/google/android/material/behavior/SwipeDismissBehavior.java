package com.google.android.material.behavior;

import G.b;
import U.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import c0.C0585d;
import k.C2426o;
import z3.C2971a;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public C0585d f13907a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13908c;

    /* renamed from: d, reason: collision with root package name */
    public int f13909d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f13910e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f13911f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f13912g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final C2971a f13913h = new C2971a(this);

    @Override // G.b
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z8 = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.b = false;
            }
        } else {
            z8 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z8;
        }
        if (!z8) {
            return false;
        }
        if (this.f13907a == null) {
            this.f13907a = new C0585d(coordinatorLayout.getContext(), coordinatorLayout, this.f13913h);
        }
        if (!this.f13908c && this.f13907a.p(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        if (ViewCompat.getImportantForAccessibility(view) == 0) {
            ViewCompat.setImportantForAccessibility(view, 1);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            if (v(view)) {
                ViewCompat.replaceAccessibilityAction(view, d.f3091j, null, new C2426o(this, 8));
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // G.b
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.f13907a != null) {
            if (!this.f13908c || motionEvent.getActionMasked() != 3) {
                this.f13907a.j(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean v(View view) {
        return true;
    }
}
