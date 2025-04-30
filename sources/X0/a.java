package X0;

import V0.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.o;
import d1.C2162c;
import d1.C2163d;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3630a = o.g("Alarms");

    public static void a(Context context, int i9, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i9, b.a(context, str), 603979776);
        if (service != null && alarmManager != null) {
            o.e().b(f3630a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i9 + ")", new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, k kVar, String str, long j7) {
        int i9;
        int i10;
        WorkDatabase workDatabase = kVar.f3418c;
        C.c k6 = workDatabase.k();
        C2163d s5 = k6.s(str);
        if (s5 != null) {
            a(context, s5.b, str);
            int i11 = s5.b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent service = PendingIntent.getService(context, i11, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j7, service);
                return;
            }
            return;
        }
        synchronized (e1.f.class) {
            workDatabase.c();
            try {
                Long k7 = workDatabase.j().k("next_alarm_manager_id");
                if (k7 != null) {
                    i9 = k7.intValue();
                } else {
                    i9 = 0;
                }
                if (i9 == Integer.MAX_VALUE) {
                    i10 = 0;
                } else {
                    i10 = i9 + 1;
                }
                workDatabase.j().v(new C2162c("next_alarm_manager_id", i10));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        k6.v(new C2163d(str, i9));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service2 = PendingIntent.getService(context, i9, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j7, service2);
        }
    }
}
