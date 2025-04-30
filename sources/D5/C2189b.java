package d5;

import com.mbridge.msdk.foundation.entity.o;
import h5.i;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2189b extends OutputStream {
    public final OutputStream b;

    /* renamed from: c, reason: collision with root package name */
    public final i f19896c;

    /* renamed from: d, reason: collision with root package name */
    public final b5.e f19897d;

    /* renamed from: f, reason: collision with root package name */
    public long f19898f = -1;

    public C2189b(OutputStream outputStream, b5.e eVar, i iVar) {
        this.b = outputStream;
        this.f19897d = eVar;
        this.f19896c = iVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j7 = this.f19898f;
        b5.e eVar = this.f19897d;
        if (j7 != -1) {
            eVar.g(j7);
        }
        i iVar = this.f19896c;
        eVar.f5327f.n(iVar.c());
        try {
            this.b.close();
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.b.flush();
        } catch (IOException e4) {
            long c9 = this.f19896c.c();
            b5.e eVar = this.f19897d;
            eVar.k(c9);
            h.c(eVar);
            throw e4;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i9) {
        b5.e eVar = this.f19897d;
        try {
            this.b.write(i9);
            long j7 = this.f19898f + 1;
            this.f19898f = j7;
            eVar.g(j7);
        } catch (IOException e4) {
            o.u(this.f19896c, eVar, eVar);
            throw e4;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        b5.e eVar = this.f19897d;
        try {
            this.b.write(bArr);
            long length = this.f19898f + bArr.length;
            this.f19898f = length;
            eVar.g(length);
        } catch (IOException e4) {
            o.u(this.f19896c, eVar, eVar);
            throw e4;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i9, int i10) {
        b5.e eVar = this.f19897d;
        try {
            this.b.write(bArr, i9, i10);
            long j7 = this.f19898f + i10;
            this.f19898f = j7;
            eVar.g(j7);
        } catch (IOException e4) {
            o.u(this.f19896c, eVar, eVar);
            throw e4;
        }
    }
}
