package com.bytedance.adsdk.Sg.tN.tN;

import com.bytedance.adsdk.Sg.tN.YFl.YoT;
import com.bytedance.adsdk.Sg.tN.YFl.eT;
import com.bytedance.adsdk.Sg.wN.nc;
import eb.j;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class wN {
    private final long AlY;
    private final String DSW;
    private final float EH;
    private final float GA;
    private final boolean Ne;
    private final YoT NjR;
    private final com.bytedance.adsdk.Sg.DSW Sg;
    private final com.bytedance.adsdk.Sg.tN.Sg.YFl VOe;
    private final eT Wwa;
    private final List<com.bytedance.adsdk.Sg.tN.Sg.tN> YFl;
    private final int YoT;
    private final List<com.bytedance.adsdk.Sg.DSW.YFl<Float>> aIu;
    private final nc bZ;
    private final int eT;
    private final com.bytedance.adsdk.Sg.tN.YFl.nc lG;

    /* renamed from: nc, reason: collision with root package name */
    private final int f10210nc;
    private final float pDU;
    private final com.bytedance.adsdk.Sg.tN.YFl.Sg qO;
    private final List<com.bytedance.adsdk.Sg.tN.Sg.qsH> qsH;
    private final float rkt;
    private final String tN;

    /* renamed from: vc, reason: collision with root package name */
    private final long f10211vc;
    private final YFl wN;
    private final Sg wXo;

    /* loaded from: classes.dex */
    public enum Sg {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum YFl {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public wN(List<com.bytedance.adsdk.Sg.tN.Sg.tN> list, com.bytedance.adsdk.Sg.DSW dsw, String str, long j3, YFl yFl, long j10, String str2, List<com.bytedance.adsdk.Sg.tN.Sg.qsH> list2, YoT yoT, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.Sg.tN.YFl.nc ncVar, eT eTVar, List<com.bytedance.adsdk.Sg.DSW.YFl<Float>> list3, Sg sg2, com.bytedance.adsdk.Sg.tN.YFl.Sg sg3, boolean z10, com.bytedance.adsdk.Sg.tN.Sg.YFl yFl2, nc ncVar2) {
        this.YFl = list;
        this.Sg = dsw;
        this.tN = str;
        this.AlY = j3;
        this.wN = yFl;
        this.f10211vc = j10;
        this.DSW = str2;
        this.qsH = list2;
        this.NjR = yoT;
        this.f10210nc = i10;
        this.eT = i11;
        this.YoT = i12;
        this.GA = f10;
        this.pDU = f11;
        this.EH = f12;
        this.rkt = f13;
        this.lG = ncVar;
        this.Wwa = eTVar;
        this.aIu = list3;
        this.wXo = sg2;
        this.qO = sg3;
        this.Ne = z10;
        this.VOe = yFl2;
        this.bZ = ncVar2;
    }

    public List<com.bytedance.adsdk.Sg.DSW.YFl<Float>> AlY() {
        return this.aIu;
    }

    public String DSW() {
        return this.DSW;
    }

    public YoT EH() {
        return this.NjR;
    }

    public long GA() {
        return this.f10211vc;
    }

    public boolean Ne() {
        return this.Ne;
    }

    public float NjR() {
        return this.rkt;
    }

    public float Sg() {
        return this.GA;
    }

    public com.bytedance.adsdk.Sg.tN.Sg.YFl VOe() {
        return this.VOe;
    }

    public int Wwa() {
        return this.f10210nc;
    }

    public String YFl(String str) {
        StringBuilder m10 = j.m(str);
        m10.append(vc());
        m10.append("\n");
        wN YFl2 = this.Sg.YFl(GA());
        if (YFl2 != null) {
            m10.append("\t\tParents: ");
            m10.append(YFl2.vc());
            wN YFl3 = this.Sg.YFl(YFl2.GA());
            while (YFl3 != null) {
                m10.append("->");
                m10.append(YFl3.vc());
                YFl3 = this.Sg.YFl(YFl3.GA());
            }
            m10.append(str);
            m10.append("\n");
        }
        if (!nc().isEmpty()) {
            m10.append(str);
            m10.append("\tMasks: ");
            m10.append(nc().size());
            m10.append("\n");
        }
        if (Wwa() != 0 && lG() != 0) {
            m10.append(str);
            m10.append("\tBackground: ");
            m10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(Wwa()), Integer.valueOf(lG()), Integer.valueOf(rkt())));
        }
        if (!this.YFl.isEmpty()) {
            m10.append(str);
            m10.append("\tShapes:\n");
            for (com.bytedance.adsdk.Sg.tN.Sg.tN tNVar : this.YFl) {
                m10.append(str);
                m10.append("\t\t");
                m10.append(tNVar);
                m10.append("\n");
            }
        }
        return m10.toString();
    }

    public Sg YoT() {
        return this.wXo;
    }

    public eT aIu() {
        return this.Wwa;
    }

    public nc bZ() {
        return this.bZ;
    }

    public YFl eT() {
        return this.wN;
    }

    public int lG() {
        return this.eT;
    }

    public List<com.bytedance.adsdk.Sg.tN.Sg.qsH> nc() {
        return this.qsH;
    }

    public List<com.bytedance.adsdk.Sg.tN.Sg.tN> pDU() {
        return this.YFl;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.nc qO() {
        return this.lG;
    }

    public float qsH() {
        return this.EH;
    }

    public int rkt() {
        return this.YoT;
    }

    public float tN() {
        return this.pDU / this.Sg.lG();
    }

    public String toString() {
        return YFl("");
    }

    public String vc() {
        return this.tN;
    }

    public long wN() {
        return this.AlY;
    }

    public com.bytedance.adsdk.Sg.tN.YFl.Sg wXo() {
        return this.qO;
    }

    public com.bytedance.adsdk.Sg.DSW YFl() {
        return this.Sg;
    }
}
