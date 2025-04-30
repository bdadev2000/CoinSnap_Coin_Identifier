package com.bytedance.sdk.component.ku.KS;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class jU implements ThreadFactory {
    private final AtomicInteger KS = new AtomicInteger(1);
    protected final String lMd;
    protected final ThreadGroup zp;

    public jU(String str) {
        this.zp = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.lMd = zp(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread zp = zp(this.zp, runnable, this.lMd + "_" + this.KS.getAndIncrement());
        if (zp.isDaemon()) {
            zp.setDaemon(false);
        }
        return zp;
    }

    public Thread zp(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String zp(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
