package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.PointF;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import java.util.ArrayList;
import java.util.List;
import vd.e;

/* loaded from: classes.dex */
public class lG implements YFl.InterfaceC0054YFl, qO {
    private com.bytedance.adsdk.Sg.tN.Sg.pDU AlY;
    private final String Sg;
    private final com.bytedance.adsdk.Sg.NjR YFl;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> tN;

    public lG(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.GA ga2) {
        this.YFl = njR;
        this.Sg = ga2.YFl();
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl = ga2.Sg().YFl();
        this.tN = YFl;
        yFl.YFl(YFl);
        YFl.YFl(this);
    }

    public com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> Sg() {
        return this.tN;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
    }

    private com.bytedance.adsdk.Sg.tN.Sg.pDU Sg(com.bytedance.adsdk.Sg.tN.Sg.pDU pdu) {
        List<com.bytedance.adsdk.Sg.tN.YFl> tN = pdu.tN();
        boolean Sg = pdu.Sg();
        int size = tN.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.Sg.tN.YFl yFl = tN.get(size);
            com.bytedance.adsdk.Sg.tN.YFl yFl2 = tN.get(YFl(size - 1, tN.size()));
            PointF tN2 = (size != 0 || Sg) ? yFl2.tN() : pdu.YFl();
            i10 = (((size != 0 || Sg) ? yFl2.Sg() : tN2).equals(tN2) && yFl.YFl().equals(tN2) && !(!pdu.Sg() && size == 0 && size == tN.size() - 1)) ? i10 + 2 : i10 + 1;
            size--;
        }
        com.bytedance.adsdk.Sg.tN.Sg.pDU pdu2 = this.AlY;
        if (pdu2 == null || pdu2.tN().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new com.bytedance.adsdk.Sg.tN.YFl());
            }
            this.AlY = new com.bytedance.adsdk.Sg.tN.Sg.pDU(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.AlY.YFl(Sg);
        return this.AlY;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        this.YFl.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.qO
    public com.bytedance.adsdk.Sg.tN.Sg.pDU YFl(com.bytedance.adsdk.Sg.tN.Sg.pDU pdu) {
        List<com.bytedance.adsdk.Sg.tN.YFl> list;
        List<com.bytedance.adsdk.Sg.tN.YFl> tN = pdu.tN();
        if (tN.size() <= 2) {
            return pdu;
        }
        float floatValue = this.tN.DSW().floatValue();
        if (floatValue == 0.0f) {
            return pdu;
        }
        com.bytedance.adsdk.Sg.tN.Sg.pDU Sg = Sg(pdu);
        Sg.YFl(pdu.YFl().x, pdu.YFl().y);
        List<com.bytedance.adsdk.Sg.tN.YFl> tN2 = Sg.tN();
        boolean Sg2 = pdu.Sg();
        int i10 = 0;
        int i11 = 0;
        while (i10 < tN.size()) {
            com.bytedance.adsdk.Sg.tN.YFl yFl = tN.get(i10);
            com.bytedance.adsdk.Sg.tN.YFl yFl2 = tN.get(YFl(i10 - 1, tN.size()));
            com.bytedance.adsdk.Sg.tN.YFl yFl3 = tN.get(YFl(i10 - 2, tN.size()));
            PointF tN3 = (i10 != 0 || Sg2) ? yFl2.tN() : pdu.YFl();
            PointF Sg3 = (i10 != 0 || Sg2) ? yFl2.Sg() : tN3;
            PointF YFl = yFl.YFl();
            PointF tN4 = yFl3.tN();
            PointF tN5 = yFl.tN();
            boolean z10 = !pdu.Sg() && i10 == 0 && i10 == tN.size() + (-1);
            if (Sg3.equals(tN3) && YFl.equals(tN3) && !z10) {
                float f10 = tN3.x;
                float f11 = f10 - tN4.x;
                float f12 = tN3.y;
                float f13 = f12 - tN4.y;
                float f14 = tN5.x - f10;
                float f15 = tN5.y - f12;
                list = tN;
                float hypot = (float) Math.hypot(f11, f13);
                float hypot2 = (float) Math.hypot(f14, f15);
                float min = Math.min(floatValue / hypot, 0.5f);
                float min2 = Math.min(floatValue / hypot2, 0.5f);
                float f16 = tN3.x;
                float b3 = e.b(tN4.x, f16, min, f16);
                float f17 = tN3.y;
                float b10 = e.b(tN4.y, f17, min, f17);
                float b11 = e.b(tN5.x, f16, min2, f16);
                float b12 = e.b(tN5.y, f17, min2, f17);
                float f18 = b3 - ((b3 - f16) * 0.5519f);
                float f19 = b10 - ((b10 - f17) * 0.5519f);
                float f20 = b11 - ((b11 - f16) * 0.5519f);
                float f21 = b12 - ((b12 - f17) * 0.5519f);
                com.bytedance.adsdk.Sg.tN.YFl yFl4 = tN2.get(YFl(i11 - 1, tN2.size()));
                com.bytedance.adsdk.Sg.tN.YFl yFl5 = tN2.get(i11);
                yFl4.Sg(b3, b10);
                yFl4.tN(b3, b10);
                if (i10 == 0) {
                    Sg.YFl(b3, b10);
                }
                yFl5.YFl(f18, f19);
                i11++;
                com.bytedance.adsdk.Sg.tN.YFl yFl6 = tN2.get(i11);
                yFl5.Sg(f20, f21);
                yFl5.tN(b11, b12);
                yFl6.YFl(b11, b12);
            } else {
                list = tN;
                com.bytedance.adsdk.Sg.tN.YFl yFl7 = tN2.get(YFl(i11 - 1, tN2.size()));
                com.bytedance.adsdk.Sg.tN.YFl yFl8 = tN2.get(i11);
                yFl7.Sg(yFl2.Sg().x, yFl2.Sg().y);
                yFl7.tN(yFl2.tN().x, yFl2.tN().y);
                yFl8.YFl(yFl.YFl().x, yFl.YFl().y);
            }
            i11++;
            i10++;
            tN = list;
        }
        return Sg;
    }

    private static int Sg(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int YFl(int i10, int i11) {
        return i10 - (Sg(i10, i11) * i11);
    }
}
