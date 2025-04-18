package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class U4 implements LG {
    public final /* synthetic */ B8 A00;

    public U4(B8 b8) {
        this.A00 = b8;
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ABb() {
        Q4 q4;
        Q4 q42;
        int i2;
        q4 = this.A00.A05;
        q4.ADa(false);
        q42 = this.A00.A05;
        i2 = this.A00.A02;
        q42.ABi(i2);
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ADF(float f2) {
        Q4 q4;
        int i2;
        q4 = this.A00.A05;
        i2 = this.A00.A02;
        q4.ABz(i2 - f2);
    }
}
