package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0928Vb implements C5W {
    public final /* synthetic */ VY A00;

    public C0928Vb(VY vy) {
        this.A00 = vy;
    }

    @Override // com.instagram.common.viewpoint.core.C5W
    public final boolean A9J() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
