package o2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import m2.k;

/* loaded from: classes.dex */
public abstract class a {
    public static final String a = p.g("Alarms");

    public static void a(Context context, int i10, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, b.a(context, str), 603979776);
        if (service != null && alarmManager != null) {
            p.e().b(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, k kVar, String str, long j3) {
        int a10;
        WorkDatabase workDatabase = kVar.f21460k;
        h.c e2 = workDatabase.e();
        u2.e y4 = e2.y(str);
        if (y4 != null) {
            a(context, y4.f25447b, str);
            int i10 = y4.f25447b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent service = PendingIntent.getService(context, i10, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j3, service);
                return;
            }
            return;
        }
        v2.f fVar = new v2.f(workDatabase);
        synchronized (v2.f.class) {
            a10 = fVar.a("next_alarm_manager_id");
        }
        e2.C(new u2.e(str, a10));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service2 = PendingIntent.getService(context, a10, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j3, service2);
        }
    }
}
