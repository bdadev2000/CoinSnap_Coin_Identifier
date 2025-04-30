package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;

/* loaded from: classes3.dex */
public final class i extends l {
    public static final h Companion = new h(null);
    private static final String TAG = i.class.getSimpleName();
    private final e creator;
    private final j jobRunner;
    private final g jobinfo;
    private final q threadPriorityHelper;

    public i(g gVar, e eVar, j jVar, q qVar) {
        G7.j.e(gVar, "jobinfo");
        G7.j.e(eVar, "creator");
        G7.j.e(jVar, "jobRunner");
        this.jobinfo = gVar;
        this.creator = eVar;
        this.jobRunner = jVar;
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
                String str = TAG;
                G7.j.d(str, "TAG");
                uVar.d(str, "Setting process thread prio = " + makeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                com.vungle.ads.internal.util.u uVar2 = com.vungle.ads.internal.util.v.Companion;
                String str2 = TAG;
                G7.j.d(str2, "TAG");
                uVar2.e(str2, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            com.vungle.ads.internal.util.u uVar3 = com.vungle.ads.internal.util.v.Companion;
            String str3 = TAG;
            G7.j.d(str3, "TAG");
            uVar3.d(str3, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int onRunJob = ((s) this.creator).create(jobTag).onRunJob(extras, this.jobRunner);
            G7.j.d(str3, "TAG");
            uVar3.d(str3, "On job finished " + jobTag + " with result " + onRunJob);
            if (onRunJob == 2) {
                long makeNextRescedule = this.jobinfo.makeNextRescedule();
                if (makeNextRescedule > 0) {
                    this.jobinfo.setDelay(makeNextRescedule);
                    ((w) this.jobRunner).execute(this.jobinfo);
                    G7.j.d(str3, "TAG");
                    uVar3.d(str3, "Rescheduling " + jobTag + " in " + makeNextRescedule);
                }
            }
        } catch (Exception e4) {
            com.vungle.ads.internal.util.u uVar4 = com.vungle.ads.internal.util.v.Companion;
            String str4 = TAG;
            G7.j.d(str4, "TAG");
            uVar4.e(str4, "Cannot create job" + e4.getLocalizedMessage());
        }
    }
}
