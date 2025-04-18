package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import java.util.concurrent.TimeUnit;

@RestrictTo
/* loaded from: classes2.dex */
public class ForceStopRunnable implements Runnable {
    public static final String d = Logger.e("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f22188f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f22189a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkManagerImpl f22190b;

    /* renamed from: c, reason: collision with root package name */
    public int f22191c = 0;

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f22192a = Logger.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            Logger.c().f(f22192a, new Throwable[0]);
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, WorkManagerImpl workManagerImpl) {
        this.f22189a = context.getApplicationContext();
        this.f22190b = workManagerImpl;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = BuildCompat.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long currentTimeMillis = System.currentTimeMillis() + f22188f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        Configuration configuration = this.f22190b.f21970b;
        configuration.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = d;
        if (isEmpty) {
            Logger.c().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a2 = ProcessUtils.a(this.f22189a, configuration);
        Logger.c().a(str, String.format("Is default app process = %s", Boolean.valueOf(a2)), new Throwable[0]);
        return a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = d;
        WorkManagerImpl workManagerImpl = this.f22190b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                WorkDatabasePathHelper.a(this.f22189a);
                Logger.c().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i2 = this.f22191c + 1;
                    this.f22191c = i2;
                    if (i2 >= 3) {
                        Logger.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        workManagerImpl.f21970b.getClass();
                        throw illegalStateException;
                    }
                    Logger.c().a(str, String.format("Retrying after %s", Long.valueOf(i2 * 300)), e);
                    try {
                        Thread.sleep(this.f22191c * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            workManagerImpl.d();
        }
    }
}
