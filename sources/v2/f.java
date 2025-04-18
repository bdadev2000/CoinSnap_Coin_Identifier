package v2;

import androidx.work.impl.WorkDatabase;
import v1.f0;

/* loaded from: classes.dex */
public final class f {
    public final WorkDatabase a;

    public /* synthetic */ f(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public final int a(String str) {
        int i10;
        WorkDatabase workDatabase = this.a;
        workDatabase.beginTransaction();
        try {
            Long b3 = workDatabase.d().b(str);
            int i11 = 0;
            if (b3 != null) {
                i10 = b3.intValue();
            } else {
                i10 = 0;
            }
            if (i10 != Integer.MAX_VALUE) {
                i11 = i10 + 1;
            }
            u2.c d10 = workDatabase.d();
            u2.d dVar = new u2.d(str, i11);
            f0 f0Var = d10.a;
            f0Var.assertNotSuspendingTransaction();
            f0Var.beginTransaction();
            try {
                d10.f25445b.insert(dVar);
                f0Var.setTransactionSuccessful();
                f0Var.endTransaction();
                workDatabase.setTransactionSuccessful();
                return i10;
            } catch (Throwable th2) {
                f0Var.endTransaction();
                throw th2;
            }
        } finally {
            workDatabase.endTransaction();
        }
    }
}
