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
public class YFl implements Application.ActivityLifecycleCallbacks {
    public static long Sg = 0;
    public static boolean YFl = false;
    public static long tN;
    private volatile WeakReference<Activity> GA;
    private final AtomicBoolean AlY = new AtomicBoolean(false);
    private final RunnableC0139YFl wN = new RunnableC0139YFl();

    /* renamed from: vc, reason: collision with root package name */
    private final AlY f10833vc = new AlY();
    private final tN DSW = new tN();
    private final Sg qsH = new Sg();
    private int NjR = 0;

    /* renamed from: nc, reason: collision with root package name */
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.YFl>> f10832nc = new CopyOnWriteArrayList<>();
    private HandlerThread eT = null;
    private Handler YoT = null;
    private final LinkedList<Activity> pDU = new LinkedList<>();

    /* loaded from: classes.dex */
    public class AlY implements Runnable {
        public AlY() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.pDU.Sg().removeMessages(1001);
            if (com.bytedance.sdk.openadsdk.core.lG.YFl() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.nc.YFl.Sg();
        }
    }

    /* loaded from: classes.dex */
    public static class Sg implements Runnable {
        private Sg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().Sg();
            com.bytedance.sdk.openadsdk.AlY.YFl.pDU Gnp = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().Gnp();
            if (Gnp != null && !Gnp.YFl() && com.bytedance.sdk.component.utils.EH.qsH(com.bytedance.sdk.openadsdk.core.lG.YFl())) {
                com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()));
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0139YFl implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            mn.tN(new com.bytedance.sdk.component.qsH.qsH("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.YFl.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class tN implements Runnable {
        public tN() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler Sg = com.bytedance.sdk.openadsdk.core.pDU.Sg();
                Message obtain = Message.obtain(Sg, YFl.this.wN);
                obtain.what = 1001;
                Sg.sendMessageDelayed(obtain, 30000L);
            }
        }
    }

    /* loaded from: classes.dex */
    public class wN implements Runnable {
        private boolean AlY;
        private long Sg;
        private long tN;

        public wN(long j3, long j10, boolean z10) {
            this.Sg = j3;
            this.tN = j10;
            this.AlY = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.AlY) {
                com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl(this.Sg / 1000, this.tN / 1000);
            }
            YFl.this.AlY();
        }
    }

    public YFl() {
        tN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY() {
        com.bytedance.sdk.openadsdk.AlY.YFl.YFl.YFl();
    }

    private void tN() {
        HandlerThread handlerThread = new HandlerThread("lifecycle", 10);
        this.eT = handlerThread;
        handlerThread.start();
        this.YoT = new Handler(this.eT.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.pDU.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f10832nc != null && this.f10832nc.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.YFl>> it = this.f10832nc.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.YFl> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().YFl(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.GA != null && this.GA.get() == activity) {
            this.GA = null;
        }
        this.pDU.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i10 = this.NjR - 1;
        this.NjR = i10;
        if (i10 < 0) {
            this.NjR = 0;
        }
        if (ApmHelper.isIsInit()) {
            YFl(this.DSW);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        YFl(this.f10833vc);
        if (!YFl) {
            Sg = System.currentTimeMillis();
            YFl = true;
        }
        this.GA = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.NjR++;
        this.YoT.removeCallbacks(this.qsH);
        if (this.AlY.get()) {
            YFl(this.qsH);
        }
        this.AlY.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.NjR <= 0) {
            this.AlY.set(true);
        }
        if (YFl()) {
            YFl = false;
            com.bytedance.sdk.openadsdk.core.pDU.Sg.set(false);
            tN = System.currentTimeMillis();
            YFl(this.qsH);
        }
        YFl(new wN(Sg, tN, YFl()));
    }

    private void YFl(Runnable runnable) {
        if (!this.eT.isAlive()) {
            tN();
        }
        this.YoT.postDelayed(runnable, 1000L);
    }

    public boolean Sg(com.bytedance.sdk.component.adexpress.YFl yFl) {
        return this.f10832nc.remove(new WeakReference(yFl));
    }

    public Activity Sg() {
        if (this.pDU.isEmpty()) {
            return null;
        }
        return this.pDU.getFirst();
    }

    public void YFl(com.bytedance.sdk.component.adexpress.YFl yFl) {
        this.f10832nc.add(new WeakReference<>(yFl));
    }

    public boolean YFl() {
        return this.AlY.get();
    }

    public boolean YFl(boolean z10) {
        Activity activity;
        Window window;
        return (this.GA == null || (activity = this.GA.get()) == null || (window = activity.getWindow()) == null) ? z10 : window.getDecorView().hasWindowFocus();
    }
}
