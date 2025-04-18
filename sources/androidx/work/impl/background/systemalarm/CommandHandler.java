package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.StopWorkRunnable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes3.dex */
public class CommandHandler implements ExecutionListener {
    public static final String d = Logger.e("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f22021a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22022b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f22023c = new Object();

    public CommandHandler(Context context) {
        this.f22021a = context;
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

    public final void c(int i2, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Logger.c().a(d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            ConstraintsCommandHandler constraintsCommandHandler = new ConstraintsCommandHandler(this.f22021a, i2, systemAlarmDispatcher);
            ArrayList<WorkSpec> g2 = systemAlarmDispatcher.f22046f.f21971c.h().g();
            String str = ConstraintProxy.f22024a;
            Iterator it = g2.iterator();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                Constraints constraints = ((WorkSpec) it.next()).f22153j;
                z2 |= constraints.d;
                z3 |= constraints.f21855b;
                z4 |= constraints.e;
                z5 |= constraints.f21854a != NetworkType.f21881a;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f22025a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = constraintsCommandHandler.f22029a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            WorkConstraintsTracker workConstraintsTracker = constraintsCommandHandler.f22031c;
            workConstraintsTracker.d(g2);
            ArrayList arrayList = new ArrayList(g2.size());
            long currentTimeMillis = System.currentTimeMillis();
            for (WorkSpec workSpec : g2) {
                String str3 = workSpec.f22146a;
                if (currentTimeMillis >= workSpec.a() && (!workSpec.b() || workConstraintsTracker.c(str3))) {
                    arrayList.add(workSpec);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((WorkSpec) it2.next()).f22146a;
                Intent a2 = a(context, str4);
                Logger.c().a(ConstraintsCommandHandler.d, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(constraintsCommandHandler.f22030b, a2, systemAlarmDispatcher));
            }
            workConstraintsTracker.e();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            Logger.c().a(d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
            systemAlarmDispatcher.f22046f.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            Logger.c().b(d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            String str5 = d;
            Logger.c().a(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = systemAlarmDispatcher.f22046f.f21971c;
            workDatabase.beginTransaction();
            try {
                WorkSpec j2 = workDatabase.h().j(string);
                if (j2 == null) {
                    Logger.c().g(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (j2.f22147b.a()) {
                    Logger.c().g(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long a3 = j2.a();
                    boolean b2 = j2.b();
                    Context context2 = this.f22021a;
                    WorkManagerImpl workManagerImpl = systemAlarmDispatcher.f22046f;
                    if (b2) {
                        Logger.c().a(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a3)), new Throwable[0]);
                        Alarms.b(context2, workManagerImpl, string, a3);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        systemAlarmDispatcher.d(new SystemAlarmDispatcher.AddRunnable(i2, intent3, systemAlarmDispatcher));
                    } else {
                        Logger.c().a(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a3)), new Throwable[0]);
                        Alarms.b(context2, workManagerImpl, string, a3);
                    }
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
                return;
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f22023c) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    Logger c2 = Logger.c();
                    String str6 = d;
                    c2.a(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                    if (this.f22022b.containsKey(string2)) {
                        Logger.c().a(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                    } else {
                        DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.f22021a, i2, string2, systemAlarmDispatcher);
                        this.f22022b.put(string2, delayMetCommandHandler);
                        delayMetCommandHandler.d();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                Logger.c().g(d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z6 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            Logger.c().a(d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
            e(string3, z6);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        Logger.c().a(d, String.format("Handing stopWork work for %s", string4), new Throwable[0]);
        WorkManagerImpl workManagerImpl2 = systemAlarmDispatcher.f22046f;
        workManagerImpl2.d.b(new StopWorkRunnable(workManagerImpl2, string4, false));
        String str7 = Alarms.f22020a;
        SystemIdInfoDao e = systemAlarmDispatcher.f22046f.f21971c.e();
        SystemIdInfo a4 = e.a(string4);
        if (a4 != null) {
            Alarms.a(this.f22021a, string4, a4.f22132b);
            Logger.c().a(Alarms.f22020a, String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new Throwable[0]);
            e.d(string4);
        }
        systemAlarmDispatcher.e(string4, false);
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        synchronized (this.f22023c) {
            try {
                ExecutionListener executionListener = (ExecutionListener) this.f22022b.remove(str);
                if (executionListener != null) {
                    executionListener.e(str, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
