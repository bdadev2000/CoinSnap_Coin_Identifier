package androidx.loader.content;

import android.database.Cursor;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;

/* loaded from: classes2.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {
    public Cursor d;
    public CancellationSignal e;

    @Override // androidx.loader.content.AsyncTaskLoader
    public final void b() {
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.e;
                if (cancellationSignal != null) {
                    cancellationSignal.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.core.os.CancellationSignal, java.lang.Object] */
    @Override // androidx.loader.content.AsyncTaskLoader
    public final Object d() {
        synchronized (this) {
            try {
                if (this.f20253c != null) {
                    throw new OperationCanceledException();
                }
                this.e = new Object();
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            throw null;
        } catch (Throwable th2) {
            synchronized (this) {
                this.e = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final void f(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a(Cursor cursor) {
        Cursor cursor2 = this.d;
        this.d = cursor;
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }
}
