package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class jc {

    /* renamed from: d, reason: collision with root package name */
    public static final c f8426d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f8427e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f8428f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f8429g;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f8430a;
    private d b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f8431c;

    /* loaded from: classes.dex */
    public interface b {
        c a(e eVar, long j7, long j9, IOException iOException, int i9);

        void a(e eVar, long j7, long j9);

        void a(e eVar, long j7, long j9, boolean z8);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f8432a;
        private final long b;

        private c(int i9, long j7) {
            this.f8432a = i9;
            this.b = j7;
        }

        public boolean a() {
            int i9 = this.f8432a;
            return i9 == 0 || i9 == 1;
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
        private final f f8442a;

        public g(f fVar) {
            this.f8442a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8442a.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        f8426d = a(false, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        f8427e = a(true, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        f8428f = new c(2, j7);
        f8429g = new c(3, j7);
    }

    public jc(String str) {
        this.f8430a = yp.e("ExoPlayer:Loader:" + str);
    }

    public boolean c() {
        if (this.f8431c != null) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void b() {
        this.f8431c = null;
    }

    public void a() {
        ((d) AbstractC0669a1.b(this.b)).a(false);
    }

    public void a(int i9) {
        IOException iOException = this.f8431c;
        if (iOException == null) {
            d dVar = this.b;
            if (dVar != null) {
                if (i9 == Integer.MIN_VALUE) {
                    i9 = dVar.f8433a;
                }
                dVar.a(i9);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void a(f fVar) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f8430a.execute(new g(fVar));
        }
        this.f8430a.shutdown();
    }

    public long a(e eVar, b bVar, int i9) {
        Looper looper = (Looper) AbstractC0669a1.b(Looper.myLooper());
        this.f8431c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i9, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    /* loaded from: classes.dex */
    public final class d extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f8433a;
        private final e b;

        /* renamed from: c, reason: collision with root package name */
        private final long f8434c;

        /* renamed from: d, reason: collision with root package name */
        private b f8435d;

        /* renamed from: f, reason: collision with root package name */
        private IOException f8436f;

        /* renamed from: g, reason: collision with root package name */
        private int f8437g;

        /* renamed from: h, reason: collision with root package name */
        private Thread f8438h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f8439i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f8440j;

        public d(Looper looper, e eVar, b bVar, int i9, long j7) {
            super(looper);
            this.b = eVar;
            this.f8435d = bVar;
            this.f8433a = i9;
            this.f8434c = j7;
        }

        private void b() {
            jc.this.b = null;
        }

        private long c() {
            return Math.min((this.f8437g - 1) * 1000, 5000);
        }

        public void a(boolean z8) {
            this.f8440j = z8;
            this.f8436f = null;
            if (hasMessages(0)) {
                this.f8439i = true;
                removeMessages(0);
                if (!z8) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f8439i = true;
                        this.b.b();
                        Thread thread = this.f8438h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z8) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC0669a1.a(this.f8435d)).a(this.b, elapsedRealtime, elapsedRealtime - this.f8434c, true);
                this.f8435d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long c9;
            if (this.f8440j) {
                return;
            }
            int i9 = message.what;
            if (i9 == 0) {
                a();
                return;
            }
            if (i9 != 3) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = elapsedRealtime - this.f8434c;
                b bVar = (b) AbstractC0669a1.a(this.f8435d);
                if (this.f8439i) {
                    bVar.a(this.b, elapsedRealtime, j7, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f8436f = iOException;
                        int i11 = this.f8437g + 1;
                        this.f8437g = i11;
                        c a6 = bVar.a(this.b, elapsedRealtime, j7, iOException, i11);
                        if (a6.f8432a == 3) {
                            jc.this.f8431c = this.f8436f;
                            return;
                        } else {
                            if (a6.f8432a != 2) {
                                if (a6.f8432a == 1) {
                                    this.f8437g = 1;
                                }
                                if (a6.b != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                    c9 = a6.b;
                                } else {
                                    c9 = c();
                                }
                                a(c9);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                try {
                    bVar.a(this.b, elapsedRealtime, j7);
                    return;
                } catch (RuntimeException e4) {
                    kc.a("LoadTask", "Unexpected exception handling load completed", e4);
                    jc.this.f8431c = new h(e4);
                    return;
                }
            }
            throw ((Error) message.obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z8;
            try {
                synchronized (this) {
                    z8 = !this.f8439i;
                    this.f8438h = Thread.currentThread();
                }
                if (z8) {
                    lo.a("load:".concat(this.b.getClass().getSimpleName()));
                    try {
                        this.b.a();
                        lo.a();
                    } catch (Throwable th) {
                        lo.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f8438h = null;
                    Thread.interrupted();
                }
                if (!this.f8440j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e4) {
                if (!this.f8440j) {
                    obtainMessage(2, e4).sendToTarget();
                }
            } catch (Error e9) {
                if (!this.f8440j) {
                    kc.a("LoadTask", "Unexpected error loading stream", e9);
                    obtainMessage(3, e9).sendToTarget();
                }
                throw e9;
            } catch (Exception e10) {
                if (!this.f8440j) {
                    kc.a("LoadTask", "Unexpected exception loading stream", e10);
                    obtainMessage(2, new h(e10)).sendToTarget();
                }
            } catch (OutOfMemoryError e11) {
                if (!this.f8440j) {
                    kc.a("LoadTask", "OutOfMemory error loading stream", e11);
                    obtainMessage(2, new h(e11)).sendToTarget();
                }
            }
        }

        private void a() {
            this.f8436f = null;
            jc.this.f8430a.execute((Runnable) AbstractC0669a1.a(jc.this.b));
        }

        public void a(int i9) {
            IOException iOException = this.f8436f;
            if (iOException != null && this.f8437g > i9) {
                throw iOException;
            }
        }

        public void a(long j7) {
            AbstractC0669a1.b(jc.this.b == null);
            jc.this.b = this;
            if (j7 > 0) {
                sendEmptyMessageDelayed(0, j7);
            } else {
                a();
            }
        }
    }

    public static c a(boolean z8, long j7) {
        return new c(z8 ? 1 : 0, j7);
    }
}
