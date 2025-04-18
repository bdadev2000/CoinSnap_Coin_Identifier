package u2;

import v1.f0;

/* loaded from: classes.dex */
public final class b extends v1.l {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, f0 f0Var, int i10) {
        super(f0Var);
        this.a = i10;
        this.f25444b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e1  */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Throwable] */
    @Override // v1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind(z1.j r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.b.bind(z1.j, java.lang.Object):void");
    }

    @Override // v1.n0
    public final String createQuery() {
        switch (this.a) {
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
}
