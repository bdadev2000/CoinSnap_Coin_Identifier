package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class UW implements C5T {
    public final /* synthetic */ UT A00;

    public UW(UT ut) {
        this.A00 = ut;
    }

    @Override // com.meta.analytics.dsp.uinode.C5T
    public final boolean A8u() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
