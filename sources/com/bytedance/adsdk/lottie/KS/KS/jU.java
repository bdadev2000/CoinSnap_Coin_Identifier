package com.bytedance.adsdk.lottie.KS.KS;

import com.bytedance.adsdk.lottie.COT.dT;
import com.bytedance.adsdk.lottie.KS.zp.Bj;
import com.bytedance.adsdk.lottie.KS.zp.vDp;
import java.util.List;
import java.util.Locale;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class jU {
    private final int Bj;
    private final zp COT;
    private final lMd FP;
    private final long HWF;
    private final String KS;
    private final float KVG;
    private final String QR;
    private final vDp YW;
    private final List<com.bytedance.adsdk.lottie.QR.zp<Float>> cz;
    private final float dQp;
    private final int dT;
    private final long jU;
    private final List<com.bytedance.adsdk.lottie.KS.lMd.ku> ku;
    private final com.bytedance.adsdk.lottie.HWF lMd;
    private final boolean ot;
    private final dT ox;
    private final com.bytedance.adsdk.lottie.KS.zp.lMd pvr;
    private final float rV;
    private final float tG;
    private final int vDp;
    private final Bj vwr;
    private final com.bytedance.adsdk.lottie.KS.zp.dT woN;
    private final com.bytedance.adsdk.lottie.KS.lMd.zp yRU;
    private final List<com.bytedance.adsdk.lottie.KS.lMd.KS> zp;

    /* loaded from: classes.dex */
    public enum lMd {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum zp {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public jU(List<com.bytedance.adsdk.lottie.KS.lMd.KS> list, com.bytedance.adsdk.lottie.HWF hwf, String str, long j7, zp zpVar, long j9, String str2, List<com.bytedance.adsdk.lottie.KS.lMd.ku> list2, vDp vdp, int i9, int i10, int i11, float f9, float f10, float f11, float f12, com.bytedance.adsdk.lottie.KS.zp.dT dTVar, Bj bj, List<com.bytedance.adsdk.lottie.QR.zp<Float>> list3, lMd lmd, com.bytedance.adsdk.lottie.KS.zp.lMd lmd2, boolean z8, com.bytedance.adsdk.lottie.KS.lMd.zp zpVar2, dT dTVar2) {
        this.zp = list;
        this.lMd = hwf;
        this.KS = str;
        this.jU = j7;
        this.COT = zpVar;
        this.HWF = j9;
        this.QR = str2;
        this.ku = list2;
        this.YW = vdp;
        this.dT = i9;
        this.Bj = i10;
        this.vDp = i11;
        this.tG = f9;
        this.rV = f10;
        this.dQp = f11;
        this.KVG = f12;
        this.woN = dTVar;
        this.vwr = bj;
        this.cz = list3;
        this.FP = lmd;
        this.pvr = lmd2;
        this.ot = z8;
        this.yRU = zpVar2;
        this.ox = dTVar2;
    }

    public zp Bj() {
        return this.COT;
    }

    public long COT() {
        return this.jU;
    }

    public com.bytedance.adsdk.lottie.KS.zp.lMd FP() {
        return this.pvr;
    }

    public String HWF() {
        return this.KS;
    }

    public float KS() {
        return this.rV / this.lMd.tG();
    }

    public int KVG() {
        return this.vDp;
    }

    public String QR() {
        return this.QR;
    }

    public float YW() {
        return this.KVG;
    }

    public Bj cz() {
        return this.vwr;
    }

    public vDp dQp() {
        return this.YW;
    }

    public List<com.bytedance.adsdk.lottie.KS.lMd.ku> dT() {
        return this.ku;
    }

    public List<com.bytedance.adsdk.lottie.QR.zp<Float>> jU() {
        return this.cz;
    }

    public float ku() {
        return this.dQp;
    }

    public float lMd() {
        return this.tG;
    }

    public boolean ot() {
        return this.ot;
    }

    public dT ox() {
        return this.ox;
    }

    public com.bytedance.adsdk.lottie.KS.zp.dT pvr() {
        return this.woN;
    }

    public List<com.bytedance.adsdk.lottie.KS.lMd.KS> rV() {
        return this.zp;
    }

    public long tG() {
        return this.HWF;
    }

    public String toString() {
        return zp("");
    }

    public lMd vDp() {
        return this.FP;
    }

    public int vwr() {
        return this.dT;
    }

    public int woN() {
        return this.Bj;
    }

    public com.bytedance.adsdk.lottie.KS.lMd.zp yRU() {
        return this.yRU;
    }

    public String zp(String str) {
        StringBuilder b = AbstractC2965e.b(str);
        b.append(HWF());
        b.append("\n");
        jU zp2 = this.lMd.zp(tG());
        if (zp2 != null) {
            b.append("\t\tParents: ");
            b.append(zp2.HWF());
            jU zp3 = this.lMd.zp(zp2.tG());
            while (zp3 != null) {
                b.append("->");
                b.append(zp3.HWF());
                zp3 = this.lMd.zp(zp3.tG());
            }
            b.append(str);
            b.append("\n");
        }
        if (!dT().isEmpty()) {
            b.append(str);
            b.append("\tMasks: ");
            b.append(dT().size());
            b.append("\n");
        }
        if (vwr() != 0 && woN() != 0) {
            b.append(str);
            b.append("\tBackground: ");
            b.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(vwr()), Integer.valueOf(woN()), Integer.valueOf(KVG())));
        }
        if (!this.zp.isEmpty()) {
            b.append(str);
            b.append("\tShapes:\n");
            for (com.bytedance.adsdk.lottie.KS.lMd.KS ks : this.zp) {
                b.append(str);
                b.append("\t\t");
                b.append(ks);
                b.append("\n");
            }
        }
        return b.toString();
    }

    public com.bytedance.adsdk.lottie.HWF zp() {
        return this.lMd;
    }
}
