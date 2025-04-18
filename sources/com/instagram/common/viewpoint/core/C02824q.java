package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.4q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02824q extends DO implements Comparable<C02824q> {
    public long A00;

    public C02824q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C02824q c02824q) {
        if (A04() != c02824q.A04()) {
            return A04() ? 1 : -1;
        }
        long j2 = ((C1023Yw) this).A00 - ((C1023Yw) c02824q).A00;
        if (j2 == 0) {
            long j3 = this.A00;
            long delta = c02824q.A00;
            j2 = j3 - delta;
            if (j2 == 0) {
                return 0;
            }
        }
        return j2 > 0 ? 1 : -1;
    }
}
