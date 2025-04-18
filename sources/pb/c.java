package pb;

import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import f7.d;
import f7.g;
import i7.p;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jb.a0;
import jb.j;

/* loaded from: classes3.dex */
public final class c {
    public final double a;

    /* renamed from: b, reason: collision with root package name */
    public final double f23569b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23570c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23571d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23572e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f23573f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f23574g;

    /* renamed from: h, reason: collision with root package name */
    public final p f23575h;

    /* renamed from: i, reason: collision with root package name */
    public final qa.a f23576i;

    /* renamed from: j, reason: collision with root package name */
    public int f23577j;

    /* renamed from: k, reason: collision with root package name */
    public long f23578k;

    public c(p pVar, qb.a aVar, qa.a aVar2) {
        double d10 = aVar.f23740d;
        this.a = d10;
        this.f23569b = aVar.f23741e;
        this.f23570c = aVar.f23742f * 1000;
        this.f23575h = pVar;
        this.f23576i = aVar2;
        this.f23571d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f23572e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f23573f = arrayBlockingQueue;
        this.f23574g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f23577j = 0;
        this.f23578k = 0L;
    }

    public final int a() {
        boolean z10;
        int max;
        if (this.f23578k == 0) {
            this.f23578k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f23578k) / this.f23570c);
        if (this.f23573f.size() == this.f23572e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            max = Math.min(100, this.f23577j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f23577j - currentTimeMillis);
        }
        if (this.f23577j != max) {
            this.f23577j = max;
            this.f23578k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(final jb.a aVar, final TaskCompletionSource taskCompletionSource) {
        final boolean z10;
        b6.a.f2288f.d("Sending report through Google DataTransport: " + aVar.f19873b, null);
        if (SystemClock.elapsedRealtime() - this.f23571d < AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23575h.a(new f7.a(aVar.a, d.HIGHEST, null), new g() { // from class: pb.b
            @Override // f7.g
            public final void a(Exception exc) {
                c cVar = c.this;
                cVar.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z10) {
                    boolean z11 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new j(2, cVar, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = a0.a;
                    boolean z12 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (z11) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = nanoTime - System.nanoTime();
                                z12 = true;
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z12;
                    }
                }
                taskCompletionSource2.trySetResult(aVar);
            }
        });
    }
}
