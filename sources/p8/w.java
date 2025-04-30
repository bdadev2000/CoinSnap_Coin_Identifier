package p8;

import Q7.n0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class w implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f22481g;
    public final w8.h b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22482c;

    /* renamed from: d, reason: collision with root package name */
    public final v f22483d;

    /* renamed from: f, reason: collision with root package name */
    public final C2576d f22484f;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        G7.j.d(logger, "getLogger(Http2::class.java.name)");
        f22481g = logger;
    }

    public w(w8.h hVar, boolean z8) {
        G7.j.e(hVar, "source");
        this.b = hVar;
        this.f22482c = z8;
        v vVar = new v(hVar);
        this.f22483d = vVar;
        this.f22484f = new C2576d(vVar);
    }

    public final boolean a(boolean z8, m mVar) {
        EnumC2574b enumC2574b;
        int readInt;
        Object[] array;
        String h6;
        G7.j.e(mVar, "handler");
        int i9 = 0;
        try {
            this.b.require(9L);
            int s5 = j8.b.s(this.b);
            if (s5 <= 16384) {
                int readByte = this.b.readByte() & 255;
                byte readByte2 = this.b.readByte();
                int i10 = readByte2 & 255;
                int readInt2 = this.b.readInt();
                int i11 = readInt2 & Integer.MAX_VALUE;
                Logger logger = f22481g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g.a(true, i11, s5, readByte, i10));
                }
                if (z8 && readByte != 4) {
                    String[] strArr = g.b;
                    if (readByte < strArr.length) {
                        h6 = strArr[readByte];
                    } else {
                        h6 = j8.b.h("0x%02x", Integer.valueOf(readByte));
                    }
                    throw new IOException(G7.j.j(h6, "Expected a SETTINGS frame but was "));
                }
                EnumC2574b enumC2574b2 = null;
                switch (readByte) {
                    case 0:
                        c(mVar, s5, i10, i11);
                        return true;
                    case 1:
                        i(mVar, s5, i10, i11);
                        return true;
                    case 2:
                        if (s5 == 5) {
                            if (i11 != 0) {
                                w8.h hVar = this.b;
                                hVar.readInt();
                                hVar.readByte();
                                return true;
                            }
                            throw new IOException("TYPE_PRIORITY streamId == 0");
                        }
                        throw new IOException(n0.f(s5, "TYPE_PRIORITY length: ", " != 5"));
                    case 3:
                        if (s5 == 4) {
                            if (i11 != 0) {
                                int readInt3 = this.b.readInt();
                                EnumC2574b[] values = EnumC2574b.values();
                                int length = values.length;
                                while (true) {
                                    if (i9 < length) {
                                        enumC2574b = values[i9];
                                        if (enumC2574b.b != readInt3) {
                                            i9++;
                                        }
                                    } else {
                                        enumC2574b = null;
                                    }
                                }
                                if (enumC2574b != null) {
                                    s sVar = mVar.f22426c;
                                    sVar.getClass();
                                    if (i11 != 0 && (readInt2 & 1) == 0) {
                                        sVar.l.c(new p(sVar.f22450f + '[' + i11 + "] onReset", sVar, i11, enumC2574b, 0), 0L);
                                    } else {
                                        z h9 = sVar.h(i11);
                                        if (h9 != null) {
                                            h9.j(enumC2574b);
                                        }
                                    }
                                    return true;
                                }
                                throw new IOException(G7.j.j(Integer.valueOf(readInt3), "TYPE_RST_STREAM unexpected error code: "));
                            }
                            throw new IOException("TYPE_RST_STREAM streamId == 0");
                        }
                        throw new IOException(n0.f(s5, "TYPE_RST_STREAM length: ", " != 4"));
                    case 4:
                        if (i11 == 0) {
                            if ((readByte2 & 1) != 0) {
                                if (s5 != 0) {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (s5 % 6 == 0) {
                                D d2 = new D();
                                L7.a s9 = e1.f.s(e1.f.t(0, s5), 6);
                                int i12 = s9.b;
                                int i13 = s9.f1830c;
                                int i14 = s9.f1831d;
                                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                                    while (true) {
                                        int i15 = i12 + i14;
                                        w8.h hVar2 = this.b;
                                        short readShort = hVar2.readShort();
                                        byte[] bArr = j8.b.f21214a;
                                        int i16 = readShort & 65535;
                                        readInt = hVar2.readInt();
                                        if (i16 != 2) {
                                            if (i16 != 3) {
                                                if (i16 != 4) {
                                                    if (i16 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                                    }
                                                } else if (readInt >= 0) {
                                                    i16 = 7;
                                                } else {
                                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                }
                                            } else {
                                                i16 = 4;
                                            }
                                        } else if (readInt != 0 && readInt != 1) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        d2.c(i16, readInt);
                                        if (i12 != i13) {
                                            i12 = i15;
                                        }
                                    }
                                    throw new IOException(G7.j.j(Integer.valueOf(readInt), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                }
                                s sVar2 = mVar.f22426c;
                                sVar2.f22455k.c(new l(G7.j.j(" applyAndAckSettings", sVar2.f22450f), mVar, d2), 0L);
                            } else {
                                throw new IOException(G7.j.j(Integer.valueOf(s5), "TYPE_SETTINGS length % 6 != 0: "));
                            }
                            return true;
                        }
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    case 5:
                        j(mVar, s5, i10, i11);
                        return true;
                    case 6:
                        if (s5 == 8) {
                            if (i11 == 0) {
                                int readInt4 = this.b.readInt();
                                int readInt5 = this.b.readInt();
                                if ((readByte2 & 1) != 0) {
                                    s sVar3 = mVar.f22426c;
                                    synchronized (sVar3) {
                                        try {
                                            if (readInt4 != 1) {
                                                if (readInt4 != 2) {
                                                    if (readInt4 == 3) {
                                                        sVar3.notifyAll();
                                                    }
                                                } else {
                                                    sVar3.f22460r++;
                                                }
                                            } else {
                                                sVar3.f22458p++;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else {
                                    s sVar4 = mVar.f22426c;
                                    sVar4.f22455k.c(new k(G7.j.j(" ping", sVar4.f22450f), mVar.f22426c, readInt4, readInt5), 0L);
                                }
                                return true;
                            }
                            throw new IOException("TYPE_PING streamId != 0");
                        }
                        throw new IOException(G7.j.j(Integer.valueOf(s5), "TYPE_PING length != 8: "));
                    case 7:
                        if (s5 >= 8) {
                            if (i11 == 0) {
                                int readInt6 = this.b.readInt();
                                int readInt7 = this.b.readInt();
                                int i17 = s5 - 8;
                                EnumC2574b[] values2 = EnumC2574b.values();
                                int length2 = values2.length;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < length2) {
                                        EnumC2574b enumC2574b3 = values2[i18];
                                        if (enumC2574b3.b == readInt7) {
                                            enumC2574b2 = enumC2574b3;
                                        } else {
                                            i18++;
                                        }
                                    }
                                }
                                if (enumC2574b2 != null) {
                                    w8.i iVar = w8.i.f24015f;
                                    if (i17 > 0) {
                                        iVar = this.b.readByteString(i17);
                                    }
                                    G7.j.e(iVar, "debugData");
                                    iVar.c();
                                    s sVar5 = mVar.f22426c;
                                    synchronized (sVar5) {
                                        array = sVar5.f22449d.values().toArray(new z[0]);
                                        if (array != null) {
                                            sVar5.f22453i = true;
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                        }
                                    }
                                    z[] zVarArr = (z[]) array;
                                    int length3 = zVarArr.length;
                                    while (i9 < length3) {
                                        z zVar = zVarArr[i9];
                                        i9++;
                                        if (zVar.f22493a > readInt6 && zVar.g()) {
                                            zVar.j(EnumC2574b.REFUSED_STREAM);
                                            mVar.f22426c.h(zVar.f22493a);
                                        }
                                    }
                                    return true;
                                }
                                throw new IOException(G7.j.j(Integer.valueOf(readInt7), "TYPE_GOAWAY unexpected error code: "));
                            }
                            throw new IOException("TYPE_GOAWAY streamId != 0");
                        }
                        throw new IOException(G7.j.j(Integer.valueOf(s5), "TYPE_GOAWAY length < 8: "));
                    case 8:
                        if (s5 == 4) {
                            long readInt8 = this.b.readInt() & 2147483647L;
                            if (readInt8 != 0) {
                                if (i11 == 0) {
                                    s sVar6 = mVar.f22426c;
                                    synchronized (sVar6) {
                                        sVar6.f22467y += readInt8;
                                        sVar6.notifyAll();
                                    }
                                } else {
                                    z c9 = mVar.f22426c.c(i11);
                                    if (c9 != null) {
                                        synchronized (c9) {
                                            c9.f22497f += readInt8;
                                            if (readInt8 > 0) {
                                                c9.notifyAll();
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        throw new IOException(G7.j.j(Integer.valueOf(s5), "TYPE_WINDOW_UPDATE length !=4: "));
                    default:
                        this.b.skip(s5);
                        return true;
                }
            }
            throw new IOException(G7.j.j(Integer.valueOf(s5), "FRAME_SIZE_ERROR: "));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(m mVar) {
        G7.j.e(mVar, "handler");
        if (this.f22482c) {
            if (!a(true, mVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        w8.i iVar = g.f22413a;
        w8.i readByteString = this.b.readByteString(iVar.b.length);
        Level level = Level.FINE;
        Logger logger = f22481g;
        if (logger.isLoggable(level)) {
            logger.fine(j8.b.h(G7.j.j(readByteString.d(), "<< CONNECTION "), new Object[0]));
        }
        if (iVar.equals(readByteString)) {
        } else {
            throw new IOException(G7.j.j(readByteString.j(), "Expected a connection header but was "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, w8.f] */
    public final void c(m mVar, int i9, int i10, int i11) {
        boolean z8;
        int i12;
        int i13;
        boolean z9;
        z zVar;
        boolean z10;
        boolean z11;
        boolean z12;
        long j7;
        if (i11 != 0) {
            if ((i10 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i10 & 32) == 0) {
                if ((i10 & 8) != 0) {
                    byte readByte = this.b.readByte();
                    byte[] bArr = j8.b.f21214a;
                    i13 = readByte & 255;
                    i12 = i9;
                } else {
                    i12 = i9;
                    i13 = 0;
                }
                int a6 = u.a(i12, i10, i13);
                w8.h hVar = this.b;
                mVar.getClass();
                G7.j.e(hVar, "source");
                mVar.f22426c.getClass();
                if (i11 != 0 && (i11 & 1) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    s sVar = mVar.f22426c;
                    sVar.getClass();
                    ?? obj = new Object();
                    long j9 = a6;
                    hVar.require(j9);
                    hVar.read(obj, j9);
                    sVar.l.c(new n(sVar.f22450f + '[' + i11 + "] onData", sVar, i11, obj, a6, z8), 0L);
                } else {
                    z c9 = mVar.f22426c.c(i11);
                    if (c9 == null) {
                        mVar.f22426c.l(i11, EnumC2574b.PROTOCOL_ERROR);
                        long j10 = a6;
                        mVar.f22426c.j(j10);
                        hVar.skip(j10);
                    } else {
                        byte[] bArr2 = j8.b.f21214a;
                        y yVar = c9.f22500i;
                        long j11 = a6;
                        yVar.getClass();
                        while (true) {
                            if (j11 > 0) {
                                synchronized (yVar.f22492h) {
                                    z10 = yVar.f22488c;
                                    zVar = c9;
                                    if (yVar.f22490f.f24014c + j11 > yVar.b) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                if (z11) {
                                    hVar.skip(j11);
                                    yVar.f22492h.e(EnumC2574b.FLOW_CONTROL_ERROR);
                                    break;
                                }
                                if (z10) {
                                    hVar.skip(j11);
                                    break;
                                }
                                long read = hVar.read(yVar.f22489d, j11);
                                if (read != -1) {
                                    j11 -= read;
                                    z zVar2 = yVar.f22492h;
                                    synchronized (zVar2) {
                                        if (yVar.f22491g) {
                                            w8.f fVar = yVar.f22489d;
                                            j7 = fVar.f24014c;
                                            fVar.skip(j7);
                                        } else {
                                            w8.f fVar2 = yVar.f22490f;
                                            if (fVar2.f24014c == 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            fVar2.z(yVar.f22489d);
                                            if (z12) {
                                                zVar2.notifyAll();
                                            }
                                            j7 = 0;
                                        }
                                    }
                                    if (j7 > 0) {
                                        yVar.a(j7);
                                    }
                                    c9 = zVar;
                                } else {
                                    throw new EOFException();
                                }
                            } else {
                                zVar = c9;
                                break;
                            }
                        }
                        if (z8) {
                            zVar.i(j8.b.b, true);
                        }
                    }
                }
                this.b.skip(i13);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException(G7.j.j(java.lang.Integer.valueOf(r6.f22398a), "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List h(int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.w.h(int, int, int, int):java.util.List");
    }

    public final void i(m mVar, int i9, int i10, int i11) {
        boolean z8;
        int i12;
        int i13 = 1;
        if (i11 != 0) {
            boolean z9 = false;
            if ((i10 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i10 & 8) != 0) {
                byte readByte = this.b.readByte();
                byte[] bArr = j8.b.f21214a;
                i12 = readByte & 255;
            } else {
                i12 = 0;
            }
            if ((i10 & 32) != 0) {
                w8.h hVar = this.b;
                hVar.readInt();
                hVar.readByte();
                byte[] bArr2 = j8.b.f21214a;
                mVar.getClass();
                i9 -= 5;
            }
            List h6 = h(u.a(i9, i10, i12), i12, i10, i11);
            mVar.getClass();
            mVar.f22426c.getClass();
            if (i11 != 0 && (i11 & 1) == 0) {
                z9 = true;
            }
            if (z9) {
                s sVar = mVar.f22426c;
                sVar.getClass();
                sVar.l.c(new o(sVar.f22450f + '[' + i11 + "] onHeaders", sVar, i11, h6, z8), 0L);
                return;
            }
            s sVar2 = mVar.f22426c;
            synchronized (sVar2) {
                z c9 = sVar2.c(i11);
                if (c9 == null) {
                    if (!sVar2.f22453i) {
                        if (i11 > sVar2.f22451g) {
                            if (i11 % 2 != sVar2.f22452h % 2) {
                                z zVar = new z(i11, sVar2, false, z8, j8.b.u(h6));
                                sVar2.f22451g = i11;
                                sVar2.f22449d.put(Integer.valueOf(i11), zVar);
                                sVar2.f22454j.f().c(new j(sVar2.f22450f + '[' + i11 + "] onStream", sVar2, zVar, i13), 0L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                c9.i(j8.b.u(h6), z8);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void j(m mVar, int i9, int i10, int i11) {
        int i12;
        if (i11 != 0) {
            if ((i10 & 8) != 0) {
                byte readByte = this.b.readByte();
                byte[] bArr = j8.b.f21214a;
                i12 = readByte & 255;
            } else {
                i12 = 0;
            }
            int readInt = this.b.readInt() & Integer.MAX_VALUE;
            List h6 = h(u.a(i9 - 4, i10, i12), i12, i10, i11);
            mVar.getClass();
            s sVar = mVar.f22426c;
            sVar.getClass();
            synchronized (sVar) {
                if (sVar.f22447C.contains(Integer.valueOf(readInt))) {
                    sVar.l(readInt, EnumC2574b.PROTOCOL_ERROR);
                    return;
                }
                sVar.f22447C.add(Integer.valueOf(readInt));
                sVar.l.c(new o(sVar.f22450f + '[' + readInt + "] onRequest", sVar, readInt, h6), 0L);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
