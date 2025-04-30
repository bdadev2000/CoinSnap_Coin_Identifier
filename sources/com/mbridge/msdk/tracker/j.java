package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18126a;
    private final Executor b;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f18129a;

        public a(Runnable runnable) {
            this.f18129a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (y.a(this.f18129a)) {
                return;
            }
            try {
                this.f18129a.run();
            } catch (Exception e4) {
                if (com.mbridge.msdk.tracker.a.f18098a) {
                    Log.e("TrackManager", "execute error", e4);
                }
            }
        }
    }

    public j() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f18126a = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.j.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeTrackThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.b = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.j.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeTrackDatabaseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(Runnable runnable) {
        this.f18126a.execute(new a(runnable));
    }

    public final void b(Runnable runnable) {
        this.b.execute(new a(runnable));
    }
}
