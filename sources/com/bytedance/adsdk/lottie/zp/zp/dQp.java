package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.KS.lMd.pvr;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.List;

/* loaded from: classes.dex */
public class dQp implements zp.InterfaceC0063zp, Bj, tG {
    private boolean Bj;
    private final com.bytedance.adsdk.lottie.ku COT;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, PointF> HWF;
    private final String KS;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, PointF> QR;
    private final boolean jU;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> ku;
    private final Path zp = new Path();
    private final RectF lMd = new RectF();
    private final lMd YW = new lMd();
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> dT = null;

    public dQp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.Bj bj) {
        this.KS = bj.zp();
        this.jU = bj.COT();
        this.COT = kuVar;
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp = bj.jU().zp();
        this.HWF = zp;
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp2 = bj.KS().zp();
        this.QR = zp2;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp3 = bj.lMd().zp();
        this.ku = zp3;
        zpVar.zp(zp);
        zpVar.zp(zp2);
        zpVar.zp(zp3);
        zp.zp(this);
        zp2.zp(this);
        zp3.zp(this);
    }

    private void lMd() {
        this.Bj = false;
        this.COT.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.tG
    public Path jU() {
        float YW;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zpVar;
        if (this.Bj) {
            return this.zp;
        }
        this.zp.reset();
        if (this.jU) {
            this.Bj = true;
            return this.zp;
        }
        PointF QR = this.QR.QR();
        float f9 = QR.x / 2.0f;
        float f10 = QR.y / 2.0f;
        com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> zpVar2 = this.ku;
        if (zpVar2 == null) {
            YW = 0.0f;
        } else {
            YW = ((com.bytedance.adsdk.lottie.zp.lMd.jU) zpVar2).YW();
        }
        if (YW == 0.0f && (zpVar = this.dT) != null) {
            YW = Math.min(zpVar.QR().floatValue(), Math.min(f9, f10));
        }
        float min = Math.min(f9, f10);
        if (YW > min) {
            YW = min;
        }
        PointF QR2 = this.HWF.QR();
        this.zp.moveTo(QR2.x + f9, (QR2.y - f10) + YW);
        this.zp.lineTo(QR2.x + f9, (QR2.y + f10) - YW);
        if (YW > 0.0f) {
            RectF rectF = this.lMd;
            float f11 = QR2.x;
            float f12 = YW * 2.0f;
            float f13 = QR2.y;
            rectF.set((f11 + f9) - f12, (f13 + f10) - f12, f11 + f9, f13 + f10);
            this.zp.arcTo(this.lMd, 0.0f, 90.0f, false);
        }
        this.zp.lineTo((QR2.x - f9) + YW, QR2.y + f10);
        if (YW > 0.0f) {
            RectF rectF2 = this.lMd;
            float f14 = QR2.x;
            float f15 = QR2.y;
            float f16 = YW * 2.0f;
            rectF2.set(f14 - f9, (f15 + f10) - f16, (f14 - f9) + f16, f15 + f10);
            this.zp.arcTo(this.lMd, 90.0f, 90.0f, false);
        }
        this.zp.lineTo(QR2.x - f9, (QR2.y - f10) + YW);
        if (YW > 0.0f) {
            RectF rectF3 = this.lMd;
            float f17 = QR2.x;
            float f18 = QR2.y;
            float f19 = YW * 2.0f;
            rectF3.set(f17 - f9, f18 - f10, (f17 - f9) + f19, (f18 - f10) + f19);
            this.zp.arcTo(this.lMd, 180.0f, 90.0f, false);
        }
        this.zp.lineTo((QR2.x + f9) - YW, QR2.y - f10);
        if (YW > 0.0f) {
            RectF rectF4 = this.lMd;
            float f20 = QR2.x;
            float f21 = YW * 2.0f;
            float f22 = QR2.y;
            rectF4.set((f20 + f9) - f21, f22 - f10, f20 + f9, (f22 - f10) + f21);
            this.zp.arcTo(this.lMd, 270.0f, 90.0f, false);
        }
        this.zp.close();
        this.YW.zp(this.zp);
        this.Bj = true;
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
                    this.YW.zp(fp);
                    fp.zp(this);
                }
            }
            if (ks instanceof woN) {
                this.dT = ((woN) ks).lMd();
            }
        }
    }
}
