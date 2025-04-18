package j2;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j0;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class m extends l0.h {

    /* renamed from: d, reason: collision with root package name */
    public final v3.c f19733d;

    /* renamed from: f, reason: collision with root package name */
    public final fb.c f19734f;

    /* renamed from: g, reason: collision with root package name */
    public g f19735g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f19736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ViewPager2 viewPager2) {
        super(viewPager2);
        this.f19736h = viewPager2;
        this.f19733d = new v3.c(this, 10);
        this.f19734f = new fb.c(this, 11);
    }

    public final void k(j0 j0Var) {
        r();
        if (j0Var != null) {
            j0Var.registerAdapterDataObserver(this.f19735g);
        }
    }

    public final void l(j0 j0Var) {
        if (j0Var != null) {
            j0Var.unregisterAdapterDataObserver(this.f19735g);
        }
    }

    public final void m(RecyclerView recyclerView) {
        ViewCompat.setImportantForAccessibility(recyclerView, 2);
        this.f19735g = new g(this, 1);
        ViewPager2 viewPager2 = this.f19736h;
        if (ViewCompat.getImportantForAccessibility(viewPager2) == 0) {
            ViewCompat.setImportantForAccessibility(viewPager2, 1);
        }
    }

    public final void n(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        int itemCount;
        o0.j jVar = new o0.j(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.f19736h;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                i10 = viewPager2.getAdapter().getItemCount();
                i11 = 1;
            } else {
                i11 = viewPager2.getAdapter().getItemCount();
                i10 = 1;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        jVar.j(new o0.h(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, 0)));
        j0 adapter = viewPager2.getAdapter();
        if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && viewPager2.f2164t) {
            if (viewPager2.f2150f > 0) {
                jVar.a(8192);
            }
            if (viewPager2.f2150f < itemCount - 1) {
                jVar.a(4096);
            }
            jVar.m(true);
        }
    }

    public final void o(View view, o0.j jVar) {
        int i10;
        ViewPager2 viewPager2 = this.f19736h;
        int i11 = 0;
        if (viewPager2.getOrientation() == 1) {
            i10 = viewPager2.f2153i.getPosition(view);
        } else {
            i10 = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            i11 = viewPager2.f2153i.getPosition(view);
        }
        jVar.k(new o0.i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, 1, i11, 1, false, false)));
    }

    public final void p(int i10, Bundle bundle) {
        boolean z10;
        int currentItem;
        if (i10 != 8192 && i10 != 4096) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ViewPager2 viewPager2 = this.f19736h;
            if (i10 == 8192) {
                currentItem = viewPager2.getCurrentItem() - 1;
            } else {
                currentItem = viewPager2.getCurrentItem() + 1;
            }
            if (viewPager2.f2164t) {
                viewPager2.c(currentItem);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void q(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.f19736h);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    public final void r() {
        int itemCount;
        int i10;
        ViewPager2 viewPager2 = this.f19736h;
        int i11 = R.id.accessibilityActionPageLeft;
        ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageLeft);
        ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageRight);
        ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageUp);
        ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageDown);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f2164t) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        v3.c cVar = this.f19733d;
        fb.c cVar2 = this.f19734f;
        if (orientation == 0) {
            boolean z10 = true;
            if (viewPager2.f2153i.getLayoutDirection() != 1) {
                z10 = false;
            }
            if (z10) {
                i10 = 16908360;
            } else {
                i10 = 16908361;
            }
            if (z10) {
                i11 = 16908361;
            }
            if (viewPager2.f2150f < itemCount - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new o0.c(i10), null, cVar);
            }
            if (viewPager2.f2150f > 0) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new o0.c(i11), null, cVar2);
                return;
            }
            return;
        }
        if (viewPager2.f2150f < itemCount - 1) {
            ViewCompat.replaceAccessibilityAction(viewPager2, new o0.c(R.id.accessibilityActionPageDown), null, cVar);
        }
        if (viewPager2.f2150f > 0) {
            ViewCompat.replaceAccessibilityAction(viewPager2, new o0.c(R.id.accessibilityActionPageUp), null, cVar2);
        }
    }
}
