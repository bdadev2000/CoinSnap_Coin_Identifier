package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import b0.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import o0.c;
import x0.d;
import y7.u;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends a {
    public d a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11561c;

    /* renamed from: d, reason: collision with root package name */
    public int f11562d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f11563e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f11564f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f11565g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final u9.a f11566h = new u9.a(this);

    @Override // b0.a
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f11560b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f11560b = false;
            }
        } else {
            z10 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11560b = z10;
        }
        if (!z10) {
            return false;
        }
        if (this.a == null) {
            this.a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f11566h);
        }
        if (!this.f11561c && this.a.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // b0.a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ViewCompat.removeAccessibilityAction(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            if (w(view)) {
                ViewCompat.replaceAccessibilityAction(view, c.f22961j, null, new u(this));
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // b0.a
    public final boolean v(View view, MotionEvent motionEvent) {
        if (this.a != null) {
            if (!this.f11561c || motionEvent.getActionMasked() != 3) {
                this.a.k(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean w(View view) {
        return true;
    }
}
