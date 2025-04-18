package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0560Gp {
    public final int A00;
    public final C0557Gm A01;
    public final Object A02;
    public final AG[] A03;

    public C0560Gp(AG[] agArr, InterfaceC0556Gl[] interfaceC0556GlArr, Object obj) {
        this.A03 = agArr;
        this.A01 = new C0557Gm(interfaceC0556GlArr);
        this.A02 = obj;
        this.A00 = agArr.length;
    }

    public final boolean A00(int i2) {
        return this.A03[i2] != null;
    }

    public final boolean A01(C0560Gp c0560Gp) {
        if (c0560Gp == null || c0560Gp.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i2 = 0; i2 < this.A01.A01; i2++) {
            if (!A02(c0560Gp, i2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(C0560Gp c0560Gp, int i2) {
        return c0560Gp != null && IK.A0g(this.A03[i2], c0560Gp.A03[i2]) && IK.A0g(this.A01.A00(i2), c0560Gp.A01.A00(i2));
    }
}
