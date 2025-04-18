package com.bytedance.sdk.component.DSW.tN;

import java.util.Map;

/* loaded from: classes.dex */
public class AlY {
    public boolean YFl = false;
    public boolean Sg = true;
    public Map<String, Integer> tN = null;
    public Map<String, String> AlY = null;
    public int wN = 10;

    /* renamed from: vc, reason: collision with root package name */
    public int f10315vc = 1;
    public int DSW = 1;
    public int qsH = 10;
    public int NjR = 1;

    /* renamed from: nc, reason: collision with root package name */
    public int f10314nc = 1;
    public int eT = 900;
    public int YoT = 120;
    public String GA = null;
    public int pDU = 0;
    public long EH = 0;

    public String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder(" localEnable: ");
        sb2.append(this.YFl);
        sb2.append(" probeEnable: ");
        sb2.append(this.Sg);
        sb2.append(" hostFilter: ");
        Map<String, Integer> map = this.tN;
        int i11 = 0;
        if (map != null) {
            i10 = map.size();
        } else {
            i10 = 0;
        }
        sb2.append(i10);
        sb2.append(" hostMap: ");
        Map<String, String> map2 = this.AlY;
        if (map2 != null) {
            i11 = map2.size();
        }
        sb2.append(i11);
        sb2.append(" reqTo: ");
        sb2.append(this.wN);
        sb2.append("#");
        sb2.append(this.f10315vc);
        sb2.append("#");
        sb2.append(this.DSW);
        sb2.append(" reqErr: ");
        sb2.append(this.qsH);
        sb2.append("#");
        sb2.append(this.NjR);
        sb2.append("#");
        sb2.append(this.f10314nc);
        sb2.append(" updateInterval: ");
        sb2.append(this.eT);
        sb2.append(" updateRandom: ");
        sb2.append(this.YoT);
        sb2.append(" httpBlack: ");
        sb2.append(this.GA);
        return sb2.toString();
    }
}
