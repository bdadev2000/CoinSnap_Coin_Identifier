package androidx.recyclerview.widget;

import T.C0260b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q0 extends C0260b {

    /* renamed from: d, reason: collision with root package name */
    public final r0 f5076d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f5077e = new WeakHashMap();

    public q0(r0 r0Var) {
        this.f5076d = r0Var;
    }

    @Override // T.C0260b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0260b c0260b = (C0260b) this.f5077e.get(view);
        if (c0260b != null) {
            return c0260b.a(view, accessibilityEvent);
        }
        return this.f2879a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // T.C0260b
    public final U.l b(View view) {
        C0260b c0260b = (C0260b) this.f5077e.get(view);
        if (c0260b != null) {
            return c0260b.b(view);
        }
        return super.b(view);
    }

    @Override // T.C0260b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0260b c0260b = (C0260b) this.f5077e.get(view);
        if (c0260b != null) {
            c0260b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // T.C0260b
    public final void d(View view, U.i iVar) {
        r0 r0Var = this.f5076d;
        boolean hasPendingAdapterUpdates = r0Var.f5082d.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.f2879a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f3098a;
        if (!hasPendingAdapterUpdates) {
            RecyclerView recyclerView = r0Var.f5082d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, iVar);
                C0260b c0260b = (C0260b) this.f5077e.get(view);
                if (c0260b != null) {
                    c0260b.d(view, iVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // T.C0260b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0260b c0260b = (C0260b) this.f5077e.get(view);
        if (c0260b != null) {
            c0260b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // T.C0260b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0260b c0260b = (C0260b) this.f5077e.get(viewGroup);
        if (c0260b != null) {
            return c0260b.f(viewGroup, view, accessibilityEvent);
        }
        return this.f2879a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // T.C0260b
    public final boolean g(View view, int i9, Bundle bundle) {
        r0 r0Var = this.f5076d;
        if (!r0Var.f5082d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = r0Var.f5082d;
            if (recyclerView.getLayoutManager() != null) {
                C0260b c0260b = (C0260b) this.f5077e.get(view);
                if (c0260b != null) {
                    if (c0260b.g(view, i9, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i9, bundle)) {
                    return true;
                }
                return recyclerView.getLayoutManager().performAccessibilityActionForItem(view, i9, bundle);
            }
        }
        return super.g(view, i9, bundle);
    }

    @Override // T.C0260b
    public final void h(View view, int i9) {
        C0260b c0260b = (C0260b) this.f5077e.get(view);
        if (c0260b != null) {
            c0260b.h(view, i9);
        } else {
            super.h(view, i9);
        }
    }

    @Override // T.C0260b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0260b c0260b = (C0260b) this.f5077e.get(view);
        if (c0260b != null) {
            c0260b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
