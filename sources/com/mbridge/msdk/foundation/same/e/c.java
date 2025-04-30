package com.mbridge.msdk.foundation.same.e;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f15761a;

    private static int a(int i9, String str) {
        try {
            int a6 = af.a().a(str, i9);
            return a6 <= 0 ? i9 : a6;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return i9;
            }
            ad.b("CommonTaskLoaderThreadPool", e4.getMessage());
            return i9;
        }
    }

    public static ThreadPoolExecutor a() {
        if (f15761a == null) {
            int a6 = a(10, "c_t_l_t_p_c");
            int a9 = a(50, "c_t_l_t_p_m");
            int a10 = a(5, "c_t_l_t_p_t");
            int i9 = a9 < a6 ? a6 : a9;
            try {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor for core " + a6 + " max " + i9 + " timeout " + a10);
                }
                long j7 = a10;
                if (j7 <= 0) {
                    j7 = 1;
                }
                f15761a = new ThreadPoolExecutor(a6, i9, j7, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.e.c.1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable);
                        thread.setName("mb-task-loader-thread");
                        return thread;
                    }
                }, new ThreadPoolExecutor.DiscardPolicy());
                f15761a.allowCoreThreadTimeOut(true);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor failed ", e4);
                }
            }
        }
        if (f15761a == null) {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f15761a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.e.c.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("mb-task-loader-thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            f15761a.allowCoreThreadTimeOut(true);
        }
        return f15761a;
    }
}
