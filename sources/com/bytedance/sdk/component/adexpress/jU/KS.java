package com.bytedance.sdk.component.adexpress.jU;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class KS {
    public static void lMd(com.bytedance.sdk.component.ku.ku kuVar, int i9) {
        ExecutorService executorService;
        if (kuVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zp.zp.KS KS = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS();
        if (KS != null) {
            executorService = KS.tG();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            kuVar.setPriority(i9);
            executorService.execute(kuVar);
        } else {
            com.bytedance.sdk.component.ku.HWF.zp(kuVar);
        }
    }

    public static void zp(com.bytedance.sdk.component.ku.ku kuVar, int i9) {
        if (kuVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zp.zp.KS KS = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS();
        ExecutorService rV = KS != null ? KS.rV() : null;
        if (rV != null) {
            kuVar.setPriority(i9);
            rV.execute(kuVar);
        } else {
            com.bytedance.sdk.component.ku.HWF.zp(kuVar, i9);
        }
    }

    public static ScheduledFuture zp(Runnable runnable, long j7, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.ku.HWF.HWF().schedule(runnable, j7, timeUnit);
    }
}
