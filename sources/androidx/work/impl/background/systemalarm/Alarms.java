package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.utils.IdGenerator;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo
/* loaded from: classes.dex */
public class Alarms {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22020a = Logger.e("Alarms");

    public static void a(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, CommandHandler.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        Logger.c().a(f22020a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i2)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkManagerImpl workManagerImpl, String str, long j2) {
        int a2;
        WorkDatabase workDatabase = workManagerImpl.f21971c;
        SystemIdInfoDao e = workDatabase.e();
        SystemIdInfo a3 = e.a(str);
        if (a3 != null) {
            a(context, str, a3.f22132b);
            int i2 = a3.f22132b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i2, CommandHandler.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j2, service);
                return;
            }
            return;
        }
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        synchronized (IdGenerator.class) {
            a2 = idGenerator.a("next_alarm_manager_id");
        }
        e.c(new SystemIdInfo(str, a2));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, a2, CommandHandler.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j2, service2);
        }
    }
}
