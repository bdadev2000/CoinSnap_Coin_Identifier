package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public final class d extends n0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPager f2118d;

    public d(ViewPager viewPager) {
        this.f2118d = viewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.getCount() > 1) goto L8;
     */
    @Override // n0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            super.c(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            androidx.viewpager.widget.ViewPager r3 = r2.f2118d
            androidx.viewpager.widget.PagerAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L1a
            int r0 = r0.getCount()
            r1 = 1
            if (r0 <= r1) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r4.setScrollable(r1)
            int r0 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L3b
            androidx.viewpager.widget.PagerAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L3b
            int r0 = r0.getCount()
            r4.setItemCount(r0)
            int r0 = r3.mCurItem
            r4.setFromIndex(r0)
            int r3 = r3.mCurItem
            r4.setToIndex(r3)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.d.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // n0.b
    public final void d(View view, o0.j jVar) {
        boolean z10;
        this.a.onInitializeAccessibilityNodeInfo(view, jVar.a);
        jVar.i(ViewPager.class.getName());
        ViewPager viewPager = this.f2118d;
        PagerAdapter pagerAdapter = viewPager.mAdapter;
        if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.m(z10);
        if (viewPager.canScrollHorizontally(1)) {
            jVar.a(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            jVar.a(8192);
        }
    }

    @Override // n0.b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        ViewPager viewPager = this.f2118d;
        if (i10 != 4096) {
            if (i10 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.mCurItem - 1);
            return true;
        }
        if (!viewPager.canScrollHorizontally(1)) {
            return false;
        }
        viewPager.setCurrentItem(viewPager.mCurItem + 1);
        return true;
    }
}
