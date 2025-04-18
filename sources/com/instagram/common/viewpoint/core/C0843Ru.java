package com.instagram.common.viewpoint.core;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Ru, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0843Ru {
    public C0847Ry A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C0843Ru A00(C0847Ry c0847Ry) {
        this.A00 = c0847Ry;
        return this;
    }

    public final C0843Ru A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C0843Ru A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C0843Ru A03(boolean z2) {
        this.A04 = z2;
        return this;
    }

    public final C0843Ru A04(boolean z2) {
        this.A03 = z2;
        return this;
    }

    public final C0844Rv A05() {
        return new C0844Rv(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
