package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class VG implements OR {
    public final /* synthetic */ VA A00;

    public VG(VA va) {
        this.A00 = va;
    }

    @Override // com.instagram.common.viewpoint.core.OR
    public final void AB7() {
        boolean A0V;
        A0V = this.A00.A0V();
        if (A0V) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.OR
    public final void ACc() {
        LH lh;
        this.A00.A0F = false;
        lh = this.A00.A0O;
        lh.A07();
    }

    @Override // com.instagram.common.viewpoint.core.OR
    public final void ACd() {
        LH lh;
        this.A00.A0F = true;
        lh = this.A00.A0O;
        lh.A06();
    }
}
