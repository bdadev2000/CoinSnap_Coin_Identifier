package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class AK {
    public final int A00;
    public final C1132Eo A01;

    public AK(int i9, C1132Eo c1132Eo) {
        this.A00 = i9;
        this.A01 = c1132Eo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AK ak = (AK) obj;
        return this.A00 == ak.A00 && this.A01.equals(ak.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
