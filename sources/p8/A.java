package p8;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import u7.AbstractC2815f;

/* loaded from: classes3.dex */
public final class A implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f22373i = Logger.getLogger(g.class.getName());
    public final w8.g b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22374c;

    /* renamed from: d, reason: collision with root package name */
    public final w8.f f22375d;

    /* renamed from: f, reason: collision with root package name */
    public int f22376f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22377g;

    /* renamed from: h, reason: collision with root package name */
    public final C2577e f22378h;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, w8.f] */
    public A(w8.g gVar, boolean z8) {
        G7.j.e(gVar, "sink");
        this.b = gVar;
        this.f22374c = z8;
        ?? obj = new Object();
        this.f22375d = obj;
        this.f22376f = 16384;
        this.f22378h = new C2577e(obj);
    }

    public final synchronized void a(D d2) {
        int i9;
        try {
            G7.j.e(d2, "peerSettings");
            if (!this.f22377g) {
                int i10 = this.f22376f;
                int i11 = d2.f22382a;
                if ((i11 & 32) != 0) {
                    i10 = d2.b[5];
                }
                this.f22376f = i10;
                int i12 = -1;
                if ((i11 & 2) != 0) {
                    i9 = d2.b[1];
                } else {
                    i9 = -1;
                }
                if (i9 != -1) {
                    C2577e c2577e = this.f22378h;
                    if ((i11 & 2) != 0) {
                        i12 = d2.b[1];
                    }
                    c2577e.getClass();
                    int min = Math.min(i12, 16384);
                    int i13 = c2577e.f22407e;
                    if (i13 != min) {
                        if (min < i13) {
                            c2577e.f22405c = Math.min(c2577e.f22405c, min);
                        }
                        c2577e.f22406d = true;
                        c2577e.f22407e = min;
                        int i14 = c2577e.f22411i;
                        if (min < i14) {
                            if (min == 0) {
                                C2575c[] c2575cArr = c2577e.f22408f;
                                AbstractC2815f.y(c2575cArr, 0, c2575cArr.length);
                                c2577e.f22409g = c2577e.f22408f.length - 1;
                                c2577e.f22410h = 0;
                                c2577e.f22411i = 0;
                            } else {
                                c2577e.a(i14 - min);
                            }
                        }
                    }
                }
                c(0, 0, 4, 1);
                this.b.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z8, int i9, w8.f fVar, int i10) {
        if (!this.f22377g) {
            c(i9, i10, 0, z8 ? 1 : 0);
            if (i10 > 0) {
                G7.j.b(fVar);
                this.b.d(fVar, i10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void c(int i9, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = f22373i;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i9, i10, i11, i12));
        }
        if (i10 <= this.f22376f) {
            if ((Integer.MIN_VALUE & i9) == 0) {
                byte[] bArr = j8.b.f21214a;
                w8.g gVar = this.b;
                G7.j.e(gVar, "<this>");
                gVar.writeByte((i10 >>> 16) & 255);
                gVar.writeByte((i10 >>> 8) & 255);
                gVar.writeByte(i10 & 255);
                gVar.writeByte(i11 & 255);
                gVar.writeByte(i12 & 255);
                gVar.writeInt(i9 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(G7.j.j(Integer.valueOf(i9), "reserved bit set: ").toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f22376f + ": " + i10).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f22377g = true;
        this.b.close();
    }

    public final synchronized void flush() {
        if (!this.f22377g) {
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(int i9, EnumC2574b enumC2574b, byte[] bArr) {
        try {
            if (!this.f22377g) {
                if (enumC2574b.b != -1) {
                    boolean z8 = false;
                    c(0, bArr.length + 8, 7, 0);
                    this.b.writeInt(i9);
                    this.b.writeInt(enumC2574b.b);
                    if (bArr.length == 0) {
                        z8 = true;
                    }
                    if (!z8) {
                        this.b.write(bArr);
                    }
                    this.b.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(boolean z8, int i9, int i10) {
        if (!this.f22377g) {
            c(0, 8, 6, z8 ? 1 : 0);
            this.b.writeInt(i9);
            this.b.writeInt(i10);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(int i9, EnumC2574b enumC2574b) {
        G7.j.e(enumC2574b, "errorCode");
        if (!this.f22377g) {
            if (enumC2574b.b != -1) {
                c(i9, 4, 3, 0);
                this.b.writeInt(enumC2574b.b);
                this.b.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(int i9, long j7) {
        if (!this.f22377g) {
            if (j7 != 0 && j7 <= 2147483647L) {
                c(i9, 4, 8, 0);
                this.b.writeInt((int) j7);
                this.b.flush();
            } else {
                throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void l(int i9, long j7) {
        int i10;
        while (j7 > 0) {
            long min = Math.min(this.f22376f, j7);
            j7 -= min;
            int i11 = (int) min;
            if (j7 == 0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            c(i9, i11, 9, i10);
            this.b.d(this.f22375d, min);
        }
    }
}
