package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class AD {
    public static final AD A02;
    public static final AD A03;
    public static final AD A04;
    public static final AD A05;
    public static final AD A06;
    public final long A00;
    public final long A01;

    static {
        AD ad = new AD(0L, 0L);
        A04 = ad;
        A02 = new AD(Long.MAX_VALUE, Long.MAX_VALUE);
        A06 = new AD(Long.MAX_VALUE, 0L);
        A05 = new AD(0L, Long.MAX_VALUE);
        A03 = ad;
    }

    public AD(long j7, long j9) {
        AbstractC1192Ha.A03(j7 >= 0);
        AbstractC1192Ha.A03(j9 >= 0);
        this.A01 = j7;
        this.A00 = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AD ad = (AD) obj;
        return this.A01 == ad.A01 && this.A00 == ad.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
