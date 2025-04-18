package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x1 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1741b = 0;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f1743d = new StringBuilder(128);

    /* renamed from: c, reason: collision with root package name */
    public final Object f1742c = FragmentManager.TAG;

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f1741b) {
            case 1:
                return append(charSequence);
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1741b) {
            case 0:
                d();
                return;
            default:
                return;
        }
    }

    public final void d() {
        CharSequence charSequence = this.f1743d;
        if (((StringBuilder) charSequence).length() > 0) {
            Log.d((String) this.f1742c, ((StringBuilder) charSequence).toString());
            ((StringBuilder) charSequence).delete(0, ((StringBuilder) charSequence).length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f1741b) {
            case 0:
                d();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        int i12 = this.f1741b;
        CharSequence charSequence = this.f1743d;
        switch (i12) {
            case 0:
                for (int i13 = 0; i13 < i11; i13++) {
                    char c10 = cArr[i10 + i13];
                    if (c10 == '\n') {
                        d();
                    } else {
                        ((StringBuilder) charSequence).append(c10);
                    }
                }
                return;
            default:
                uc.r rVar = (uc.r) charSequence;
                rVar.getClass();
                rVar.getClass();
                ((Appendable) this.f1742c).append(rVar, i10, i11 + i10);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i10, int i11) {
        switch (this.f1741b) {
            case 1:
                return append(charSequence, i10, i11);
            default:
                return super.append(charSequence, i10, i11);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        switch (this.f1741b) {
            case 1:
                ((Appendable) this.f1742c).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) {
        switch (this.f1741b) {
            case 1:
                ((Appendable) this.f1742c).append(charSequence, i10, i11);
                return this;
            default:
                return super.append(charSequence, i10, i11);
        }
    }

    @Override // java.io.Writer
    public final void write(int i10) {
        switch (this.f1741b) {
            case 1:
                ((Appendable) this.f1742c).append((char) i10);
                return;
            default:
                super.write(i10);
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) {
        switch (this.f1741b) {
            case 1:
                Objects.requireNonNull(str);
                ((Appendable) this.f1742c).append(str, i10, i11 + i10);
                return;
            default:
                super.write(str, i10, i11);
                return;
        }
    }
}
