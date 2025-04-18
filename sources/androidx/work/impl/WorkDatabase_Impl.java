package androidx.work.impl;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTagDao_Impl;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: c, reason: collision with root package name */
    public volatile WorkSpecDao_Impl f21960c;
    public volatile DependencyDao_Impl d;
    public volatile WorkTagDao_Impl e;

    /* renamed from: f, reason: collision with root package name */
    public volatile SystemIdInfoDao_Impl f21961f;

    /* renamed from: g, reason: collision with root package name */
    public volatile WorkNameDao_Impl f21962g;

    /* renamed from: h, reason: collision with root package name */
    public volatile WorkProgressDao_Impl f21963h;

    /* renamed from: i, reason: collision with root package name */
    public volatile PreferenceDao_Impl f21964i;

    @Override // androidx.work.impl.WorkDatabase
    public final DependencyDao c() {
        DependencyDao_Impl dependencyDao_Impl;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new DependencyDao_Impl(this);
                }
                dependencyDao_Impl = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dependencyDao_Impl;
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase U = super.getOpenHelper().U();
        try {
            super.beginTransaction();
            U.g("PRAGMA defer_foreign_keys = TRUE");
            U.g("DELETE FROM `Dependency`");
            U.g("DELETE FROM `WorkSpec`");
            U.g("DELETE FROM `WorkTag`");
            U.g("DELETE FROM `SystemIdInfo`");
            U.g("DELETE FROM `WorkName`");
            U.g("DELETE FROM `WorkProgress`");
            U.g("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            U.W("PRAGMA wal_checkpoint(FULL)").close();
            if (!U.c0()) {
                U.g("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() { // from class: androidx.work.impl.WorkDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
                frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `Dependency`");
                frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `WorkSpec`");
                frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `WorkTag`");
                frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `SystemIdInfo`");
                frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `WorkName`");
                frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `WorkProgress`");
                frameworkSQLiteDatabase.g("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                if (((RoomDatabase) workDatabase_Impl).mCallbacks != null) {
                    int size = ((RoomDatabase) workDatabase_Impl).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) workDatabase_Impl).mCallbacks.get(i2)).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                if (((RoomDatabase) workDatabase_Impl).mCallbacks != null) {
                    int size = ((RoomDatabase) workDatabase_Impl).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) workDatabase_Impl).mCallbacks.get(i2)).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) supportSQLiteDatabase;
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                ((RoomDatabase) workDatabase_Impl).mDatabase = frameworkSQLiteDatabase;
                frameworkSQLiteDatabase.g("PRAGMA foreign_keys = ON");
                workDatabase_Impl.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (((RoomDatabase) workDatabase_Impl).mCallbacks != null) {
                    int size = ((RoomDatabase) workDatabase_Impl).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) workDatabase_Impl).mCallbacks.get(i2)).a(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.a(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new TableInfo.Column(1, "work_spec_id", "TEXT", null, true, 1));
                hashMap.put("prerequisite_id", new TableInfo.Column(2, "prerequisite_id", "TEXT", null, true, 1));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new TableInfo.Index("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
                hashSet2.add(new TableInfo.Index("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
                TableInfo tableInfo = new TableInfo("Dependency", hashMap, hashSet, hashSet2);
                TableInfo a2 = TableInfo.a(supportSQLiteDatabase, "Dependency");
                if (!tableInfo.equals(a2)) {
                    return new RoomOpenHelper.ValidationResult(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo + "\n Found:\n" + a2);
                }
                HashMap hashMap2 = new HashMap(25);
                hashMap2.put("id", new TableInfo.Column(1, "id", "TEXT", null, true, 1));
                hashMap2.put("state", new TableInfo.Column(0, "state", "INTEGER", null, true, 1));
                hashMap2.put("worker_class_name", new TableInfo.Column(0, "worker_class_name", "TEXT", null, true, 1));
                hashMap2.put("input_merger_class_name", new TableInfo.Column(0, "input_merger_class_name", "TEXT", null, false, 1));
                hashMap2.put("input", new TableInfo.Column(0, "input", "BLOB", null, true, 1));
                hashMap2.put(AgentOptions.OUTPUT, new TableInfo.Column(0, AgentOptions.OUTPUT, "BLOB", null, true, 1));
                hashMap2.put("initial_delay", new TableInfo.Column(0, "initial_delay", "INTEGER", null, true, 1));
                hashMap2.put("interval_duration", new TableInfo.Column(0, "interval_duration", "INTEGER", null, true, 1));
                hashMap2.put("flex_duration", new TableInfo.Column(0, "flex_duration", "INTEGER", null, true, 1));
                hashMap2.put("run_attempt_count", new TableInfo.Column(0, "run_attempt_count", "INTEGER", null, true, 1));
                hashMap2.put("backoff_policy", new TableInfo.Column(0, "backoff_policy", "INTEGER", null, true, 1));
                hashMap2.put("backoff_delay_duration", new TableInfo.Column(0, "backoff_delay_duration", "INTEGER", null, true, 1));
                hashMap2.put("period_start_time", new TableInfo.Column(0, "period_start_time", "INTEGER", null, true, 1));
                hashMap2.put("minimum_retention_duration", new TableInfo.Column(0, "minimum_retention_duration", "INTEGER", null, true, 1));
                hashMap2.put("schedule_requested_at", new TableInfo.Column(0, "schedule_requested_at", "INTEGER", null, true, 1));
                hashMap2.put("run_in_foreground", new TableInfo.Column(0, "run_in_foreground", "INTEGER", null, true, 1));
                hashMap2.put("out_of_quota_policy", new TableInfo.Column(0, "out_of_quota_policy", "INTEGER", null, true, 1));
                hashMap2.put("required_network_type", new TableInfo.Column(0, "required_network_type", "INTEGER", null, false, 1));
                hashMap2.put("requires_charging", new TableInfo.Column(0, "requires_charging", "INTEGER", null, true, 1));
                hashMap2.put("requires_device_idle", new TableInfo.Column(0, "requires_device_idle", "INTEGER", null, true, 1));
                hashMap2.put("requires_battery_not_low", new TableInfo.Column(0, "requires_battery_not_low", "INTEGER", null, true, 1));
                hashMap2.put("requires_storage_not_low", new TableInfo.Column(0, "requires_storage_not_low", "INTEGER", null, true, 1));
                hashMap2.put("trigger_content_update_delay", new TableInfo.Column(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
                hashMap2.put("trigger_max_content_delay", new TableInfo.Column(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
                hashMap2.put("content_uri_triggers", new TableInfo.Column(0, "content_uri_triggers", "BLOB", null, false, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new TableInfo.Index("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
                hashSet4.add(new TableInfo.Index("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
                TableInfo tableInfo2 = new TableInfo("WorkSpec", hashMap2, hashSet3, hashSet4);
                TableInfo a3 = TableInfo.a(supportSQLiteDatabase, "WorkSpec");
                if (!tableInfo2.equals(a3)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo2 + "\n Found:\n" + a3);
                }
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new TableInfo.Column(1, "tag", "TEXT", null, true, 1));
                hashMap3.put("work_spec_id", new TableInfo.Column(2, "work_spec_id", "TEXT", null, true, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
                TableInfo tableInfo3 = new TableInfo("WorkTag", hashMap3, hashSet5, hashSet6);
                TableInfo a4 = TableInfo.a(supportSQLiteDatabase, "WorkTag");
                if (!tableInfo3.equals(a4)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + a4);
                }
                HashMap hashMap4 = new HashMap(2);
                hashMap4.put("work_spec_id", new TableInfo.Column(1, "work_spec_id", "TEXT", null, true, 1));
                hashMap4.put("system_id", new TableInfo.Column(0, "system_id", "INTEGER", null, true, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                TableInfo tableInfo4 = new TableInfo("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                TableInfo a5 = TableInfo.a(supportSQLiteDatabase, "SystemIdInfo");
                if (!tableInfo4.equals(a5)) {
                    return new RoomOpenHelper.ValidationResult(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo4 + "\n Found:\n" + a5);
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("name", new TableInfo.Column(1, "name", "TEXT", null, true, 1));
                hashMap5.put("work_spec_id", new TableInfo.Column(2, "work_spec_id", "TEXT", null, true, 1));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new TableInfo.Index("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
                TableInfo tableInfo5 = new TableInfo("WorkName", hashMap5, hashSet8, hashSet9);
                TableInfo a6 = TableInfo.a(supportSQLiteDatabase, "WorkName");
                if (!tableInfo5.equals(a6)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo5 + "\n Found:\n" + a6);
                }
                HashMap hashMap6 = new HashMap(2);
                hashMap6.put("work_spec_id", new TableInfo.Column(1, "work_spec_id", "TEXT", null, true, 1));
                hashMap6.put("progress", new TableInfo.Column(0, "progress", "BLOB", null, true, 1));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                TableInfo tableInfo6 = new TableInfo("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                TableInfo a7 = TableInfo.a(supportSQLiteDatabase, "WorkProgress");
                if (!tableInfo6.equals(a7)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + tableInfo6 + "\n Found:\n" + a7);
                }
                HashMap hashMap7 = new HashMap(2);
                hashMap7.put(SDKConstants.PARAM_KEY, new TableInfo.Column(1, SDKConstants.PARAM_KEY, "TEXT", null, true, 1));
                hashMap7.put("long_value", new TableInfo.Column(0, "long_value", "INTEGER", null, false, 1));
                TableInfo tableInfo7 = new TableInfo("Preference", hashMap7, new HashSet(0), new HashSet(0));
                TableInfo a8 = TableInfo.a(supportSQLiteDatabase, "Preference");
                if (tableInfo7.equals(a8)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + tableInfo7 + "\n Found:\n" + a8);
            }
        }, "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        SupportSQLiteOpenHelper.Configuration.Builder a2 = SupportSQLiteOpenHelper.Configuration.Companion.a(databaseConfiguration.f21249a);
        a2.f21463b = databaseConfiguration.f21250b;
        a2.f21464c = roomOpenHelper;
        return databaseConfiguration.f21251c.a(a2.a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final PreferenceDao d() {
        PreferenceDao_Impl preferenceDao_Impl;
        if (this.f21964i != null) {
            return this.f21964i;
        }
        synchronized (this) {
            try {
                if (this.f21964i == null) {
                    this.f21964i = new PreferenceDao_Impl(this);
                }
                preferenceDao_Impl = this.f21964i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final SystemIdInfoDao e() {
        SystemIdInfoDao_Impl systemIdInfoDao_Impl;
        if (this.f21961f != null) {
            return this.f21961f;
        }
        synchronized (this) {
            try {
                if (this.f21961f == null) {
                    this.f21961f = new SystemIdInfoDao_Impl(this);
                }
                systemIdInfoDao_Impl = this.f21961f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemIdInfoDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkNameDao f() {
        WorkNameDao_Impl workNameDao_Impl;
        if (this.f21962g != null) {
            return this.f21962g;
        }
        synchronized (this) {
            try {
                if (this.f21962g == null) {
                    this.f21962g = new WorkNameDao_Impl(this);
                }
                workNameDao_Impl = this.f21962g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workNameDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkProgressDao g() {
        WorkProgressDao_Impl workProgressDao_Impl;
        if (this.f21963h != null) {
            return this.f21963h;
        }
        synchronized (this) {
            try {
                if (this.f21963h == null) {
                    this.f21963h = new WorkProgressDao_Impl(this);
                }
                workProgressDao_Impl = this.f21963h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workProgressDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkSpecDao h() {
        WorkSpecDao_Impl workSpecDao_Impl;
        if (this.f21960c != null) {
            return this.f21960c;
        }
        synchronized (this) {
            try {
                if (this.f21960c == null) {
                    this.f21960c = new WorkSpecDao_Impl(this);
                }
                workSpecDao_Impl = this.f21960c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workSpecDao_Impl;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkTagDao i() {
        WorkTagDao_Impl workTagDao_Impl;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = new WorkTagDao_Impl(this);
                }
                workTagDao_Impl = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workTagDao_Impl;
    }
}
