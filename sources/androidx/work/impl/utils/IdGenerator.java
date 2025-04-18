package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

@RestrictTo
/* loaded from: classes2.dex */
public class IdGenerator {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f22193a;

    public IdGenerator(WorkDatabase workDatabase) {
        this.f22193a = workDatabase;
    }

    public final int a(String str) {
        WorkDatabase workDatabase = this.f22193a;
        workDatabase.beginTransaction();
        try {
            Long b2 = workDatabase.d().b(str);
            int i2 = 0;
            int intValue = b2 != null ? b2.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i2 = intValue + 1;
            }
            workDatabase.d().a(new Preference(str, i2));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            return intValue;
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
