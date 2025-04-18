package v1;

import android.database.sqlite.SQLiteProgram;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class b0 implements z1.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25837b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25838c;

    public b0(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f25838c = delegate;
    }

    @Override // z1.h
    public final void b(int i10, double d10) {
        switch (this.f25837b) {
            case 0:
                d(i10, Double.valueOf(d10));
                return;
            default:
                ((SQLiteProgram) this.f25838c).bindDouble(i10, d10);
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f25837b) {
            case 0:
                return;
            default:
                ((SQLiteProgram) this.f25838c).close();
                return;
        }
    }

    public final void d(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        Object obj2 = this.f25838c;
        if (i11 >= ((List) obj2).size() && (size = ((List) obj2).size()) <= i11) {
            while (true) {
                ((List) obj2).add(null);
                if (size == i11) {
                    break;
                } else {
                    size++;
                }
            }
        }
        ((List) obj2).set(i11, obj);
    }

    @Override // z1.h
    public final void i(int i10, String value) {
        switch (this.f25837b) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                d(i10, value);
                return;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                ((SQLiteProgram) this.f25838c).bindString(i10, value);
                return;
        }
    }

    @Override // z1.h
    public final void m(int i10, long j3) {
        switch (this.f25837b) {
            case 0:
                d(i10, Long.valueOf(j3));
                return;
            default:
                ((SQLiteProgram) this.f25838c).bindLong(i10, j3);
                return;
        }
    }

    @Override // z1.h
    public final void n(int i10, byte[] value) {
        switch (this.f25837b) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                d(i10, value);
                return;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                ((SQLiteProgram) this.f25838c).bindBlob(i10, value);
                return;
        }
    }

    @Override // z1.h
    public final void o(int i10) {
        switch (this.f25837b) {
            case 0:
                d(i10, null);
                return;
            default:
                ((SQLiteProgram) this.f25838c).bindNull(i10);
                return;
        }
    }
}
