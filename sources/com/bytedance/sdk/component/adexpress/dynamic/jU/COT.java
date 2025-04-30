package com.bytedance.sdk.component.adexpress.dynamic.jU;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.jU.lMd;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class COT {
    private com.bytedance.sdk.component.adexpress.dynamic.KS.ku KS;
    private zp jU;
    protected lMd lMd;
    public com.bytedance.sdk.component.adexpress.dynamic.KS.lMd zp;

    /* loaded from: classes.dex */
    public static class zp {
        float KS;
        float lMd;
        float zp;
    }

    public COT(double d2, int i9, double d9, String str, tG tGVar) {
        this.lMd = new lMd(d2, i9, d9, str, tGVar);
    }

    public void zp(zp zpVar) {
        this.jU = zpVar;
    }

    public void zp() {
        this.lMd.zp();
    }

    public void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar, float f9, float f10) {
        if (kuVar != null) {
            this.KS = kuVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar2 = this.KS;
        float ku = kuVar2.ku();
        float YW = kuVar2.YW();
        float f11 = TextUtils.equals(kuVar2.dT().COT().Gzh(), "fixed") ? YW : 65536.0f;
        this.lMd.zp();
        this.lMd.KS(kuVar2, ku, f11);
        lMd.KS zp2 = this.lMd.zp(kuVar2);
        com.bytedance.sdk.component.adexpress.dynamic.KS.lMd lmd = new com.bytedance.sdk.component.adexpress.dynamic.KS.lMd();
        lmd.zp = f9;
        lmd.lMd = f10;
        if (zp2 != null) {
            ku = zp2.zp;
        }
        lmd.KS = ku;
        if (zp2 != null) {
            YW = zp2.lMd;
        }
        lmd.jU = YW;
        lmd.COT = "root";
        lmd.YW = 1280.0f;
        lmd.HWF = kuVar2;
        kuVar2.KS(f9);
        lmd.HWF.jU(lmd.lMd);
        lmd.HWF.COT(lmd.KS);
        lmd.HWF.HWF(lmd.jU);
        com.bytedance.sdk.component.adexpress.dynamic.KS.lMd zp3 = zp(lmd, 0.0f);
        this.zp = zp3;
        zp(zp3);
    }

    public void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.lMd lmd) {
        if (lmd == null) {
            return;
        }
        lmd.HWF.dT().lMd();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.KS.lMd>> list = lmd.QR;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.KS.lMd> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.KS.lMd> it = list2.iterator();
                while (it.hasNext()) {
                    zp(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.KS.lMd zp(com.bytedance.sdk.component.adexpress.dynamic.KS.lMd r37, float r38) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.jU.COT.zp(com.bytedance.sdk.component.adexpress.dynamic.KS.lMd, float):com.bytedance.sdk.component.adexpress.dynamic.KS.lMd");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.KS.YW zp(com.bytedance.sdk.component.adexpress.dynamic.KS.HWF hwf, lMd.KS ks, lMd.KS ks2) {
        float vLi = hwf.vLi();
        float Eg = hwf.Eg();
        float bQm = hwf.bQm();
        float TS = hwf.TS();
        boolean GP = hwf.GP();
        boolean mW = hwf.mW();
        boolean sqt = hwf.sqt();
        boolean fVt = hwf.fVt();
        if (!GP) {
            if (mW) {
                float f9 = this.jU.zp;
                vLi = ((f9 != 0.0f ? Math.min(f9, ks.zp) : ks.zp) - bQm) - ks2.zp;
            } else {
                vLi = 0.0f;
            }
        }
        if (!sqt) {
            if (fVt) {
                float f10 = this.jU.lMd;
                if (f10 == 0.0f) {
                    f10 = ks.lMd;
                }
                Eg = (f10 - TS) - ks2.lMd;
            } else {
                Eg = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.KS.YW(vLi, Eg);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.KS.YW zp(com.bytedance.sdk.component.adexpress.dynamic.KS.lMd lmd, com.bytedance.sdk.component.adexpress.dynamic.KS.HWF hwf, float f9, float f10) {
        float f11;
        float f12;
        float f13 = lmd.zp;
        float f14 = lmd.lMd;
        float vLi = hwf.vLi();
        float Eg = hwf.Eg();
        float bQm = hwf.bQm();
        float TS = hwf.TS();
        boolean GP = hwf.GP();
        boolean mW = hwf.mW();
        boolean sqt = hwf.sqt();
        boolean fVt = hwf.fVt();
        String fs = hwf.fs();
        float f15 = lmd.KS;
        float f16 = lmd.jU;
        if (TextUtils.equals(fs, "0")) {
            if (GP) {
                f13 = lmd.zp + vLi;
            } else if (mW) {
                f13 = ((lmd.zp + f15) - bQm) - f9;
            }
            if (sqt) {
                f12 = lmd.lMd;
                f14 = f12 + Eg;
            } else if (fVt) {
                f11 = lmd.lMd;
                f14 = ((f11 + f16) - TS) - f10;
            }
        } else if (TextUtils.equals(fs, "1")) {
            f13 = lmd.zp + ((f15 - f9) / 2.0f);
            if (sqt) {
                f12 = lmd.lMd;
                f14 = f12 + Eg;
            } else if (fVt) {
                f11 = lmd.lMd;
                f14 = ((f11 + f16) - TS) - f10;
            }
        } else if (TextUtils.equals(fs, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            f14 = lmd.lMd + ((f16 - f10) / 2.0f);
            if (GP) {
                f13 = lmd.zp + vLi;
            } else if (mW) {
                f13 = ((lmd.zp + f15) - bQm) - f9;
            }
        } else if (TextUtils.equals(fs, "3")) {
            f13 = lmd.zp + ((f15 - f9) / 2.0f);
            f14 = ((f16 - f10) / 2.0f) + lmd.lMd;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.KS.YW(f13, f14);
    }
}
