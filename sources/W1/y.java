package W1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y extends FilterInputStream {
    public volatile byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public int f3605c;

    /* renamed from: d, reason: collision with root package name */
    public int f3606d;

    /* renamed from: f, reason: collision with root package name */
    public int f3607f;

    /* renamed from: g, reason: collision with root package name */
    public int f3608g;

    /* renamed from: h, reason: collision with root package name */
    public final Q1.f f3609h;

    public y(InputStream inputStream, Q1.f fVar) {
        super(inputStream);
        this.f3607f = -1;
        this.f3609h = fVar;
        this.b = (byte[]) fVar.c(65536, byte[].class);
    }

    public static void b() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i9 = this.f3607f;
        if (i9 != -1) {
            int i10 = this.f3608g - i9;
            int i11 = this.f3606d;
            if (i10 < i11) {
                if (i9 == 0 && i11 > bArr.length && this.f3605c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3609h.c(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.b = bArr2;
                    this.f3609h.g(bArr);
                    bArr = bArr2;
                } else if (i9 > 0) {
                    System.arraycopy(bArr, i9, bArr, 0, bArr.length - i9);
                }
                int i12 = this.f3608g - this.f3607f;
                this.f3608g = i12;
                this.f3607f = 0;
                this.f3605c = 0;
                int read = inputStream.read(bArr, i12, bArr.length - i12);
                int i13 = this.f3608g;
                if (read > 0) {
                    i13 += read;
                }
                this.f3605c = i13;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f3607f = -1;
            this.f3608g = 0;
            this.f3605c = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.b != null && inputStream != null) {
        } else {
            b();
            throw null;
        }
        return (this.f3605c - this.f3608g) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != null) {
            this.f3609h.g(this.b);
            this.b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i9) {
        this.f3606d = Math.max(this.f3606d, i9);
        this.f3607f = this.f3608g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f3608g >= this.f3605c && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.b && (bArr = this.b) == null) {
                b();
                throw null;
            }
            int i9 = this.f3605c;
            int i10 = this.f3608g;
            if (i9 - i10 <= 0) {
                return -1;
            }
            this.f3608g = i10 + 1;
            return bArr[i10] & 255;
        }
        b();
        throw null;
    }

    public final synchronized void release() {
        if (this.b != null) {
            this.f3609h.g(this.b);
            this.b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.b != null) {
            int i9 = this.f3607f;
            if (-1 != i9) {
                this.f3608g = i9;
            } else {
                throw new IOException("Mark has been invalidated, pos: " + this.f3608g + " markLimit: " + this.f3606d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j7) {
        if (j7 < 1) {
            return 0L;
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i9 = this.f3605c;
                int i10 = this.f3608g;
                if (i9 - i10 >= j7) {
                    this.f3608g = (int) (i10 + j7);
                    return j7;
                }
                long j9 = i9 - i10;
                this.f3608g = i9;
                if (this.f3607f != -1 && j7 <= this.f3606d) {
                    if (a(inputStream, bArr) == -1) {
                        return j9;
                    }
                    int i11 = this.f3605c;
                    int i12 = this.f3608g;
                    if (i11 - i12 >= j7 - j9) {
                        this.f3608g = (int) ((i12 + j7) - j9);
                        return j7;
                    }
                    long j10 = (j9 + i11) - i12;
                    this.f3608g = i11;
                    return j10;
                }
                long skip = inputStream.skip(j7 - j9);
                if (skip > 0) {
                    this.f3607f = -1;
                }
                return j9 + skip;
            }
            b();
            throw null;
        }
        b();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.b;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i13 = this.f3608g;
            int i14 = this.f3605c;
            if (i13 < i14) {
                int i15 = i14 - i13;
                if (i15 >= i10) {
                    i15 = i10;
                }
                System.arraycopy(bArr2, i13, bArr, i9, i15);
                this.f3608g += i15;
                if (i15 == i10 || inputStream.available() == 0) {
                    return i15;
                }
                i9 += i15;
                i11 = i10 - i15;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f3607f == -1 && i11 >= bArr2.length) {
                    i12 = inputStream.read(bArr, i9, i11);
                    if (i12 == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.b && (bArr2 = this.b) == null) {
                        b();
                        throw null;
                    }
                    int i16 = this.f3605c;
                    int i17 = this.f3608g;
                    i12 = i16 - i17;
                    if (i12 >= i11) {
                        i12 = i11;
                    }
                    System.arraycopy(bArr2, i17, bArr, i9, i12);
                    this.f3608g += i12;
                }
                i11 -= i12;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i9 += i12;
            }
        } else {
            b();
            throw null;
        }
    }
}
