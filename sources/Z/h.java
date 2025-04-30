package Z;

import T.C0260b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class h extends C0260b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3866d;

    public /* synthetic */ h(int i9) {
        this.f3866d = i9;
    }

    @Override // T.C0260b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z8;
        switch (this.f3866d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                accessibilityEvent.setScrollable(z8);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // T.C0260b
    public final void d(View view, U.i iVar) {
        int scrollRange;
        switch (this.f3866d) {
            case 0:
                this.f2879a.onInitializeAccessibilityNodeInfo(view, iVar.f3098a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                iVar.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    iVar.k(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        iVar.b(U.d.f3088g);
                        iVar.b(U.d.f3092k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        iVar.b(U.d.f3087f);
                        iVar.b(U.d.l);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate = this.f2879a;
                AccessibilityNodeInfo accessibilityNodeInfo = iVar.f3098a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 2:
                this.f2879a.onInitializeAccessibilityNodeInfo(view, iVar.f3098a);
                iVar.k(false);
                return;
            default:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f2879a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = iVar.f3098a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r6 != 16908346) goto L11;
     */
    @Override // T.C0260b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f3866d
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La0
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1f
        L1c:
            r0 = r1
            goto La0
        L1f:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3c
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3c
            int r7 = r2.height()
        L3c:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L76
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4f
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4f
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L76
            goto L1c
        L4f:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.u(r1, r6, r0)
            goto La0
        L76:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.u(r1, r6, r0)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
