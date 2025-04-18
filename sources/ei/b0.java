package ei;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes5.dex */
public final class b0 implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f17383i = Logger.getLogger(g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final ki.j f17384b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17385c;

    /* renamed from: d, reason: collision with root package name */
    public final ki.i f17386d;

    /* renamed from: f, reason: collision with root package name */
    public int f17387f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17388g;

    /* renamed from: h, reason: collision with root package name */
    public final e f17389h;

    public b0(ki.j sink, boolean z10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f17384b = sink;
        this.f17385c = z10;
        ki.i iVar = new ki.i();
        this.f17386d = iVar;
        this.f17387f = JsonLexerKt.BATCH_SIZE;
        this.f17389h = new e(iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f17388g = true;
        this.f17384b.close();
    }

    public final synchronized void d(e0 peerSettings) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (!this.f17388g) {
            int i12 = this.f17387f;
            int i13 = peerSettings.a;
            if ((i13 & 32) != 0) {
                i12 = peerSettings.f17415b[5];
            }
            this.f17387f = i12;
            if ((i13 & 2) != 0) {
                i10 = peerSettings.f17415b[1];
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                e eVar = this.f17389h;
                if ((i13 & 2) != 0) {
                    i11 = peerSettings.f17415b[1];
                } else {
                    i11 = -1;
                }
                eVar.getClass();
                int min = Math.min(i11, JsonLexerKt.BATCH_SIZE);
                int i14 = eVar.f17410e;
                if (i14 != min) {
                    if (min < i14) {
                        eVar.f17408c = Math.min(eVar.f17408c, min);
                    }
                    eVar.f17409d = true;
                    eVar.f17410e = min;
                    int i15 = eVar.f17414i;
                    if (min < i15) {
                        if (min == 0) {
                            ArraysKt___ArraysJvmKt.fill$default(eVar.f17411f, (Object) null, 0, 0, 6, (Object) null);
                            eVar.f17412g = eVar.f17411f.length - 1;
                            eVar.f17413h = 0;
                            eVar.f17414i = 0;
                        } else {
                            eVar.a(i15 - min);
                        }
                    }
                }
            }
            j(0, 0, 4, 1);
            this.f17384b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(boolean z10, int i10, ki.i iVar, int i11) {
        if (!this.f17388g) {
            j(i10, i11, 0, z10 ? 1 : 0);
            if (i11 > 0) {
                Intrinsics.checkNotNull(iVar);
                this.f17384b.a(iVar, i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void j(int i10, int i11, int i12, int i13) {
        boolean z10;
        Level level = Level.FINE;
        Logger logger = f17383i;
        boolean z11 = false;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(i10, i11, i12, i13, false));
        }
        if (i11 <= this.f17387f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                z11 = true;
            }
            if (z11) {
                byte[] bArr = xh.b.a;
                ki.j jVar = this.f17384b;
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                jVar.writeByte((i11 >>> 16) & 255);
                jVar.writeByte((i11 >>> 8) & 255);
                jVar.writeByte(i11 & 255);
                jVar.writeByte(i12 & 255);
                jVar.writeByte(i13 & 255);
                jVar.writeInt(i10 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(i10)).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f17387f + ": " + i11).toString());
    }

    public final synchronized void k(int i10, b errorCode, byte[] debugData) {
        boolean z10;
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (!this.f17388g) {
            boolean z11 = false;
            if (errorCode.f17382b != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j(0, debugData.length + 8, 7, 0);
                this.f17384b.writeInt(i10);
                this.f17384b.writeInt(errorCode.f17382b);
                if (debugData.length == 0) {
                    z11 = true;
                }
                if (!z11) {
                    this.f17384b.write(debugData);
                }
                this.f17384b.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void p(boolean z10, int i10, int i11) {
        int i12;
        if (!this.f17388g) {
            if (z10) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            j(0, 8, 6, i12);
            this.f17384b.writeInt(i10);
            this.f17384b.writeInt(i11);
            this.f17384b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i10, b errorCode) {
        boolean z10;
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (!this.f17388g) {
            if (errorCode.f17382b != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j(i10, 4, 3, 0);
                this.f17384b.writeInt(errorCode.f17382b);
                this.f17384b.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void r(int i10, long j3) {
        boolean z10;
        if (!this.f17388g) {
            if (j3 != 0 && j3 <= 2147483647L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j(i10, 4, 8, 0);
                this.f17384b.writeInt((int) j3);
                this.f17384b.flush();
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j3)).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void s(int i10, long j3) {
        int i11;
        while (j3 > 0) {
            long min = Math.min(this.f17387f, j3);
            j3 -= min;
            int i12 = (int) min;
            if (j3 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            j(i10, i12, 9, i11);
            this.f17384b.a(this.f17386d, min);
        }
    }
}
