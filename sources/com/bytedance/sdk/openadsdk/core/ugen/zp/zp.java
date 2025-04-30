package com.bytedance.sdk.openadsdk.core.ugen.zp;

/* loaded from: classes.dex */
public class zp {
    private String COT;
    private String HWF;
    private String KS;
    private Long jU;
    private String lMd;
    private String zp;

    public String COT() {
        return this.COT;
    }

    public String HWF() {
        return this.HWF;
    }

    public String KS() {
        return this.KS;
    }

    public Long jU() {
        return this.jU;
    }

    public String lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public zp COT(String str) {
        this.HWF = str;
        return this;
    }

    public zp KS(String str) {
        this.KS = str;
        return this;
    }

    public zp jU(String str) {
        this.COT = str;
        return this;
    }

    public zp lMd(String str) {
        this.lMd = str;
        return this;
    }

    public zp zp(String str) {
        this.zp = str;
        return this;
    }

    public zp zp(Long l) {
        this.jU = l;
        return this;
    }
}
