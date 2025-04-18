package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class q1 extends n0.b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f2018d;

    /* renamed from: e, reason: collision with root package name */
    public final p1 f2019e;

    public q1(RecyclerView recyclerView) {
        this.f2018d = recyclerView;
        p1 p1Var = this.f2019e;
        if (p1Var != null) {
            this.f2019e = p1Var;
        } else {
            this.f2019e = new p1(this);
        }
    }

    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f2018d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @Override // n0.b
    public final void d(View view, o0.j jVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, jVar.a);
        RecyclerView recyclerView = this.f2018d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(jVar);
        }
    }

    @Override // n0.b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2018d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().performAccessibilityAction(i10, bundle);
        }
        return false;
    }
}
