package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class QJ extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    public C7R A00;
    public WeakReference<QI> A01;
    public final R9 A02;

    /* JADX WARN: Multi-variable type inference failed */
    public QJ(C1070Yn c1070Yn, R9 r92) {
        super(c1070Yn);
        this.A02 = r92;
        AbstractC0737Lo.A0J((View) r92);
        addView(r92.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(QQ qq) {
        addView(qq, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C7R) qq;
    }

    public final void A01(QQ qq) {
        AbstractC0737Lo.A0J(qq);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A8c();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C7R c7r = this.A00;
        if (c7r != null) {
            c7r.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (r6 > r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        r5 = (r4 * r7) / r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        if (r6 > r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r6 == Integer.MIN_VALUE) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (r4 <= r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r6 == Integer.MIN_VALUE) goto L43;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.QJ.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(QI qi) {
        this.A01 = new WeakReference<>(qi);
    }
}
