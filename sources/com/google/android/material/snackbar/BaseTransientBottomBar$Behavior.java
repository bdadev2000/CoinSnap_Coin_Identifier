package com.google.android.material.snackbar;

import T3.a;
import a5.C0398b;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j5.C2400c;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i, reason: collision with root package name */
    public final C0398b f14126i;

    /* JADX WARN: Type inference failed for: r0v0, types: [a5.b, java.lang.Object] */
    public BaseTransientBottomBar$Behavior() {
        ?? obj = new Object();
        this.f13911f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f13912g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f13909d = 0;
        this.f14126i = obj;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, G.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f14126i.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C2400c.f21106f == null) {
                    C2400c.f21106f = new C2400c(16);
                }
                synchronized (C2400c.f21106f.f21107c) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C2400c.f21106f == null) {
                C2400c.f21106f = new C2400c(16);
            }
            synchronized (C2400c.f21106f.f21107c) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        this.f14126i.getClass();
        return view instanceof a;
    }
}
