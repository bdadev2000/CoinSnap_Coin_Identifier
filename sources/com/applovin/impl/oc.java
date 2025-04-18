package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class oc {
    public static final c d = a(false, -9223372036854775807L);
    public static final c e = a(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f25824f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f25825g;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f25826a;

    /* renamed from: b, reason: collision with root package name */
    private d f25827b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f25828c;

    /* loaded from: classes.dex */
    public interface b {
        c a(e eVar, long j2, long j3, IOException iOException, int i2);

        void a(e eVar, long j2, long j3);

        void a(e eVar, long j2, long j3, boolean z2);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f25829a;

        /* renamed from: b, reason: collision with root package name */
        private final long f25830b;

        private c(int i2, long j2) {
            this.f25829a = i2;
            this.f25830b = j2;
        }

        public boolean a() {
            int i2 = this.f25829a;
            return i2 == 0 || i2 == 1;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface f {
        void d();
    }

    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final f f25840a;

        public g(f fVar) {
            this.f25840a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25840a.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j2 = -9223372036854775807L;
        f25824f = new c(2, j2);
        f25825g = new c(3, j2);
    }

    public oc(String str) {
        this.f25826a = xp.e("ExoPlayer:Loader:" + str);
    }

    public void b() {
        this.f25828c = null;
    }

    public boolean c() {
        return this.f25828c != null;
    }

    public boolean d() {
        return this.f25827b != null;
    }

    public void a() {
        ((d) b1.b(this.f25827b)).a(false);
    }

    public void a(int i2) {
        IOException iOException = this.f25828c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f25827b;
        if (dVar != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = dVar.f25831a;
            }
            dVar.a(i2);
        }
    }

    public void a(f fVar) {
        d dVar = this.f25827b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f25826a.execute(new g(fVar));
        }
        this.f25826a.shutdown();
    }

    public long a(e eVar, b bVar, int i2) {
        Looper looper = (Looper) b1.b(Looper.myLooper());
        this.f25828c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i2, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    /* loaded from: classes.dex */
    public final class d extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f25831a;

        /* renamed from: b, reason: collision with root package name */
        private final e f25832b;

        /* renamed from: c, reason: collision with root package name */
        private final long f25833c;
        private b d;

        /* renamed from: f, reason: collision with root package name */
        private IOException f25834f;

        /* renamed from: g, reason: collision with root package name */
        private int f25835g;

        /* renamed from: h, reason: collision with root package name */
        private Thread f25836h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f25837i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f25838j;

        public d(Looper looper, e eVar, b bVar, int i2, long j2) {
            super(looper);
            this.f25832b = eVar;
            this.d = bVar;
            this.f25831a = i2;
            this.f25833c = j2;
        }

        private void b() {
            oc.this.f25827b = null;
        }

        private long c() {
            return Math.min((this.f25835g - 1) * 1000, 5000);
        }

        public void a(boolean z2) {
            this.f25838j = z2;
            this.f25834f = null;
            if (hasMessages(0)) {
                this.f25837i = true;
                removeMessages(0);
                if (!z2) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f25837i = true;
                        this.f25832b.b();
                        Thread thread = this.f25836h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z2) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) b1.a(this.d)).a(this.f25832b, elapsedRealtime, elapsedRealtime - this.f25833c, true);
                this.d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f25838j) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                a();
                return;
            }
            if (i2 == 3) {
                throw ((Error) message.obj);
            }
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.f25833c;
            b bVar = (b) b1.a(this.d);
            if (this.f25837i) {
                bVar.a(this.f25832b, elapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    bVar.a(this.f25832b, elapsedRealtime, j2);
                    return;
                } catch (RuntimeException e) {
                    pc.a("LoadTask", "Unexpected exception handling load completed", e);
                    oc.this.f25828c = new h(e);
                    return;
                }
            }
            if (i3 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f25834f = iOException;
            int i4 = this.f25835g + 1;
            this.f25835g = i4;
            c a2 = bVar.a(this.f25832b, elapsedRealtime, j2, iOException, i4);
            if (a2.f25829a == 3) {
                oc.this.f25828c = this.f25834f;
            } else if (a2.f25829a != 2) {
                if (a2.f25829a == 1) {
                    this.f25835g = 1;
                }
                a(a2.f25830b != -9223372036854775807L ? a2.f25830b : c());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            try {
                synchronized (this) {
                    z2 = !this.f25837i;
                    this.f25836h = Thread.currentThread();
                }
                if (z2) {
                    ko.a("load:".concat(this.f25832b.getClass().getSimpleName()));
                    try {
                        this.f25832b.a();
                        ko.a();
                    } catch (Throwable th) {
                        ko.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f25836h = null;
                    Thread.interrupted();
                }
                if (this.f25838j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f25838j) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (Error e2) {
                if (!this.f25838j) {
                    pc.a("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (this.f25838j) {
                    return;
                }
                pc.a("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(2, new h(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.f25838j) {
                    return;
                }
                pc.a("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(2, new h(e4)).sendToTarget();
            }
        }

        private void a() {
            this.f25834f = null;
            oc.this.f25826a.execute((Runnable) b1.a(oc.this.f25827b));
        }

        public void a(int i2) {
            IOException iOException = this.f25834f;
            if (iOException != null && this.f25835g > i2) {
                throw iOException;
            }
        }

        public void a(long j2) {
            b1.b(oc.this.f25827b == null);
            oc.this.f25827b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                a();
            }
        }
    }

    public static c a(boolean z2, long j2) {
        return new c(z2 ? 1 : 0, j2);
    }
}
