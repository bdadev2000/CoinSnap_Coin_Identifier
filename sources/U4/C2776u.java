package u4;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import x0.AbstractC2914a;

/* renamed from: u4.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2776u extends AbstractRunnableC2758c {
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f23174c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23175d = 2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f23176f;

    public C2776u(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.b = str;
        this.f23174c = executorService;
        this.f23176f = timeUnit;
    }

    @Override // u4.AbstractRunnableC2758c
    public final void a() {
        String str = this.b;
        ExecutorService executorService = this.f23174c;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(this.f23175d, this.f23176f)) {
                String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str3, null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String e4 = AbstractC2914a.e("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", e4, null);
            }
            executorService.shutdownNow();
        }
    }
}
