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
public class vc implements eT, Runnable {
    private long AlY;
    private final YFl DSW;
    private final Activity Sg;
    private boolean qsH;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10838vc;
    private long wN;
    private final AtomicBoolean NjR = new AtomicBoolean(false);
    private final Handler tN = new Handler(Looper.getMainLooper());
    private View YFl = AlY();

    /* loaded from: classes.dex */
    public interface YFl {
        void Sg();

        View YFl();
    }

    private vc(Activity activity, int i10, YFl yFl) {
        this.DSW = yFl;
        this.Sg = activity;
        this.AlY = i10;
    }

    private View AlY() {
        YFl yFl = this.DSW;
        if (yFl != null) {
            return yFl.YFl();
        }
        return null;
    }

    private void DSW() {
        ViewParent parent = this.YFl.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.YFl) != r0.getChildCount() - 1) {
                this.YFl.bringToFront();
            }
        }
    }

    public static eT YFl(Activity activity, YFl yFl) {
        int Af = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().Af();
        if (Af < 0) {
            return new eT() { // from class: com.bytedance.sdk.openadsdk.utils.vc.1
                @Override // com.bytedance.sdk.openadsdk.utils.eT
                public void Sg() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.eT
                public void YFl() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.eT
                public void tN() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.eT
                public void YFl(long j3) {
                }
            };
        }
        return new vc(activity, Math.min(Af, 50) * 1000, yFl);
    }

    private void vc() {
        Activity activity;
        View childAt;
        if (this.f10838vc || (activity = this.Sg) == null || activity.isFinishing() || this.Sg.isDestroyed()) {
            return;
        }
        if (this.YFl == null) {
            this.YFl = AlY();
        }
        View view = this.YFl;
        if (view != null) {
            if (Sg(view)) {
                YFl(this.YFl);
                View view2 = this.YFl;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.YFl).getChildAt(0)) != null && Sg(childAt)) {
                    YFl(childAt);
                }
                YFl yFl = this.DSW;
                if (yFl != null) {
                    yFl.Sg();
                }
            }
            DSW();
        }
        this.f10838vc = true;
    }

    private void wN() {
        this.qsH = false;
        this.wN = SystemClock.elapsedRealtime();
        Handler handler = this.tN;
        if (handler != null) {
            handler.postDelayed(this, this.AlY);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.eT
    public void Sg() {
        if (this.wN <= 0 || this.f10838vc) {
            return;
        }
        if (!this.qsH) {
            this.AlY -= SystemClock.elapsedRealtime() - this.wN;
        }
        this.qsH = true;
        if (this.AlY <= 0) {
            vc();
            return;
        }
        Handler handler = this.tN;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        vc();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.eT
    public void tN() {
        if (this.f10838vc) {
            return;
        }
        this.f10838vc = true;
        Handler handler = this.tN;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.eT
    public void YFl(long j3) {
        if (this.NjR.compareAndSet(false, true)) {
            if (j3 < 0) {
                j3 = 0;
            }
            this.AlY += j3;
            wN();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.eT
    public void YFl() {
        if (this.wN == 0 || !this.qsH) {
            return;
        }
        wN();
    }

    private void YFl(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean Sg(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
