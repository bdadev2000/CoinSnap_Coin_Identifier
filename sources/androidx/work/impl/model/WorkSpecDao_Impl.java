package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.jacoco.core.runtime.AgentOptions;
import p0.a;

/* loaded from: classes4.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f22164a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f22165b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedSQLiteStatement f22166c;
    public final SharedSQLiteStatement d;
    public final SharedSQLiteStatement e;

    /* renamed from: f, reason: collision with root package name */
    public final SharedSQLiteStatement f22167f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedSQLiteStatement f22168g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedSQLiteStatement f22169h;

    /* renamed from: i, reason: collision with root package name */
    public final SharedSQLiteStatement f22170i;

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkSpec> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01d3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01ad -> B:58:0x01c7). Please report as a decompilation issue!!! */
        @Override // androidx.room.EntityInsertionAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(androidx.sqlite.db.SupportSQLiteStatement r17, java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 523
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDao_Impl.AnonymousClass1.d(androidx.sqlite.db.SupportSQLiteStatement, java.lang.Object):void");
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$10, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass10 implements Callable<List<String>> {
        @Override // java.util.concurrent.Callable
        public final List<String> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$11, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass11 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$12, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass12 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$13, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass13 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$14, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass14 implements Callable<Long> {
        @Override // java.util.concurrent.Callable
        public final Long call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass4 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass5 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$6, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass6 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$7, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass7 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$8, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass8 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$9, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass9 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.EntityInsertionAdapter, androidx.room.SharedSQLiteStatement] */
    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.f22164a = roomDatabase;
        a.s(roomDatabase, "database");
        this.f22165b = new SharedSQLiteStatement(roomDatabase);
        this.f22166c = new SharedSQLiteStatement(roomDatabase);
        this.d = new SharedSQLiteStatement(roomDatabase);
        this.e = new SharedSQLiteStatement(roomDatabase);
        this.f22167f = new SharedSQLiteStatement(roomDatabase);
        this.f22168g = new SharedSQLiteStatement(roomDatabase);
        this.f22169h = new SharedSQLiteStatement(roomDatabase);
        this.f22170i = new SharedSQLiteStatement(roomDatabase);
        new SharedSQLiteStatement(roomDatabase);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void a(String str) {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.f22166c;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        if (str == null) {
            a2.a0(1);
        } else {
            a2.L(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            a2.k();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int b(WorkInfo.State state, String... strArr) {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=? WHERE id IN (");
        StringUtil.a(sb, strArr.length);
        sb.append(")");
        SupportSQLiteStatement compileStatement = roomDatabase.compileStatement(sb.toString());
        compileStatement.Q(1, WorkTypeConverters.f(state));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.a0(i2);
            } else {
                compileStatement.L(i2, str);
            }
            i2++;
        }
        roomDatabase.beginTransaction();
        try {
            int k2 = compileStatement.k();
            roomDatabase.setTransactionSuccessful();
            return k2;
        } finally {
            roomDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int c(long j2, String str) {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.f22169h;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        a2.Q(1, j2);
        if (str == null) {
            a2.a0(2);
        } else {
            a2.L(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            int k2 = a2.k();
            roomDatabase.setTransactionSuccessful();
            return k2;
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList d(long j2) {
        RoomSQLiteQuery roomSQLiteQuery;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        e.Q(1, j2);
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b16 = DBUtil.b(roomDatabase, e, false);
        try {
            b2 = CursorUtil.b(b16, "required_network_type");
            b3 = CursorUtil.b(b16, "requires_charging");
            b4 = CursorUtil.b(b16, "requires_device_idle");
            b5 = CursorUtil.b(b16, "requires_battery_not_low");
            b6 = CursorUtil.b(b16, "requires_storage_not_low");
            b7 = CursorUtil.b(b16, "trigger_content_update_delay");
            b8 = CursorUtil.b(b16, "trigger_max_content_delay");
            b9 = CursorUtil.b(b16, "content_uri_triggers");
            b10 = CursorUtil.b(b16, "id");
            b11 = CursorUtil.b(b16, "state");
            b12 = CursorUtil.b(b16, "worker_class_name");
            b13 = CursorUtil.b(b16, "input_merger_class_name");
            b14 = CursorUtil.b(b16, "input");
            b15 = CursorUtil.b(b16, AgentOptions.OUTPUT);
            roomSQLiteQuery = e;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = e;
        }
        try {
            int b17 = CursorUtil.b(b16, "initial_delay");
            int b18 = CursorUtil.b(b16, "interval_duration");
            int b19 = CursorUtil.b(b16, "flex_duration");
            int b20 = CursorUtil.b(b16, "run_attempt_count");
            int b21 = CursorUtil.b(b16, "backoff_policy");
            int b22 = CursorUtil.b(b16, "backoff_delay_duration");
            int b23 = CursorUtil.b(b16, "period_start_time");
            int b24 = CursorUtil.b(b16, "minimum_retention_duration");
            int b25 = CursorUtil.b(b16, "schedule_requested_at");
            int b26 = CursorUtil.b(b16, "run_in_foreground");
            int b27 = CursorUtil.b(b16, "out_of_quota_policy");
            int i2 = b15;
            ArrayList arrayList = new ArrayList(b16.getCount());
            while (b16.moveToNext()) {
                String string = b16.getString(b10);
                int i3 = b10;
                String string2 = b16.getString(b12);
                int i4 = b12;
                Constraints constraints = new Constraints();
                int i5 = b2;
                constraints.f21854a = WorkTypeConverters.c(b16.getInt(b2));
                constraints.f21855b = b16.getInt(b3) != 0;
                constraints.f21856c = b16.getInt(b4) != 0;
                constraints.d = b16.getInt(b5) != 0;
                constraints.e = b16.getInt(b6) != 0;
                int i6 = b3;
                int i7 = b4;
                constraints.f21857f = b16.getLong(b7);
                constraints.f21858g = b16.getLong(b8);
                constraints.f21859h = WorkTypeConverters.a(b16.getBlob(b9));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.f22147b = WorkTypeConverters.e(b16.getInt(b11));
                workSpec.d = b16.getString(b13);
                workSpec.e = Data.a(b16.getBlob(b14));
                int i8 = i2;
                workSpec.f22149f = Data.a(b16.getBlob(i8));
                int i9 = b17;
                int i10 = b13;
                workSpec.f22150g = b16.getLong(i9);
                i2 = i8;
                int i11 = b14;
                int i12 = b18;
                workSpec.f22151h = b16.getLong(i12);
                b18 = i12;
                int i13 = b19;
                workSpec.f22152i = b16.getLong(i13);
                int i14 = b20;
                workSpec.f22154k = b16.getInt(i14);
                int i15 = b21;
                b20 = i14;
                workSpec.f22155l = WorkTypeConverters.b(b16.getInt(i15));
                b19 = i13;
                int i16 = b22;
                workSpec.f22156m = b16.getLong(i16);
                b22 = i16;
                int i17 = b23;
                workSpec.f22157n = b16.getLong(i17);
                b23 = i17;
                int i18 = b24;
                workSpec.f22158o = b16.getLong(i18);
                b24 = i18;
                int i19 = b25;
                workSpec.f22159p = b16.getLong(i19);
                int i20 = b26;
                workSpec.f22160q = b16.getInt(i20) != 0;
                int i21 = b27;
                b26 = i20;
                workSpec.f22161r = WorkTypeConverters.d(b16.getInt(i21));
                workSpec.f22153j = constraints;
                arrayList.add(workSpec);
                b27 = i21;
                b25 = i19;
                b3 = i6;
                b10 = i3;
                b12 = i4;
                b2 = i5;
                b13 = i10;
                b17 = i9;
                b4 = i7;
                b21 = i15;
                b14 = i11;
            }
            b16.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b16.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void e(WorkSpec workSpec) {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f22165b.e(workSpec);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void f(long j2, String str) {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.e;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        a2.Q(1, j2);
        if (str == null) {
            a2.a0(2);
        } else {
            a2.L(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            a2.k();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList g() {
        RoomSQLiteQuery roomSQLiteQuery;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        RoomSQLiteQuery e = RoomSQLiteQuery.e(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b16 = DBUtil.b(roomDatabase, e, false);
        try {
            b2 = CursorUtil.b(b16, "required_network_type");
            b3 = CursorUtil.b(b16, "requires_charging");
            b4 = CursorUtil.b(b16, "requires_device_idle");
            b5 = CursorUtil.b(b16, "requires_battery_not_low");
            b6 = CursorUtil.b(b16, "requires_storage_not_low");
            b7 = CursorUtil.b(b16, "trigger_content_update_delay");
            b8 = CursorUtil.b(b16, "trigger_max_content_delay");
            b9 = CursorUtil.b(b16, "content_uri_triggers");
            b10 = CursorUtil.b(b16, "id");
            b11 = CursorUtil.b(b16, "state");
            b12 = CursorUtil.b(b16, "worker_class_name");
            b13 = CursorUtil.b(b16, "input_merger_class_name");
            b14 = CursorUtil.b(b16, "input");
            b15 = CursorUtil.b(b16, AgentOptions.OUTPUT);
            roomSQLiteQuery = e;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = e;
        }
        try {
            int b17 = CursorUtil.b(b16, "initial_delay");
            int b18 = CursorUtil.b(b16, "interval_duration");
            int b19 = CursorUtil.b(b16, "flex_duration");
            int b20 = CursorUtil.b(b16, "run_attempt_count");
            int b21 = CursorUtil.b(b16, "backoff_policy");
            int b22 = CursorUtil.b(b16, "backoff_delay_duration");
            int b23 = CursorUtil.b(b16, "period_start_time");
            int b24 = CursorUtil.b(b16, "minimum_retention_duration");
            int b25 = CursorUtil.b(b16, "schedule_requested_at");
            int b26 = CursorUtil.b(b16, "run_in_foreground");
            int b27 = CursorUtil.b(b16, "out_of_quota_policy");
            int i2 = b15;
            ArrayList arrayList = new ArrayList(b16.getCount());
            while (b16.moveToNext()) {
                String string = b16.getString(b10);
                int i3 = b10;
                String string2 = b16.getString(b12);
                int i4 = b12;
                Constraints constraints = new Constraints();
                int i5 = b2;
                constraints.f21854a = WorkTypeConverters.c(b16.getInt(b2));
                constraints.f21855b = b16.getInt(b3) != 0;
                constraints.f21856c = b16.getInt(b4) != 0;
                constraints.d = b16.getInt(b5) != 0;
                constraints.e = b16.getInt(b6) != 0;
                int i6 = b3;
                int i7 = b4;
                constraints.f21857f = b16.getLong(b7);
                constraints.f21858g = b16.getLong(b8);
                constraints.f21859h = WorkTypeConverters.a(b16.getBlob(b9));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.f22147b = WorkTypeConverters.e(b16.getInt(b11));
                workSpec.d = b16.getString(b13);
                workSpec.e = Data.a(b16.getBlob(b14));
                int i8 = i2;
                workSpec.f22149f = Data.a(b16.getBlob(i8));
                int i9 = b14;
                int i10 = b17;
                workSpec.f22150g = b16.getLong(i10);
                int i11 = b5;
                int i12 = b18;
                workSpec.f22151h = b16.getLong(i12);
                int i13 = b19;
                workSpec.f22152i = b16.getLong(i13);
                int i14 = b20;
                workSpec.f22154k = b16.getInt(i14);
                int i15 = b21;
                workSpec.f22155l = WorkTypeConverters.b(b16.getInt(i15));
                int i16 = b22;
                workSpec.f22156m = b16.getLong(i16);
                int i17 = b23;
                workSpec.f22157n = b16.getLong(i17);
                int i18 = b24;
                workSpec.f22158o = b16.getLong(i18);
                int i19 = b25;
                workSpec.f22159p = b16.getLong(i19);
                int i20 = b26;
                workSpec.f22160q = b16.getInt(i20) != 0;
                int i21 = b27;
                workSpec.f22161r = WorkTypeConverters.d(b16.getInt(i21));
                workSpec.f22153j = constraints;
                arrayList.add(workSpec);
                i2 = i8;
                b3 = i6;
                b17 = i10;
                b18 = i12;
                b22 = i16;
                b23 = i17;
                b26 = i20;
                b12 = i4;
                b2 = i5;
                b27 = i21;
                b25 = i19;
                b14 = i9;
                b10 = i3;
                b4 = i7;
                b24 = i18;
                b5 = i11;
                b19 = i13;
                b20 = i14;
                b21 = i15;
            }
            b16.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b16.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList h(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final WorkInfo.State i(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            return b2.moveToFirst() ? WorkTypeConverters.e(b2.getInt(0)) : null;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final WorkSpec j(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            int b3 = CursorUtil.b(b2, "required_network_type");
            int b4 = CursorUtil.b(b2, "requires_charging");
            int b5 = CursorUtil.b(b2, "requires_device_idle");
            int b6 = CursorUtil.b(b2, "requires_battery_not_low");
            int b7 = CursorUtil.b(b2, "requires_storage_not_low");
            int b8 = CursorUtil.b(b2, "trigger_content_update_delay");
            int b9 = CursorUtil.b(b2, "trigger_max_content_delay");
            int b10 = CursorUtil.b(b2, "content_uri_triggers");
            int b11 = CursorUtil.b(b2, "id");
            int b12 = CursorUtil.b(b2, "state");
            int b13 = CursorUtil.b(b2, "worker_class_name");
            int b14 = CursorUtil.b(b2, "input_merger_class_name");
            int b15 = CursorUtil.b(b2, "input");
            int b16 = CursorUtil.b(b2, AgentOptions.OUTPUT);
            roomSQLiteQuery = e;
            try {
                int b17 = CursorUtil.b(b2, "initial_delay");
                int b18 = CursorUtil.b(b2, "interval_duration");
                int b19 = CursorUtil.b(b2, "flex_duration");
                int b20 = CursorUtil.b(b2, "run_attempt_count");
                int b21 = CursorUtil.b(b2, "backoff_policy");
                int b22 = CursorUtil.b(b2, "backoff_delay_duration");
                int b23 = CursorUtil.b(b2, "period_start_time");
                int b24 = CursorUtil.b(b2, "minimum_retention_duration");
                int b25 = CursorUtil.b(b2, "schedule_requested_at");
                int b26 = CursorUtil.b(b2, "run_in_foreground");
                int b27 = CursorUtil.b(b2, "out_of_quota_policy");
                if (b2.moveToFirst()) {
                    String string = b2.getString(b11);
                    String string2 = b2.getString(b13);
                    Constraints constraints = new Constraints();
                    constraints.f21854a = WorkTypeConverters.c(b2.getInt(b3));
                    constraints.f21855b = b2.getInt(b4) != 0;
                    constraints.f21856c = b2.getInt(b5) != 0;
                    constraints.d = b2.getInt(b6) != 0;
                    constraints.e = b2.getInt(b7) != 0;
                    constraints.f21857f = b2.getLong(b8);
                    constraints.f21858g = b2.getLong(b9);
                    constraints.f21859h = WorkTypeConverters.a(b2.getBlob(b10));
                    workSpec = new WorkSpec(string, string2);
                    workSpec.f22147b = WorkTypeConverters.e(b2.getInt(b12));
                    workSpec.d = b2.getString(b14);
                    workSpec.e = Data.a(b2.getBlob(b15));
                    workSpec.f22149f = Data.a(b2.getBlob(b16));
                    workSpec.f22150g = b2.getLong(b17);
                    workSpec.f22151h = b2.getLong(b18);
                    workSpec.f22152i = b2.getLong(b19);
                    workSpec.f22154k = b2.getInt(b20);
                    workSpec.f22155l = WorkTypeConverters.b(b2.getInt(b21));
                    workSpec.f22156m = b2.getLong(b22);
                    workSpec.f22157n = b2.getLong(b23);
                    workSpec.f22158o = b2.getLong(b24);
                    workSpec.f22159p = b2.getLong(b25);
                    workSpec.f22160q = b2.getInt(b26) != 0;
                    workSpec.f22161r = WorkTypeConverters.d(b2.getInt(b27));
                    workSpec.f22153j = constraints;
                } else {
                    workSpec = null;
                }
                b2.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                b2.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = e;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList k(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList l(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(Data.a(b2.getBlob(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int m() {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.f22170i;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        roomDatabase.beginTransaction();
        try {
            int k2 = a2.k();
            roomDatabase.setTransactionSuccessful();
            return k2;
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList n() {
        RoomSQLiteQuery roomSQLiteQuery;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        e.Q(1, 200);
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b16 = DBUtil.b(roomDatabase, e, false);
        try {
            b2 = CursorUtil.b(b16, "required_network_type");
            b3 = CursorUtil.b(b16, "requires_charging");
            b4 = CursorUtil.b(b16, "requires_device_idle");
            b5 = CursorUtil.b(b16, "requires_battery_not_low");
            b6 = CursorUtil.b(b16, "requires_storage_not_low");
            b7 = CursorUtil.b(b16, "trigger_content_update_delay");
            b8 = CursorUtil.b(b16, "trigger_max_content_delay");
            b9 = CursorUtil.b(b16, "content_uri_triggers");
            b10 = CursorUtil.b(b16, "id");
            b11 = CursorUtil.b(b16, "state");
            b12 = CursorUtil.b(b16, "worker_class_name");
            b13 = CursorUtil.b(b16, "input_merger_class_name");
            b14 = CursorUtil.b(b16, "input");
            b15 = CursorUtil.b(b16, AgentOptions.OUTPUT);
            roomSQLiteQuery = e;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = e;
        }
        try {
            int b17 = CursorUtil.b(b16, "initial_delay");
            int b18 = CursorUtil.b(b16, "interval_duration");
            int b19 = CursorUtil.b(b16, "flex_duration");
            int b20 = CursorUtil.b(b16, "run_attempt_count");
            int b21 = CursorUtil.b(b16, "backoff_policy");
            int b22 = CursorUtil.b(b16, "backoff_delay_duration");
            int b23 = CursorUtil.b(b16, "period_start_time");
            int b24 = CursorUtil.b(b16, "minimum_retention_duration");
            int b25 = CursorUtil.b(b16, "schedule_requested_at");
            int b26 = CursorUtil.b(b16, "run_in_foreground");
            int b27 = CursorUtil.b(b16, "out_of_quota_policy");
            int i2 = b15;
            ArrayList arrayList = new ArrayList(b16.getCount());
            while (b16.moveToNext()) {
                String string = b16.getString(b10);
                int i3 = b10;
                String string2 = b16.getString(b12);
                int i4 = b12;
                Constraints constraints = new Constraints();
                int i5 = b2;
                constraints.f21854a = WorkTypeConverters.c(b16.getInt(b2));
                constraints.f21855b = b16.getInt(b3) != 0;
                constraints.f21856c = b16.getInt(b4) != 0;
                constraints.d = b16.getInt(b5) != 0;
                constraints.e = b16.getInt(b6) != 0;
                int i6 = b3;
                int i7 = b4;
                constraints.f21857f = b16.getLong(b7);
                constraints.f21858g = b16.getLong(b8);
                constraints.f21859h = WorkTypeConverters.a(b16.getBlob(b9));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.f22147b = WorkTypeConverters.e(b16.getInt(b11));
                workSpec.d = b16.getString(b13);
                workSpec.e = Data.a(b16.getBlob(b14));
                int i8 = i2;
                workSpec.f22149f = Data.a(b16.getBlob(i8));
                int i9 = b13;
                int i10 = b17;
                workSpec.f22150g = b16.getLong(i10);
                i2 = i8;
                int i11 = b14;
                int i12 = b18;
                workSpec.f22151h = b16.getLong(i12);
                b18 = i12;
                int i13 = b19;
                workSpec.f22152i = b16.getLong(i13);
                int i14 = b20;
                workSpec.f22154k = b16.getInt(i14);
                int i15 = b21;
                b20 = i14;
                workSpec.f22155l = WorkTypeConverters.b(b16.getInt(i15));
                b19 = i13;
                int i16 = b22;
                workSpec.f22156m = b16.getLong(i16);
                b22 = i16;
                int i17 = b23;
                workSpec.f22157n = b16.getLong(i17);
                b23 = i17;
                int i18 = b24;
                workSpec.f22158o = b16.getLong(i18);
                b24 = i18;
                int i19 = b25;
                workSpec.f22159p = b16.getLong(i19);
                int i20 = b26;
                workSpec.f22160q = b16.getInt(i20) != 0;
                int i21 = b27;
                b26 = i20;
                workSpec.f22161r = WorkTypeConverters.d(b16.getInt(i21));
                workSpec.f22153j = constraints;
                arrayList.add(workSpec);
                b27 = i21;
                b25 = i19;
                b13 = i9;
                b3 = i6;
                b10 = i3;
                b12 = i4;
                b2 = i5;
                b17 = i10;
                b4 = i7;
                b21 = i15;
                b14 = i11;
            }
            b16.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b16.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, androidx.work.impl.model.WorkSpec$IdAndState] */
    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList o(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            int b3 = CursorUtil.b(b2, "id");
            int b4 = CursorUtil.b(b2, "state");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                ?? obj = new Object();
                obj.f22162a = b2.getString(b3);
                obj.f22163b = WorkTypeConverters.e(b2.getInt(b4));
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList p(int i2) {
        RoomSQLiteQuery roomSQLiteQuery;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        e.Q(1, i2);
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b16 = DBUtil.b(roomDatabase, e, false);
        try {
            b2 = CursorUtil.b(b16, "required_network_type");
            b3 = CursorUtil.b(b16, "requires_charging");
            b4 = CursorUtil.b(b16, "requires_device_idle");
            b5 = CursorUtil.b(b16, "requires_battery_not_low");
            b6 = CursorUtil.b(b16, "requires_storage_not_low");
            b7 = CursorUtil.b(b16, "trigger_content_update_delay");
            b8 = CursorUtil.b(b16, "trigger_max_content_delay");
            b9 = CursorUtil.b(b16, "content_uri_triggers");
            b10 = CursorUtil.b(b16, "id");
            b11 = CursorUtil.b(b16, "state");
            b12 = CursorUtil.b(b16, "worker_class_name");
            b13 = CursorUtil.b(b16, "input_merger_class_name");
            b14 = CursorUtil.b(b16, "input");
            b15 = CursorUtil.b(b16, AgentOptions.OUTPUT);
            roomSQLiteQuery = e;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = e;
        }
        try {
            int b17 = CursorUtil.b(b16, "initial_delay");
            int b18 = CursorUtil.b(b16, "interval_duration");
            int b19 = CursorUtil.b(b16, "flex_duration");
            int b20 = CursorUtil.b(b16, "run_attempt_count");
            int b21 = CursorUtil.b(b16, "backoff_policy");
            int b22 = CursorUtil.b(b16, "backoff_delay_duration");
            int b23 = CursorUtil.b(b16, "period_start_time");
            int b24 = CursorUtil.b(b16, "minimum_retention_duration");
            int b25 = CursorUtil.b(b16, "schedule_requested_at");
            int b26 = CursorUtil.b(b16, "run_in_foreground");
            int b27 = CursorUtil.b(b16, "out_of_quota_policy");
            int i3 = b15;
            ArrayList arrayList = new ArrayList(b16.getCount());
            while (b16.moveToNext()) {
                String string = b16.getString(b10);
                int i4 = b10;
                String string2 = b16.getString(b12);
                int i5 = b12;
                Constraints constraints = new Constraints();
                int i6 = b2;
                constraints.f21854a = WorkTypeConverters.c(b16.getInt(b2));
                constraints.f21855b = b16.getInt(b3) != 0;
                constraints.f21856c = b16.getInt(b4) != 0;
                constraints.d = b16.getInt(b5) != 0;
                constraints.e = b16.getInt(b6) != 0;
                int i7 = b3;
                int i8 = b4;
                constraints.f21857f = b16.getLong(b7);
                constraints.f21858g = b16.getLong(b8);
                constraints.f21859h = WorkTypeConverters.a(b16.getBlob(b9));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.f22147b = WorkTypeConverters.e(b16.getInt(b11));
                workSpec.d = b16.getString(b13);
                workSpec.e = Data.a(b16.getBlob(b14));
                int i9 = i3;
                workSpec.f22149f = Data.a(b16.getBlob(i9));
                int i10 = b13;
                int i11 = b17;
                workSpec.f22150g = b16.getLong(i11);
                i3 = i9;
                int i12 = b14;
                int i13 = b18;
                workSpec.f22151h = b16.getLong(i13);
                b18 = i13;
                int i14 = b19;
                workSpec.f22152i = b16.getLong(i14);
                int i15 = b20;
                workSpec.f22154k = b16.getInt(i15);
                int i16 = b21;
                b20 = i15;
                workSpec.f22155l = WorkTypeConverters.b(b16.getInt(i16));
                b19 = i14;
                int i17 = b22;
                workSpec.f22156m = b16.getLong(i17);
                b22 = i17;
                int i18 = b23;
                workSpec.f22157n = b16.getLong(i18);
                b23 = i18;
                int i19 = b24;
                workSpec.f22158o = b16.getLong(i19);
                b24 = i19;
                int i20 = b25;
                workSpec.f22159p = b16.getLong(i20);
                int i21 = b26;
                workSpec.f22160q = b16.getInt(i21) != 0;
                int i22 = b27;
                b26 = i21;
                workSpec.f22161r = WorkTypeConverters.d(b16.getInt(i22));
                workSpec.f22153j = constraints;
                arrayList.add(workSpec);
                b27 = i22;
                b25 = i20;
                b13 = i10;
                b3 = i7;
                b10 = i4;
                b12 = i5;
                b2 = i6;
                b17 = i11;
                b4 = i8;
                b21 = i16;
                b14 = i12;
            }
            b16.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b16.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void q(String str, Data data) {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.d;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        byte[] c2 = Data.c(data);
        if (c2 == null) {
            a2.a0(1);
        } else {
            a2.T(1, c2);
        }
        if (str == null) {
            a2.a0(2);
        } else {
            a2.L(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            a2.k();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList r() {
        RoomSQLiteQuery roomSQLiteQuery;
        int b2;
        int b3;
        int b4;
        int b5;
        int b6;
        int b7;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        RoomSQLiteQuery e = RoomSQLiteQuery.e(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b16 = DBUtil.b(roomDatabase, e, false);
        try {
            b2 = CursorUtil.b(b16, "required_network_type");
            b3 = CursorUtil.b(b16, "requires_charging");
            b4 = CursorUtil.b(b16, "requires_device_idle");
            b5 = CursorUtil.b(b16, "requires_battery_not_low");
            b6 = CursorUtil.b(b16, "requires_storage_not_low");
            b7 = CursorUtil.b(b16, "trigger_content_update_delay");
            b8 = CursorUtil.b(b16, "trigger_max_content_delay");
            b9 = CursorUtil.b(b16, "content_uri_triggers");
            b10 = CursorUtil.b(b16, "id");
            b11 = CursorUtil.b(b16, "state");
            b12 = CursorUtil.b(b16, "worker_class_name");
            b13 = CursorUtil.b(b16, "input_merger_class_name");
            b14 = CursorUtil.b(b16, "input");
            b15 = CursorUtil.b(b16, AgentOptions.OUTPUT);
            roomSQLiteQuery = e;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = e;
        }
        try {
            int b17 = CursorUtil.b(b16, "initial_delay");
            int b18 = CursorUtil.b(b16, "interval_duration");
            int b19 = CursorUtil.b(b16, "flex_duration");
            int b20 = CursorUtil.b(b16, "run_attempt_count");
            int b21 = CursorUtil.b(b16, "backoff_policy");
            int b22 = CursorUtil.b(b16, "backoff_delay_duration");
            int b23 = CursorUtil.b(b16, "period_start_time");
            int b24 = CursorUtil.b(b16, "minimum_retention_duration");
            int b25 = CursorUtil.b(b16, "schedule_requested_at");
            int b26 = CursorUtil.b(b16, "run_in_foreground");
            int b27 = CursorUtil.b(b16, "out_of_quota_policy");
            int i2 = b15;
            ArrayList arrayList = new ArrayList(b16.getCount());
            while (b16.moveToNext()) {
                String string = b16.getString(b10);
                int i3 = b10;
                String string2 = b16.getString(b12);
                int i4 = b12;
                Constraints constraints = new Constraints();
                int i5 = b2;
                constraints.f21854a = WorkTypeConverters.c(b16.getInt(b2));
                constraints.f21855b = b16.getInt(b3) != 0;
                constraints.f21856c = b16.getInt(b4) != 0;
                constraints.d = b16.getInt(b5) != 0;
                constraints.e = b16.getInt(b6) != 0;
                int i6 = b3;
                int i7 = b4;
                constraints.f21857f = b16.getLong(b7);
                constraints.f21858g = b16.getLong(b8);
                constraints.f21859h = WorkTypeConverters.a(b16.getBlob(b9));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.f22147b = WorkTypeConverters.e(b16.getInt(b11));
                workSpec.d = b16.getString(b13);
                workSpec.e = Data.a(b16.getBlob(b14));
                int i8 = i2;
                workSpec.f22149f = Data.a(b16.getBlob(i8));
                int i9 = b14;
                int i10 = b17;
                workSpec.f22150g = b16.getLong(i10);
                int i11 = b5;
                int i12 = b18;
                workSpec.f22151h = b16.getLong(i12);
                int i13 = b19;
                workSpec.f22152i = b16.getLong(i13);
                int i14 = b20;
                workSpec.f22154k = b16.getInt(i14);
                int i15 = b21;
                workSpec.f22155l = WorkTypeConverters.b(b16.getInt(i15));
                int i16 = b22;
                workSpec.f22156m = b16.getLong(i16);
                int i17 = b23;
                workSpec.f22157n = b16.getLong(i17);
                int i18 = b24;
                workSpec.f22158o = b16.getLong(i18);
                int i19 = b25;
                workSpec.f22159p = b16.getLong(i19);
                int i20 = b26;
                workSpec.f22160q = b16.getInt(i20) != 0;
                int i21 = b27;
                workSpec.f22161r = WorkTypeConverters.d(b16.getInt(i21));
                workSpec.f22153j = constraints;
                arrayList.add(workSpec);
                i2 = i8;
                b3 = i6;
                b17 = i10;
                b18 = i12;
                b22 = i16;
                b23 = i17;
                b26 = i20;
                b12 = i4;
                b2 = i5;
                b27 = i21;
                b25 = i19;
                b14 = i9;
                b10 = i3;
                b4 = i7;
                b24 = i18;
                b5 = i11;
                b19 = i13;
                b20 = i14;
                b21 = i15;
            }
            b16.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b16.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final boolean s() {
        boolean z2 = false;
        RoomSQLiteQuery e = RoomSQLiteQuery.e(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) != 0) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int t(String str) {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.f22168g;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        if (str == null) {
            a2.a0(1);
        } else {
            a2.L(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            int k2 = a2.k();
            roomDatabase.setTransactionSuccessful();
            return k2;
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int u(String str) {
        RoomDatabase roomDatabase = this.f22164a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.f22167f;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        if (str == null) {
            a2.a0(1);
        } else {
            a2.L(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            int k2 = a2.k();
            roomDatabase.setTransactionSuccessful();
            return k2;
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }
}
