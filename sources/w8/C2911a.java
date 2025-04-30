package w8;

import java.io.IOException;
import java.io.OutputStream;
import y2.AbstractC2947c;

/* renamed from: w8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2911a implements x {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24003c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24004d;

    public /* synthetic */ C2911a(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f24003c = obj;
        this.f24004d = obj2;
    }

    @Override // w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                x xVar = (x) this.f24004d;
                c cVar = (c) this.f24003c;
                cVar.h();
                try {
                    xVar.close();
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
                ((OutputStream) this.f24003c).close();
                return;
        }
    }

    @Override // w8.x
    public final void d(f fVar, long j7) {
        switch (this.b) {
            case 0:
                G7.j.e(fVar, "source");
                AbstractC2947c.h(fVar.f24014c, 0L, j7);
                while (true) {
                    long j9 = 0;
                    if (j7 > 0) {
                        u uVar = fVar.b;
                        G7.j.b(uVar);
                        while (true) {
                            if (j9 < 65536) {
                                j9 += uVar.f24042c - uVar.b;
                                if (j9 >= j7) {
                                    j9 = j7;
                                } else {
                                    uVar = uVar.f24045f;
                                    G7.j.b(uVar);
                                }
                            }
                        }
                        x xVar = (x) this.f24004d;
                        c cVar = (c) this.f24003c;
                        cVar.h();
                        try {
                            xVar.d(fVar, j9);
                            if (!cVar.i()) {
                                j7 -= j9;
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
                    } else {
                        return;
                    }
                }
            default:
                G7.j.e(fVar, "source");
                AbstractC2947c.h(fVar.f24014c, 0L, j7);
                while (j7 > 0) {
                    ((A) this.f24004d).f();
                    u uVar2 = fVar.b;
                    G7.j.b(uVar2);
                    int min = (int) Math.min(j7, uVar2.f24042c - uVar2.b);
                    ((OutputStream) this.f24003c).write(uVar2.f24041a, uVar2.b, min);
                    int i9 = uVar2.b + min;
                    uVar2.b = i9;
                    long j10 = min;
                    j7 -= j10;
                    fVar.f24014c -= j10;
                    if (i9 == uVar2.f24042c) {
                        fVar.b = uVar2.a();
                        v.a(uVar2);
                    }
                }
                return;
        }
    }

    @Override // w8.x, java.io.Flushable
    public final void flush() {
        switch (this.b) {
            case 0:
                x xVar = (x) this.f24004d;
                c cVar = (c) this.f24003c;
                cVar.h();
                try {
                    xVar.flush();
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
                ((OutputStream) this.f24003c).flush();
                return;
        }
    }

    @Override // w8.x
    public final A timeout() {
        switch (this.b) {
            case 0:
                return (c) this.f24003c;
            default:
                return (A) this.f24004d;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "AsyncTimeout.sink(" + ((x) this.f24004d) + ')';
            default:
                return "sink(" + ((OutputStream) this.f24003c) + ')';
        }
    }
}
