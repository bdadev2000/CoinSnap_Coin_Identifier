package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10149j implements Comparable<C10149j> {
    public int A00;
    public long A01;
    public Object A02;
    public final A8 A03;

    public C10149j(A8 a82) {
        this.A03 = a82;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C10149j c10149j) {
        Object obj = this.A02;
        if ((obj == null) != (c10149j.A02 == null)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i9 = this.A00 - c10149j.A00;
        if (i9 != 0) {
            return i9;
        }
        int comparePeriodIndex = IF.A07(this.A01, c10149j.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i9, long j7, Object obj) {
        this.A00 = i9;
        this.A01 = j7;
        this.A02 = obj;
    }
}
