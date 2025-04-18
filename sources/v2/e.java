package v2;

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
    public static final String f25981f = androidx.work.p.g("ForceStopRunnable");

    /* renamed from: g, reason: collision with root package name */
    public static final long f25982g = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b, reason: collision with root package name */
    public final Context f25983b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.k f25984c;

    /* renamed from: d, reason: collision with root package name */
    public int f25985d = 0;

    public e(Context context, m2.k kVar) {
        this.f25983b = context.getApplicationContext();
        this.f25984c = kVar;
    }

    public static void c(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (j0.b.b()) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f25982g;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.e.a():void");
    }

    public final boolean b() {
        androidx.work.b bVar = this.f25984c.f21459j;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f25981f;
        if (isEmpty) {
            androidx.work.p.e().b(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a = h.a(this.f25983b, bVar);
        androidx.work.p.e().b(str, String.format("Is default app process = %s", Boolean.valueOf(a)), new Throwable[0]);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f25981f;
        m2.k kVar = this.f25984c;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                m2.i.a(this.f25983b);
                androidx.work.p.e().b(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                    int i10 = this.f25985d + 1;
                    this.f25985d = i10;
                    if (i10 < 3) {
                        androidx.work.p.e().b(str, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e2);
                        try {
                            Thread.sleep(this.f25985d * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        androidx.work.p.e().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        kVar.f21459j.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            kVar.x();
        }
    }
}
