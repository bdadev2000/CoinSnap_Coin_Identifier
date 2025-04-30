package com.bytedance.sdk.component.ku;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class YW implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    protected int KS;
    private final AtomicInteger jU;
    protected final String lMd;
    protected final ThreadGroup zp;

    public YW(String str) {
        this(5, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread zp = zp(this.zp, runnable, this.lMd + this.jU.getAndIncrement());
        if (zp.isDaemon()) {
            zp.setDaemon(false);
        }
        int i9 = this.KS;
        if (i9 > 10 || i9 <= 0) {
            this.KS = 5;
        }
        zp.setPriority(this.KS);
        return zp;
    }

    public Thread zp(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public YW(int i9, String str) {
        this.jU = new AtomicInteger(1);
        this.KS = i9;
        this.zp = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.lMd = THREAD_NAME_PRE.concat(String.valueOf(str));
    }
}
