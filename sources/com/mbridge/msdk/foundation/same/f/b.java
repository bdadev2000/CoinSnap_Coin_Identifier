package com.mbridge.msdk.foundation.same.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f15763a;
    private static ThreadPoolExecutor b;

    /* renamed from: c, reason: collision with root package name */
    private static Handler f15764c;

    /* renamed from: d, reason: collision with root package name */
    private static ThreadPoolExecutor f15765d;

    /* renamed from: e, reason: collision with root package name */
    private static ThreadPoolExecutor f15766e;

    /* renamed from: f, reason: collision with root package name */
    private static ThreadPoolExecutor f15767f;

    /* loaded from: classes3.dex */
    public static class a extends Handler {
        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    public static ThreadPoolExecutor a() {
        if (b == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("BitmapThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            b = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return b;
    }

    public static ThreadPoolExecutor b() {
        if (f15763a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 25, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            f15763a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f15763a;
    }

    public static Handler c() {
        if (f15764c == null) {
            f15764c = new a();
        }
        return f15764c;
    }

    public static ThreadPoolExecutor d() {
        if (f15765d == null) {
            f15765d = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("NwtThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f15765d;
    }

    public static ThreadPoolExecutor e() {
        if (f15766e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.4
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("ReportThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
            f15766e = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f15766e;
    }

    public static ThreadPoolExecutor f() {
        if (f15767f == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.5
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("rv-load-tread");
                    return thread;
                }
            };
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors * 2, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), threadFactory, new ThreadPoolExecutor.DiscardPolicy());
            f15767f = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f15767f;
    }
}
