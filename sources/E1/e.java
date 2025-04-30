package e1;

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
import androidx.core.app.NotificationCompat;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final String f20031f = androidx.work.o.g("ForceStopRunnable");

    /* renamed from: g, reason: collision with root package name */
    public static final long f20032g = TimeUnit.DAYS.toMillis(3650);
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final V0.k f20033c;

    /* renamed from: d, reason: collision with root package name */
    public int f20034d = 0;

    public e(Context context, V0.k kVar) {
        this.b = context.getApplicationContext();
        this.f20033c = kVar;
    }

    public static void c(Context context) {
        int i9;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (P.b.b()) {
            i9 = 167772160;
        } else {
            i9 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i9);
        long currentTimeMillis = System.currentTimeMillis() + f20032g;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.e.a():void");
    }

    public final boolean b() {
        androidx.work.b bVar = this.f20033c.b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f20031f;
        if (isEmpty) {
            androidx.work.o.e().b(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a6 = h.a(this.b, bVar);
        androidx.work.o.e().b(str, "Is default app process = " + a6, new Throwable[0]);
        return a6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f20031f;
        V0.k kVar = this.f20033c;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                V0.j.a(this.b);
                androidx.work.o.e().b(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e4) {
                    int i9 = this.f20034d + 1;
                    this.f20034d = i9;
                    if (i9 < 3) {
                        androidx.work.o.e().b(str, "Retrying after " + (i9 * 300), e4);
                        try {
                            Thread.sleep(this.f20034d * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        androidx.work.o.e().d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        kVar.b.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            kVar.x();
        }
    }
}
