package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03979o implements Comparable<C03979o> {
    public int A00;
    public long A01;
    public Object A02;
    public final AD A03;

    public C03979o(AD ad) {
        this.A03 = ad;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C03979o c03979o) {
        if ((this.A02 == null) != (c03979o.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i2 = this.A00 - c03979o.A00;
        if (i2 != 0) {
            return i2;
        }
        int comparePeriodIndex = IK.A07(this.A01, c03979o.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i2, long j2, Object obj) {
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = obj;
    }
}
