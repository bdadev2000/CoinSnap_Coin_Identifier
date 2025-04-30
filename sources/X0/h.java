package X0;

import V0.k;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.o;
import e1.t;
import g1.InterfaceC2286a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class h implements V0.a {
    public static final String m = o.g("SystemAlarmDispatcher");
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2286a f3647c;

    /* renamed from: d, reason: collision with root package name */
    public final t f3648d;

    /* renamed from: f, reason: collision with root package name */
    public final V0.b f3649f;

    /* renamed from: g, reason: collision with root package name */
    public final k f3650g;

    /* renamed from: h, reason: collision with root package name */
    public final b f3651h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f3652i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3653j;

    /* renamed from: k, reason: collision with root package name */
    public Intent f3654k;
    public g l;

    public h(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f3651h = new b(applicationContext);
        this.f3648d = new t();
        k v6 = k.v(context);
        this.f3650g = v6;
        V0.b bVar = v6.f3421f;
        this.f3649f = bVar;
        this.f3647c = v6.f3419d;
        bVar.a(this);
        this.f3653j = new ArrayList();
        this.f3654k = null;
        this.f3652i = new Handler(Looper.getMainLooper());
    }

    public final void a(int i9, Intent intent) {
        o e4 = o.e();
        String str = m;
        e4.b(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i9)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.e().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f3653j) {
                try {
                    Iterator it = this.f3653j.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i9);
        synchronized (this.f3653j) {
            try {
                boolean z8 = !this.f3653j.isEmpty();
                this.f3653j.add(intent);
                if (!z8) {
                    f();
                }
            } finally {
            }
        }
    }

    public final void b() {
        if (this.f3652i.getLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // V0.a
    public final void c(String str, boolean z8) {
        String str2 = b.f3631f;
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z8);
        e(new B3.b(0, this, intent, 1));
    }

    public final void d() {
        o.e().b(m, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f3649f.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f3648d.f20063a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.l = null;
    }

    public final void e(Runnable runnable) {
        this.f3652i.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock a6 = e1.k.a(this.b, "ProcessCommand");
        try {
            a6.acquire();
            ((C.c) this.f3650g.f3419d).p(new f(this, 0));
        } finally {
            a6.release();
        }
    }
}
