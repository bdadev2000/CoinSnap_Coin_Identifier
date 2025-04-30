package androidx.recyclerview.widget;

import T.C0260b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class r0 extends C0260b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f5082d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f5083e;

    public r0(RecyclerView recyclerView) {
        this.f5082d = recyclerView;
        q0 q0Var = this.f5083e;
        if (q0Var != null) {
            this.f5083e = q0Var;
        } else {
            this.f5083e = new q0(this);
        }
    }

    @Override // T.C0260b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f5082d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @Override // T.C0260b
    public final void d(View view, U.i iVar) {
        this.f2879a.onInitializeAccessibilityNodeInfo(view, iVar.f3098a);
        RecyclerView recyclerView = this.f5082d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(iVar);
        }
    }

    @Override // T.C0260b
    public final boolean g(View view, int i9, Bundle bundle) {
        if (super.g(view, i9, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5082d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            return recyclerView.getLayoutManager().performAccessibilityAction(i9, bundle);
        }
        return false;
    }
}
