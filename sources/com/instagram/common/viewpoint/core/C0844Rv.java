package com.instagram.common.viewpoint.core;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Rv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0844Rv {
    public C0847Ry A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04;

    public C0844Rv(C0847Ry c0847Ry, boolean z2, Set<String> pinnedPublicKeys, Set<String> pinnedCertificates, boolean z3) {
        this.A00 = c0847Ry;
        this.A04 = z2;
        this.A02 = pinnedPublicKeys;
        this.A01 = pinnedCertificates;
        this.A03 = z3;
    }

    public final C0847Ry A00() {
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
