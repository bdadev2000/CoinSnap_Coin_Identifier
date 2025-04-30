package com.meta.analytics.dsp.uinode;

import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class RP {
    public RS A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04;

    public RP(RS rs, boolean z8, Set<String> pinnedPublicKeys, Set<String> pinnedCertificates, boolean z9) {
        this.A00 = rs;
        this.A04 = z8;
        this.A02 = pinnedPublicKeys;
        this.A01 = pinnedCertificates;
        this.A03 = z9;
    }

    public final RS A00() {
        return this.A00;
    }

    public final Set<String> A01() {
        return this.A01;
    }

    public final Set<String> A02() {
        return this.A02;
    }

    public final boolean A03() {
        return this.A04;
    }

    public final boolean A04() {
        return this.A03;
    }
}
