package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import com.bytedance.adsdk.Sg.tN.Sg.qO;
import java.util.List;

/* loaded from: classes.dex */
public class vc implements YFl.InterfaceC0054YFl, GA, eT {
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, PointF> AlY;
    private final String Sg;
    private boolean qsH;
    private final com.bytedance.adsdk.Sg.NjR tN;

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.tN.Sg.Sg f10182vc;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, PointF> wN;
    private final Path YFl = new Path();
    private final Sg DSW = new Sg();

    public vc(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.Sg sg2) {
        this.Sg = sg2.YFl();
        this.tN = njR;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl = sg2.tN().YFl();
        this.AlY = YFl;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl2 = sg2.Sg().YFl();
        this.wN = YFl2;
        this.f10182vc = sg2;
        yFl.YFl(YFl);
        yFl.YFl(YFl2);
        YFl.YFl(this);
        YFl2.YFl(this);
    }

    private void Sg() {
        this.qsH = false;
        this.tN.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.GA
    public Path AlY() {
        if (this.qsH) {
            return this.YFl;
        }
        this.YFl.reset();
        if (this.f10182vc.wN()) {
            this.qsH = true;
            return this.YFl;
        }
        PointF DSW = this.AlY.DSW();
        float f10 = DSW.x / 2.0f;
        float f11 = DSW.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.YFl.reset();
        if (this.f10182vc.AlY()) {
            float f14 = -f11;
            this.YFl.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.YFl.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.YFl.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.YFl.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.YFl.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.YFl.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.YFl.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.YFl.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.YFl.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.YFl.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF DSW2 = this.wN.DSW();
        this.YFl.offset(DSW2.x, DSW2.y);
        this.YFl.close();
        this.DSW.YFl(this.YFl);
        this.qsH = true;
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
                    this.DSW.YFl(wxo);
                    wxo.YFl(this);
                }
            }
        }
    }
}
