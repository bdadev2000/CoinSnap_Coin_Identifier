package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class I0 extends Writer {

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f4659c = new StringBuilder(128);
    public final String b = FragmentManager.TAG;

    public final void a() {
        StringBuilder sb = this.f4659c;
        if (sb.length() > 0) {
            Log.d(this.b, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c9 = cArr[i9 + i11];
            if (c9 == '\n') {
                a();
            } else {
                this.f4659c.append(c9);
            }
        }
    }
}
