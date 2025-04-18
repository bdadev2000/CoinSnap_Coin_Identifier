package kb;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final c f20633d = new c();
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final a f20634b;

    /* renamed from: c, reason: collision with root package name */
    public final a f20635c;

    public d(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.a = new a(backgroundExecutorService);
        this.f20634b = new a(backgroundExecutorService);
        new a(backgroundExecutorService);
        this.f20635c = new a(blockingExecutorService);
    }

    public static final void a() {
        c.a(new b(0), b6.c.f2300d);
    }
}
