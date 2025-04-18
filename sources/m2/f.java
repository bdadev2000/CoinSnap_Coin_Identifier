package m2;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {
    public static void a(z1.a db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.A();
        try {
            int i10 = WorkDatabase.f2200b;
            db2.C("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db2.F();
        } finally {
            db2.J();
        }
    }
}
