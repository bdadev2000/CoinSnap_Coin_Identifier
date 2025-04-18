package m2;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class h extends w1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21452c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f21453d;

    public h(Context context, int i10, int i11) {
        super(i10, i11);
        this.f21453d = context;
    }

    @Override // w1.a
    public final void a(a2.c cVar) {
        int i10 = this.f21452c;
        Context context = this.f21453d;
        switch (i10) {
            case 0:
                if (this.f26667b >= 10) {
                    cVar.G("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                cVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j3 = 0;
                    long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j3 = 1;
                    }
                    cVar.A();
                    try {
                        cVar.G("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                        cVar.G("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                        sharedPreferences.edit().clear().apply();
                        cVar.F();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i11 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i12 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    cVar.A();
                    try {
                        cVar.G("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i11)});
                        cVar.G("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i12)});
                        sharedPreferences2.edit().clear().apply();
                        cVar.F();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f21453d = context;
    }
}
