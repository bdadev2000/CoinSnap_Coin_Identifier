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
    static final b<d, Runnable> a = new b<d, Runnable>() { // from class: com.apm.insight.runtime.u.1
    };

    /* renamed from: b, reason: collision with root package name */
    static final b<Message, Runnable> f3361b = new b<Message, Runnable>() { // from class: com.apm.insight.runtime.u.2
    };

    /* renamed from: c, reason: collision with root package name */
    private final HandlerThread f3362c;

    /* renamed from: f, reason: collision with root package name */
    private volatile Handler f3365f;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<d> f3363d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Queue<Message> f3364e = new ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    private final Object f3366g = new Object();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public void a() {
            while (!u.this.f3363d.isEmpty()) {
                d dVar = (d) u.this.f3363d.poll();
                if (u.this.f3365f != null) {
                    try {
                        u.this.f3365f.sendMessageAtTime(dVar.a, dVar.f3369b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public void b() {
            while (!u.this.f3364e.isEmpty()) {
                if (u.this.f3365f != null) {
                    try {
                        u.this.f3365f.sendMessageAtFrontOfQueue((Message) u.this.f3364e.poll());
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
        volatile int a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f3367b;

        public c(String str) {
            super(str);
            this.a = 0;
            this.f3367b = false;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (u.this.f3366g) {
                u.this.f3365f = new Handler();
            }
            u.this.f3365f.post(new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.g.a(com.apm.insight.i.g()).a().c();
                        if (this.a < 5) {
                            com.apm.insight.c.a().a("NPTH_CATCH", th2);
                        } else if (!this.f3367b) {
                            this.f3367b = true;
                            com.apm.insight.c.a().a("NPTH_ERR_MAX", new RuntimeException());
                        }
                        this.a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        Message a;

        /* renamed from: b, reason: collision with root package name */
        long f3369b;

        public d(Message message, long j3) {
            this.a = message;
            this.f3369b = j3;
        }
    }

    public u(String str) {
        this.f3362c = new c(str);
    }

    @Nullable
    public Handler a() {
        return this.f3365f;
    }

    public HandlerThread c() {
        return this.f3362c;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f3365f, runnable);
    }

    public void b() {
        this.f3362c.start();
    }

    public final boolean a(Message message, long j3) {
        if (j3 < 0) {
            j3 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j3);
    }

    public final boolean b(Message message, long j3) {
        if (this.f3365f == null) {
            synchronized (this.f3366g) {
                if (this.f3365f == null) {
                    this.f3363d.add(new d(message, j3));
                    return true;
                }
            }
        }
        try {
            return this.f3365f.sendMessageAtTime(message, j3);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j3) {
        return a(b(runnable), j3);
    }
}
