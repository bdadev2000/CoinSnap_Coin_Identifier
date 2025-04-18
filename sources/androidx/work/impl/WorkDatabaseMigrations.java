package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

@RestrictTo
/* loaded from: classes2.dex */
public class WorkDatabaseMigrations {

    /* renamed from: a, reason: collision with root package name */
    public static final Migration f21951a = new Migration(1, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Migration f21952b = new Migration(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final Migration f21953c = new Migration(4, 5);
    public static final Migration d = new Migration(6, 7);
    public static final Migration e = new Migration(7, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final Migration f21954f = new Migration(8, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final Migration f21955g = new Migration(11, 12);

    /* renamed from: androidx.work.impl.WorkDatabaseMigrations$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.g("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS alarmInfo");
            frameworkSQLiteDatabase.g("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabaseMigrations$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabaseMigrations$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            frameworkSQLiteDatabase.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabaseMigrations$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabaseMigrations$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabaseMigrations$6, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabaseMigrations$7, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes2.dex */
    public static class RescheduleMigration extends Migration {

        /* renamed from: c, reason: collision with root package name */
        public final Context f21956c;

        public RescheduleMigration(Context context, int i2, int i3) {
            super(i2, i3);
            this.f21956c = context;
        }

        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            if (this.f21412b >= 10) {
                frameworkSQLiteDatabase.p("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f21956c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class WorkMigration9To10 extends Migration {

        /* renamed from: c, reason: collision with root package name */
        public final Context f21957c;

        public WorkMigration9To10(Context context) {
            super(9, 10);
            this.f21957c = context;
        }

        @Override // androidx.room.migration.Migration
        public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.f21957c;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j3 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                frameworkSQLiteDatabase.d();
                try {
                    frameworkSQLiteDatabase.p("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    frameworkSQLiteDatabase.p("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                    sharedPreferences.edit().clear().apply();
                    frameworkSQLiteDatabase.m();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                frameworkSQLiteDatabase.d();
                try {
                    frameworkSQLiteDatabase.p("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                    frameworkSQLiteDatabase.p("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                    sharedPreferences2.edit().clear().apply();
                    frameworkSQLiteDatabase.m();
                } finally {
                }
            }
        }
    }
}
