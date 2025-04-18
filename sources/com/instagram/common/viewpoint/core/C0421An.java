package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.An, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0421An {
    public final Handler A00;
    public final InterfaceC0422Ao A01;

    public C0421An(Handler handler, InterfaceC0422Ao interfaceC0422Ao) {
        this.A00 = interfaceC0422Ao != null ? (Handler) AbstractC0576Hf.A01(handler) : null;
        this.A01 = interfaceC0422Ao;
    }

    public final void A01(int i2) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0420Am(this, i2));
        }
    }

    public final void A02(int i2, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0418Ak(this, i2, j2, j3));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0417Aj(this, format));
        }
    }

    public final void A04(BH bh) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0419Al(this, bh));
        }
    }

    public final void A05(BH bh) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0415Ah(this, bh));
        }
    }

    public final void A06(String str, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC0416Ai(this, str, j2, j3));
        }
    }
}
