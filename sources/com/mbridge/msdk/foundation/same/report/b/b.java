package com.mbridge.msdk.foundation.same.report.b;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes3.dex */
public class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f15871a;
    private final Handler b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f15872c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.b.a f15873d;

    /* renamed from: e, reason: collision with root package name */
    private int f15874e;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private long b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15876c;

        /* renamed from: d, reason: collision with root package name */
        private long f15877d;

        private a() {
            this.b = SystemClock.uptimeMillis();
        }

        public final void b() {
            this.f15876c = false;
            this.f15877d = SystemClock.uptimeMillis();
            b.this.b.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this) {
                this.f15876c = true;
                this.b = SystemClock.uptimeMillis();
            }
        }

        public final boolean a() {
            return !this.f15876c || this.b - this.f15877d >= ((long) b.this.f15874e);
        }
    }

    private b() {
        super("AnrMonitor-Thread");
        this.b = new Handler(Looper.getMainLooper());
        this.f15874e = 5000;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (!isInterrupted() && (this.f15872c == null || this.f15872c.f15876c)) {
                synchronized (this) {
                    try {
                        if (this.f15872c == null) {
                            this.f15872c = new a();
                        }
                        this.f15872c.b();
                        long j7 = this.f15874e;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        while (j7 > 0) {
                            try {
                                wait(j7);
                            } catch (InterruptedException e4) {
                                Log.w("AnrMonitor", e4.toString());
                            }
                            j7 = this.f15874e - (SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        if (!this.f15872c.a()) {
                            com.mbridge.msdk.foundation.same.report.b.a aVar = this.f15873d;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f15873d != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f15873d.a(c.a(stackTrace), stackTrace);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                try {
                    Thread.sleep(this.f15874e);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static b a() {
        if (f15871a == null) {
            synchronized (b.class) {
                try {
                    if (f15871a == null) {
                        f15871a = new b();
                    }
                } finally {
                }
            }
        }
        return f15871a;
    }

    public final b a(int i9, com.mbridge.msdk.foundation.same.report.b.a aVar) {
        this.f15874e = i9;
        this.f15873d = aVar;
        return this;
    }
}
