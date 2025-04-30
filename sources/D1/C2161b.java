package d1;

import D0.o;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2161b extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2161b(D0.j jVar, int i9) {
        super(jVar);
        this.f19794d = i9;
    }

    @Override // D0.o
    public final String b() {
        switch (this.f19794d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0215  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x01ef -> B:68:0x0209). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(I0.f r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C2161b.d(I0.f, java.lang.Object):void");
    }

    public final void e(Object obj) {
        I0.f a6 = a();
        try {
            d(a6, obj);
            a6.f1407f.executeInsert();
        } finally {
            c(a6);
        }
    }
}
