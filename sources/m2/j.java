package m2;

import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import v1.f0;
import v1.g0;
import v1.h0;

/* loaded from: classes.dex */
public final class j extends g0 {
    public final /* synthetic */ WorkDatabase_Impl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WorkDatabase_Impl workDatabase_Impl) {
        super(12);
        this.a = workDatabase_Impl;
    }

    @Override // v1.g0
    public final void createAllTables(z1.a aVar) {
        a2.c cVar = (a2.c) aVar;
        cVar.C("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.C("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        cVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        cVar.C("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.C("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.C("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.C("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    @Override // v1.g0
    public final void dropAllTables(z1.a db2) {
        List list;
        List list2;
        List list3;
        a2.c cVar = (a2.c) db2;
        cVar.C("DROP TABLE IF EXISTS `Dependency`");
        cVar.C("DROP TABLE IF EXISTS `WorkSpec`");
        cVar.C("DROP TABLE IF EXISTS `WorkTag`");
        cVar.C("DROP TABLE IF EXISTS `SystemIdInfo`");
        cVar.C("DROP TABLE IF EXISTS `WorkName`");
        cVar.C("DROP TABLE IF EXISTS `WorkProgress`");
        cVar.C("DROP TABLE IF EXISTS `Preference`");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        list = ((f0) workDatabase_Impl).mCallbacks;
        if (list != null) {
            list2 = ((f0) workDatabase_Impl).mCallbacks;
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                list3 = ((f0) workDatabase_Impl).mCallbacks;
                ((f) list3.get(i10)).getClass();
                Intrinsics.checkNotNullParameter(db2, "db");
            }
        }
    }

    @Override // v1.g0
    public final void onCreate(z1.a db2) {
        List list;
        List list2;
        List list3;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        list = ((f0) workDatabase_Impl).mCallbacks;
        if (list != null) {
            list2 = ((f0) workDatabase_Impl).mCallbacks;
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                list3 = ((f0) workDatabase_Impl).mCallbacks;
                ((f) list3.get(i10)).getClass();
                Intrinsics.checkNotNullParameter(db2, "db");
            }
        }
    }

    @Override // v1.g0
    public final void onOpen(z1.a aVar) {
        List list;
        List list2;
        List list3;
        a2.c cVar = (a2.c) aVar;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        ((f0) workDatabase_Impl).mDatabase = cVar;
        cVar.C("PRAGMA foreign_keys = ON");
        workDatabase_Impl.internalInitInvalidationTracker(aVar);
        list = ((f0) workDatabase_Impl).mCallbacks;
        if (list != null) {
            list2 = ((f0) workDatabase_Impl).mCallbacks;
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                list3 = ((f0) workDatabase_Impl).mCallbacks;
                ((f) list3.get(i10)).getClass();
                f.a(aVar);
            }
        }
    }

    @Override // v1.g0
    public final void onPostMigrate(z1.a aVar) {
    }

    @Override // v1.g0
    public final void onPreMigrate(z1.a aVar) {
        com.facebook.internal.i.n(aVar);
    }

    @Override // v1.g0
    public final h0 onValidateSchema(z1.a aVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new x1.b(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap.put("prerequisite_id", new x1.b(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new x1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new x1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new x1.e("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new x1.e("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        x1.f fVar = new x1.f("Dependency", hashMap, hashSet, hashSet2);
        x1.f a = x1.f.a(aVar, "Dependency");
        if (!fVar.equals(a)) {
            return new h0(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new x1.b(1, "id", "TEXT", null, true, 1));
        hashMap2.put("state", new x1.b(0, "state", "INTEGER", null, true, 1));
        hashMap2.put("worker_class_name", new x1.b(0, "worker_class_name", "TEXT", null, true, 1));
        hashMap2.put("input_merger_class_name", new x1.b(0, "input_merger_class_name", "TEXT", null, false, 1));
        hashMap2.put("input", new x1.b(0, "input", "BLOB", null, true, 1));
        hashMap2.put("output", new x1.b(0, "output", "BLOB", null, true, 1));
        hashMap2.put("initial_delay", new x1.b(0, "initial_delay", "INTEGER", null, true, 1));
        hashMap2.put("interval_duration", new x1.b(0, "interval_duration", "INTEGER", null, true, 1));
        hashMap2.put("flex_duration", new x1.b(0, "flex_duration", "INTEGER", null, true, 1));
        hashMap2.put("run_attempt_count", new x1.b(0, "run_attempt_count", "INTEGER", null, true, 1));
        hashMap2.put("backoff_policy", new x1.b(0, "backoff_policy", "INTEGER", null, true, 1));
        hashMap2.put("backoff_delay_duration", new x1.b(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        hashMap2.put("period_start_time", new x1.b(0, "period_start_time", "INTEGER", null, true, 1));
        hashMap2.put("minimum_retention_duration", new x1.b(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        hashMap2.put("schedule_requested_at", new x1.b(0, "schedule_requested_at", "INTEGER", null, true, 1));
        hashMap2.put("run_in_foreground", new x1.b(0, "run_in_foreground", "INTEGER", null, true, 1));
        hashMap2.put("out_of_quota_policy", new x1.b(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        hashMap2.put("required_network_type", new x1.b(0, "required_network_type", "INTEGER", null, false, 1));
        hashMap2.put("requires_charging", new x1.b(0, "requires_charging", "INTEGER", null, true, 1));
        hashMap2.put("requires_device_idle", new x1.b(0, "requires_device_idle", "INTEGER", null, true, 1));
        hashMap2.put("requires_battery_not_low", new x1.b(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        hashMap2.put("requires_storage_not_low", new x1.b(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        hashMap2.put("trigger_content_update_delay", new x1.b(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        hashMap2.put("trigger_max_content_delay", new x1.b(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        hashMap2.put("content_uri_triggers", new x1.b(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new x1.e("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new x1.e("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        x1.f fVar2 = new x1.f("WorkSpec", hashMap2, hashSet3, hashSet4);
        x1.f a10 = x1.f.a(aVar, "WorkSpec");
        if (!fVar2.equals(a10)) {
            return new h0(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a10);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new x1.b(1, "tag", "TEXT", null, true, 1));
        hashMap3.put("work_spec_id", new x1.b(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new x1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new x1.e("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        x1.f fVar3 = new x1.f("WorkTag", hashMap3, hashSet5, hashSet6);
        x1.f a11 = x1.f.a(aVar, "WorkTag");
        if (!fVar3.equals(a11)) {
            return new h0(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a11);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new x1.b(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap4.put("system_id", new x1.b(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new x1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        x1.f fVar4 = new x1.f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        x1.f a12 = x1.f.a(aVar, "SystemIdInfo");
        if (!fVar4.equals(a12)) {
            return new h0(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a12);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new x1.b(1, "name", "TEXT", null, true, 1));
        hashMap5.put("work_spec_id", new x1.b(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new x1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new x1.e("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        x1.f fVar5 = new x1.f("WorkName", hashMap5, hashSet8, hashSet9);
        x1.f a13 = x1.f.a(aVar, "WorkName");
        if (!fVar5.equals(a13)) {
            return new h0(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a13);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new x1.b(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap6.put(NotificationCompat.CATEGORY_PROGRESS, new x1.b(0, NotificationCompat.CATEGORY_PROGRESS, "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new x1.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        x1.f fVar6 = new x1.f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        x1.f a14 = x1.f.a(aVar, "WorkProgress");
        if (!fVar6.equals(a14)) {
            return new h0(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a14);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new x1.b(1, "key", "TEXT", null, true, 1));
        hashMap7.put("long_value", new x1.b(0, "long_value", "INTEGER", null, false, 1));
        x1.f fVar7 = new x1.f("Preference", hashMap7, new HashSet(0), new HashSet(0));
        x1.f a15 = x1.f.a(aVar, "Preference");
        if (!fVar7.equals(a15)) {
            return new h0(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a15);
        }
        return new h0(true, null);
    }
}
