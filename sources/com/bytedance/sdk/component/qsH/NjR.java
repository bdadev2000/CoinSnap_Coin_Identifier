package com.bytedance.sdk.component.qsH;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class NjR implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    private final AtomicInteger AlY;
    protected final String Sg;
    protected final ThreadGroup YFl;
    protected int tN;

    public NjR(String str) {
        this(5, str);
    }

    public Thread YFl(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread YFl = YFl(this.YFl, runnable, this.Sg + this.AlY.getAndIncrement());
        if (YFl.isDaemon()) {
            YFl.setDaemon(false);
        }
        int i10 = this.tN;
        if (i10 > 10 || i10 <= 0) {
            this.tN = 5;
        }
        YFl.setPriority(this.tN);
        return YFl;
    }

    public NjR(int i10, String str) {
        this.AlY = new AtomicInteger(1);
        this.tN = i10;
        this.YFl = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.Sg = THREAD_NAME_PRE.concat(String.valueOf(str));
    }
}
