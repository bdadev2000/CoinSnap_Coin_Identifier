package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;

/* loaded from: classes.dex */
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f21491a;

    public FrameworkSQLiteProgram(SQLiteProgram sQLiteProgram) {
        p0.a.s(sQLiteProgram, "delegate");
        this.f21491a = sQLiteProgram;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void L(int i2, String str) {
        p0.a.s(str, "value");
        this.f21491a.bindString(i2, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void Q(int i2, long j2) {
        this.f21491a.bindLong(i2, j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void T(int i2, byte[] bArr) {
        this.f21491a.bindBlob(i2, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void Z(double d, int i2) {
        this.f21491a.bindDouble(i2, d);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void a0(int i2) {
        this.f21491a.bindNull(i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21491a.close();
    }
}
