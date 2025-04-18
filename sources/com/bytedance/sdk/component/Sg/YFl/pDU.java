package com.bytedance.sdk.component.Sg.YFl;

/* loaded from: classes.dex */
public class pDU {
    public String AlY;
    public NjR tN;

    /* renamed from: vc, reason: collision with root package name */
    public YFl f10338vc;
    public byte[] wN;

    /* loaded from: classes.dex */
    public enum YFl {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public pDU() {
    }

    public String YFl() {
        return this.AlY;
    }

    public pDU(NjR njR, String str, YFl yFl) {
        this.tN = njR;
        this.AlY = str;
        this.f10338vc = yFl;
    }

    public static pDU YFl(NjR njR, String str) {
        return new pDU(njR, str, YFl.STRING_TYPE);
    }

    public static pDU YFl(NjR njR, byte[] bArr) {
        return new pDU(njR, bArr, YFl.BYTE_ARRAY_TYPE);
    }

    public pDU(NjR njR, byte[] bArr, YFl yFl) {
        this.tN = njR;
        this.wN = bArr;
        this.f10338vc = yFl;
    }
}
