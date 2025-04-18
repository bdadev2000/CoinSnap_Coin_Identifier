package o2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import m2.k;
import v2.r;

/* loaded from: classes.dex */
public final class h implements m2.a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f22989m = p.g("SystemAlarmDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public final Context f22990b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.a f22991c;

    /* renamed from: d, reason: collision with root package name */
    public final r f22992d;

    /* renamed from: f, reason: collision with root package name */
    public final m2.b f22993f;

    /* renamed from: g, reason: collision with root package name */
    public final k f22994g;

    /* renamed from: h, reason: collision with root package name */
    public final b f22995h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f22996i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f22997j;

    /* renamed from: k, reason: collision with root package name */
    public Intent f22998k;

    /* renamed from: l, reason: collision with root package name */
    public g f22999l;

    public h(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f22990b = applicationContext;
        this.f22995h = new b(applicationContext);
        this.f22992d = new r();
        k v10 = k.v(context);
        this.f22994g = v10;
        m2.b bVar = v10.f21463n;
        this.f22993f = bVar;
        this.f22991c = v10.f21461l;
        bVar.a(this);
        this.f22997j = new ArrayList();
        this.f22998k = null;
        this.f22996i = new Handler(Looper.getMainLooper());
    }

    public final void a(int i10, Intent intent) {
        p e2 = p.e();
        String str = f22989m;
        boolean z10 = false;
        e2.b(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            p.e().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f22997j) {
                Iterator it = this.f22997j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f22997j) {
            boolean z11 = !this.f22997j.isEmpty();
            this.f22997j.add(intent);
            if (!z11) {
                f();
            }
        }
    }

    public final void b() {
        if (this.f22996i.getLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void c() {
        p.e().b(f22989m, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        m2.b bVar = this.f22993f;
        synchronized (bVar.f21443m) {
            bVar.f21442l.remove(this);
        }
        ScheduledExecutorService scheduledExecutorService = this.f22992d.a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f22999l = null;
    }

    @Override // m2.a
    public final void d(String str, boolean z10) {
        String str2 = b.f22970f;
        Intent intent = new Intent(this.f22990b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        e(new d.d(this, intent, 0));
    }

    public final void e(Runnable runnable) {
        this.f22996i.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock a = v2.k.a(this.f22990b, "ProcessCommand");
        try {
            a.acquire();
            ((h.c) this.f22994g.f21461l).r(new f(this, 0));
        } finally {
            a.release();
        }
    }
}
