package o8;

import G7.j;
import java.util.zip.Deflater;
import w8.A;
import w8.g;
import w8.l;
import w8.s;
import w8.u;
import w8.v;
import w8.x;
import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public final class e implements x {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22019c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22020d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22021f;

    public e(s sVar, Deflater deflater) {
        this.f22020d = sVar;
        this.f22021f = deflater;
    }

    public void a(boolean z8) {
        u k6;
        int deflate;
        g gVar = (g) this.f22020d;
        w8.f y4 = gVar.y();
        while (true) {
            k6 = y4.k(1);
            Deflater deflater = (Deflater) this.f22021f;
            byte[] bArr = k6.f24041a;
            if (z8) {
                int i9 = k6.f24042c;
                deflate = deflater.deflate(bArr, i9, 8192 - i9, 2);
            } else {
                int i10 = k6.f24042c;
                deflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (deflate > 0) {
                k6.f24042c += deflate;
                y4.f24014c += deflate;
                gVar.emitCompleteSegments();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (k6.b == k6.f24042c) {
            y4.b = k6.a();
            v.a(k6);
        }
    }

    @Override // w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                if (!this.f22019c) {
                    this.f22019c = true;
                    P4.a aVar = (P4.a) this.f22021f;
                    aVar.getClass();
                    l lVar = (l) this.f22020d;
                    A a6 = lVar.f24018e;
                    lVar.f24018e = A.f23999d;
                    a6.a();
                    a6.b();
                    aVar.f2415a = 3;
                    return;
                }
                return;
            default:
                Deflater deflater = (Deflater) this.f22021f;
                if (!this.f22019c) {
                    try {
                        deflater.finish();
                        a(false);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        ((g) this.f22020d).close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.f22019c = true;
                    if (th == null) {
                        return;
                    } else {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // w8.x
    public final void d(w8.f fVar, long j7) {
        Object obj = this.f22021f;
        int i9 = this.b;
        j.e(fVar, "source");
        switch (i9) {
            case 0:
                if (!this.f22019c) {
                    long j9 = fVar.f24014c;
                    byte[] bArr = j8.b.f21214a;
                    if (j7 >= 0 && 0 <= j9 && j9 >= j7) {
                        ((g) ((P4.a) obj).f2418e).d(fVar, j7);
                        return;
                    }
                    throw new ArrayIndexOutOfBoundsException();
                }
                throw new IllegalStateException("closed".toString());
            default:
                AbstractC2947c.h(fVar.f24014c, 0L, j7);
                while (j7 > 0) {
                    u uVar = fVar.b;
                    j.b(uVar);
                    int min = (int) Math.min(j7, uVar.f24042c - uVar.b);
                    ((Deflater) obj).setInput(uVar.f24041a, uVar.b, min);
                    a(false);
                    long j10 = min;
                    fVar.f24014c -= j10;
                    int i10 = uVar.b + min;
                    uVar.b = i10;
                    if (i10 == uVar.f24042c) {
                        fVar.b = uVar.a();
                        v.a(uVar);
                    }
                    j7 -= j10;
                }
                return;
        }
    }

    @Override // w8.x, java.io.Flushable
    public final void flush() {
        switch (this.b) {
            case 0:
                if (!this.f22019c) {
                    ((g) ((P4.a) this.f22021f).f2418e).flush();
                    return;
                }
                return;
            default:
                a(true);
                ((g) this.f22020d).flush();
                return;
        }
    }

    @Override // w8.x
    public final A timeout() {
        switch (this.b) {
            case 0:
                return (l) this.f22020d;
            default:
                return ((g) this.f22020d).timeout();
        }
    }

    public String toString() {
        switch (this.b) {
            case 1:
                return "DeflaterSink(" + ((g) this.f22020d) + ')';
            default:
                return super.toString();
        }
    }

    public e(P4.a aVar) {
        j.e(aVar, "this$0");
        this.f22021f = aVar;
        this.f22020d = new l(((g) aVar.f2418e).timeout());
    }
}
