package com.bytedance.sdk.component.COT.lMd;

import com.bytedance.sdk.component.COT.HWF;
import com.bytedance.sdk.component.COT.QR;
import java.util.Map;

/* loaded from: classes.dex */
public class jU<T> implements HWF {
    private QR COT;
    private T KS;
    private String jU;
    private int lMd;
    Map<String, String> zp;

    public jU(int i9, T t9, String str) {
        this.lMd = i9;
        this.KS = t9;
        this.jU = str;
    }

    @Override // com.bytedance.sdk.component.COT.HWF
    public Map<String, String> COT() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.COT.HWF
    public T KS() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.COT.HWF
    public String jU() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.component.COT.HWF
    public int lMd() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.COT.HWF
    public QR zp() {
        return this.COT;
    }

    public void zp(QR qr) {
        this.COT = qr;
    }

    public jU(int i9, T t9, String str, Map<String, String> map) {
        this(i9, t9, str);
        this.zp = map;
    }
}
