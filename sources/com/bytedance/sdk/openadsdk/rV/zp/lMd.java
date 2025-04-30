package com.bytedance.sdk.openadsdk.rV.zp;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.woN;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class lMd {
    private final AtomicBoolean COT;
    private final int HWF;
    protected final AtomicBoolean KS;
    private final Integer QR;
    private final int YW;
    private final AtomicLong jU;
    private volatile boolean ku = false;
    protected woN lMd;
    protected WeakReference<View> zp;

    public lMd(Integer num, View view, woN won, int i9, int i10) {
        this.QR = num;
        this.HWF = i9;
        this.lMd = won;
        this.YW = i10;
        zp(view);
        this.KS = new AtomicBoolean(false);
        this.jU = new AtomicLong(-1L);
        this.COT = new AtomicBoolean(false);
    }

    public static lMd zp(boolean z8, Integer num, View view, woN won, int i9) {
        return z8 ? new ku(num, view, won, i9) : new KS(num, view, won, i9);
    }

    public Integer Bj() {
        return this.QR;
    }

    public zp COT() {
        WeakReference<View> weakReference = this.zp;
        if (weakReference == null) {
            return new zp(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new zp(0, 0, 0.0f);
        }
        return new zp(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public abstract int HWF();

    public abstract boolean KS();

    public void QR() {
        if (YW()) {
            return;
        }
        if (!this.KS.get()) {
            ku();
        } else if (!this.jU.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.jU.get() >= this.HWF) {
            jU();
        }
    }

    public boolean YW() {
        return this.COT.get();
    }

    public void dT() {
        this.ku = true;
        QR.lMd(this);
    }

    public void jU() {
        if (this.COT.compareAndSet(false, true)) {
            jU.zp(this.lMd, COT(), this.YW);
        }
    }

    public void ku() {
        this.jU.set(-1L);
    }

    public int lMd() {
        if (YW()) {
            return 1;
        }
        WeakReference<View> weakReference = this.zp;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.ku) {
            return 3;
        }
        if (Bj().equals(view.getTag(33554433))) {
            return (Bj().equals(view.getTag(33554433)) && KS()) ? 1 : 2;
        }
        dT();
        COT.lMd(Bj());
        return 3;
    }

    public abstract void lMd(int i9);

    public void tG() {
        this.KS.set(false);
        ku();
    }

    public boolean vDp() {
        return this.KS.get();
    }

    public void zp() {
        if (this.KS.compareAndSet(false, true)) {
            QR.zp(this);
        }
    }

    public void zp(int i9) {
        if (i9 == 4) {
            zp();
            return;
        }
        if (i9 == 8) {
            tG();
        } else if (i9 == 9) {
            jU();
        } else {
            lMd(i9);
        }
    }

    public void zp(View view) {
        if (view != null) {
            view.setTag(33554433, Bj());
        }
        this.zp = new WeakReference<>(view);
    }
}
