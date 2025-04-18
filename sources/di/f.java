package di;

import java.util.zip.Deflater;
import ki.d0;
import ki.f0;
import ki.g0;
import ki.i;
import ki.i0;
import ki.j;
import ki.m0;
import ki.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17055b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17056c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17057d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f17058f;

    public f(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f17058f = this$0;
        this.f17057d = new r(this$0.f17062d.timeout());
    }

    @Override // ki.i0
    public final void a(i source, long j3) {
        int i10 = this.f17055b;
        Object obj = this.f17058f;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                if (!this.f17056c) {
                    long j10 = source.f20994c;
                    byte[] bArr = xh.b.a;
                    if ((0 | j3) >= 0 && 0 <= j10 && j10 - 0 >= j3) {
                        ((h) obj).f17062d.a(source, j3);
                        return;
                    }
                    throw new ArrayIndexOutOfBoundsException();
                }
                throw new IllegalStateException("closed".toString());
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                mi.a.c(source.f20994c, 0L, j3);
                while (j3 > 0) {
                    f0 f0Var = source.f20993b;
                    Intrinsics.checkNotNull(f0Var);
                    int min = (int) Math.min(j3, f0Var.f20980c - f0Var.f20979b);
                    ((Deflater) obj).setInput(f0Var.a, f0Var.f20979b, min);
                    d(false);
                    long j11 = min;
                    source.f20994c -= j11;
                    int i11 = f0Var.f20979b + min;
                    f0Var.f20979b = i11;
                    if (i11 == f0Var.f20980c) {
                        source.f20993b = f0Var.a();
                        g0.a(f0Var);
                    }
                    j3 -= j11;
                }
                return;
        }
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f17055b;
        Object obj = this.f17057d;
        Object obj2 = this.f17058f;
        switch (i10) {
            case 0:
                if (!this.f17056c) {
                    this.f17056c = true;
                    h hVar = (h) obj2;
                    h.f(hVar, (r) obj);
                    hVar.f17063e = 3;
                    return;
                }
                return;
            default:
                if (!this.f17056c) {
                    try {
                        ((Deflater) obj2).finish();
                        d(false);
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        ((Deflater) obj2).end();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    try {
                        ((j) obj).close();
                    } catch (Throwable th4) {
                        if (th == null) {
                            th = th4;
                        }
                    }
                    this.f17056c = true;
                    if (th == null) {
                        return;
                    } else {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void d(boolean z10) {
        f0 t5;
        int deflate;
        Object obj = this.f17057d;
        i y4 = ((j) obj).y();
        while (true) {
            t5 = y4.t(1);
            Object obj2 = this.f17058f;
            byte[] bArr = t5.a;
            if (z10) {
                int i10 = t5.f20980c;
                deflate = ((Deflater) obj2).deflate(bArr, i10, 8192 - i10, 2);
            } else {
                int i11 = t5.f20980c;
                deflate = ((Deflater) obj2).deflate(bArr, i11, 8192 - i11);
            }
            if (deflate > 0) {
                t5.f20980c += deflate;
                y4.f20994c += deflate;
                ((j) obj).emitCompleteSegments();
            } else if (((Deflater) obj2).needsInput()) {
                break;
            }
        }
        if (t5.f20979b == t5.f20980c) {
            y4.f20993b = t5.a();
            g0.a(t5);
        }
    }

    @Override // ki.i0, java.io.Flushable
    public final void flush() {
        switch (this.f17055b) {
            case 0:
                if (!this.f17056c) {
                    ((h) this.f17058f).f17062d.flush();
                    return;
                }
                return;
            default:
                d(true);
                ((j) this.f17057d).flush();
                return;
        }
    }

    @Override // ki.i0
    public final m0 timeout() {
        int i10 = this.f17055b;
        Object obj = this.f17057d;
        switch (i10) {
            case 0:
                return (r) obj;
            default:
                return ((j) obj).timeout();
        }
    }

    public final String toString() {
        switch (this.f17055b) {
            case 1:
                return "DeflaterSink(" + ((j) this.f17057d) + ')';
            default:
                return super.toString();
        }
    }

    public f(d0 sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f17057d = sink;
        this.f17058f = deflater;
    }
}
