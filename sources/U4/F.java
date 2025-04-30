package U4;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: i, reason: collision with root package name */
    public static final long f3257i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f3258j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3259a;
    public final r b;

    /* renamed from: c, reason: collision with root package name */
    public final p f3260c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f3261d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f3263f;

    /* renamed from: h, reason: collision with root package name */
    public final D f3265h;

    /* renamed from: e, reason: collision with root package name */
    public final x.b f3262e = new x.l();

    /* renamed from: g, reason: collision with root package name */
    public boolean f3264g = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [x.l, x.b] */
    public F(FirebaseMessaging firebaseMessaging, r rVar, D d2, p pVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f3261d = firebaseMessaging;
        this.b = rVar;
        this.f3265h = d2;
        this.f3260c = pVar;
        this.f3259a = context;
        this.f3263f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e9);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) {
        String a6 = this.f3261d.a();
        p pVar = this.f3260c;
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(pVar.m(pVar.u(a6, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a6 = this.f3261d.a();
        p pVar = this.f3260c;
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(pVar.m(pVar.u(a6, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0094 A[Catch: IOException -> 0x0043, TryCatch #1 {IOException -> 0x0043, blocks: (B:8:0x002a, B:17:0x0059, B:19:0x0061, B:64:0x0076, B:66:0x0081, B:67:0x0094, B:69:0x009f, B:70:0x0039, B:73:0x0046), top: B:7:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.F.d():boolean");
    }

    public final void e(long j7) {
        this.f3263f.schedule(new H(this, this.f3259a, this.b, Math.min(Math.max(30L, 2 * j7), f3257i)), j7, TimeUnit.SECONDS);
        synchronized (this) {
            this.f3264g = true;
        }
    }
}
