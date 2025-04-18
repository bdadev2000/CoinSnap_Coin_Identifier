package v2;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final String f26011e = androidx.work.p.g("WorkTimer");
    public final ScheduledExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f26012b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f26013c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26014d;

    public r() {
        k0.j jVar = new k0.j(this);
        this.f26012b = new HashMap();
        this.f26013c = new HashMap();
        this.f26014d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(jVar);
    }

    public final void a(String str, p pVar) {
        synchronized (this.f26014d) {
            androidx.work.p.e().b(f26011e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            q qVar = new q(this, str);
            this.f26012b.put(str, qVar);
            this.f26013c.put(str, pVar);
            this.a.schedule(qVar, TTAdConstant.AD_MAX_EVENT_TIME, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f26014d) {
            if (((q) this.f26012b.remove(str)) != null) {
                androidx.work.p.e().b(f26011e, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f26013c.remove(str);
            }
        }
    }
}
