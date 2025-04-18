package com.instagram.common.viewpoint.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Sp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0864Sp extends C2P {
    public final /* synthetic */ C0863So A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0864Sp(C0863So c0863So, double d, double d2, double d3, boolean z2) {
        super(d, d2, d3, z2);
        this.A00 = c0863So;
    }

    @Override // com.instagram.common.viewpoint.core.C2P
    public final void A00(boolean z2, boolean z3, C2R c2r) {
        boolean z4;
        String str;
        Map A0I;
        if (z3) {
            z4 = this.A00.A0A;
            if (!z4) {
                this.A00.A0A = true;
                C0863So c0863So = this.A00;
                str = this.A00.A0J;
                A0I = this.A00.A0I(EnumC0809Qm.A0B);
                c0863So.A0Q(str, A0I);
            }
        }
    }
}
