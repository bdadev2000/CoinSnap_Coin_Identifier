package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class zp implements Application.ActivityLifecycleCallbacks {
    public static long KS = 0;
    public static long lMd = 0;
    public static boolean zp = false;
    private volatile WeakReference<Activity> tG;
    private final AtomicBoolean jU = new AtomicBoolean(false);
    private final RunnableC0127zp COT = new RunnableC0127zp();
    private final jU HWF = new jU();
    private final KS QR = new KS();
    private final lMd ku = new lMd();
    private int YW = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.zp>> dT = new CopyOnWriteArrayList<>();
    private HandlerThread Bj = null;
    private Handler vDp = null;
    private final LinkedList<Activity> rV = new LinkedList<>();

    /* loaded from: classes.dex */
    public class COT implements Runnable {
        private long KS;
        private boolean jU;
        private long lMd;

        public COT(long j7, long j9, boolean z8) {
            this.lMd = j7;
            this.KS = j9;
            this.jU = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.jU) {
                com.bytedance.sdk.openadsdk.dT.KS.zp().zp(this.lMd / 1000, this.KS / 1000);
            }
            zp.this.jU();
        }
    }

    /* loaded from: classes.dex */
    public class KS implements Runnable {
        public KS() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler lMd = com.bytedance.sdk.openadsdk.core.tG.lMd();
                Message obtain = Message.obtain(lMd, zp.this.COT);
                obtain.what = 1001;
                lMd.sendMessageDelayed(obtain, 30000L);
            }
        }
    }

    /* loaded from: classes.dex */
    public class jU implements Runnable {
        public jU() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.tG.lMd().removeMessages(1001);
            if (com.bytedance.sdk.openadsdk.core.KVG.zp() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.HWF.zp.lMd();
        }
    }

    /* loaded from: classes.dex */
    public static class lMd implements Runnable {
        private lMd() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!com.bytedance.sdk.openadsdk.core.settings.dQp.etV().Fm().zp() && com.bytedance.sdk.component.utils.KVG.ku(com.bytedance.sdk.openadsdk.core.KVG.zp())) {
                com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(com.bytedance.sdk.openadsdk.core.Bj.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()));
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0127zp implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            QUv.KS(new com.bytedance.sdk.component.ku.ku("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.zp.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public zp() {
        KS();
    }

    private void KS() {
        HandlerThread handlerThread = new HandlerThread("lifecycle", 10);
        this.Bj = handlerThread;
        handlerThread.start();
        this.vDp = new Handler(this.Bj.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jU() {
        com.bytedance.sdk.openadsdk.lMd.zp.zp.zp();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.rV.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.dT != null && this.dT.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.zp>> it = this.dT.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.zp> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().zp(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.tG != null && this.tG.get() == activity) {
            this.tG = null;
        }
        this.rV.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i9 = this.YW - 1;
        this.YW = i9;
        if (i9 < 0) {
            this.YW = 0;
        }
        if (ApmHelper.isIsInit()) {
            zp(this.QR);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        zp(this.HWF);
        if (!zp) {
            lMd = System.currentTimeMillis();
            zp = true;
        }
        this.tG = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.YW++;
        this.vDp.removeCallbacks(this.ku);
        if (this.jU.get()) {
            zp(this.ku);
        }
        this.jU.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.YW <= 0) {
            this.jU.set(true);
        }
        if (zp()) {
            zp = false;
            com.bytedance.sdk.openadsdk.core.tG.lMd.set(false);
            KS = System.currentTimeMillis();
            zp(this.ku);
        }
        zp(new COT(lMd, KS, zp()));
    }

    private void zp(Runnable runnable) {
        if (!this.Bj.isAlive()) {
            KS();
        }
        this.vDp.postDelayed(runnable, 1000L);
    }

    public boolean lMd(com.bytedance.sdk.component.adexpress.zp zpVar) {
        return this.dT.remove(new WeakReference(zpVar));
    }

    public Activity lMd() {
        if (this.rV.isEmpty()) {
            return null;
        }
        return this.rV.getFirst();
    }

    public void zp(com.bytedance.sdk.component.adexpress.zp zpVar) {
        this.dT.add(new WeakReference<>(zpVar));
    }

    public boolean zp() {
        return this.jU.get();
    }

    public boolean zp(boolean z8) {
        Activity activity;
        Window window;
        return (this.tG == null || (activity = this.tG.get()) == null || (window = activity.getWindow()) == null) ? z8 : window.getDecorView().hasWindowFocus();
    }
}
