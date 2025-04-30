package L1;

import androidx.fragment.app.FragmentTransaction;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class e implements Closeable {
    public final InputStream b;

    /* renamed from: c, reason: collision with root package name */
    public final Charset f1704c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f1705d;

    /* renamed from: f, reason: collision with root package name */
    public int f1706f;

    /* renamed from: g, reason: collision with root package name */
    public int f1707g;

    public e(FileInputStream fileInputStream) {
        Charset charset = f.f1708a;
        if (charset != null) {
            if (charset.equals(charset)) {
                this.b = fileInputStream;
                this.f1704c = charset;
                this.f1705d = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final String a() {
        int i9;
        synchronized (this.b) {
            try {
                byte[] bArr = this.f1705d;
                if (bArr != null) {
                    if (this.f1706f >= this.f1707g) {
                        int read = this.b.read(bArr, 0, bArr.length);
                        if (read != -1) {
                            this.f1706f = 0;
                            this.f1707g = read;
                        } else {
                            throw new EOFException();
                        }
                    }
                    for (int i10 = this.f1706f; i10 != this.f1707g; i10++) {
                        byte[] bArr2 = this.f1705d;
                        if (bArr2[i10] == 10) {
                            int i11 = this.f1706f;
                            if (i10 != i11) {
                                i9 = i10 - 1;
                                if (bArr2[i9] == 13) {
                                    String str = new String(bArr2, i11, i9 - i11, this.f1704c.name());
                                    this.f1706f = i10 + 1;
                                    return str;
                                }
                            }
                            i9 = i10;
                            String str2 = new String(bArr2, i11, i9 - i11, this.f1704c.name());
                            this.f1706f = i10 + 1;
                            return str2;
                        }
                    }
                    d dVar = new d(this, (this.f1707g - this.f1706f) + 80);
                    while (true) {
                        byte[] bArr3 = this.f1705d;
                        int i12 = this.f1706f;
                        dVar.write(bArr3, i12, this.f1707g - i12);
                        this.f1707g = -1;
                        byte[] bArr4 = this.f1705d;
                        int read2 = this.b.read(bArr4, 0, bArr4.length);
                        if (read2 != -1) {
                            this.f1706f = 0;
                            this.f1707g = read2;
                            for (int i13 = 0; i13 != this.f1707g; i13++) {
                                byte[] bArr5 = this.f1705d;
                                if (bArr5[i13] == 10) {
                                    int i14 = this.f1706f;
                                    if (i13 != i14) {
                                        dVar.write(bArr5, i14, i13 - i14);
                                    }
                                    this.f1706f = i13 + 1;
                                    return dVar.toString();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                } else {
                    throw new IOException("LineReader is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            try {
                if (this.f1705d != null) {
                    this.f1705d = null;
                    this.b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
