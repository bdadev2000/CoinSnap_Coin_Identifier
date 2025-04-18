package com.google.android.material.snackbar;

import a4.j;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import fb.c;
import ic.t;
import ma.b;

/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i, reason: collision with root package name */
    public final c f11794i = new c((SwipeDismissBehavior) this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, b0.a
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        c cVar = this.f11794i;
        cVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (t.f19573f == null) {
                    t.f19573f = new t(8);
                }
                t tVar = t.f19573f;
                j.t(cVar.f17773c);
                synchronized (tVar.a) {
                    j.t(tVar.f19575c);
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (t.f19573f == null) {
                t.f19573f = new t(8);
            }
            t tVar2 = t.f19573f;
            j.t(cVar.f17773c);
            synchronized (tVar2.a) {
                j.t(tVar2.f19575c);
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f11794i.getClass();
        return view instanceof b;
    }
}
