package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21318a = new ArrayList();

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void L(int i2, String str) {
        a(i2, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void Q(int i2, long j2) {
        a(i2, Long.valueOf(j2));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void T(int i2, byte[] bArr) {
        a(i2, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void Z(double d, int i2) {
        a(i2, Double.valueOf(d));
    }

    public final void a(int i2, Object obj) {
        int size;
        int i3 = i2 - 1;
        ArrayList arrayList = this.f21318a;
        if (i3 >= arrayList.size() && (size = arrayList.size()) <= i3) {
            while (true) {
                arrayList.add(null);
                if (size == i3) {
                    break;
                } else {
                    size++;
                }
            }
        }
        arrayList.set(i3, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void a0(int i2) {
        a(i2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
