package j2;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d1;
import androidx.recyclerview.widget.k1;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class k extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ViewPager2 viewPager2, Context context) {
        super(context);
        this.a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(k1 k1Var, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(k1Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onInitializeAccessibilityNodeInfo(d1 d1Var, k1 k1Var, o0.j jVar) {
        super.onInitializeAccessibilityNodeInfo(d1Var, k1Var, jVar);
        this.a.f2165v.getClass();
    }

    @Override // androidx.recyclerview.widget.v0
    public final void onInitializeAccessibilityNodeInfoForItem(d1 d1Var, k1 k1Var, View view, o0.j jVar) {
        this.a.f2165v.o(view, jVar);
    }

    @Override // androidx.recyclerview.widget.v0
    public final boolean performAccessibilityAction(d1 d1Var, k1 k1Var, int i10, Bundle bundle) {
        this.a.f2165v.getClass();
        return super.performAccessibilityAction(d1Var, k1Var, i10, bundle);
    }

    @Override // androidx.recyclerview.widget.v0
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }
}
