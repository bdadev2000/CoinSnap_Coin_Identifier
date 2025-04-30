package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class w implements j {
    private final e creator;
    private final Executor executor;
    private long nextCheck;
    private final List<u> pendingJobs;
    private final Runnable pendingRunnable;
    private final q threadPriorityHelper;
    public static final t Companion = new t(null);
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = w.class.getSimpleName();

    public w(e eVar, Executor executor, q qVar) {
        G7.j.e(eVar, "creator");
        G7.j.e(executor, "executor");
        this.creator = eVar;
        this.executor = executor;
        this.threadPriorityHelper = qVar;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new v(new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j7 = Long.MAX_VALUE;
            for (u uVar : this.pendingJobs) {
                if (uptimeMillis >= uVar.getUptimeMillis()) {
                    this.pendingJobs.remove(uVar);
                    g info = uVar.getInfo();
                    if (info != null) {
                        this.executor.execute(new i(info, this.creator, this, this.threadPriorityHelper));
                    }
                } else {
                    j7 = Math.min(j7, uVar.getUptimeMillis());
                }
            }
            if (j7 != Long.MAX_VALUE && j7 != this.nextCheck) {
                Handler handler2 = handler;
                handler2.removeCallbacks(this.pendingRunnable);
                handler2.postAtTime(this.pendingRunnable, TAG, j7);
            }
            this.nextCheck = j7;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.task.j
    public synchronized void cancelPendingJob(String str) {
        String str2;
        try {
            G7.j.e(str, "tag");
            ArrayList arrayList = new ArrayList();
            for (u uVar : this.pendingJobs) {
                g info = uVar.getInfo();
                if (info != null) {
                    str2 = info.getJobTag();
                } else {
                    str2 = null;
                }
                if (G7.j.a(str2, str)) {
                    arrayList.add(uVar);
                }
            }
            this.pendingJobs.removeAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.task.j
    public synchronized void execute(g gVar) {
        String str;
        try {
            G7.j.e(gVar, "jobInfo");
            g copy = gVar.copy();
            if (copy != null) {
                String jobTag = copy.getJobTag();
                long delay = copy.getDelay();
                copy.setDelay(0L);
                if (copy.getUpdateCurrent()) {
                    for (u uVar : this.pendingJobs) {
                        g info = uVar.getInfo();
                        if (info != null) {
                            str = info.getJobTag();
                        } else {
                            str = null;
                        }
                        if (G7.j.a(str, jobTag)) {
                            com.vungle.ads.internal.util.u uVar2 = com.vungle.ads.internal.util.v.Companion;
                            String str2 = TAG;
                            G7.j.d(str2, "TAG");
                            uVar2.d(str2, "replacing pending job with new " + jobTag);
                            this.pendingJobs.remove(uVar);
                        }
                    }
                }
                this.pendingJobs.add(new u(SystemClock.uptimeMillis() + delay, copy));
                executePendingJobs();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
