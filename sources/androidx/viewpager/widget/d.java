package androidx.viewpager.widget;

import T.C0260b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;

/* loaded from: classes.dex */
public final class d extends C0260b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPager f5162d;

    public d(ViewPager viewPager) {
        this.f5162d = viewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.getCount() > 1) goto L8;
     */
    @Override // T.C0260b
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
            androidx.viewpager.widget.ViewPager r3 = r2.f5162d
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

    @Override // T.C0260b
    public final void d(View view, U.i iVar) {
        boolean z8;
        this.f2879a.onInitializeAccessibilityNodeInfo(view, iVar.f3098a);
        iVar.i(ViewPager.class.getName());
        ViewPager viewPager = this.f5162d;
        PagerAdapter pagerAdapter = viewPager.mAdapter;
        if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        iVar.k(z8);
        if (viewPager.canScrollHorizontally(1)) {
            iVar.a(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            iVar.a(FragmentTransaction.TRANSIT_EXIT_MASK);
        }
    }

    @Override // T.C0260b
    public final boolean g(View view, int i9, Bundle bundle) {
        if (super.g(view, i9, bundle)) {
            return true;
        }
        ViewPager viewPager = this.f5162d;
        if (i9 != 4096) {
            if (i9 != 8192 || !viewPager.canScrollHorizontally(-1)) {
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
