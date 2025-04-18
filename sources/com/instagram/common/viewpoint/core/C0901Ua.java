package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0901Ua implements LG {
    public final /* synthetic */ BX A00;

    public C0901Ua(BX bx) {
        this.A00 = bx;
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ABb() {
        MQ mq;
        MQ mq2;
        this.A00.A08 = false;
        mq = this.A00.A04;
        if (mq != null) {
            mq2 = this.A00.A04;
            mq2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ADF(float f2) {
        MQ mq;
        MQ mq2;
        mq = this.A00.A04;
        if (mq != null) {
            float A00 = 1.0f - (f2 / ((float) this.A00.getAdInfo().A0H().A00()));
            mq2 = this.A00.A04;
            mq2.setProgressImmediate(100.0f * A00);
        }
    }
}
