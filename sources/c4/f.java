package c4;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f2609b;

    /* renamed from: c, reason: collision with root package name */
    public final Charset f2610c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2611d;

    /* renamed from: f, reason: collision with root package name */
    public int f2612f;

    /* renamed from: g, reason: collision with root package name */
    public int f2613g;

    public f(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(g.a)) {
                this.f2609b = fileInputStream;
                this.f2610c = charset;
                this.f2611d = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2609b) {
            if (this.f2611d != null) {
                this.f2611d = null;
                this.f2609b.close();
            }
        }
    }

    public final String d() {
        int i10;
        synchronized (this.f2609b) {
            byte[] bArr = this.f2611d;
            if (bArr != null) {
                if (this.f2612f >= this.f2613g) {
                    int read = this.f2609b.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f2612f = 0;
                        this.f2613g = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i11 = this.f2612f; i11 != this.f2613g; i11++) {
                    byte[] bArr2 = this.f2611d;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f2612f;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f2610c.name());
                                this.f2612f = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f2610c.name());
                        this.f2612f = i11 + 1;
                        return str2;
                    }
                }
                e eVar = new e(this, (this.f2613g - this.f2612f) + 80);
                while (true) {
                    byte[] bArr3 = this.f2611d;
                    int i13 = this.f2612f;
                    eVar.write(bArr3, i13, this.f2613g - i13);
                    this.f2613g = -1;
                    byte[] bArr4 = this.f2611d;
                    int read2 = this.f2609b.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f2612f = 0;
                        this.f2613g = read2;
                        for (int i14 = 0; i14 != this.f2613g; i14++) {
                            byte[] bArr5 = this.f2611d;
                            if (bArr5[i14] == 10) {
                                int i15 = this.f2612f;
                                if (i14 != i15) {
                                    eVar.write(bArr5, i15, i14 - i15);
                                }
                                this.f2612f = i14 + 1;
                                return eVar.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }
}
