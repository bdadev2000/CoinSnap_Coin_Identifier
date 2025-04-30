package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.KS.lMd.pvr;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.List;

/* loaded from: classes.dex */
public class HWF implements zp.InterfaceC0063zp, Bj, tG {
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, PointF> COT;
    private final com.bytedance.adsdk.lottie.KS.lMd.lMd HWF;
    private final com.bytedance.adsdk.lottie.ku KS;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, PointF> jU;
    private boolean ku;
    private final String lMd;
    private final Path zp = new Path();
    private final lMd QR = new lMd();

    public HWF(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.lMd lmd) {
        this.lMd = lmd.zp();
        this.KS = kuVar;
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp = lmd.KS().zp();
        this.jU = zp;
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp2 = lmd.lMd().zp();
        this.COT = zp2;
        this.HWF = lmd;
        zpVar.zp(zp);
        zpVar.zp(zp2);
        zp.zp(this);
        zp2.zp(this);
    }

    private void lMd() {
        this.ku = false;
        this.KS.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.tG
    public Path jU() {
        if (this.ku) {
            return this.zp;
        }
        this.zp.reset();
        if (this.HWF.COT()) {
            this.ku = true;
            return this.zp;
        }
        PointF QR = this.jU.QR();
        float f9 = QR.x / 2.0f;
        float f10 = QR.y / 2.0f;
        float f11 = f9 * 0.55228f;
        float f12 = 0.55228f * f10;
        this.zp.reset();
        if (this.HWF.jU()) {
            float f13 = -f10;
            this.zp.moveTo(0.0f, f13);
            float f14 = 0.0f - f11;
            float f15 = -f9;
            float f16 = 0.0f - f12;
            this.zp.cubicTo(f14, f13, f15, f16, f15, 0.0f);
            float f17 = f12 + 0.0f;
            this.zp.cubicTo(f15, f17, f14, f10, 0.0f, f10);
            float f18 = f11 + 0.0f;
            this.zp.cubicTo(f18, f10, f9, f17, f9, 0.0f);
            this.zp.cubicTo(f9, f16, f18, f13, 0.0f, f13);
        } else {
            float f19 = -f10;
            this.zp.moveTo(0.0f, f19);
            float f20 = f11 + 0.0f;
            float f21 = 0.0f - f12;
            this.zp.cubicTo(f20, f19, f9, f21, f9, 0.0f);
            float f22 = f12 + 0.0f;
            this.zp.cubicTo(f9, f22, f20, f10, 0.0f, f10);
            float f23 = 0.0f - f11;
            float f24 = -f9;
            this.zp.cubicTo(f23, f10, f24, f22, f24, 0.0f);
            this.zp.cubicTo(f24, f21, f23, f19, 0.0f, f19);
        }
        PointF QR2 = this.COT.QR();
        this.zp.offset(QR2.x, QR2.y);
        this.zp.close();
        this.QR.zp(this.zp);
        this.ku = true;
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        lMd();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            KS ks = list.get(i9);
            if (ks instanceof FP) {
                FP fp = (FP) ks;
                if (fp.lMd() == pvr.zp.SIMULTANEOUSLY) {
                    this.QR.zp(fp);
                    fp.zp(this);
                }
            }
        }
    }
}
