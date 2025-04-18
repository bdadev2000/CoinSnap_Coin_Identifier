package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends l {
    public static final h Companion = new h(null);
    private static final String TAG = i.class.getSimpleName();
    private final e creator;
    private final j jobRunner;
    private final g jobinfo;
    private final q threadPriorityHelper;

    public i(g jobinfo, e creator, j jobRunner, q qVar) {
        Intrinsics.checkNotNullParameter(jobinfo, "jobinfo");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = qVar;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    @Override // com.vungle.ads.internal.task.l
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        q qVar = this.threadPriorityHelper;
        if (qVar != null) {
            try {
                int makeAndroidThreadPriority = ((k) qVar).makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(makeAndroidThreadPriority);
                com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                uVar.d(TAG2, "Setting process thread prio = " + makeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                com.vungle.ads.internal.util.u uVar2 = com.vungle.ads.internal.util.v.Companion;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                uVar2.e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            com.vungle.ads.internal.util.u uVar3 = com.vungle.ads.internal.util.v.Companion;
            String TAG4 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            uVar3.d(TAG4, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int onRunJob = ((s) this.creator).create(jobTag).onRunJob(extras, this.jobRunner);
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            uVar3.d(TAG4, "On job finished " + jobTag + " with result " + onRunJob);
            if (onRunJob == 2) {
                long makeNextRescedule = this.jobinfo.makeNextRescedule();
                if (makeNextRescedule > 0) {
                    this.jobinfo.setDelay(makeNextRescedule);
                    ((w) this.jobRunner).execute(this.jobinfo);
                    Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    uVar3.d(TAG4, "Rescheduling " + jobTag + " in " + makeNextRescedule);
                }
            }
        } catch (Exception e2) {
            com.vungle.ads.internal.util.u uVar4 = com.vungle.ads.internal.util.v.Companion;
            String TAG5 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            uVar4.e(TAG5, "Cannot create job" + e2.getLocalizedMessage());
        }
    }
}
