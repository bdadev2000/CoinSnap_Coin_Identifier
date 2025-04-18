package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.5B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5B {
    public AnonymousClass58 A00 = new AnonymousClass58();
    public final AnonymousClass59 A01;

    public C5B(AnonymousClass59 anonymousClass59) {
        this.A01 = anonymousClass59;
    }

    public final View A00(int i10, int i11, int i12, int i13) {
        int A7b = this.A01.A7b();
        int next = this.A01.A7a();
        int childEnd = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View A6M = this.A01.A6M(i10);
            int A6P = this.A01.A6P(A6M);
            int i14 = this.A01.A6O(A6M);
            this.A00.A03(A7b, next, A6P, i14);
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    return A6M;
                }
            }
            if (i13 != 0) {
                this.A00.A01();
                this.A00.A02(i13);
                if (this.A00.A04()) {
                    view = A6M;
                }
            }
            i10 += childEnd;
        }
        return view;
    }
}
