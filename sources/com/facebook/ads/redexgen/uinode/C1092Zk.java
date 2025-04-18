package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1092Zk implements C5D {
    public final /* synthetic */ C0553Eb A00;

    public C1092Zk(C0553Eb c0553Eb) {
        this.A00 = c0553Eb;
    }

    @Override // com.facebook.ads.redexgen.uinode.C5D
    public final void AE9(AnonymousClass56 anonymousClass56, C03314j c03314j, C03314j c03314j2) {
        this.A00.A1j(anonymousClass56, c03314j, c03314j2);
    }

    @Override // com.facebook.ads.redexgen.uinode.C5D
    public final void AEB(AnonymousClass56 anonymousClass56, C03314j c03314j, C03314j c03314j2) {
        this.A00.A0r.A0Y(anonymousClass56);
        this.A00.A1k(anonymousClass56, c03314j, c03314j2);
    }

    @Override // com.facebook.ads.redexgen.uinode.C5D
    public final void AED(AnonymousClass56 anonymousClass56, C03314j c03314j, C03314j c03314j2) {
        anonymousClass56.A0X(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(anonymousClass56, anonymousClass56, c03314j, c03314j2)) {
                this.A00.A1M();
            }
        } else {
            if (!this.A00.A05.A0G(anonymousClass56, c03314j, c03314j2)) {
                return;
            }
            this.A00.A1M();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C5D
    public final void AGo(AnonymousClass56 anonymousClass56) {
        this.A00.A06.A1D(anonymousClass56.A0H, this.A00.A0r);
    }
}
