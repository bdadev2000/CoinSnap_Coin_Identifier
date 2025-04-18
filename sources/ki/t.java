package ki;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public byte f21020b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f21021c;

    /* renamed from: d, reason: collision with root package name */
    public final Inflater f21022d;

    /* renamed from: f, reason: collision with root package name */
    public final u f21023f;

    /* renamed from: g, reason: collision with root package name */
    public final CRC32 f21024g;

    public t(k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        e0 e0Var = new e0(source);
        this.f21021c = e0Var;
        Inflater inflater = new Inflater(true);
        this.f21022d = inflater;
        this.f21023f = new u(e0Var, inflater);
        this.f21024g = new CRC32();
    }

    public static void d(String str, int i10, int i11) {
        if (i11 == i10) {
        } else {
            throw new IOException(com.applovin.impl.mediation.ads.e.h(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21023f.close();
    }

    public final void g(long j3, long j10, i iVar) {
        f0 f0Var = iVar.f20993b;
        Intrinsics.checkNotNull(f0Var);
        while (true) {
            int i10 = f0Var.f20980c;
            int i11 = f0Var.f20979b;
            if (j3 < i10 - i11) {
                break;
            }
            j3 -= i10 - i11;
            f0Var = f0Var.f20983f;
            Intrinsics.checkNotNull(f0Var);
        }
        while (j10 > 0) {
            int min = (int) Math.min(f0Var.f20980c - r5, j10);
            this.f21024g.update(f0Var.a, (int) (f0Var.f20979b + j3), min);
            j10 -= min;
            f0Var = f0Var.f20983f;
            Intrinsics.checkNotNull(f0Var);
            j3 = 0;
        }
    }

    @Override // ki.k0
    public final long read(i sink, long j3) {
        boolean z10;
        e0 e0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j3 == 0) {
                return 0L;
            }
            byte b3 = this.f21020b;
            CRC32 crc32 = this.f21024g;
            e0 e0Var2 = this.f21021c;
            if (b3 == 0) {
                e0Var2.require(10L);
                i iVar = e0Var2.f20977c;
                byte k10 = iVar.k(3L);
                if (((k10 >> 1) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    g(0L, 10L, e0Var2.f20977c);
                }
                d("ID1ID2", 8075, e0Var2.readShort());
                e0Var2.skip(8L);
                if (((k10 >> 2) & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    e0Var2.require(2L);
                    if (z11) {
                        g(0L, 2L, e0Var2.f20977c);
                    }
                    long readShortLe = iVar.readShortLe() & UShort.MAX_VALUE;
                    e0Var2.require(readShortLe);
                    if (z11) {
                        g(0L, readShortLe, e0Var2.f20977c);
                        j10 = readShortLe;
                    } else {
                        j10 = readShortLe;
                    }
                    e0Var2.skip(j10);
                }
                if (((k10 >> 3) & 1) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    long indexOf = e0Var2.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                    if (indexOf != -1) {
                        if (z11) {
                            e0Var = e0Var2;
                            g(0L, indexOf + 1, e0Var2.f20977c);
                        } else {
                            e0Var = e0Var2;
                        }
                        e0Var.skip(indexOf + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    e0Var = e0Var2;
                }
                if (((k10 >> 4) & 1) == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    long indexOf2 = e0Var.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                    if (indexOf2 != -1) {
                        if (z11) {
                            g(0L, indexOf2 + 1, e0Var.f20977c);
                        }
                        e0Var.skip(indexOf2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z11) {
                    d("FHCRC", e0Var.readShortLe(), (short) crc32.getValue());
                    crc32.reset();
                }
                this.f21020b = (byte) 1;
            } else {
                e0Var = e0Var2;
            }
            if (this.f21020b == 1) {
                long j11 = sink.f20994c;
                long read = this.f21023f.read(sink, j3);
                if (read != -1) {
                    g(j11, read, sink);
                    return read;
                }
                this.f21020b = (byte) 2;
            }
            if (this.f21020b == 2) {
                d("CRC", e0Var.readIntLe(), (int) crc32.getValue());
                d("ISIZE", e0Var.readIntLe(), (int) this.f21022d.getBytesWritten());
                this.f21020b = (byte) 3;
                if (!e0Var.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount < 0: ", j3).toString());
    }

    @Override // ki.k0
    public final m0 timeout() {
        return this.f21021c.timeout();
    }
}
