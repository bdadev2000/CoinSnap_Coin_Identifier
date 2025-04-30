package f5;

import a5.C0397a;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.mbridge.msdk.foundation.entity.o;
import h5.i;
import i5.C2349d;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final C0397a f20346f = C0397a.d();

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20347a;
    public final ConcurrentLinkedQueue b;

    /* renamed from: c, reason: collision with root package name */
    public final Runtime f20348c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f20349d;

    /* renamed from: e, reason: collision with root package name */
    public long f20350e;

    public f() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f20349d = null;
        this.f20350e = -1L;
        this.f20347a = newSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue();
        this.f20348c = runtime;
    }

    public final synchronized void a(long j7, i iVar) {
        this.f20350e = j7;
        try {
            this.f20349d = this.f20347a.scheduleAtFixedRate(new e(this, iVar, 0), 0L, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            f20346f.f("Unable to start collecting Memory Metrics: " + e4.getMessage());
        }
    }

    public final AndroidMemoryReading b(i iVar) {
        if (iVar == null) {
            return null;
        }
        long c9 = iVar.c() + iVar.b;
        C2349d newBuilder = AndroidMemoryReading.newBuilder();
        newBuilder.a(c9);
        Runtime runtime = this.f20348c;
        newBuilder.b(com.bumptech.glide.c.R((o.e(5) * (runtime.totalMemory() - runtime.freeMemory())) / 1024));
        return (AndroidMemoryReading) newBuilder.build();
    }
}
