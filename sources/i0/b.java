package I0;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* loaded from: classes.dex */
public class b implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1396d = new String[0];
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteClosable f1397c;

    public /* synthetic */ b(SQLiteClosable sQLiteClosable, int i9) {
        this.b = i9;
        this.f1397c = sQLiteClosable;
    }

    public void a() {
        ((SQLiteDatabase) this.f1397c).beginTransaction();
    }

    public void b(int i9, byte[] bArr) {
        ((SQLiteProgram) this.f1397c).bindBlob(i9, bArr);
    }

    public void c(int i9, double d2) {
        ((SQLiteProgram) this.f1397c).bindDouble(i9, d2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                ((SQLiteDatabase) this.f1397c).close();
                return;
            default:
                ((SQLiteProgram) this.f1397c).close();
                return;
        }
    }

    public void h(int i9, long j7) {
        ((SQLiteProgram) this.f1397c).bindLong(i9, j7);
    }

    public void i(int i9) {
        ((SQLiteProgram) this.f1397c).bindNull(i9);
    }

    public void j(int i9, String str) {
        ((SQLiteProgram) this.f1397c).bindString(i9, str);
    }

    public void k() {
        ((SQLiteDatabase) this.f1397c).endTransaction();
    }

    public void l(String str) {
        ((SQLiteDatabase) this.f1397c).execSQL(str);
    }

    public Cursor m(H0.e eVar) {
        return ((SQLiteDatabase) this.f1397c).rawQueryWithFactory(new a(eVar), eVar.b(), f1396d, null);
    }

    public Cursor n(String str) {
        return m(new H0.a(str, 0));
    }

    public void o() {
        ((SQLiteDatabase) this.f1397c).setTransactionSuccessful();
    }
}
