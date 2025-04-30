package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class HWF implements Bj, Runnable {
    private long COT;
    private boolean HWF;
    private final zp QR;
    private long jU;
    private boolean ku;
    private final Activity lMd;
    private final AtomicBoolean YW = new AtomicBoolean(false);
    private final Handler KS = new Handler(Looper.getMainLooper());
    private View zp = jU();

    /* loaded from: classes.dex */
    public interface zp {
        void lMd();

        View zp();
    }

    private HWF(Activity activity, int i9, zp zpVar) {
        this.QR = zpVar;
        this.lMd = activity;
        this.jU = i9;
    }

    private void COT() {
        this.ku = false;
        this.COT = SystemClock.elapsedRealtime();
        Handler handler = this.KS;
        if (handler != null) {
            handler.postDelayed(this, this.jU);
        }
    }

    private void HWF() {
        Activity activity;
        View childAt;
        if (this.HWF || (activity = this.lMd) == null || activity.isFinishing() || this.lMd.isDestroyed()) {
            return;
        }
        if (this.zp == null) {
            this.zp = jU();
        }
        View view = this.zp;
        if (view != null) {
            if (lMd(view)) {
                zp(this.zp);
                View view2 = this.zp;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.zp).getChildAt(0)) != null && lMd(childAt)) {
                    zp(childAt);
                }
                zp zpVar = this.QR;
                if (zpVar != null) {
                    zpVar.lMd();
                }
            }
            QR();
        }
        this.HWF = true;
    }

    private void QR() {
        ViewParent parent = this.zp.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.zp) != r0.getChildCount() - 1) {
                this.zp.bringToFront();
            }
        }
    }

    private View jU() {
        zp zpVar = this.QR;
        if (zpVar != null) {
            return zpVar.zp();
        }
        return null;
    }

    public static Bj zp(Activity activity, zp zpVar) {
        int PI = com.bytedance.sdk.openadsdk.core.settings.dQp.etV().PI();
        if (PI < 0) {
            return new Bj() { // from class: com.bytedance.sdk.openadsdk.utils.HWF.1
                @Override // com.bytedance.sdk.openadsdk.utils.Bj
                public void KS() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.Bj
                public void lMd() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.Bj
                public void zp() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.Bj
                public void zp(long j7) {
                }
            };
        }
        return new HWF(activity, Math.min(PI, 50) * 1000, zpVar);
    }

    @Override // com.bytedance.sdk.openadsdk.utils.Bj
    public void KS() {
        if (this.HWF) {
            return;
        }
        this.HWF = true;
        Handler handler = this.KS;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.Bj
    public void lMd() {
        if (this.COT <= 0 || this.HWF) {
            return;
        }
        if (!this.ku) {
            this.jU -= SystemClock.elapsedRealtime() - this.COT;
        }
        this.ku = true;
        if (this.jU <= 0) {
            HWF();
            return;
        }
        Handler handler = this.KS;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        HWF();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.Bj
    public void zp(long j7) {
        if (this.YW.compareAndSet(false, true)) {
            if (j7 < 0) {
                j7 = 0;
            }
            this.jU += j7;
            COT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.Bj
    public void zp() {
        if (this.COT == 0 || !this.ku) {
            return;
        }
        COT();
    }

    private void zp(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean lMd(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
