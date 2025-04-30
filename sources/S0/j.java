package S0;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C0525e0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l0;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class j extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f2788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f2788a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(l0 l0Var, int[] iArr) {
        ViewPager2 viewPager2 = this.f2788a;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(l0Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.W
    public final void onInitializeAccessibilityNodeInfo(C0525e0 c0525e0, l0 l0Var, U.i iVar) {
        super.onInitializeAccessibilityNodeInfo(c0525e0, l0Var, iVar);
        this.f2788a.f5183v.getClass();
    }

    @Override // androidx.recyclerview.widget.W
    public final void onInitializeAccessibilityNodeInfoForItem(C0525e0 c0525e0, l0 l0Var, View view, U.i iVar) {
        int i9;
        ViewPager2 viewPager2 = (ViewPager2) this.f2788a.f5183v.f5272f;
        int i10 = 0;
        if (viewPager2.getOrientation() == 1) {
            i9 = viewPager2.f5172i.getPosition(view);
        } else {
            i9 = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            i10 = viewPager2.f5172i.getPosition(view);
        }
        AccessibilityNodeInfo.CollectionItemInfo obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, 1, i10, 1, false, false);
        iVar.getClass();
        iVar.f3098a.setCollectionItemInfo(obtain);
    }

    @Override // androidx.recyclerview.widget.W
    public final boolean performAccessibilityAction(C0525e0 c0525e0, l0 l0Var, int i9, Bundle bundle) {
        this.f2788a.f5183v.getClass();
        return super.performAccessibilityAction(c0525e0, l0Var, i9, bundle);
    }

    @Override // androidx.recyclerview.widget.W
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
        return false;
    }
}
