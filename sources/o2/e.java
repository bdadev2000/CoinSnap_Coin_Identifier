package o2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u2.j;
import v2.k;
import v2.p;

/* loaded from: classes.dex */
public final class e implements q2.b, m2.a, p {

    /* renamed from: l, reason: collision with root package name */
    public static final String f22977l = androidx.work.p.g("DelayMetCommandHandler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f22978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22979c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22980d;

    /* renamed from: f, reason: collision with root package name */
    public final h f22981f;

    /* renamed from: g, reason: collision with root package name */
    public final q2.c f22982g;

    /* renamed from: j, reason: collision with root package name */
    public PowerManager.WakeLock f22985j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22986k = false;

    /* renamed from: i, reason: collision with root package name */
    public int f22984i = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Object f22983h = new Object();

    public e(Context context, int i10, String str, h hVar) {
        this.f22978b = context;
        this.f22979c = i10;
        this.f22981f = hVar;
        this.f22980d = str;
        this.f22982g = new q2.c(context, hVar.f22991c, this);
    }

    public final void a() {
        synchronized (this.f22983h) {
            this.f22982g.c();
            this.f22981f.f22992d.b(this.f22980d);
            PowerManager.WakeLock wakeLock = this.f22985j;
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.p.e().b(f22977l, String.format("Releasing wakelock %s for WorkSpec %s", this.f22985j, this.f22980d), new Throwable[0]);
                this.f22985j.release();
            }
        }
    }

    @Override // q2.b
    public final void b(ArrayList arrayList) {
        e();
    }

    public final void c() {
        String str = this.f22980d;
        this.f22985j = k.a(this.f22978b, String.format("%s (%s)", str, Integer.valueOf(this.f22979c)));
        androidx.work.p e2 = androidx.work.p.e();
        Object[] objArr = {this.f22985j, str};
        String str2 = f22977l;
        e2.b(str2, String.format("Acquiring wakelock %s for WorkSpec %s", objArr), new Throwable[0]);
        this.f22985j.acquire();
        j k10 = this.f22981f.f22994g.f21460k.h().k(str);
        if (k10 == null) {
            e();
            return;
        }
        boolean b3 = k10.b();
        this.f22986k = b3;
        if (!b3) {
            androidx.work.p.e().b(str2, String.format("No constraints for %s", str), new Throwable[0]);
            f(Collections.singletonList(str));
        } else {
            this.f22982g.b(Collections.singletonList(k10));
        }
    }

    @Override // m2.a
    public final void d(String str, boolean z10) {
        androidx.work.p.e().b(f22977l, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        a();
        int i10 = this.f22979c;
        h hVar = this.f22981f;
        Context context = this.f22978b;
        if (z10) {
            hVar.e(new d.d(hVar, b.b(context, this.f22980d), i10));
        }
        if (this.f22986k) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.e(new d.d(hVar, intent, i10));
        }
    }

    public final void e() {
        synchronized (this.f22983h) {
            if (this.f22984i < 2) {
                this.f22984i = 2;
                androidx.work.p e2 = androidx.work.p.e();
                String str = f22977l;
                e2.b(str, String.format("Stopping work for WorkSpec %s", this.f22980d), new Throwable[0]);
                Context context = this.f22978b;
                String str2 = this.f22980d;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                h hVar = this.f22981f;
                hVar.e(new d.d(hVar, intent, this.f22979c));
                if (this.f22981f.f22993f.c(this.f22980d)) {
                    androidx.work.p.e().b(str, String.format("WorkSpec %s needs to be rescheduled", this.f22980d), new Throwable[0]);
                    Intent b3 = b.b(this.f22978b, this.f22980d);
                    h hVar2 = this.f22981f;
                    hVar2.e(new d.d(hVar2, b3, this.f22979c));
                } else {
                    androidx.work.p.e().b(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f22980d), new Throwable[0]);
                }
            } else {
                androidx.work.p.e().b(f22977l, String.format("Already stopped work for %s", this.f22980d), new Throwable[0]);
            }
        }
    }

    @Override // q2.b
    public final void f(List list) {
        if (!list.contains(this.f22980d)) {
            return;
        }
        synchronized (this.f22983h) {
            if (this.f22984i == 0) {
                this.f22984i = 1;
                androidx.work.p.e().b(f22977l, String.format("onAllConstraintsMet for %s", this.f22980d), new Throwable[0]);
                if (this.f22981f.f22993f.f(this.f22980d, null)) {
                    this.f22981f.f22992d.a(this.f22980d, this);
                } else {
                    a();
                }
            } else {
                androidx.work.p.e().b(f22977l, String.format("Already started work for %s", this.f22980d), new Throwable[0]);
            }
        }
    }
}
