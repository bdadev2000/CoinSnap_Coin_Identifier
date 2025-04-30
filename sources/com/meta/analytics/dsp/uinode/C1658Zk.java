package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1658Zk implements C5D {
    public final /* synthetic */ C1119Eb A00;

    public C1658Zk(C1119Eb c1119Eb) {
        this.A00 = c1119Eb;
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AE9(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2) {
        this.A00.A1j(anonymousClass56, c08974j, c08974j2);
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AEB(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2) {
        this.A00.A0r.A0Y(anonymousClass56);
        this.A00.A1k(anonymousClass56, c08974j, c08974j2);
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AED(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2) {
        anonymousClass56.A0X(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(anonymousClass56, anonymousClass56, c08974j, c08974j2)) {
                this.A00.A1M();
            }
        } else {
            if (!this.A00.A05.A0G(anonymousClass56, c08974j, c08974j2)) {
                return;
            }
            this.A00.A1M();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AGo(AnonymousClass56 anonymousClass56) {
        this.A00.A06.A1D(anonymousClass56.A0H, this.A00.A0r);
    }
}
