package X0;

import Q7.n0;
import V0.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.o;
import d1.C2163d;
import d1.C2168i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class b implements V0.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f3631f = o.g("CommandHandler");
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3632c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3633d = new Object();

    public b(Context context) {
        this.b = context;
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

    @Override // V0.a
    public final void c(String str, boolean z8) {
        synchronized (this.f3633d) {
            try {
                V0.a aVar = (V0.a) this.f3632c.remove(str);
                if (aVar != null) {
                    aVar.c(str, z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Intent intent, int i9, h hVar) {
        boolean z8;
        int i10 = 1;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o.e().b(f3631f, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            d dVar = new d(this.b, i9, hVar);
            ArrayList e4 = hVar.f3650g.f3418c.n().e();
            String str = c.f3634a;
            Iterator it = e4.iterator();
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                androidx.work.c cVar = ((C2168i) it.next()).f19809j;
                z9 |= cVar.f5205d;
                z10 |= cVar.b;
                z11 |= cVar.f5206e;
                if (cVar.f5203a != 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z12 |= z8;
                if (z9 && z10 && z11 && z12) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f5225a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f3636a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
            context.sendBroadcast(intent2);
            Z0.c cVar2 = dVar.f3637c;
            cVar2.b(e4);
            ArrayList arrayList = new ArrayList(e4.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = e4.iterator();
            while (it2.hasNext()) {
                C2168i c2168i = (C2168i) it2.next();
                String str3 = c2168i.f19801a;
                if (currentTimeMillis >= c2168i.a() && (!c2168i.b() || cVar2.a(str3))) {
                    arrayList.add(c2168i);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((C2168i) it3.next()).f19801a;
                Intent a6 = a(context, str4);
                o.e().b(d.f3635d, AbstractC2914a.e("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                hVar.e(new B3.b(dVar.b, hVar, a6, i10));
            }
            cVar2.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o.e().b(f3631f, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i9)), new Throwable[0]);
            hVar.f3650g.y();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                String str5 = f3631f;
                o.e().b(str5, AbstractC2914a.d("Handling schedule work for ", string), new Throwable[0]);
                WorkDatabase workDatabase = hVar.f3650g.f3418c;
                workDatabase.c();
                try {
                    C2168i j7 = workDatabase.n().j(string);
                    if (j7 == null) {
                        o.e().h(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    } else if (n0.b(j7.b)) {
                        o.e().h(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    } else {
                        long a9 = j7.a();
                        boolean b = j7.b();
                        Context context2 = this.b;
                        k kVar = hVar.f3650g;
                        if (!b) {
                            o.e().b(str5, "Setting up Alarms for " + string + " at " + a9, new Throwable[0]);
                            a.b(context2, kVar, string, a9);
                        } else {
                            o.e().b(str5, "Opportunistically setting an alarm for " + string + " at " + a9, new Throwable[0]);
                            a.b(context2, kVar, string, a9);
                            Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                            intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                            hVar.e(new B3.b(i9, hVar, intent3, i10));
                        }
                        workDatabase.h();
                    }
                    workDatabase.f();
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            }
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f3633d) {
                    try {
                        String string2 = extras2.getString("KEY_WORKSPEC_ID");
                        o e9 = o.e();
                        String str6 = f3631f;
                        e9.b(str6, "Handing delay met for " + string2, new Throwable[0]);
                        if (!this.f3632c.containsKey(string2)) {
                            e eVar = new e(this.b, i9, string2, hVar);
                            this.f3632c.put(string2, eVar);
                            eVar.d();
                        } else {
                            o.e().b(str6, "WorkSpec " + string2 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        }
                    } finally {
                    }
                }
                return;
            }
            if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                o.e().b(f3631f, AbstractC2914a.d("Handing stopWork work for ", string3), new Throwable[0]);
                hVar.f3650g.A(string3);
                String str7 = a.f3630a;
                C.c k6 = hVar.f3650g.f3418c.k();
                C2163d s5 = k6.s(string3);
                if (s5 != null) {
                    a.a(this.b, s5.b, string3);
                    o.e().b(a.f3630a, AbstractC2914a.e("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                    k6.z(string3);
                }
                hVar.c(string3, false);
                return;
            }
            if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras3 = intent.getExtras();
                String string4 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z13 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                o.e().b(f3631f, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i9)), new Throwable[0]);
                c(string4, z13);
                return;
            }
            o.e().h(f3631f, String.format("Ignoring intent %s", intent), new Throwable[0]);
            return;
        }
        o.e().d(f3631f, AbstractC2914a.e("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
    }
}
