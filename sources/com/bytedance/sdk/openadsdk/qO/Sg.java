package com.bytedance.sdk.openadsdk.qO;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Sg {
    private int AlY;
    private qsH Sg;
    private ScheduledExecutorService YFl = null;
    private long tN = 0;
    private YFl wN;

    /* loaded from: classes.dex */
    public interface YFl {
    }

    public Sg(qsH qsh, int i10) {
        this.Sg = qsh;
        this.AlY = i10;
    }

    public boolean Sg() {
        ScheduledExecutorService scheduledExecutorService = this.YFl;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void YFl(long j3) {
        this.tN = j3;
    }

    public void YFl(int i10) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.YFl = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.Sg.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = Sg.this.tN;
                if (System.currentTimeMillis() - Sg.this.tN > Sg.this.AlY) {
                    Sg.this.YFl.shutdown();
                    if (Sg.this.Sg != null) {
                        Sg.this.Sg.Sg(0, "Automatic detection of stuck");
                    }
                    if (Sg.this.wN != null) {
                        YFl unused2 = Sg.this.wN;
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void YFl() {
        ScheduledExecutorService scheduledExecutorService = this.YFl;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
