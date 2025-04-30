package d5;

import com.mbridge.msdk.foundation.entity.o;
import h5.i;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2188a extends InputStream {
    public final InputStream b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.e f19891c;

    /* renamed from: d, reason: collision with root package name */
    public final i f19892d;

    /* renamed from: g, reason: collision with root package name */
    public long f19894g;

    /* renamed from: f, reason: collision with root package name */
    public long f19893f = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f19895h = -1;

    public C2188a(InputStream inputStream, b5.e eVar, i iVar) {
        this.f19892d = iVar;
        this.b = inputStream;
        this.f19891c = eVar;
        this.f19894g = eVar.f5327f.c();
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.b.available();
        } catch (IOException e4) {
            long c9 = this.f19892d.c();
            b5.e eVar = this.f19891c;
            eVar.k(c9);
            h.c(eVar);
            throw e4;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b5.e eVar = this.f19891c;
        i iVar = this.f19892d;
        long c9 = iVar.c();
        if (this.f19895h == -1) {
            this.f19895h = c9;
        }
        try {
            this.b.close();
            long j7 = this.f19893f;
            if (j7 != -1) {
                eVar.j(j7);
            }
            long j9 = this.f19894g;
            if (j9 != -1) {
                eVar.f5327f.p(j9);
            }
            eVar.k(this.f19895h);
            eVar.c();
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i9) {
        this.b.mark(i9);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        i iVar = this.f19892d;
        b5.e eVar = this.f19891c;
        try {
            int read = this.b.read();
            long c9 = iVar.c();
            if (this.f19894g == -1) {
                this.f19894g = c9;
            }
            if (read == -1 && this.f19895h == -1) {
                this.f19895h = c9;
                eVar.k(c9);
                eVar.c();
            } else {
                long j7 = this.f19893f + 1;
                this.f19893f = j7;
                eVar.j(j7);
            }
            return read;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.b.reset();
        } catch (IOException e4) {
            long c9 = this.f19892d.c();
            b5.e eVar = this.f19891c;
            eVar.k(c9);
            h.c(eVar);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        i iVar = this.f19892d;
        b5.e eVar = this.f19891c;
        try {
            long skip = this.b.skip(j7);
            long c9 = iVar.c();
            if (this.f19894g == -1) {
                this.f19894g = c9;
            }
            if (skip == -1 && this.f19895h == -1) {
                this.f19895h = c9;
                eVar.k(c9);
            } else {
                long j9 = this.f19893f + skip;
                this.f19893f = j9;
                eVar.j(j9);
            }
            return skip;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        i iVar = this.f19892d;
        b5.e eVar = this.f19891c;
        try {
            int read = this.b.read(bArr, i9, i10);
            long c9 = iVar.c();
            if (this.f19894g == -1) {
                this.f19894g = c9;
            }
            if (read == -1 && this.f19895h == -1) {
                this.f19895h = c9;
                eVar.k(c9);
                eVar.c();
            } else {
                long j7 = this.f19893f + read;
                this.f19893f = j7;
                eVar.j(j7);
            }
            return read;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        i iVar = this.f19892d;
        b5.e eVar = this.f19891c;
        try {
            int read = this.b.read(bArr);
            long c9 = iVar.c();
            if (this.f19894g == -1) {
                this.f19894g = c9;
            }
            if (read == -1 && this.f19895h == -1) {
                this.f19895h = c9;
                eVar.k(c9);
                eVar.c();
            } else {
                long j7 = this.f19893f + read;
                this.f19893f = j7;
                eVar.j(j7);
            }
            return read;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }
}
