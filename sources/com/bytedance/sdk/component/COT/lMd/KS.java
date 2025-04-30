package com.bytedance.sdk.component.COT.lMd;

import com.bytedance.sdk.component.COT.rV;

/* loaded from: classes.dex */
public class KS implements com.bytedance.sdk.component.COT.COT {
    private boolean KS;
    private rV jU;
    private boolean lMd;
    private String zp;

    public KS(String str, boolean z8, boolean z9, rV rVVar) {
        this.zp = str;
        this.lMd = z8;
        this.KS = z9;
        this.jU = rVVar;
    }

    @Override // com.bytedance.sdk.component.COT.COT
    public boolean KS() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.COT.COT
    public boolean lMd() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.COT.COT
    public String zp() {
        return this.zp;
    }
}
