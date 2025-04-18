package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
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

    public w(e creator, Executor executor, q qVar) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.creator = creator;
        this.executor = executor;
        this.threadPriorityHelper = qVar;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new v(new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = Long.MAX_VALUE;
        for (u uVar : this.pendingJobs) {
            if (uptimeMillis >= uVar.getUptimeMillis()) {
                this.pendingJobs.remove(uVar);
                g info = uVar.getInfo();
                if (info != null) {
                    this.executor.execute(new i(info, this.creator, this, this.threadPriorityHelper));
                }
            } else {
                j3 = Math.min(j3, uVar.getUptimeMillis());
            }
        }
        if (j3 != Long.MAX_VALUE && j3 != this.nextCheck) {
            Handler handler2 = handler;
            handler2.removeCallbacks(this.pendingRunnable);
            handler2.postAtTime(this.pendingRunnable, TAG, j3);
        }
        this.nextCheck = j3;
    }

    @Override // com.vungle.ads.internal.task.j
    public synchronized void cancelPendingJob(String tag) {
        String str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.pendingJobs) {
            g info = uVar.getInfo();
            if (info != null) {
                str = info.getJobTag();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, tag)) {
                arrayList.add(uVar);
            }
        }
        this.pendingJobs.removeAll(arrayList);
    }

    @Override // com.vungle.ads.internal.task.j
    public synchronized void execute(g jobInfo) {
        String str;
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        g copy = jobInfo.copy();
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
                    if (Intrinsics.areEqual(str, jobTag)) {
                        com.vungle.ads.internal.util.u uVar2 = com.vungle.ads.internal.util.v.Companion;
                        String TAG2 = TAG;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        uVar2.d(TAG2, "replacing pending job with new " + jobTag);
                        this.pendingJobs.remove(uVar);
                    }
                }
            }
            this.pendingJobs.add(new u(SystemClock.uptimeMillis() + delay, copy));
            executePendingJobs();
        }
    }

    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
