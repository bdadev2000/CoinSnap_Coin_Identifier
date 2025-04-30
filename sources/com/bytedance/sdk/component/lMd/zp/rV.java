package com.bytedance.sdk.component.lMd.zp;

/* loaded from: classes.dex */
public class rV {
    public byte[] COT;
    public zp HWF;
    public YW KS;
    public String jU;

    /* loaded from: classes.dex */
    public enum zp {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public rV() {
    }

    public String zp() {
        return this.jU;
    }

    public rV(YW yw, String str, zp zpVar) {
        this.KS = yw;
        this.jU = str;
        this.HWF = zpVar;
    }

    public static rV zp(YW yw, String str) {
        return new rV(yw, str, zp.STRING_TYPE);
    }

    public static rV zp(YW yw, byte[] bArr) {
        return new rV(yw, bArr, zp.BYTE_ARRAY_TYPE);
    }

    public rV(YW yw, byte[] bArr, zp zpVar) {
        this.KS = yw;
        this.COT = bArr;
        this.HWF = zpVar;
    }
}
