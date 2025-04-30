package o8;

import G7.j;
import w8.A;
import w8.g;
import w8.l;
import w8.x;

/* loaded from: classes3.dex */
public final class b implements x {
    public final l b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P4.a f22012d;

    public b(P4.a aVar) {
        j.e(aVar, "this$0");
        this.f22012d = aVar;
        this.b = new l(((g) aVar.f2418e).timeout());
    }

    @Override // w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f22011c) {
            return;
        }
        this.f22011c = true;
        ((g) this.f22012d.f2418e).writeUtf8("0\r\n\r\n");
        P4.a aVar = this.f22012d;
        l lVar = this.b;
        aVar.getClass();
        A a6 = lVar.f24018e;
        lVar.f24018e = A.f23999d;
        a6.a();
        a6.b();
        this.f22012d.f2415a = 3;
    }

    @Override // w8.x
    public final void d(w8.f fVar, long j7) {
        j.e(fVar, "source");
        if (!this.f22011c) {
            if (j7 == 0) {
                return;
            }
            P4.a aVar = this.f22012d;
            ((g) aVar.f2418e).writeHexadecimalUnsignedLong(j7);
            g gVar = (g) aVar.f2418e;
            gVar.writeUtf8("\r\n");
            gVar.d(fVar, j7);
            gVar.writeUtf8("\r\n");
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.x, java.io.Flushable
    public final synchronized void flush() {
        if (this.f22011c) {
            return;
        }
        ((g) this.f22012d.f2418e).flush();
    }

    @Override // w8.x
    public final A timeout() {
        return this.b;
    }
}
