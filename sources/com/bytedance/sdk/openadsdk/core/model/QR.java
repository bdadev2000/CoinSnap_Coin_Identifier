package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* loaded from: classes.dex */
public class QR {
    private List<String> COT;
    private String HWF;
    private String KS;
    private String QR;
    private String YW;
    private List<String> jU;
    private List<String> ku;
    private String lMd;
    private String zp;

    public void COT(String str) {
        this.QR = str;
    }

    public void HWF(String str) {
        this.YW = str;
    }

    public void KS(String str) {
        this.KS = str;
    }

    public void jU(String str) {
        this.HWF = str;
    }

    public void lMd(String str) {
        this.lMd = str;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void KS(List<String> list) {
        this.ku = list;
    }

    public void lMd(List<String> list) {
        this.COT = list;
    }

    public void zp(List<String> list) {
        this.jU = list;
    }
}
