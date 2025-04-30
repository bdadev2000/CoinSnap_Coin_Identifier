package w8;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public final class n implements y {
    public byte b;

    /* renamed from: c, reason: collision with root package name */
    public final t f24023c;

    /* renamed from: d, reason: collision with root package name */
    public final Inflater f24024d;

    /* renamed from: f, reason: collision with root package name */
    public final o f24025f;

    /* renamed from: g, reason: collision with root package name */
    public final CRC32 f24026g;

    public n(y yVar) {
        G7.j.e(yVar, "source");
        t tVar = new t(yVar);
        this.f24023c = tVar;
        Inflater inflater = new Inflater(true);
        this.f24024d = inflater;
        this.f24025f = new o(tVar, inflater);
        this.f24026g = new CRC32();
    }

    public static void a(String str, int i9, int i10) {
        if (i10 == i9) {
        } else {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i9)}, 3)));
        }
    }

    public final void b(f fVar, long j7, long j9) {
        u uVar = fVar.b;
        G7.j.b(uVar);
        while (true) {
            int i9 = uVar.f24042c;
            int i10 = uVar.b;
            if (j7 < i9 - i10) {
                break;
            }
            j7 -= i9 - i10;
            uVar = uVar.f24045f;
            G7.j.b(uVar);
        }
        while (j9 > 0) {
            int min = (int) Math.min(uVar.f24042c - r6, j9);
            this.f24026g.update(uVar.f24041a, (int) (uVar.b + j7), min);
            j9 -= min;
            uVar = uVar.f24045f;
            G7.j.b(uVar);
            j7 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24025f.close();
    }

    @Override // w8.y
    public final long read(f fVar, long j7) {
        t tVar;
        boolean z8;
        f fVar2;
        long j9;
        G7.j.e(fVar, "sink");
        if (j7 >= 0) {
            if (j7 == 0) {
                return 0L;
            }
            byte b = this.b;
            CRC32 crc32 = this.f24026g;
            t tVar2 = this.f24023c;
            if (b == 0) {
                tVar2.require(10L);
                f fVar3 = tVar2.f24039c;
                byte c9 = fVar3.c(3L);
                if (((c9 >> 1) & 1) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    b(tVar2.f24039c, 0L, 10L);
                }
                a("ID1ID2", 8075, tVar2.readShort());
                tVar2.skip(8L);
                if (((c9 >> 2) & 1) == 1) {
                    tVar2.require(2L);
                    if (z8) {
                        b(tVar2.f24039c, 0L, 2L);
                    }
                    short readShort = fVar3.readShort();
                    long j10 = (short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8));
                    tVar2.require(j10);
                    if (z8) {
                        b(tVar2.f24039c, 0L, j10);
                        j9 = j10;
                    } else {
                        j9 = j10;
                    }
                    tVar2.skip(j9);
                }
                if (((c9 >> 3) & 1) == 1) {
                    fVar2 = fVar3;
                    long indexOf = tVar2.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                    if (indexOf != -1) {
                        if (z8) {
                            tVar = tVar2;
                            b(tVar2.f24039c, 0L, indexOf + 1);
                        } else {
                            tVar = tVar2;
                        }
                        tVar.skip(indexOf + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    fVar2 = fVar3;
                    tVar = tVar2;
                }
                if (((c9 >> 4) & 1) == 1) {
                    long indexOf2 = tVar.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                    if (indexOf2 != -1) {
                        if (z8) {
                            b(tVar.f24039c, 0L, indexOf2 + 1);
                        }
                        tVar.skip(indexOf2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z8) {
                    tVar.require(2L);
                    short readShort2 = fVar2.readShort();
                    a("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                    crc32.reset();
                }
                this.b = (byte) 1;
            } else {
                tVar = tVar2;
            }
            if (this.b == 1) {
                long j11 = fVar.f24014c;
                long read = this.f24025f.read(fVar, j7);
                if (read != -1) {
                    b(fVar, j11, read);
                    return read;
                }
                this.b = (byte) 2;
            }
            if (this.b == 2) {
                tVar.require(4L);
                f fVar4 = tVar.f24039c;
                a("CRC", AbstractC2947c.w(fVar4.readInt()), (int) crc32.getValue());
                tVar.require(4L);
                a("ISIZE", AbstractC2947c.w(fVar4.readInt()), (int) this.f24024d.getBytesWritten());
                this.b = (byte) 3;
                if (tVar.exhausted()) {
                    return -1L;
                }
                throw new IOException("gzip finished without exhausting source");
            }
            return -1L;
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
    }

    @Override // w8.y
    public final A timeout() {
        return this.f24023c.b.timeout();
    }
}
