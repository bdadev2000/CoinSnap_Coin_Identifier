package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0952Wa extends KY {
    public final /* synthetic */ WY A00;

    public C0952Wa(WY wy) {
        this.A00 = wy;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        long j2;
        long j3;
        WY.A00(this.A00);
        j2 = this.A00.A01;
        if (j2 > 0) {
            try {
                j3 = this.A00.A01;
                Thread.sleep(j3);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
