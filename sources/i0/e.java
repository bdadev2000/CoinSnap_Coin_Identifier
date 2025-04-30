package I0;

import D0.l;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class e implements H0.d {
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1401c;

    /* renamed from: d, reason: collision with root package name */
    public final l f1402d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1403f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1404g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public d f1405h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1406i;

    public e(Context context, String str, l lVar, boolean z8) {
        this.b = context;
        this.f1401c = str;
        this.f1402d = lVar;
        this.f1403f = z8;
    }

    public final d a() {
        d dVar;
        synchronized (this.f1404g) {
            try {
                if (this.f1405h == null) {
                    b[] bVarArr = new b[1];
                    if (this.f1401c != null && this.f1403f) {
                        this.f1405h = new d(this.b, new File(this.b.getNoBackupFilesDir(), this.f1401c).getAbsolutePath(), bVarArr, this.f1402d);
                    } else {
                        this.f1405h = new d(this.b, this.f1401c, bVarArr, this.f1402d);
                    }
                    this.f1405h.setWriteAheadLoggingEnabled(this.f1406i);
                }
                dVar = this.f1405h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // H0.d
    public final b getWritableDatabase() {
        return a().b();
    }

    @Override // H0.d
    public final void setWriteAheadLoggingEnabled(boolean z8) {
        synchronized (this.f1404g) {
            try {
                d dVar = this.f1405h;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z8);
                }
                this.f1406i = z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
