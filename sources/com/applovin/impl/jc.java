package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class jc {

    /* renamed from: d, reason: collision with root package name */
    public static final c f5469d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f5470e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f5471f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f5472g;
    private final ExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    private d f5473b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f5474c;

    /* loaded from: classes.dex */
    public interface b {
        c a(e eVar, long j3, long j10, IOException iOException, int i10);

        void a(e eVar, long j3, long j10);

        void a(e eVar, long j3, long j10, boolean z10);
    }

    /* loaded from: classes.dex */
    public static final class c {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final long f5475b;

        private c(int i10, long j3) {
            this.a = i10;
            this.f5475b = j3;
        }

        public boolean a() {
            int i10 = this.a;
            return i10 == 0 || i10 == 1;
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
        private final f a;

        public g(f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    static {
        long j3 = C.TIME_UNSET;
        f5469d = a(false, C.TIME_UNSET);
        f5470e = a(true, C.TIME_UNSET);
        f5471f = new c(2, j3);
        f5472g = new c(3, j3);
    }

    public jc(String str) {
        this.a = yp.e("ExoPlayer:Loader:" + str);
    }

    public boolean c() {
        return this.f5474c != null;
    }

    public boolean d() {
        return this.f5473b != null;
    }

    public void b() {
        this.f5474c = null;
    }

    public void a() {
        ((d) a1.b(this.f5473b)).a(false);
    }

    public void a(int i10) {
        IOException iOException = this.f5474c;
        if (iOException == null) {
            d dVar = this.f5473b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.a;
                }
                dVar.a(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void a(f fVar) {
        d dVar = this.f5473b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.a.execute(new g(fVar));
        }
        this.a.shutdown();
    }

    public long a(e eVar, b bVar, int i10) {
        Looper looper = (Looper) a1.b(Looper.myLooper());
        this.f5474c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i10, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    /* loaded from: classes.dex */
    public final class d extends Handler implements Runnable {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        private final e f5476b;

        /* renamed from: c, reason: collision with root package name */
        private final long f5477c;

        /* renamed from: d, reason: collision with root package name */
        private b f5478d;

        /* renamed from: f, reason: collision with root package name */
        private IOException f5479f;

        /* renamed from: g, reason: collision with root package name */
        private int f5480g;

        /* renamed from: h, reason: collision with root package name */
        private Thread f5481h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f5482i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f5483j;

        public d(Looper looper, e eVar, b bVar, int i10, long j3) {
            super(looper);
            this.f5476b = eVar;
            this.f5478d = bVar;
            this.a = i10;
            this.f5477c = j3;
        }

        private void b() {
            jc.this.f5473b = null;
        }

        private long c() {
            return Math.min((this.f5480g - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f5483j = z10;
            this.f5479f = null;
            if (hasMessages(0)) {
                this.f5482i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f5482i = true;
                    this.f5476b.b();
                    Thread thread = this.f5481h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) a1.a(this.f5478d)).a(this.f5476b, elapsedRealtime, elapsedRealtime - this.f5477c, true);
                this.f5478d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long c10;
            if (this.f5483j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                a();
                return;
            }
            if (i10 != 3) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f5477c;
                b bVar = (b) a1.a(this.f5478d);
                if (this.f5482i) {
                    bVar.a(this.f5476b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f5479f = iOException;
                        int i12 = this.f5480g + 1;
                        this.f5480g = i12;
                        c a = bVar.a(this.f5476b, elapsedRealtime, j3, iOException, i12);
                        if (a.a == 3) {
                            jc.this.f5474c = this.f5479f;
                            return;
                        } else {
                            if (a.a != 2) {
                                if (a.a == 1) {
                                    this.f5480g = 1;
                                }
                                if (a.f5475b != C.TIME_UNSET) {
                                    c10 = a.f5475b;
                                } else {
                                    c10 = c();
                                }
                                a(c10);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                try {
                    bVar.a(this.f5476b, elapsedRealtime, j3);
                    return;
                } catch (RuntimeException e2) {
                    kc.a("LoadTask", "Unexpected exception handling load completed", e2);
                    jc.this.f5474c = new h(e2);
                    return;
                }
            }
            throw ((Error) message.obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f5482i;
                    this.f5481h = Thread.currentThread();
                }
                if (z10) {
                    lo.a("load:".concat(this.f5476b.getClass().getSimpleName()));
                    try {
                        this.f5476b.a();
                        lo.a();
                    } catch (Throwable th2) {
                        lo.a();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f5481h = null;
                    Thread.interrupted();
                }
                if (!this.f5483j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e2) {
                if (!this.f5483j) {
                    obtainMessage(2, e2).sendToTarget();
                }
            } catch (OutOfMemoryError e10) {
                if (!this.f5483j) {
                    kc.a("LoadTask", "OutOfMemory error loading stream", e10);
                    obtainMessage(2, new h(e10)).sendToTarget();
                }
            } catch (Error e11) {
                if (!this.f5483j) {
                    kc.a("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (!this.f5483j) {
                    kc.a("LoadTask", "Unexpected exception loading stream", e12);
                    obtainMessage(2, new h(e12)).sendToTarget();
                }
            }
        }

        private void a() {
            this.f5479f = null;
            jc.this.a.execute((Runnable) a1.a(jc.this.f5473b));
        }

        public void a(int i10) {
            IOException iOException = this.f5479f;
            if (iOException != null && this.f5480g > i10) {
                throw iOException;
            }
        }

        public void a(long j3) {
            a1.b(jc.this.f5473b == null);
            jc.this.f5473b = this;
            if (j3 > 0) {
                sendEmptyMessageDelayed(0, j3);
            } else {
                a();
            }
        }
    }

    public static c a(boolean z10, long j3) {
        return new c(z10 ? 1 : 0, j3);
    }
}
