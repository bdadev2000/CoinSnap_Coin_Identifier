package e1;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final String f20062e = androidx.work.o.g("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20063a;
    public final HashMap b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20064c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20065d;

    /* JADX WARN: Type inference failed for: r0v0, types: [e1.q, java.lang.Object, java.util.concurrent.ThreadFactory] */
    public t() {
        ?? obj = new Object();
        obj.f20060a = 0;
        this.b = new HashMap();
        this.f20064c = new HashMap();
        this.f20065d = new Object();
        this.f20063a = Executors.newSingleThreadScheduledExecutor(obj);
    }

    public final void a(String str, r rVar) {
        synchronized (this.f20065d) {
            androidx.work.o.e().b(f20062e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            s sVar = new s(this, str);
            this.b.put(str, sVar);
            this.f20064c.put(str, rVar);
            this.f20063a.schedule(sVar, TTAdConstant.AD_MAX_EVENT_TIME, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f20065d) {
            try {
                if (((s) this.b.remove(str)) != null) {
                    androidx.work.o.e().b(f20062e, "Stopping timer for " + str, new Throwable[0]);
                    this.f20064c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
