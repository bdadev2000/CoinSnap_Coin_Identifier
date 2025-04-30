package w8;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: w8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2912b implements y {
    public final /* synthetic */ int b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24005c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24006d;

    public C2912b(InputStream inputStream, A a6) {
        G7.j.e(inputStream, "input");
        this.f24005c = inputStream;
        this.f24006d = a6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                y yVar = (y) this.f24006d;
                c cVar = (c) this.f24005c;
                cVar.h();
                try {
                    yVar.close();
                    if (!cVar.i()) {
                        return;
                    } else {
                        throw cVar.j(null);
                    }
                } catch (IOException e4) {
                    if (!cVar.i()) {
                        throw e4;
                    }
                    throw cVar.j(e4);
                } finally {
                    cVar.i();
                }
            default:
                ((InputStream) this.f24005c).close();
                return;
        }
    }

    @Override // w8.y
    public final long read(f fVar, long j7) {
        boolean z8;
        switch (this.b) {
            case 0:
                G7.j.e(fVar, "sink");
                y yVar = (y) this.f24006d;
                c cVar = (c) this.f24005c;
                cVar.h();
                try {
                    long read = yVar.read(fVar, j7);
                    if (!cVar.i()) {
                        return read;
                    }
                    throw cVar.j(null);
                } catch (IOException e4) {
                    if (!cVar.i()) {
                        throw e4;
                    }
                    throw cVar.j(e4);
                } finally {
                    cVar.i();
                }
            default:
                G7.j.e(fVar, "sink");
                if (j7 == 0) {
                    return 0L;
                }
                if (j7 >= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    try {
                        ((A) this.f24006d).f();
                        u k6 = fVar.k(1);
                        int read2 = ((InputStream) this.f24005c).read(k6.f24041a, k6.f24042c, (int) Math.min(j7, 8192 - k6.f24042c));
                        if (read2 == -1) {
                            if (k6.b == k6.f24042c) {
                                fVar.b = k6.a();
                                v.a(k6);
                            }
                            return -1L;
                        }
                        k6.f24042c += read2;
                        long j9 = read2;
                        fVar.f24014c += j9;
                        return j9;
                    } catch (AssertionError e9) {
                        if (r8.k.p(e9)) {
                            throw new IOException(e9);
                        }
                        throw e9;
                    }
                }
                throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
        }
    }

    @Override // w8.y
    public final A timeout() {
        switch (this.b) {
            case 0:
                return (c) this.f24005c;
            default:
                return (A) this.f24006d;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "AsyncTimeout.source(" + ((y) this.f24006d) + ')';
            default:
                return "source(" + ((InputStream) this.f24005c) + ')';
        }
    }

    public C2912b(m8.h hVar, C2912b c2912b) {
        this.f24005c = hVar;
        this.f24006d = c2912b;
    }
}
