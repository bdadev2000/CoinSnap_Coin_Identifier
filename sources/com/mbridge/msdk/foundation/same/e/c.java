package com.mbridge.msdk.foundation.same.e;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class c {
    private static volatile ThreadPoolExecutor a;

    private static int a(int i10, String str) {
        try {
            int a10 = af.a().a(str, i10);
            return a10 <= 0 ? i10 : a10;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return i10;
            }
            ad.b("CommonTaskLoaderThreadPool", e2.getMessage());
            return i10;
        }
    }

    public static ThreadPoolExecutor a() {
        if (a == null) {
            int a10 = a(10, "c_t_l_t_p_c");
            int a11 = a(50, "c_t_l_t_p_m");
            int a12 = a(5, "c_t_l_t_p_t");
            int i10 = a11 < a10 ? a10 : a11;
            try {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor for core " + a10 + " max " + i10 + " timeout " + a12);
                }
                long j3 = a12;
                if (j3 <= 0) {
                    j3 = 1;
                }
                a = new ThreadPoolExecutor(a10, i10, j3, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.e.c.1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable);
                        thread.setName("mb-task-loader-thread");
                        return thread;
                    }
                }, new ThreadPoolExecutor.DiscardPolicy());
                a.allowCoreThreadTimeOut(true);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor failed ", e2);
                }
            }
        }
        if (a == null) {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.e.c.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("mb-task-loader-thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            a.allowCoreThreadTimeOut(true);
        }
        return a;
    }
}
