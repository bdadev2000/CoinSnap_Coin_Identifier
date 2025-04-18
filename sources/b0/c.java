package b0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class c implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f2247b;

    public c(CoordinatorLayout coordinatorLayout) {
        this.f2247b = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2247b.f1165s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f2247b;
        coordinatorLayout.p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1165s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
