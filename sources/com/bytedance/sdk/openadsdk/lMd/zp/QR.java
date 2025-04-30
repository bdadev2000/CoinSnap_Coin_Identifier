package com.bytedance.sdk.openadsdk.lMd.zp;

/* loaded from: classes.dex */
class QR implements com.bytedance.sdk.component.HWF.zp.COT.KS {
    private final com.bytedance.sdk.component.QR.lMd.lMd zp;

    public QR() {
        com.bytedance.sdk.component.QR.lMd.lMd KS = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().KS();
        this.zp = KS;
        KS.zp(7);
        KS.zp("track_url");
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT.KS
    public void zp(String str) {
        this.zp.lMd(str);
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT.KS
    public void zp(String str, String str2) {
        this.zp.lMd(str, str2);
    }

    @Override // com.bytedance.sdk.component.HWF.zp.COT.KS
    public com.bytedance.sdk.component.HWF.zp.COT.jU zp() {
        return new YW(this.zp.zp());
    }
}
