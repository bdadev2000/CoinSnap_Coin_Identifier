package com.mbridge.msdk.foundation.same.c;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class f {
    private static ThreadPoolExecutor a;

    public static ThreadPoolExecutor a() {
        if (a == null) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.c.f.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("mb-image-loader-thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        a.allowCoreThreadTimeOut(true);
        return a;
    }
}
