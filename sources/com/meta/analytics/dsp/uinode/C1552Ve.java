package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1552Ve implements InterfaceC1208Hq {
    public long A00;
    public long A01;
    public C10279x A02 = C10279x.A04;
    public boolean A03;
    public final InterfaceC1195Hd A04;

    public C1552Ve(InterfaceC1195Hd interfaceC1195Hd) {
        this.A04 = interfaceC1195Hd;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5T();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7k());
            this.A03 = false;
        }
    }

    public final void A02(long j7) {
        this.A01 = j7;
        if (this.A03) {
            this.A00 = this.A04.A5T();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1208Hq
    public final C10279x A7h() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1208Hq
    public final long A7k() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A5T = this.A04.A5T();
            long positionUs = this.A00;
            long j7 = A5T - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9W.A00(j7);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j7);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1208Hq
    public final C10279x AGA(C10279x c10279x) {
        if (this.A03) {
            A02(A7k());
        }
        this.A02 = c10279x;
        return c10279x;
    }
}
