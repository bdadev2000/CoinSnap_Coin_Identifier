package V0;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class h extends E0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3406c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f3407d;

    public h(Context context, int i9, int i10) {
        super(i9, i10);
        this.f3407d = context;
    }

    @Override // E0.a
    public final void a(I0.b bVar) {
        switch (this.f3406c) {
            case 0:
                if (this.b >= 10) {
                    ((SQLiteDatabase) bVar.f1397c).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f3407d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f3407d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                boolean contains = sharedPreferences.contains("reschedule_needed");
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) bVar.f1397c;
                if (contains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j7 = 0;
                    long j9 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j7 = 1;
                    }
                    bVar.a();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j9)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j7)});
                        sharedPreferences.edit().clear().apply();
                        bVar.o();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i9 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.a();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i9)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.o();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f3407d = context;
    }
}
