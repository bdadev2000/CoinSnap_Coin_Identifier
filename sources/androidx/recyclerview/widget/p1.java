package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p1 extends n0.b {

    /* renamed from: d, reason: collision with root package name */
    public final q1 f2008d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2009e = new WeakHashMap();

    public p1(q1 q1Var) {
        this.f2008d = q1Var;
    }

    @Override // n0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f2009e.get(view);
        if (bVar != null) {
            return bVar.a(view, accessibilityEvent);
        }
        return super.a(view, accessibilityEvent);
    }

    @Override // n0.b
    public final o0.m b(View view) {
        n0.b bVar = (n0.b) this.f2009e.get(view);
        if (bVar != null) {
            return bVar.b(view);
        }
        return super.b(view);
    }

    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f2009e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // n0.b
    public final void d(View view, o0.j jVar) {
        q1 q1Var = this.f2008d;
        boolean hasPendingAdapterUpdates = q1Var.f2018d.hasPendingAdapterUpdates();
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (!hasPendingAdapterUpdates) {
            RecyclerView recyclerView = q1Var.f2018d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, jVar);
                n0.b bVar = (n0.b) this.f2009e.get(view);
                if (bVar != null) {
                    bVar.d(view, jVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // n0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f2009e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // n0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f2009e.get(viewGroup);
        if (bVar != null) {
            return bVar.f(viewGroup, view, accessibilityEvent);
        }
        return super.f(viewGroup, view, accessibilityEvent);
    }

    @Override // n0.b
    public final boolean g(View view, int i10, Bundle bundle) {
        q1 q1Var = this.f2008d;
        if (!q1Var.f2018d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = q1Var.f2018d;
            if (recyclerView.getLayoutManager() != null) {
                n0.b bVar = (n0.b) this.f2009e.get(view);
                if (bVar != null) {
                    if (bVar.g(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i10, bundle)) {
                    return true;
                }
                return recyclerView.getLayoutManager().performAccessibilityActionForItem(view, i10, bundle);
            }
        }
        return super.g(view, i10, bundle);
    }

    @Override // n0.b
    public final void h(View view, int i10) {
        n0.b bVar = (n0.b) this.f2009e.get(view);
        if (bVar != null) {
            bVar.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // n0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        n0.b bVar = (n0.b) this.f2009e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
