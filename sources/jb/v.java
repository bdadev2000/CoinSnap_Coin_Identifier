package jb;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class v extends c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f19962c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f19964f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19961b = "awaitEvenIfOnMainThread task continuation executor";

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19963d = 2;

    public v(ExecutorService executorService, TimeUnit timeUnit) {
        this.f19962c = executorService;
        this.f19964f = timeUnit;
    }

    @Override // jb.c
    public final void a() {
        b6.a aVar = b6.a.f2288f;
        String str = this.f19961b;
        ExecutorService executorService = this.f19962c;
        try {
            aVar.d("Executing shutdown hook for " + str, null);
            executorService.shutdown();
            if (!executorService.awaitTermination(this.f19963d, this.f19964f)) {
                aVar.d(str + " did not shut down in the allocated time. Requesting immediate shutdown.", null);
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            aVar.d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str), null);
            executorService.shutdownNow();
        }
    }
}
