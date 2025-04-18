package com.bytedance.adsdk.Sg.tN.Sg;

import a4.j;
import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class pDU {
    private PointF Sg;
    private final List<com.bytedance.adsdk.Sg.tN.YFl> YFl;
    private boolean tN;

    public pDU(PointF pointF, boolean z10, List<com.bytedance.adsdk.Sg.tN.YFl> list) {
        this.Sg = pointF;
        this.tN = z10;
        this.YFl = new ArrayList(list);
    }

    public boolean Sg() {
        return this.tN;
    }

    public void YFl(float f10, float f11) {
        if (this.Sg == null) {
            this.Sg = new PointF();
        }
        this.Sg.set(f10, f11);
    }

    public List<com.bytedance.adsdk.Sg.tN.YFl> tN() {
        return this.YFl;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.YFl.size());
        sb2.append("closed=");
        return j.l(sb2, this.tN, AbstractJsonLexerKt.END_OBJ);
    }

    public PointF YFl() {
        return this.Sg;
    }

    public pDU() {
        this.YFl = new ArrayList();
    }

    public void YFl(boolean z10) {
        this.tN = z10;
    }

    public void YFl(pDU pdu, pDU pdu2, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        if (this.Sg == null) {
            this.Sg = new PointF();
        }
        this.tN = pdu.Sg() || pdu2.Sg();
        if (pdu.tN().size() != pdu2.tN().size()) {
            pdu.tN().size();
            pdu2.tN().size();
        }
        int min = Math.min(pdu.tN().size(), pdu2.tN().size());
        if (this.YFl.size() < min) {
            for (int size = this.YFl.size(); size < min; size++) {
                this.YFl.add(new com.bytedance.adsdk.Sg.tN.YFl());
            }
        } else if (this.YFl.size() > min) {
            for (int size2 = this.YFl.size() - 1; size2 >= min; size2--) {
                List<com.bytedance.adsdk.Sg.tN.YFl> list = this.YFl;
                list.remove(list.size() - 1);
            }
        }
        PointF YFl = pdu.YFl();
        PointF YFl2 = pdu2.YFl();
        YFl(com.bytedance.adsdk.Sg.vc.wN.YFl(YFl.x, YFl2.x, f10), com.bytedance.adsdk.Sg.vc.wN.YFl(YFl.y, YFl2.y, f10));
        for (int size3 = this.YFl.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.Sg.tN.YFl yFl = pdu.tN().get(size3);
            com.bytedance.adsdk.Sg.tN.YFl yFl2 = pdu2.tN().get(size3);
            PointF YFl3 = yFl.YFl();
            PointF Sg = yFl.Sg();
            PointF tN = yFl.tN();
            PointF YFl4 = yFl2.YFl();
            PointF Sg2 = yFl2.Sg();
            PointF tN2 = yFl2.tN();
            this.YFl.get(size3).YFl(com.bytedance.adsdk.Sg.vc.wN.YFl(YFl3.x, YFl4.x, f10), com.bytedance.adsdk.Sg.vc.wN.YFl(YFl3.y, YFl4.y, f10));
            this.YFl.get(size3).Sg(com.bytedance.adsdk.Sg.vc.wN.YFl(Sg.x, Sg2.x, f10), com.bytedance.adsdk.Sg.vc.wN.YFl(Sg.y, Sg2.y, f10));
            this.YFl.get(size3).tN(com.bytedance.adsdk.Sg.vc.wN.YFl(tN.x, tN2.x, f10), com.bytedance.adsdk.Sg.vc.wN.YFl(tN.y, tN2.y, f10));
        }
    }
}
