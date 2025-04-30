package com.bytedance.sdk.openadsdk.vDp;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class lMd {
    private zp COT;
    private int jU;
    private ku lMd;
    private ScheduledExecutorService zp = null;
    private long KS = 0;

    /* loaded from: classes.dex */
    public interface zp {
    }

    public lMd(ku kuVar, int i9) {
        this.lMd = kuVar;
        this.jU = i9;
    }

    public boolean lMd() {
        ScheduledExecutorService scheduledExecutorService = this.zp;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void zp(long j7) {
        this.KS = j7;
    }

    public void zp(int i9) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.zp = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vDp.lMd.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = lMd.this.KS;
                if (System.currentTimeMillis() - lMd.this.KS > lMd.this.jU) {
                    lMd.this.zp.shutdown();
                    if (lMd.this.lMd != null) {
                        lMd.this.lMd.lMd(0, "Automatic detection of stuck");
                    }
                    if (lMd.this.COT != null) {
                        zp unused2 = lMd.this.COT;
                    }
                }
            }
        }, 0L, i9, TimeUnit.MILLISECONDS);
    }

    public void zp() {
        ScheduledExecutorService scheduledExecutorService = this.zp;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
