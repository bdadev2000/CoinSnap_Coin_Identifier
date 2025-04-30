package A4;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import h3.C2318a;
import h3.g;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k3.r;
import u4.AbstractC2755B;
import u4.C2756a;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final double f54a;
    public final double b;

    /* renamed from: c, reason: collision with root package name */
    public final long f55c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f58f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f59g;

    /* renamed from: h, reason: collision with root package name */
    public final r f60h;

    /* renamed from: i, reason: collision with root package name */
    public final r4.c f61i;

    /* renamed from: j, reason: collision with root package name */
    public int f62j;

    /* renamed from: k, reason: collision with root package name */
    public long f63k;

    public f(r rVar, B4.b bVar, r4.c cVar) {
        double d2 = bVar.f313d;
        this.f54a = d2;
        this.b = bVar.f314e;
        this.f55c = bVar.f315f * 1000;
        this.f60h = rVar;
        this.f61i = cVar;
        this.f56d = SystemClock.elapsedRealtime();
        int i9 = (int) d2;
        this.f57e = i9;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i9);
        this.f58f = arrayBlockingQueue;
        this.f59g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f62j = 0;
        this.f63k = 0L;
    }

    public final int a() {
        int max;
        if (this.f63k == 0) {
            this.f63k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f63k) / this.f55c);
        if (this.f58f.size() == this.f57e) {
            max = Math.min(100, this.f62j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f62j - currentTimeMillis);
        }
        if (this.f62j != max) {
            this.f62j = max;
            this.f63k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(final C2756a c2756a, final TaskCompletionSource taskCompletionSource) {
        final boolean z8;
        String str = "Sending report through Google DataTransport: " + c2756a.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.f56d < AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f60h.a(new C2318a(c2756a.f23109a, h3.d.f20587d, null), new g() { // from class: A4.c
            @Override // h3.g
            public final void b(Exception exc) {
                int i9 = 0;
                f fVar = f.this;
                fVar.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z8) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new d(i9, fVar, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = AbstractC2755B.f23108a;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    i9 = 1;
                                    if (i9 != 0) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = nanoTime - System.nanoTime();
                                i9 = 1;
                            }
                        }
                        if (i9 != 0) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                taskCompletionSource2.trySetResult(c2756a);
            }
        });
    }
}
