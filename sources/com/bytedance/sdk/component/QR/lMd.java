package com.bytedance.sdk.component.QR;

import com.bytedance.sdk.component.lMd.zp.dT;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class lMd {
    final long COT;
    final long HWF;
    final Map<String, String> KS;
    dT QR;
    private final boolean YW;
    final String jU;
    final String lMd;
    final int zp;
    private File ku = null;
    private byte[] dT = null;

    public lMd(boolean z8, int i9, String str, Map<String, String> map, String str2, long j7, long j9) {
        this.YW = z8;
        this.zp = i9;
        this.lMd = str;
        this.KS = map;
        this.jU = str2;
        this.COT = j7;
        this.HWF = j9;
    }

    public File COT() {
        return this.ku;
    }

    public boolean HWF() {
        return this.YW;
    }

    public Map<String, String> KS() {
        return this.KS;
    }

    public long QR() {
        return this.COT - this.HWF;
    }

    public String jU() {
        return this.jU;
    }

    public dT ku() {
        return this.QR;
    }

    public String lMd() {
        return this.lMd;
    }

    public int zp() {
        return this.zp;
    }

    public void zp(File file) {
        this.ku = file;
    }

    public void zp(byte[] bArr) {
        this.dT = bArr;
    }

    public void zp(dT dTVar) {
        this.QR = dTVar;
    }
}
