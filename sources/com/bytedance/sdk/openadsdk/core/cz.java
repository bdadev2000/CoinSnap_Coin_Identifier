package com.bytedance.sdk.openadsdk.core;

/* loaded from: classes.dex */
public class cz {
    private static cz zp;
    private com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd COT;
    private com.bytedance.sdk.openadsdk.apiImpl.KS.lMd HWF;
    private com.bytedance.sdk.openadsdk.core.model.woN KS;
    private com.bytedance.sdk.openadsdk.apiImpl.jU.zp jU;
    private com.bytedance.sdk.openadsdk.core.model.zp lMd;

    private cz() {
    }

    public static cz zp() {
        if (zp == null) {
            zp = new cz();
        }
        return zp;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.KS.lMd COT() {
        return this.HWF;
    }

    public void HWF() {
        this.KS = null;
        this.lMd = null;
        this.jU = null;
        this.COT = null;
        this.HWF = null;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.jU.zp KS() {
        return this.jU;
    }

    public com.bytedance.sdk.openadsdk.core.model.zp QR() {
        return this.lMd;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd jU() {
        return this.COT;
    }

    public com.bytedance.sdk.openadsdk.core.model.woN lMd() {
        return this.KS;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        this.KS = won;
    }

    public void zp(com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd lmd) {
        this.COT = lmd;
    }

    public void zp(com.bytedance.sdk.openadsdk.apiImpl.jU.zp zpVar) {
        this.jU = zpVar;
    }

    public void zp(com.bytedance.sdk.openadsdk.apiImpl.KS.lMd lmd) {
        this.HWF = lmd;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar) {
        this.lMd = zpVar;
    }
}
