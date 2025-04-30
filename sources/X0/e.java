package X0;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.o;
import d1.C2168i;
import e1.k;
import e1.r;
import java.util.Collections;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class e implements Z0.b, V0.a, r {
    public static final String l = o.g("DelayMetCommandHandler");
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3638c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3639d;

    /* renamed from: f, reason: collision with root package name */
    public final h f3640f;

    /* renamed from: g, reason: collision with root package name */
    public final Z0.c f3641g;

    /* renamed from: j, reason: collision with root package name */
    public PowerManager.WakeLock f3644j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3645k = false;

    /* renamed from: i, reason: collision with root package name */
    public int f3643i = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3642h = new Object();

    public e(Context context, int i9, String str, h hVar) {
        this.b = context;
        this.f3638c = i9;
        this.f3640f = hVar;
        this.f3639d = str;
        this.f3641g = new Z0.c(context, hVar.f3647c, this);
    }

    @Override // Z0.b
    public final void a(List list) {
        e();
    }

    public final void b() {
        synchronized (this.f3642h) {
            try {
                this.f3641g.c();
                this.f3640f.f3648d.b(this.f3639d);
                PowerManager.WakeLock wakeLock = this.f3644j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.e().b(l, "Releasing wakelock " + this.f3644j + " for WorkSpec " + this.f3639d, new Throwable[0]);
                    this.f3644j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V0.a
    public final void c(String str, boolean z8) {
        o.e().b(l, "onExecuted " + str + ", " + z8, new Throwable[0]);
        b();
        int i9 = this.f3638c;
        h hVar = this.f3640f;
        Context context = this.b;
        if (z8) {
            hVar.e(new B3.b(i9, hVar, b.b(context, this.f3639d), 1));
        }
        if (this.f3645k) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.e(new B3.b(i9, hVar, intent, 1));
        }
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        String str = this.f3639d;
        sb.append(str);
        sb.append(" (");
        this.f3644j = k.a(this.b, AbstractC2914a.g(sb, this.f3638c, ")"));
        o e4 = o.e();
        PowerManager.WakeLock wakeLock = this.f3644j;
        String str2 = l;
        e4.b(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f3644j.acquire();
        C2168i j7 = this.f3640f.f3650g.f3418c.n().j(str);
        if (j7 == null) {
            e();
            return;
        }
        boolean b = j7.b();
        this.f3645k = b;
        if (!b) {
            o.e().b(str2, AbstractC2914a.d("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        } else {
            this.f3641g.b(Collections.singletonList(j7));
        }
    }

    public final void e() {
        synchronized (this.f3642h) {
            try {
                if (this.f3643i < 2) {
                    this.f3643i = 2;
                    o e4 = o.e();
                    String str = l;
                    e4.b(str, "Stopping work for WorkSpec " + this.f3639d, new Throwable[0]);
                    Context context = this.b;
                    String str2 = this.f3639d;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    h hVar = this.f3640f;
                    hVar.e(new B3.b(this.f3638c, hVar, intent, 1));
                    if (this.f3640f.f3649f.d(this.f3639d)) {
                        o.e().b(str, "WorkSpec " + this.f3639d + " needs to be rescheduled", new Throwable[0]);
                        Intent b = b.b(this.b, this.f3639d);
                        h hVar2 = this.f3640f;
                        hVar2.e(new B3.b(this.f3638c, hVar2, b, 1));
                    } else {
                        o.e().b(str, "Processor does not have WorkSpec " + this.f3639d + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    o.e().b(l, "Already stopped work for " + this.f3639d, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z0.b
    public final void f(List list) {
        if (!list.contains(this.f3639d)) {
            return;
        }
        synchronized (this.f3642h) {
            try {
                if (this.f3643i == 0) {
                    this.f3643i = 1;
                    o.e().b(l, "onAllConstraintsMet for " + this.f3639d, new Throwable[0]);
                    if (this.f3640f.f3649f.g(this.f3639d, null)) {
                        this.f3640f.f3648d.a(this.f3639d, this);
                    } else {
                        b();
                    }
                } else {
                    o.e().b(l, "Already started work for " + this.f3639d, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
