package androidx.work;

import androidx.compose.foundation.text.input.a;
import androidx.work.impl.DefaultRunnableScheduler;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class Configuration {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f21845a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f21846b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkerFactory f21847c;
    public final InputMergerFactory d;
    public final DefaultRunnableScheduler e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21848f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21849g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21850h;

    /* loaded from: classes3.dex */
    public static final class Builder {
    }

    /* loaded from: classes3.dex */
    public interface Provider {
        Configuration a();
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, androidx.work.WorkerFactory] */
    /* JADX WARN: Type inference failed for: r6v15, types: [androidx.work.InputMergerFactory, java.lang.Object] */
    public Configuration(Builder builder) {
        final boolean z2 = true;
        final boolean z3 = false;
        this.f21845a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.Configuration.1

            /* renamed from: a, reason: collision with root package name */
            public final AtomicInteger f21851a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder q2 = a.q(z3 ? "WM.task-" : "androidx.work-");
                q2.append(this.f21851a.incrementAndGet());
                return new Thread(runnable, q2.toString());
            }
        });
        this.f21846b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.Configuration.1

            /* renamed from: a, reason: collision with root package name */
            public final AtomicInteger f21851a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder q2 = a.q(z2 ? "WM.task-" : "androidx.work-");
                q2.append(this.f21851a.incrementAndGet());
                return new Thread(runnable, q2.toString());
            }
        });
        String str = WorkerFactory.f21911a;
        this.f21847c = new Object();
        this.d = new Object();
        this.e = new DefaultRunnableScheduler();
        this.f21848f = 4;
        this.f21849g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f21850h = 20;
    }
}
