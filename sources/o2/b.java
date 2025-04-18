package o2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.p;
import androidx.work.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m2.k;
import u2.j;

/* loaded from: classes.dex */
public final class b implements m2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f22970f = p.g("CommandHandler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f22971b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22972c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f22973d = new Object();

    public b(Context context) {
        this.f22971b = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public final void c(Intent intent, int i10, h hVar) {
        boolean z10;
        boolean z11;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            p.e().b(f22970f, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            d dVar = new d(this.f22971b, i10, hVar);
            ArrayList g10 = hVar.f22994g.f21460k.h().g();
            String str = c.a;
            Iterator it = g10.iterator();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (it.hasNext()) {
                androidx.work.d dVar2 = ((j) it.next()).f25460j;
                z12 |= dVar2.f2190d;
                z13 |= dVar2.f2188b;
                z14 |= dVar2.f2191e;
                if (dVar2.a != q.NOT_REQUIRED) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z15 |= z11;
                if (z12 && z13 && z14 && z15) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z13).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z14).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z15);
            context.sendBroadcast(intent2);
            q2.c cVar = dVar.f22976c;
            cVar.b(g10);
            ArrayList arrayList = new ArrayList(g10.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = g10.iterator();
            while (it2.hasNext()) {
                j jVar = (j) it2.next();
                String str3 = jVar.a;
                if (currentTimeMillis >= jVar.a() && (!jVar.b() || cVar.a(str3))) {
                    arrayList.add(jVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((j) it3.next()).a;
                Intent a = a(context, str4);
                p.e().b(d.f22974d, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                hVar.e(new d.d(hVar, a, dVar.f22975b));
            }
            cVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            p.e().b(f22970f, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            hVar.f22994g.y();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            p.e().c(f22970f, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            String str5 = f22970f;
            p.e().b(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = hVar.f22994g.f21460k;
            workDatabase.beginTransaction();
            try {
                j k10 = workDatabase.h().k(string);
                if (k10 == null) {
                    p.e().h(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (k10.f25452b.a()) {
                    p.e().h(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long a10 = k10.a();
                    boolean b3 = k10.b();
                    Context context2 = this.f22971b;
                    k kVar = hVar.f22994g;
                    if (!b3) {
                        p.e().b(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a10)), new Throwable[0]);
                        a.b(context2, kVar, string, a10);
                    } else {
                        p.e().b(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a10)), new Throwable[0]);
                        a.b(context2, kVar, string, a10);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        hVar.e(new d.d(hVar, intent3, i10));
                    }
                    workDatabase.setTransactionSuccessful();
                }
                return;
            } finally {
                workDatabase.endTransaction();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f22973d) {
                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                p e2 = p.e();
                String str6 = f22970f;
                e2.b(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                if (!this.f22972c.containsKey(string2)) {
                    e eVar = new e(this.f22971b, i10, string2, hVar);
                    this.f22972c.put(string2, eVar);
                    eVar.c();
                } else {
                    p.e().b(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                }
            }
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            p.e().b(f22970f, String.format("Handing stopWork work for %s", string3), new Throwable[0]);
            hVar.f22994g.A(string3);
            String str7 = a.a;
            h.c e10 = hVar.f22994g.f21460k.e();
            u2.e y4 = e10.y(string3);
            if (y4 != null) {
                a.a(this.f22971b, y4.f25447b, string3);
                p.e().b(a.a, String.format("Removing SystemIdInfo for workSpecId (%s)", string3), new Throwable[0]);
                e10.F(string3);
            }
            hVar.d(string3, false);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            Bundle extras3 = intent.getExtras();
            String string4 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z16 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            p.e().b(f22970f, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            d(string4, z16);
            return;
        }
        p.e().h(f22970f, String.format("Ignoring intent %s", intent), new Throwable[0]);
    }

    @Override // m2.a
    public final void d(String str, boolean z10) {
        synchronized (this.f22973d) {
            m2.a aVar = (m2.a) this.f22972c.remove(str);
            if (aVar != null) {
                aVar.d(str, z10);
            }
        }
    }
}
