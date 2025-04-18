package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public interface SupportSQLiteDatabase extends Closeable {
    Cursor A(SupportSQLiteQuery supportSQLiteQuery);

    void C(Locale locale);

    void K(int i2);

    SupportSQLiteStatement M(String str);

    boolean O();

    void P(boolean z2);

    long R();

    int S(String str, int i2, ContentValues contentValues, String str2, Object[] objArr);

    boolean V();

    Cursor W(String str);

    long X(String str, int i2, ContentValues contentValues);

    int b(String str, String str2, Object[] objArr);

    boolean c0();

    void d();

    boolean d0();

    void e0(int i2);

    List f();

    void f0(long j2);

    void g(String str);

    long getPageSize();

    String getPath();

    int getVersion();

    boolean isOpen();

    boolean j();

    Cursor l(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    void m();

    void p(String str, Object[] objArr);

    void q();

    long r(long j2);

    boolean w();

    void x();

    boolean z(int i2);
}
