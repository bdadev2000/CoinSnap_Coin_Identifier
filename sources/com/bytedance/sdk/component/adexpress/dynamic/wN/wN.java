package com.bytedance.sdk.component.adexpress.dynamic.wN;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.bytedance.sdk.component.adexpress.dynamic.wN.Sg;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class wN {
    private YFl AlY;
    protected Sg Sg;
    public com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg YFl;
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH tN;

    /* loaded from: classes.dex */
    public static class YFl {
        float Sg;
        float YFl;
        float tN;
    }

    public wN(double d10, int i10, double d11, String str, GA ga2) {
        this.Sg = new Sg(d10, i10, d11, str, ga2);
    }

    public void YFl(YFl yFl) {
        this.AlY = yFl;
    }

    public void YFl() {
        this.Sg.YFl();
    }

    public void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, float f10, float f11) {
        if (qsh != null) {
            this.tN = qsh;
        }
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh2 = this.tN;
        float qsH = qsh2.qsH();
        float NjR = qsh2.NjR();
        float f12 = TextUtils.equals(qsh2.nc().wN().Ga(), "fixed") ? NjR : 65536.0f;
        this.Sg.YFl();
        this.Sg.tN(qsh2, qsH, f12);
        Sg.tN YFl2 = this.Sg.YFl(qsh2);
        com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg sg2 = new com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg();
        sg2.YFl = f10;
        sg2.Sg = f11;
        if (YFl2 != null) {
            qsH = YFl2.YFl;
        }
        sg2.tN = qsH;
        if (YFl2 != null) {
            NjR = YFl2.Sg;
        }
        sg2.AlY = NjR;
        sg2.wN = "root";
        sg2.NjR = 1280.0f;
        sg2.f10366vc = qsh2;
        qsh2.tN(f10);
        sg2.f10366vc.AlY(sg2.Sg);
        sg2.f10366vc.wN(sg2.tN);
        sg2.f10366vc.vc(sg2.AlY);
        com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg YFl3 = YFl(sg2, 0.0f);
        this.YFl = YFl3;
        YFl(YFl3);
    }

    public void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg sg2) {
        if (sg2 == null) {
            return;
        }
        sg2.f10366vc.nc().Sg();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg>> list = sg2.DSW;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg> it = list2.iterator();
                while (it.hasNext()) {
                    YFl(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg r37, float r38) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.wN.wN.YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg, float):com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.AlY.NjR YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.vc vcVar, Sg.tN tNVar, Sg.tN tNVar2) {
        float DjU = vcVar.DjU();
        float rE = vcVar.rE();
        float YP = vcVar.YP();
        float AfY = vcVar.AfY();
        boolean Hjb = vcVar.Hjb();
        boolean dd2 = vcVar.dd();
        boolean lL = vcVar.lL();
        boolean zz = vcVar.zz();
        if (!Hjb) {
            if (dd2) {
                float f10 = this.AlY.YFl;
                DjU = ((f10 != 0.0f ? Math.min(f10, tNVar.YFl) : tNVar.YFl) - YP) - tNVar2.YFl;
            } else {
                DjU = 0.0f;
            }
        }
        if (!lL) {
            if (zz) {
                float f11 = this.AlY.Sg;
                if (f11 == 0.0f) {
                    f11 = tNVar.Sg;
                }
                rE = (f11 - AfY) - tNVar2.Sg;
            } else {
                rE = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.AlY.NjR(DjU, rE);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.AlY.NjR YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg sg2, com.bytedance.sdk.component.adexpress.dynamic.AlY.vc vcVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = sg2.YFl;
        float f15 = sg2.Sg;
        float DjU = vcVar.DjU();
        float rE = vcVar.rE();
        float YP = vcVar.YP();
        float AfY = vcVar.AfY();
        boolean Hjb = vcVar.Hjb();
        boolean dd2 = vcVar.dd();
        boolean lL = vcVar.lL();
        boolean zz = vcVar.zz();
        String ib2 = vcVar.ib();
        float f16 = sg2.tN;
        float f17 = sg2.AlY;
        if (TextUtils.equals(ib2, "0")) {
            if (Hjb) {
                f14 = sg2.YFl + DjU;
            } else if (dd2) {
                f14 = ((sg2.YFl + f16) - YP) - f10;
            }
            if (lL) {
                f13 = sg2.Sg;
                f15 = f13 + rE;
            } else if (zz) {
                f12 = sg2.Sg;
                f15 = ((f12 + f17) - AfY) - f11;
            }
        } else if (TextUtils.equals(ib2, "1")) {
            f14 = sg2.YFl + ((f16 - f10) / 2.0f);
            if (lL) {
                f13 = sg2.Sg;
                f15 = f13 + rE;
            } else if (zz) {
                f12 = sg2.Sg;
                f15 = ((f12 + f17) - AfY) - f11;
            }
        } else if (TextUtils.equals(ib2, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            f15 = sg2.Sg + ((f17 - f11) / 2.0f);
            if (Hjb) {
                f14 = sg2.YFl + DjU;
            } else if (dd2) {
                f14 = ((sg2.YFl + f16) - YP) - f10;
            }
        } else if (TextUtils.equals(ib2, "3")) {
            f14 = sg2.YFl + ((f16 - f10) / 2.0f);
            f15 = ((f17 - f11) / 2.0f) + sg2.Sg;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.AlY.NjR(f14, f15);
    }
}
