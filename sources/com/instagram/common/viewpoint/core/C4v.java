package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4v, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4v {
    public SparseArray<C02864u> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j2, long j3) {
        if (j2 == 0) {
            return j3;
        }
        return ((j2 / 4) * 3) + (j3 / 4);
    }

    private C02864u A01(int i2) {
        C02864u c02864u = this.A00.get(i2);
        if (c02864u == null) {
            C02864u c02864u2 = new C02864u();
            this.A00.put(i2, c02864u2);
            return c02864u2;
        }
        return c02864u;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.4u> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.4u> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.4u r0 = (com.instagram.common.viewpoint.core.C02864u) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C4v.A02():void");
    }

    public final AnonymousClass56 A03(int i2) {
        C02864u c02864u = this.A00.get(i2);
        if (c02864u != null && !c02864u.A03.isEmpty()) {
            return c02864u.A03.remove(r1.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i2, long j2) {
        C02864u A01 = A01(i2);
        A01.A01 = A00(A01.A01, j2);
    }

    public final void A06(int i2, long j2) {
        C02864u A01 = A01(i2);
        A01.A02 = A00(A01.A02, j2);
    }

    public final void A07(AbstractC02684c abstractC02684c) {
        this.A01++;
    }

    public final void A08(AbstractC02684c abstractC02684c, AbstractC02684c abstractC02684c2, boolean z2) {
        if (abstractC02684c != null) {
            A04();
        }
        if (!z2 && this.A01 == 0) {
            A02();
        }
        if (abstractC02684c2 != null) {
            A07(abstractC02684c2);
        }
    }

    public final void A09(AnonymousClass56 anonymousClass56) {
        int A0H = anonymousClass56.A0H();
        ArrayList<AnonymousClass56> arrayList = A01(A0H).A03;
        int i2 = this.A00.get(A0H).A00;
        int viewType = arrayList.size();
        if (i2 <= viewType) {
            return;
        }
        anonymousClass56.A0Q();
        arrayList.add(anonymousClass56);
    }

    public final boolean A0A(int i2, long j2, long j3) {
        long j4 = A01(i2).A01;
        return j4 == 0 || j2 + j4 < j3;
    }

    public final boolean A0B(int i2, long j2, long j3) {
        long j4 = A01(i2).A02;
        return j4 == 0 || j2 + j4 < j3;
    }
}
