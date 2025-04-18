package ei;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f17492g;

    /* renamed from: b, reason: collision with root package name */
    public final ki.k f17493b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17494c;

    /* renamed from: d, reason: collision with root package name */
    public final v f17495d;

    /* renamed from: f, reason: collision with root package name */
    public final d f17496f;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f17492g = logger;
    }

    public w(ki.k source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f17493b = source;
        this.f17494c = z10;
        v vVar = new v(source);
        this.f17495d = vVar;
        this.f17496f = new d(vVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17493b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0188, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", java.lang.Integer.valueOf(r8)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(boolean r23, ei.n r24) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.w.d(boolean, ei.n):boolean");
    }

    public final void g(n handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f17494c) {
            if (!d(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ki.l lVar = g.a;
        ki.l readByteString = this.f17493b.readByteString(lVar.f20997b.length);
        Level level = Level.FINE;
        Logger logger = f17492g;
        if (logger.isLoggable(level)) {
            logger.fine(xh.b.h(Intrinsics.stringPlus("<< CONNECTION ", readByteString.e()), new Object[0]));
        }
        if (Intrinsics.areEqual(lVar, readByteString)) {
        } else {
            throw new IOException(Intrinsics.stringPlus("Expected a connection header but was ", readByteString.q()));
        }
    }

    public final void j(n nVar, int i10, int i11) {
        b errorCode;
        Object[] array;
        boolean z10;
        if (i10 >= 8) {
            if (i11 == 0) {
                int readInt = this.f17493b.readInt();
                int readInt2 = this.f17493b.readInt();
                int i12 = i10 - 8;
                b[] values = b.values();
                int length = values.length;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i14 < length) {
                        errorCode = values[i14];
                        if (errorCode.f17382b == readInt2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            break;
                        } else {
                            i14++;
                        }
                    } else {
                        errorCode = null;
                        break;
                    }
                }
                if (errorCode != null) {
                    ki.l debugData = ki.l.f20996f;
                    if (i12 > 0) {
                        debugData = this.f17493b.readByteString(i12);
                    }
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    Intrinsics.checkNotNullParameter(debugData, "debugData");
                    debugData.d();
                    t tVar = nVar.f17439c;
                    synchronized (tVar) {
                        array = tVar.f17458d.values().toArray(new a0[0]);
                        if (array != null) {
                            tVar.f17462i = true;
                            Unit unit = Unit.INSTANCE;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                    a0[] a0VarArr = (a0[]) array;
                    int length2 = a0VarArr.length;
                    while (i13 < length2) {
                        a0 a0Var = a0VarArr[i13];
                        i13++;
                        if (a0Var.a > readInt && a0Var.g()) {
                            b errorCode2 = b.REFUSED_STREAM;
                            synchronized (a0Var) {
                                Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
                                if (a0Var.f17373m == null) {
                                    a0Var.f17373m = errorCode2;
                                    a0Var.notifyAll();
                                }
                            }
                            nVar.f17439c.k(a0Var.a);
                        }
                    }
                    return;
                }
                throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY length < 8: ", Integer.valueOf(i10)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
    
        throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("Invalid dynamic table size update ", java.lang.Integer.valueOf(r3.f17400b)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List k(int r3, int r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.w.k(int, int, int, int):java.util.List");
    }

    public final void p(n nVar, int i10, int i11, int i12) {
        boolean z10;
        if (i10 == 8) {
            if (i12 == 0) {
                int readInt = this.f17493b.readInt();
                int readInt2 = this.f17493b.readInt();
                if ((i11 & 1) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    t tVar = nVar.f17439c;
                    synchronized (tVar) {
                        if (readInt != 1) {
                            if (readInt != 2) {
                                if (readInt == 3) {
                                    tVar.notifyAll();
                                }
                                Unit unit = Unit.INSTANCE;
                            } else {
                                tVar.f17471r++;
                            }
                        } else {
                            tVar.f17469p++;
                        }
                    }
                    return;
                }
                t tVar2 = nVar.f17439c;
                tVar2.f17464k.c(new l(Intrinsics.stringPlus(tVar2.f17459f, " ping"), nVar.f17439c, readInt, readInt2), 0L);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(Intrinsics.stringPlus("TYPE_PING length != 8: ", Integer.valueOf(i10)));
    }

    public final void q(n nVar, int i10, int i11) {
        if (i10 == 4) {
            int readInt = this.f17493b.readInt();
            byte[] bArr = xh.b.a;
            long j3 = readInt & 2147483647L;
            if (j3 != 0) {
                if (i11 == 0) {
                    t tVar = nVar.f17439c;
                    synchronized (tVar) {
                        tVar.f17477y += j3;
                        tVar.notifyAll();
                        Unit unit = Unit.INSTANCE;
                    }
                    return;
                }
                a0 j10 = nVar.f17439c.j(i11);
                if (j10 != null) {
                    synchronized (j10) {
                        j10.f17366f += j3;
                        if (j3 > 0) {
                            j10.notifyAll();
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    return;
                }
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(Intrinsics.stringPlus("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i10)));
    }
}
