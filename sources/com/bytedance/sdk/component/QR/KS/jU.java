package com.bytedance.sdk.component.QR.KS;

import java.util.Map;

/* loaded from: classes.dex */
public class jU {
    public boolean zp = false;
    public boolean lMd = true;
    public Map<String, Integer> KS = null;
    public Map<String, String> jU = null;
    public int COT = 10;
    public int HWF = 1;
    public int QR = 1;
    public int ku = 10;
    public int YW = 1;
    public int dT = 1;
    public int Bj = 900;
    public int vDp = 120;
    public String tG = null;
    public int rV = 0;
    public long dQp = 0;

    public String toString() {
        int i9;
        StringBuilder sb = new StringBuilder(" localEnable: ");
        sb.append(this.zp);
        sb.append(" probeEnable: ");
        sb.append(this.lMd);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.KS;
        int i10 = 0;
        if (map != null) {
            i9 = map.size();
        } else {
            i9 = 0;
        }
        sb.append(i9);
        sb.append(" hostMap: ");
        Map<String, String> map2 = this.jU;
        if (map2 != null) {
            i10 = map2.size();
        }
        sb.append(i10);
        sb.append(" reqTo: ");
        sb.append(this.COT);
        sb.append("#");
        sb.append(this.HWF);
        sb.append("#");
        sb.append(this.QR);
        sb.append(" reqErr: ");
        sb.append(this.ku);
        sb.append("#");
        sb.append(this.YW);
        sb.append("#");
        sb.append(this.dT);
        sb.append(" updateInterval: ");
        sb.append(this.Bj);
        sb.append(" updateRandom: ");
        sb.append(this.vDp);
        sb.append(" httpBlack: ");
        sb.append(this.tG);
        return sb.toString();
    }
}
