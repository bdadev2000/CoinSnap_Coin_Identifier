package com.bytedance.sdk.component.qsH.tN;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class AlY implements ThreadFactory {
    protected final String Sg;
    protected final ThreadGroup YFl;
    private final AtomicInteger tN = new AtomicInteger(1);

    public AlY(String str) {
        this.YFl = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.Sg = YFl(str);
    }

    public Thread YFl(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread YFl = YFl(this.YFl, runnable, this.Sg + "_" + this.tN.getAndIncrement());
        if (YFl.isDaemon()) {
            YFl.setDaemon(false);
        }
        return YFl;
    }

    public static String YFl(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
