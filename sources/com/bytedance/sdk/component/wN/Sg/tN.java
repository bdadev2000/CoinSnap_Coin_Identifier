package com.bytedance.sdk.component.wN.Sg;

import com.bytedance.sdk.component.wN.pDU;

/* loaded from: classes.dex */
public class tN implements com.bytedance.sdk.component.wN.wN {
    private pDU AlY;
    private boolean Sg;
    private String YFl;
    private boolean tN;

    public tN(String str, boolean z10, boolean z11, pDU pdu) {
        this.YFl = str;
        this.Sg = z10;
        this.tN = z11;
        this.AlY = pdu;
    }

    @Override // com.bytedance.sdk.component.wN.wN
    public boolean Sg() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.wN.wN
    public String YFl() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.wN.wN
    public boolean tN() {
        return this.tN;
    }
}
