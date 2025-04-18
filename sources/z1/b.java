package z1;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class b {
    public final int a;

    public b(int i10) {
        this.a = i10;
    }

    public static void a(String str) {
        int i10;
        boolean z10;
        if (!StringsKt.i(str, ":memory:")) {
            boolean z11 = true;
            int length = str.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                if (!z12) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (Intrinsics.compare((int) str.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z12) {
                    if (!z10) {
                        z12 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i11, length + 1).toString().length() != 0) {
                z11 = false;
            }
            if (!z11) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    File file = new File(str);
                    Intrinsics.checkNotNullParameter(file, "file");
                    SQLiteDatabase.deleteDatabase(file);
                } catch (Exception e2) {
                    Log.w("SupportSQLite", "delete failed: ", e2);
                }
            }
        }
    }

    public abstract void b(a2.c cVar);

    public abstract void c(a2.c cVar);

    public abstract void d(a2.c cVar, int i10, int i11);

    public abstract void e(a2.c cVar);

    public abstract void f(a2.c cVar, int i10, int i11);
}
