package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class TG implements S9 {
    public final /* synthetic */ C0799Qc A00;

    public TG(C0799Qc c0799Qc) {
        this.A00 = c0799Qc;
    }

    @Override // com.instagram.common.viewpoint.core.S9
    public final void AEd() {
        MR mr;
        MR mr2;
        N9 n9;
        mr = this.A00.A02;
        if (mr != null) {
            mr2 = this.A00.A02;
            n9 = this.A00.A03;
            mr2.A4P(n9.A8K());
        }
    }

    @Override // com.instagram.common.viewpoint.core.S9
    public final void AEf(SB sb) {
        MR mr;
        MR mr2;
        N9 n9;
        MR mr3;
        N9 n92;
        mr = this.A00.A02;
        if (mr == null) {
            return;
        }
        if (sb == null || !sb.A00()) {
            mr2 = this.A00.A02;
            n9 = this.A00.A03;
            mr2.A4P(n9.A8K());
        } else {
            mr3 = this.A00.A02;
            n92 = this.A00.A03;
            mr3.A4P(n92.A8L());
        }
    }
}
