package com.mbridge.msdk.foundation.same.report.b;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes4.dex */
public class b extends Thread {
    private static volatile b a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f13435b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f13436c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.b.a f13437d;

    /* renamed from: e, reason: collision with root package name */
    private int f13438e;

    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private long f13439b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f13440c;

        /* renamed from: d, reason: collision with root package name */
        private long f13441d;

        private a() {
            this.f13439b = SystemClock.uptimeMillis();
        }

        public final void b() {
            this.f13440c = false;
            this.f13441d = SystemClock.uptimeMillis();
            b.this.f13435b.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this) {
                this.f13440c = true;
                this.f13439b = SystemClock.uptimeMillis();
            }
        }

        public final boolean a() {
            return !this.f13440c || this.f13439b - this.f13441d >= ((long) b.this.f13438e);
        }
    }

    private b() {
        super("AnrMonitor-Thread");
        this.f13435b = new Handler(Looper.getMainLooper());
        this.f13438e = 5000;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (!isInterrupted() && (this.f13436c == null || this.f13436c.f13440c)) {
                synchronized (this) {
                    if (this.f13436c == null) {
                        this.f13436c = new a();
                    }
                    this.f13436c.b();
                    long j3 = this.f13438e;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    while (j3 > 0) {
                        try {
                            wait(j3);
                        } catch (InterruptedException e2) {
                            Log.w("AnrMonitor", e2.toString());
                        }
                        j3 = this.f13438e - (SystemClock.uptimeMillis() - uptimeMillis);
                    }
                    if (!this.f13436c.a()) {
                        com.mbridge.msdk.foundation.same.report.b.a aVar = this.f13437d;
                        if (aVar != null) {
                            aVar.a();
                        }
                    } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f13437d != null) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        this.f13437d.a(c.a(stackTrace), stackTrace);
                    }
                }
            } else {
                try {
                    Thread.sleep(this.f13438e);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    public final b a(int i10, com.mbridge.msdk.foundation.same.report.b.a aVar) {
        this.f13438e = i10;
        this.f13437d = aVar;
        return this;
    }
}
