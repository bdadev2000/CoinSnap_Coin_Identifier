package com.bytedance.sdk.component.adexpress.AlY;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AlY {
    public static void Sg(com.bytedance.sdk.component.qsH.qsH qsh, int i10) {
        ExecutorService executorService;
        if (qsh == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.YFl.YFl.tN tN = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN();
        if (tN != null) {
            executorService = tN.GA();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            qsh.setPriority(i10);
            executorService.execute(qsh);
        } else {
            com.bytedance.sdk.component.qsH.vc.YFl(qsh);
        }
    }

    public static void YFl(com.bytedance.sdk.component.qsH.qsH qsh, int i10) {
        if (qsh == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.YFl.YFl.tN tN = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN();
        ExecutorService pDU = tN != null ? tN.pDU() : null;
        if (pDU != null) {
            qsh.setPriority(i10);
            pDU.execute(qsh);
        } else {
            com.bytedance.sdk.component.qsH.vc.YFl(qsh, i10);
        }
    }

    public static ScheduledFuture YFl(Runnable runnable, long j3, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.qsH.vc.vc().schedule(runnable, j3, timeUnit);
    }
}
