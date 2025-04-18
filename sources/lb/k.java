package lb;

import com.bumptech.glide.manager.r;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class k implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f21313i = Logger.getLogger(k.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final RandomAccessFile f21314b;

    /* renamed from: c, reason: collision with root package name */
    public int f21315c;

    /* renamed from: d, reason: collision with root package name */
    public int f21316d;

    /* renamed from: f, reason: collision with root package name */
    public h f21317f;

    /* renamed from: g, reason: collision with root package name */
    public h f21318g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f21319h;

    public k(File file) {
        byte[] bArr = new byte[16];
        this.f21319h = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 4; i10 < i12; i12 = 4) {
                    int i13 = iArr[i10];
                    bArr2[i11] = (byte) (i13 >> 24);
                    bArr2[i11 + 1] = (byte) (i13 >> 16);
                    bArr2[i11 + 2] = (byte) (i13 >> 8);
                    bArr2[i11 + 3] = (byte) i13;
                    i11 += 4;
                    i10++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f21314b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int p10 = p(0, bArr);
        this.f21315c = p10;
        if (p10 <= randomAccessFile2.length()) {
            this.f21316d = p(4, bArr);
            int p11 = p(8, bArr);
            int p12 = p(12, bArr);
            this.f21317f = k(p11);
            this.f21318g = k(p12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f21315c + ", Actual length: " + randomAccessFile2.length());
    }

    public static int p(int i10, byte[] bArr) {
        return ((bArr[i10] & UByte.MAX_VALUE) << 24) + ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8) + (bArr[i10 + 3] & UByte.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f21314b.close();
    }

    public final void d(byte[] bArr) {
        boolean z10;
        int u;
        int i10;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    g(length);
                    synchronized (this) {
                        if (this.f21316d == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        if (z10) {
            u = 16;
        } else {
            h hVar = this.f21318g;
            u = u(hVar.a + 4 + hVar.f21309b);
        }
        h hVar2 = new h(u, length);
        byte[] bArr2 = this.f21319h;
        bArr2[0] = (byte) (length >> 24);
        bArr2[1] = (byte) (length >> 16);
        bArr2[2] = (byte) (length >> 8);
        bArr2[3] = (byte) length;
        s(u, 4, bArr2);
        s(u + 4, length, bArr);
        if (z10) {
            i10 = u;
        } else {
            i10 = this.f21317f.a;
        }
        v(this.f21315c, this.f21316d + 1, i10, u);
        this.f21318g = hVar2;
        this.f21316d++;
        if (z10) {
            this.f21317f = hVar2;
        }
    }

    public final void g(int i10) {
        int i11 = i10 + 4;
        int t5 = this.f21315c - t();
        if (t5 >= i11) {
            return;
        }
        int i12 = this.f21315c;
        do {
            t5 += i12;
            i12 <<= 1;
        } while (t5 < i11);
        RandomAccessFile randomAccessFile = this.f21314b;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        h hVar = this.f21318g;
        int u = u(hVar.a + 4 + hVar.f21309b);
        if (u < this.f21317f.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f21315c);
            long j3 = u - 4;
            if (channel.transferTo(16L, j3, channel) != j3) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f21318g.a;
        int i14 = this.f21317f.a;
        if (i13 < i14) {
            int i15 = (this.f21315c + i13) - 16;
            v(i12, this.f21316d, i14, i15);
            this.f21318g = new h(i15, this.f21318g.f21309b);
        } else {
            v(i12, this.f21316d, i14, i13);
        }
        this.f21315c = i12;
    }

    public final synchronized void j(j jVar) {
        int i10 = this.f21317f.a;
        for (int i11 = 0; i11 < this.f21316d; i11++) {
            h k10 = k(i10);
            jVar.a(new i(this, k10), k10.f21309b);
            i10 = u(k10.a + 4 + k10.f21309b);
        }
    }

    public final h k(int i10) {
        if (i10 == 0) {
            return h.f21308c;
        }
        RandomAccessFile randomAccessFile = this.f21314b;
        randomAccessFile.seek(i10);
        return new h(i10, randomAccessFile.readInt());
    }

    public final synchronized void q() {
        int i10;
        boolean z10;
        try {
            synchronized (this) {
                i10 = this.f21316d;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return;
        } catch (Throwable th2) {
            throw th2;
        }
        if (!z10) {
            if (i10 == 1) {
                synchronized (this) {
                    v(4096, 0, 0, 0);
                    this.f21316d = 0;
                    h hVar = h.f21308c;
                    this.f21317f = hVar;
                    this.f21318g = hVar;
                    if (this.f21315c > 4096) {
                        RandomAccessFile randomAccessFile = this.f21314b;
                        randomAccessFile.setLength(4096);
                        randomAccessFile.getChannel().force(true);
                    }
                    this.f21315c = 4096;
                }
            } else {
                h hVar2 = this.f21317f;
                int u = u(hVar2.a + 4 + hVar2.f21309b);
                r(u, 0, 4, this.f21319h);
                int p10 = p(0, this.f21319h);
                v(this.f21315c, this.f21316d - 1, u, this.f21318g.a);
                this.f21316d--;
                this.f21317f = new h(u, p10);
            }
            return;
        }
        throw new NoSuchElementException();
    }

    public final void r(int i10, int i11, int i12, byte[] bArr) {
        int u = u(i10);
        int i13 = u + i12;
        int i14 = this.f21315c;
        RandomAccessFile randomAccessFile = this.f21314b;
        if (i13 <= i14) {
            randomAccessFile.seek(u);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - u;
        randomAccessFile.seek(u);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void s(int i10, int i11, byte[] bArr) {
        int u = u(i10);
        int i12 = u + i11;
        int i13 = this.f21315c;
        RandomAccessFile randomAccessFile = this.f21314b;
        if (i12 <= i13) {
            randomAccessFile.seek(u);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - u;
        randomAccessFile.seek(u);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, 0 + i14, i11 - i14);
    }

    public final int t() {
        if (this.f21316d == 0) {
            return 16;
        }
        h hVar = this.f21318g;
        int i10 = hVar.a;
        int i11 = this.f21317f.a;
        if (i10 >= i11) {
            return (i10 - i11) + 4 + hVar.f21309b + 16;
        }
        return (((i10 + 4) + hVar.f21309b) + this.f21315c) - i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f21315c);
        sb2.append(", size=");
        sb2.append(this.f21316d);
        sb2.append(", first=");
        sb2.append(this.f21317f);
        sb2.append(", last=");
        sb2.append(this.f21318g);
        sb2.append(", element lengths=[");
        try {
            j(new r(this, sb2));
        } catch (IOException e2) {
            f21313i.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final int u(int i10) {
        int i11 = this.f21315c;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void v(int i10, int i11, int i12, int i13) {
        int i14 = 0;
        int[] iArr = {i10, i11, i12, i13};
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f21319h;
            if (i14 < 4) {
                int i16 = iArr[i14];
                bArr[i15] = (byte) (i16 >> 24);
                bArr[i15 + 1] = (byte) (i16 >> 16);
                bArr[i15 + 2] = (byte) (i16 >> 8);
                bArr[i15 + 3] = (byte) i16;
                i15 += 4;
                i14++;
            } else {
                RandomAccessFile randomAccessFile = this.f21314b;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }
}
