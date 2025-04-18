package n4;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class w extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public volatile byte[] f22450b;

    /* renamed from: c, reason: collision with root package name */
    public int f22451c;

    /* renamed from: d, reason: collision with root package name */
    public int f22452d;

    /* renamed from: f, reason: collision with root package name */
    public int f22453f;

    /* renamed from: g, reason: collision with root package name */
    public int f22454g;

    /* renamed from: h, reason: collision with root package name */
    public final h4.h f22455h;

    public w(InputStream inputStream, h4.h hVar) {
        super(inputStream);
        this.f22453f = -1;
        this.f22455h = hVar;
        this.f22450b = (byte[]) hVar.c(byte[].class, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public static void g() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f22450b != null && inputStream != null) {
        } else {
            g();
            throw null;
        }
        return (this.f22451c - this.f22454g) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22450b != null) {
            this.f22455h.g(this.f22450b);
            this.f22450b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int d(InputStream inputStream, byte[] bArr) {
        int i10 = this.f22453f;
        if (i10 != -1) {
            int i11 = this.f22454g - i10;
            int i12 = this.f22452d;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f22451c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f22455h.c(byte[].class, i12);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f22450b = bArr2;
                    this.f22455h.g(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f22454g - this.f22453f;
                this.f22454g = i13;
                this.f22453f = 0;
                this.f22451c = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f22454g;
                if (read > 0) {
                    i14 += read;
                }
                this.f22451c = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f22453f = -1;
            this.f22454g = 0;
            this.f22451c = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f22452d = Math.max(this.f22452d, i10);
        this.f22453f = this.f22454g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f22450b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f22454g >= this.f22451c && d(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f22450b && (bArr = this.f22450b) == null) {
                g();
                throw null;
            }
            int i10 = this.f22451c;
            int i11 = this.f22454g;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f22454g = i11 + 1;
            return bArr[i11] & UByte.MAX_VALUE;
        }
        g();
        throw null;
    }

    public final synchronized void release() {
        if (this.f22450b != null) {
            this.f22455h.g(this.f22450b);
            this.f22450b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f22450b != null) {
            int i10 = this.f22453f;
            if (-1 != i10) {
                this.f22454g = i10;
            } else {
                throw new v("Mark has been invalidated, pos: " + this.f22454g + " markLimit: " + this.f22452d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j3) {
        if (j3 < 1) {
            return 0L;
        }
        byte[] bArr = this.f22450b;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.f22451c;
                int i11 = this.f22454g;
                if (i10 - i11 >= j3) {
                    this.f22454g = (int) (i11 + j3);
                    return j3;
                }
                long j10 = i10 - i11;
                this.f22454g = i10;
                if (this.f22453f != -1 && j3 <= this.f22452d) {
                    if (d(inputStream, bArr) == -1) {
                        return j10;
                    }
                    int i12 = this.f22451c;
                    int i13 = this.f22454g;
                    if (i12 - i13 >= j3 - j10) {
                        this.f22454g = (int) ((i13 + j3) - j10);
                        return j3;
                    }
                    long j11 = (j10 + i12) - i13;
                    this.f22454g = i12;
                    return j11;
                }
                long skip = inputStream.skip(j3 - j10);
                if (skip > 0) {
                    this.f22453f = -1;
                }
                return j10 + skip;
            }
            g();
            throw null;
        }
        g();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f22450b;
        if (bArr2 == null) {
            g();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f22454g;
            int i15 = this.f22451c;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f22454g += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f22453f == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (d(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f22450b && (bArr2 = this.f22450b) == null) {
                        g();
                        throw null;
                    }
                    int i17 = this.f22451c;
                    int i18 = this.f22454g;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f22454g += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            g();
            throw null;
        }
    }
}
