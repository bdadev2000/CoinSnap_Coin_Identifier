package com.bytedance.adsdk.lottie.HWF;

import android.view.Choreographer;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;

/* loaded from: classes.dex */
public class KS extends zp implements Choreographer.FrameCallback {
    private com.bytedance.adsdk.lottie.HWF dT;
    private float lMd = 1.0f;
    private boolean KS = false;
    private long jU = 0;
    private float COT = 0.0f;
    private float HWF = 0.0f;
    private int QR = 0;
    private float ku = -2.1474836E9f;
    private float YW = 2.1474836E9f;
    protected boolean zp = false;
    private boolean Bj = false;

    private void FP() {
        if (this.dT == null) {
            return;
        }
        float f9 = this.HWF;
        if (f9 >= this.ku && f9 <= this.YW) {
        } else {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.ku), Float.valueOf(this.YW), Float.valueOf(this.HWF)));
        }
    }

    private boolean cz() {
        if (dT() < 0.0f) {
            return true;
        }
        return false;
    }

    private float pvr() {
        com.bytedance.adsdk.lottie.HWF hwf = this.dT;
        if (hwf == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / hwf.ku()) / Math.abs(this.lMd);
    }

    @MainThread
    public void Bj() {
        float dQp;
        this.zp = true;
        zp(cz());
        if (cz()) {
            dQp = KVG();
        } else {
            dQp = dQp();
        }
        zp((int) dQp);
        this.jU = 0L;
        this.QR = 0;
        woN();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float HWF() {
        com.bytedance.adsdk.lottie.HWF hwf = this.dT;
        if (hwf == null) {
            return 0.0f;
        }
        return (this.HWF - hwf.HWF()) / (this.dT.QR() - this.dT.HWF());
    }

    public void KS(boolean z8) {
        this.Bj = z8;
    }

    public float KVG() {
        com.bytedance.adsdk.lottie.HWF hwf = this.dT;
        if (hwf == null) {
            return 0.0f;
        }
        float f9 = this.YW;
        if (f9 == 2.1474836E9f) {
            return hwf.QR();
        }
        return f9;
    }

    public float QR() {
        return this.HWF;
    }

    public void YW() {
        KS(-dT());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        lMd();
        vwr();
    }

    public float dQp() {
        com.bytedance.adsdk.lottie.HWF hwf = this.dT;
        if (hwf == null) {
            return 0.0f;
        }
        float f9 = this.ku;
        if (f9 == -2.1474836E9f) {
            return hwf.HWF();
        }
        return f9;
    }

    public float dT() {
        return this.lMd;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j7) {
        float dQp;
        float KVG;
        woN();
        if (this.dT != null && isRunning()) {
            com.bytedance.adsdk.lottie.COT.zp("LottieValueAnimator#doFrame");
            long j9 = this.jU;
            long j10 = 0;
            if (j9 != 0) {
                j10 = j7 - j9;
            }
            float pvr = ((float) j10) / pvr();
            float f9 = this.COT;
            if (cz()) {
                pvr = -pvr;
            }
            float f10 = f9 + pvr;
            boolean z8 = !COT.KS(f10, dQp(), KVG());
            float f11 = this.COT;
            float lMd = COT.lMd(f10, dQp(), KVG());
            this.COT = lMd;
            if (this.Bj) {
                lMd = (float) Math.floor(lMd);
            }
            this.HWF = lMd;
            this.jU = j7;
            if (!this.Bj || this.COT != f11) {
                KS();
            }
            if (z8) {
                if (getRepeatCount() != -1 && this.QR >= getRepeatCount()) {
                    if (this.lMd < 0.0f) {
                        KVG = dQp();
                    } else {
                        KVG = KVG();
                    }
                    this.COT = KVG;
                    this.HWF = KVG;
                    vwr();
                    lMd(cz());
                } else {
                    zp();
                    this.QR++;
                    if (getRepeatMode() == 2) {
                        this.KS = !this.KS;
                        YW();
                    } else {
                        if (cz()) {
                            dQp = KVG();
                        } else {
                            dQp = dQp();
                        }
                        this.COT = dQp;
                        this.HWF = dQp;
                    }
                    this.jU = j7;
                }
            }
            FP();
            com.bytedance.adsdk.lottie.COT.lMd("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float dQp;
        float KVG;
        float dQp2;
        if (this.dT == null) {
            return 0.0f;
        }
        if (cz()) {
            dQp = KVG() - this.HWF;
            KVG = KVG();
            dQp2 = dQp();
        } else {
            dQp = this.HWF - dQp();
            KVG = KVG();
            dQp2 = dQp();
        }
        return dQp / (KVG - dQp2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(HWF());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        if (this.dT == null) {
            return 0L;
        }
        return r0.COT();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.zp;
    }

    @MainThread
    public void jU(boolean z8) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z8) {
            this.zp = false;
        }
    }

    public void ku() {
        this.dT = null;
        this.ku = -2.1474836E9f;
        this.YW = 2.1474836E9f;
    }

    public void lMd(float f9) {
        zp(this.ku, f9);
    }

    @MainThread
    public void rV() {
        this.zp = true;
        woN();
        this.jU = 0L;
        if (cz() && QR() == dQp()) {
            zp(KVG());
        } else if (!cz() && QR() == KVG()) {
            zp(dQp());
        }
        COT();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i9) {
        super.setRepeatMode(i9);
        if (i9 != 2 && this.KS) {
            this.KS = false;
            YW();
        }
    }

    @MainThread
    public void tG() {
        vwr();
        jU();
    }

    @MainThread
    public void vDp() {
        vwr();
        lMd(cz());
    }

    @MainThread
    public void vwr() {
        jU(true);
    }

    public void woN() {
        if (isRunning()) {
            jU(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void zp(com.bytedance.adsdk.lottie.HWF hwf) {
        boolean z8 = this.dT == null;
        this.dT = hwf;
        if (z8) {
            zp(Math.max(this.ku, hwf.HWF()), Math.min(this.YW, hwf.QR()));
        } else {
            zp((int) hwf.HWF(), (int) hwf.QR());
        }
        float f9 = this.HWF;
        this.HWF = 0.0f;
        this.COT = 0.0f;
        zp((int) f9);
        KS();
    }

    public void KS(float f9) {
        this.lMd = f9;
    }

    @Override // com.bytedance.adsdk.lottie.HWF.zp
    public void lMd() {
        super.lMd();
        lMd(cz());
    }

    public void zp(float f9) {
        if (this.COT == f9) {
            return;
        }
        float lMd = COT.lMd(f9, dQp(), KVG());
        this.COT = lMd;
        if (this.Bj) {
            lMd = (float) Math.floor(lMd);
        }
        this.HWF = lMd;
        this.jU = 0L;
        KS();
    }

    public void zp(int i9) {
        zp(i9, (int) this.YW);
    }

    public void zp(float f9, float f10) {
        if (f9 <= f10) {
            com.bytedance.adsdk.lottie.HWF hwf = this.dT;
            float HWF = hwf == null ? -3.4028235E38f : hwf.HWF();
            com.bytedance.adsdk.lottie.HWF hwf2 = this.dT;
            float QR = hwf2 == null ? Float.MAX_VALUE : hwf2.QR();
            float lMd = COT.lMd(f9, HWF, QR);
            float lMd2 = COT.lMd(f10, HWF, QR);
            if (lMd == this.ku && lMd2 == this.YW) {
                return;
            }
            this.ku = lMd;
            this.YW = lMd2;
            zp((int) COT.lMd(this.HWF, lMd, lMd2));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f9 + ") must be <= maxFrame (" + f10 + ")");
    }
}
