package com.bytedance.sdk.openadsdk.VOe.YFl;

import android.view.View;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class Sg {
    private final AtomicLong AlY;
    private final int DSW;
    private volatile boolean NjR = false;
    protected Wwa Sg;
    protected WeakReference<View> YFl;
    private final Integer qsH;
    protected final AtomicBoolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private final wN.YFl f10519vc;
    private final AtomicBoolean wN;

    public Sg(Integer num, View view, Wwa wwa, int i10, wN.YFl yFl) {
        this.qsH = num;
        this.DSW = i10;
        this.Sg = wwa;
        this.f10519vc = yFl;
        YFl(view);
        this.tN = new AtomicBoolean(false);
        this.AlY = new AtomicLong(-1L);
        this.wN = new AtomicBoolean(false);
    }

    public static Sg YFl(boolean z10, Integer num, View view, Wwa wwa, wN.YFl yFl) {
        return z10 ? new qsH(num, view, wwa, yFl) : new tN(num, view, wwa, yFl);
    }

    public void AlY() {
        if (this.wN.compareAndSet(false, true)) {
            AlY.YFl(this.Sg, wN(), this.f10519vc);
        }
    }

    public void DSW() {
        if (NjR()) {
            return;
        }
        if (!this.tN.get()) {
            qsH();
        } else if (!this.AlY.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.AlY.get() >= this.DSW) {
            AlY();
        }
    }

    public void GA() {
        this.tN.set(false);
        qsH();
    }

    public boolean NjR() {
        return this.wN.get();
    }

    public int Sg() {
        if (NjR()) {
            return 1;
        }
        WeakReference<View> weakReference = this.YFl;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.NjR) {
            return 3;
        }
        if (eT().equals(view.getTag(33554433))) {
            return eT().equals(view.getTag(33554433)) && tN() ? 1 : 2;
        }
        nc();
        wN.Sg(eT());
        return 3;
    }

    public abstract void Sg(int i10);

    public boolean YoT() {
        return this.tN.get();
    }

    public Integer eT() {
        return this.qsH;
    }

    public void nc() {
        this.NjR = true;
        DSW.Sg(this);
    }

    public void qsH() {
        this.AlY.set(-1L);
    }

    public abstract boolean tN();

    public abstract int vc();

    public YFl wN() {
        WeakReference<View> weakReference = this.YFl;
        if (weakReference == null) {
            return new YFl(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new YFl(0, 0, 0.0f);
        }
        return new YFl(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void YFl() {
        if (this.tN.compareAndSet(false, true)) {
            DSW.YFl(this);
        }
    }

    public void YFl(int i10) {
        if (i10 == 4) {
            YFl();
            return;
        }
        if (i10 == 8) {
            GA();
        } else if (i10 == 9) {
            AlY();
        } else {
            Sg(i10);
        }
    }

    public void YFl(View view) {
        if (view != null) {
            view.setTag(33554433, eT());
        }
        this.YFl = new WeakReference<>(view);
    }
}
