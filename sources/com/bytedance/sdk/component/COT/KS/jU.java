package com.bytedance.sdk.component.COT.KS;

import com.bytedance.sdk.component.COT.Bj;
import java.util.Map;

/* loaded from: classes.dex */
public class jU<T> implements Bj {
    private int Bj;
    private int COT;
    private int HWF;
    private T KS;
    private Map<String, String> QR;
    private boolean YW;
    private com.bytedance.sdk.component.COT.QR dT;
    private T jU;
    private boolean ku;
    private String lMd;
    private String zp;

    @Override // com.bytedance.sdk.component.COT.Bj
    public boolean COT() {
        return this.ku;
    }

    @Override // com.bytedance.sdk.component.COT.Bj
    public boolean HWF() {
        return this.YW;
    }

    @Override // com.bytedance.sdk.component.COT.Bj
    public T KS() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.component.COT.Bj
    public int QR() {
        return this.Bj;
    }

    @Override // com.bytedance.sdk.component.COT.Bj
    public Map<String, String> jU() {
        return this.QR;
    }

    @Override // com.bytedance.sdk.component.COT.Bj
    public T lMd() {
        return this.KS;
    }

    public jU zp(KS ks, T t9) {
        this.KS = t9;
        this.zp = ks.COT();
        this.lMd = ks.zp();
        this.COT = ks.lMd();
        this.HWF = ks.KS();
        this.YW = ks.dQp();
        this.dT = ks.KVG();
        this.Bj = ks.woN();
        return this;
    }

    public jU zp(KS ks, T t9, Map<String, String> map, boolean z8) {
        this.QR = map;
        this.ku = z8;
        return zp(ks, t9);
    }

    @Override // com.bytedance.sdk.component.COT.Bj
    public String zp() {
        return this.lMd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.COT.Bj
    public void zp(Object obj) {
        this.jU = this.KS;
        this.KS = obj;
    }
}
