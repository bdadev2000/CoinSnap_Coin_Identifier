package com.bytedance.adsdk.Sg.vc;

import android.view.Choreographer;
import com.bytedance.adsdk.Sg.DSW;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;

/* loaded from: classes.dex */
public class tN extends YFl implements Choreographer.FrameCallback {

    /* renamed from: nc, reason: collision with root package name */
    private DSW f10218nc;
    private float Sg = 1.0f;
    private boolean tN = false;
    private long AlY = 0;
    private float wN = 0.0f;

    /* renamed from: vc, reason: collision with root package name */
    private float f10219vc = 0.0f;
    private int DSW = 0;
    private float qsH = -2.1474836E9f;
    private float NjR = 2.1474836E9f;
    protected boolean YFl = false;
    private boolean eT = false;

    private boolean aIu() {
        return nc() < 0.0f;
    }

    private float qO() {
        DSW dsw = this.f10218nc;
        if (dsw == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dsw.YoT()) / Math.abs(this.Sg);
    }

    private void wXo() {
        if (this.f10218nc == null) {
            return;
        }
        float f10 = this.f10219vc;
        if (f10 >= this.qsH && f10 <= this.NjR) {
        } else {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.qsH), Float.valueOf(this.NjR), Float.valueOf(this.f10219vc)));
        }
    }

    @MainThread
    public void AlY(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.YFl = false;
        }
    }

    public float DSW() {
        return this.f10219vc;
    }

    public float EH() {
        DSW dsw = this.f10218nc;
        if (dsw == null) {
            return 0.0f;
        }
        float f10 = this.qsH;
        if (f10 == -2.1474836E9f) {
            return dsw.vc();
        }
        return f10;
    }

    @MainThread
    public void GA() {
        Wwa();
        AlY();
    }

    public void NjR() {
        tN(-nc());
    }

    public void Sg(float f10) {
        YFl(this.qsH, f10);
    }

    @MainThread
    public void Wwa() {
        AlY(true);
    }

    public void YFl(DSW dsw) {
        boolean z10 = this.f10218nc == null;
        this.f10218nc = dsw;
        if (z10) {
            YFl(Math.max(this.qsH, dsw.vc()), Math.min(this.NjR, dsw.DSW()));
        } else {
            YFl((int) dsw.vc(), (int) dsw.DSW());
        }
        float f10 = this.f10219vc;
        this.f10219vc = 0.0f;
        this.wN = 0.0f;
        YFl((int) f10);
        tN();
    }

    @MainThread
    public void YoT() {
        Wwa();
        Sg(aIu());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        Sg();
        Wwa();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j3) {
        float EH;
        float rkt;
        lG();
        if (this.f10218nc != null && isRunning()) {
            com.bytedance.adsdk.Sg.wN.YFl("LottieValueAnimator#doFrame");
            long j10 = this.AlY;
            long j11 = 0;
            if (j10 != 0) {
                j11 = j3 - j10;
            }
            float qO = ((float) j11) / qO();
            float f10 = this.wN;
            if (aIu()) {
                qO = -qO;
            }
            float f11 = f10 + qO;
            boolean z10 = !wN.tN(f11, EH(), rkt());
            float f12 = this.wN;
            float Sg = wN.Sg(f11, EH(), rkt());
            this.wN = Sg;
            if (this.eT) {
                Sg = (float) Math.floor(Sg);
            }
            this.f10219vc = Sg;
            this.AlY = j3;
            if (!this.eT || this.wN != f12) {
                tN();
            }
            if (z10) {
                if (getRepeatCount() != -1 && this.DSW >= getRepeatCount()) {
                    if (this.Sg < 0.0f) {
                        rkt = EH();
                    } else {
                        rkt = rkt();
                    }
                    this.wN = rkt;
                    this.f10219vc = rkt;
                    Wwa();
                    Sg(aIu());
                } else {
                    YFl();
                    this.DSW++;
                    if (getRepeatMode() == 2) {
                        this.tN = !this.tN;
                        NjR();
                    } else {
                        if (aIu()) {
                            EH = rkt();
                        } else {
                            EH = EH();
                        }
                        this.wN = EH;
                        this.f10219vc = EH;
                    }
                    this.AlY = j3;
                }
            }
            wXo();
            com.bytedance.adsdk.Sg.wN.Sg("LottieValueAnimator#doFrame");
        }
    }

    @MainThread
    public void eT() {
        float EH;
        this.YFl = true;
        YFl(aIu());
        if (aIu()) {
            EH = rkt();
        } else {
            EH = EH();
        }
        YFl((int) EH);
        this.AlY = 0L;
        this.DSW = 0;
        lG();
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float EH;
        float rkt;
        float EH2;
        if (this.f10218nc == null) {
            return 0.0f;
        }
        if (aIu()) {
            EH = rkt() - this.f10219vc;
            rkt = rkt();
            EH2 = EH();
        } else {
            EH = this.f10219vc - EH();
            rkt = rkt();
            EH2 = EH();
        }
        return EH / (rkt - EH2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(vc());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        if (this.f10218nc == null) {
            return 0L;
        }
        return r0.wN();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.YFl;
    }

    public void lG() {
        if (isRunning()) {
            AlY(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public float nc() {
        return this.Sg;
    }

    @MainThread
    public void pDU() {
        this.YFl = true;
        lG();
        this.AlY = 0L;
        if (aIu() && DSW() == EH()) {
            YFl(rkt());
        } else if (!aIu() && DSW() == rkt()) {
            YFl(EH());
        }
        wN();
    }

    public void qsH() {
        this.f10218nc = null;
        this.qsH = -2.1474836E9f;
        this.NjR = 2.1474836E9f;
    }

    public float rkt() {
        DSW dsw = this.f10218nc;
        if (dsw == null) {
            return 0.0f;
        }
        float f10 = this.NjR;
        if (f10 == 2.1474836E9f) {
            return dsw.DSW();
        }
        return f10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.tN) {
            this.tN = false;
            NjR();
        }
    }

    public void tN(boolean z10) {
        this.eT = z10;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float vc() {
        DSW dsw = this.f10218nc;
        if (dsw == null) {
            return 0.0f;
        }
        return (this.f10219vc - dsw.vc()) / (this.f10218nc.DSW() - this.f10218nc.vc());
    }

    @Override // com.bytedance.adsdk.Sg.vc.YFl
    public void Sg() {
        super.Sg();
        Sg(aIu());
    }

    public void tN(float f10) {
        this.Sg = f10;
    }

    public void YFl(float f10) {
        if (this.wN == f10) {
            return;
        }
        float Sg = wN.Sg(f10, EH(), rkt());
        this.wN = Sg;
        if (this.eT) {
            Sg = (float) Math.floor(Sg);
        }
        this.f10219vc = Sg;
        this.AlY = 0L;
        tN();
    }

    public void YFl(int i10) {
        YFl(i10, (int) this.NjR);
    }

    public void YFl(float f10, float f11) {
        if (f10 <= f11) {
            DSW dsw = this.f10218nc;
            float vc2 = dsw == null ? -3.4028235E38f : dsw.vc();
            DSW dsw2 = this.f10218nc;
            float DSW = dsw2 == null ? Float.MAX_VALUE : dsw2.DSW();
            float Sg = wN.Sg(f10, vc2, DSW);
            float Sg2 = wN.Sg(f11, vc2, DSW);
            if (Sg == this.qsH && Sg2 == this.NjR) {
                return;
            }
            this.qsH = Sg;
            this.NjR = Sg2;
            YFl((int) wN.Sg(this.f10219vc, Sg, Sg2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
