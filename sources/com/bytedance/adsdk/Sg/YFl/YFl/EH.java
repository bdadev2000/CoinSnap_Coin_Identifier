package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import com.bytedance.adsdk.Sg.tN.Sg.qO;
import java.util.List;

/* loaded from: classes.dex */
public class EH implements YFl.InterfaceC0054YFl, GA, eT {
    private final boolean AlY;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, PointF> DSW;
    private boolean eT;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> qsH;
    private final String tN;

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, PointF> f10168vc;
    private final com.bytedance.adsdk.Sg.NjR wN;
    private final Path YFl = new Path();
    private final RectF Sg = new RectF();
    private final Sg NjR = new Sg();

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> f10167nc = null;

    public EH(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.eT eTVar) {
        this.tN = eTVar.YFl();
        this.AlY = eTVar.wN();
        this.wN = njR;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl = eTVar.AlY().YFl();
        this.f10168vc = YFl;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl2 = eTVar.tN().YFl();
        this.DSW = YFl2;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl3 = eTVar.Sg().YFl();
        this.qsH = YFl3;
        yFl.YFl(YFl);
        yFl.YFl(YFl2);
        yFl.YFl(YFl3);
        YFl.YFl(this);
        YFl2.YFl(this);
        YFl3.YFl(this);
    }

    private void Sg() {
        this.eT = false;
        this.wN.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.GA
    public Path AlY() {
        float NjR;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> yFl;
        if (this.eT) {
            return this.YFl;
        }
        this.YFl.reset();
        if (this.AlY) {
            this.eT = true;
            return this.YFl;
        }
        PointF DSW = this.DSW.DSW();
        float f10 = DSW.x / 2.0f;
        float f11 = DSW.y / 2.0f;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> yFl2 = this.qsH;
        if (yFl2 == null) {
            NjR = 0.0f;
        } else {
            NjR = ((com.bytedance.adsdk.Sg.YFl.Sg.AlY) yFl2).NjR();
        }
        if (NjR == 0.0f && (yFl = this.f10167nc) != null) {
            NjR = Math.min(yFl.DSW().floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (NjR > min) {
            NjR = min;
        }
        PointF DSW2 = this.f10168vc.DSW();
        this.YFl.moveTo(DSW2.x + f10, (DSW2.y - f11) + NjR);
        this.YFl.lineTo(DSW2.x + f10, (DSW2.y + f11) - NjR);
        if (NjR > 0.0f) {
            RectF rectF = this.Sg;
            float f12 = DSW2.x;
            float f13 = NjR * 2.0f;
            float f14 = DSW2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.YFl.arcTo(this.Sg, 0.0f, 90.0f, false);
        }
        this.YFl.lineTo((DSW2.x - f10) + NjR, DSW2.y + f11);
        if (NjR > 0.0f) {
            RectF rectF2 = this.Sg;
            float f15 = DSW2.x;
            float f16 = DSW2.y;
            float f17 = NjR * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.YFl.arcTo(this.Sg, 90.0f, 90.0f, false);
        }
        this.YFl.lineTo(DSW2.x - f10, (DSW2.y - f11) + NjR);
        if (NjR > 0.0f) {
            RectF rectF3 = this.Sg;
            float f18 = DSW2.x;
            float f19 = DSW2.y;
            float f20 = NjR * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.YFl.arcTo(this.Sg, 180.0f, 90.0f, false);
        }
        this.YFl.lineTo((DSW2.x + f10) - NjR, DSW2.y - f11);
        if (NjR > 0.0f) {
            RectF rectF4 = this.Sg;
            float f21 = DSW2.x;
            float f22 = NjR * 2.0f;
            float f23 = DSW2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.YFl.arcTo(this.Sg, 270.0f, 90.0f, false);
        }
        this.YFl.close();
        this.NjR.YFl(this.YFl);
        this.eT = true;
        return this.YFl;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        Sg();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            tN tNVar = list.get(i10);
            if (tNVar instanceof wXo) {
                wXo wxo = (wXo) tNVar;
                if (wxo.Sg() == qO.YFl.SIMULTANEOUSLY) {
                    this.NjR.YFl(wxo);
                    wxo.YFl(this);
                }
            }
            if (tNVar instanceof lG) {
                this.f10167nc = ((lG) tNVar).Sg();
            }
        }
    }
}
