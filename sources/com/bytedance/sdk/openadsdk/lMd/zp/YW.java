package com.bytedance.sdk.openadsdk.lMd.zp;

/* loaded from: classes.dex */
class YW implements com.bytedance.sdk.component.HWF.zp.COT.jU {
    private final com.bytedance.sdk.component.QR.lMd zp;

    public YW(com.bytedance.sdk.component.QR.lMd lmd) {
        this.zp = lmd;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT.jU
    public String KS() {
        com.bytedance.sdk.component.QR.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.lMd();
        }
        return "";
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT.jU
    public int lMd() {
        com.bytedance.sdk.component.QR.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.zp();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT.jU
    public boolean zp() {
        com.bytedance.sdk.component.QR.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.HWF();
        }
        return false;
    }
}
