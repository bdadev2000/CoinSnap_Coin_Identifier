package com.bytedance.sdk.component.COT.zp;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class zp implements ThreadFactory {
    private final AtomicInteger lMd = new AtomicInteger(1);
    private final ThreadGroup zp;

    public zp(String str) {
        this.zp = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.zp, runnable, "tt_img_" + this.lMd.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
