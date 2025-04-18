package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0986Ve implements InterfaceC0642Hq {
    public long A00;
    public long A01;
    public C04619x A02 = C04619x.A04;
    public boolean A03;
    public final InterfaceC0629Hd A04;

    public C0986Ve(InterfaceC0629Hd interfaceC0629Hd) {
        this.A04 = interfaceC0629Hd;
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

    public final void A02(long j3) {
        this.A01 = j3;
        if (this.A03) {
            this.A00 = this.A04.A5T();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0642Hq
    public final C04619x A7h() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0642Hq
    public final long A7k() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A5T = this.A04.A5T();
            long positionUs = this.A00;
            long j3 = A5T - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9W.A00(j3);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j3);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0642Hq
    public final C04619x AGA(C04619x c04619x) {
        if (this.A03) {
            A02(A7k());
        }
        this.A02 = c04619x;
        return c04619x;
    }
}
