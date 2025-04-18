package com.bytedance.sdk.component.wN.YFl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class tN {
    private static final TimeUnit YFl = TimeUnit.SECONDS;

    public static ExecutorService YFl() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, YFl, new LinkedBlockingQueue(), new YFl("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
