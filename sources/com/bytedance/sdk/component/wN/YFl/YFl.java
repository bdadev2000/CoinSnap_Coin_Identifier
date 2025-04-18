package com.bytedance.sdk.component.wN.YFl;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class YFl implements ThreadFactory {
    private final AtomicInteger Sg = new AtomicInteger(1);
    private final ThreadGroup YFl;

    public YFl(String str) {
        this.YFl = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.YFl, runnable, "tt_img_" + this.Sg.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
