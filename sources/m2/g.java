package m2;

/* loaded from: classes.dex */
public final class g extends w1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11, int i12) {
        super(i10, i11);
        this.f21451c = i12;
    }

    @Override // w1.a
    public final void a(a2.c cVar) {
        switch (this.f21451c) {
            case 0:
                cVar.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.C("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
                cVar.C("DROP TABLE IF EXISTS alarmInfo");
                cVar.C("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
                return;
            case 1:
                cVar.C("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
                return;
            case 2:
                cVar.C("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                cVar.C("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 3:
                cVar.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                return;
            case 4:
                cVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
                return;
            case 5:
                cVar.C("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            default:
                cVar.C("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
        }
    }
}
