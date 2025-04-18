package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class j {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f15386b;

    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        private final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (y.a(this.a)) {
                return;
            }
            try {
                this.a.run();
            } catch (Exception e2) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", "execute error", e2);
                }
            }
        }
    }

    public j() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.j.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeTrackThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.f15386b = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.j.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeTrackDatabaseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(Runnable runnable) {
        this.a.execute(new a(runnable));
    }

    public final void b(Runnable runnable) {
        this.f15386b.execute(new a(runnable));
    }
}
