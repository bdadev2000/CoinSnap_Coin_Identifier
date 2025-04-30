package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    static final b<d, Runnable> f6077a = new b<d, Runnable>() { // from class: com.apm.insight.runtime.u.1
    };
    static final b<Message, Runnable> b = new b<Message, Runnable>() { // from class: com.apm.insight.runtime.u.2
    };

    /* renamed from: c, reason: collision with root package name */
    private final HandlerThread f6078c;

    /* renamed from: f, reason: collision with root package name */
    private volatile Handler f6081f;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<d> f6079d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Queue<Message> f6080e = new ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    private final Object f6082g = new Object();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public void a() {
            while (!u.this.f6079d.isEmpty()) {
                d dVar = (d) u.this.f6079d.poll();
                if (u.this.f6081f != null) {
                    try {
                        u.this.f6081f.sendMessageAtTime(dVar.f6086a, dVar.b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public void b() {
            while (!u.this.f6080e.isEmpty()) {
                if (u.this.f6081f != null) {
                    try {
                        u.this.f6081f.sendMessageAtFrontOfQueue((Message) u.this.f6080e.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
            a();
        }
    }

    /* loaded from: classes.dex */
    public interface b<A, B> {
    }

    /* loaded from: classes.dex */
    public class c extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        volatile int f6084a;
        volatile boolean b;

        public c(String str) {
            super(str);
            this.f6084a = 0;
            this.b = false;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (u.this.f6082g) {
                u.this.f6081f = new Handler();
            }
            u.this.f6081f.post(new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.b.g.a(com.apm.insight.i.g()).a().c();
                        if (this.f6084a < 5) {
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                        } else if (!this.b) {
                            this.b = true;
                            com.apm.insight.c.a().a("NPTH_ERR_MAX", new RuntimeException());
                        }
                        this.f6084a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        Message f6086a;
        long b;

        public d(Message message, long j7) {
            this.f6086a = message;
            this.b = j7;
        }
    }

    public u(String str) {
        this.f6078c = new c(str);
    }

    @Nullable
    public Handler a() {
        return this.f6081f;
    }

    public HandlerThread c() {
        return this.f6078c;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f6081f, runnable);
    }

    public void b() {
        this.f6078c.start();
    }

    public final boolean a(Message message, long j7) {
        if (j7 < 0) {
            j7 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j7);
    }

    public final boolean b(Message message, long j7) {
        if (this.f6081f == null) {
            synchronized (this.f6082g) {
                try {
                    if (this.f6081f == null) {
                        this.f6079d.add(new d(message, j7));
                        return true;
                    }
                } finally {
                }
            }
        }
        try {
            return this.f6081f.sendMessageAtTime(message, j7);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j7) {
        return a(b(runnable), j7);
    }
}
