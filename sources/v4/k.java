package v4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class k implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f23621i = Logger.getLogger(k.class.getName());
    public final RandomAccessFile b;

    /* renamed from: c, reason: collision with root package name */
    public int f23622c;

    /* renamed from: d, reason: collision with root package name */
    public int f23623d;

    /* renamed from: f, reason: collision with root package name */
    public h f23624f;

    /* renamed from: g, reason: collision with root package name */
    public h f23625g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f23626h;

    public k(File file) {
        byte[] bArr = new byte[16];
        this.f23626h = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i9 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    p(i9, iArr[i10], bArr2);
                    i9 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int i11 = i(0, bArr);
        this.f23622c = i11;
        if (i11 <= randomAccessFile2.length()) {
            this.f23623d = i(4, bArr);
            int i12 = i(8, bArr);
            int i13 = i(12, bArr);
            this.f23624f = h(i12);
            this.f23625g = h(i13);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f23622c + ", Actual length: " + randomAccessFile2.length());
    }

    public static int i(int i9, byte[] bArr) {
        return ((bArr[i9] & 255) << 24) + ((bArr[i9 + 1] & 255) << 16) + ((bArr[i9 + 2] & 255) << 8) + (bArr[i9 + 3] & 255);
    }

    public static void p(int i9, int i10, byte[] bArr) {
        bArr[i9] = (byte) (i10 >> 24);
        bArr[i9 + 1] = (byte) (i10 >> 16);
        bArr[i9 + 2] = (byte) (i10 >> 8);
        bArr[i9 + 3] = (byte) i10;
    }

    public final void a(byte[] bArr) {
        boolean z8;
        int n2;
        int i9;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    b(length);
                    synchronized (this) {
                        if (this.f23623d == 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        if (z8) {
            n2 = 16;
        } else {
            h hVar = this.f23625g;
            n2 = n(hVar.f23618a + 4 + hVar.b);
        }
        h hVar2 = new h(n2, length);
        p(0, length, this.f23626h);
        l(n2, 4, this.f23626h);
        l(n2 + 4, length, bArr);
        if (z8) {
            i9 = n2;
        } else {
            i9 = this.f23624f.f23618a;
        }
        o(this.f23622c, this.f23623d + 1, i9, n2);
        this.f23625g = hVar2;
        this.f23623d++;
        if (z8) {
            this.f23624f = hVar2;
        }
    }

    public final void b(int i9) {
        int i10 = i9 + 4;
        int m = this.f23622c - m();
        if (m >= i10) {
            return;
        }
        int i11 = this.f23622c;
        do {
            m += i11;
            i11 <<= 1;
        } while (m < i10);
        RandomAccessFile randomAccessFile = this.b;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        h hVar = this.f23625g;
        int n2 = n(hVar.f23618a + 4 + hVar.b);
        if (n2 < this.f23624f.f23618a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f23622c);
            long j7 = n2 - 4;
            if (channel.transferTo(16L, j7, channel) != j7) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f23625g.f23618a;
        int i13 = this.f23624f.f23618a;
        if (i12 < i13) {
            int i14 = (this.f23622c + i12) - 16;
            o(i11, this.f23623d, i13, i14);
            this.f23625g = new h(i14, this.f23625g.b);
        } else {
            o(i11, this.f23623d, i13, i12);
        }
        this.f23622c = i11;
    }

    public final synchronized void c(j jVar) {
        int i9 = this.f23624f.f23618a;
        for (int i10 = 0; i10 < this.f23623d; i10++) {
            h h6 = h(i9);
            jVar.a(new i(this, h6), h6.b);
            i9 = n(h6.f23618a + 4 + h6.b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.close();
    }

    public final h h(int i9) {
        if (i9 == 0) {
            return h.f23617c;
        }
        RandomAccessFile randomAccessFile = this.b;
        randomAccessFile.seek(i9);
        return new h(i9, randomAccessFile.readInt());
    }

    public final synchronized void j() {
        int i9;
        boolean z8;
        synchronized (this) {
            i9 = this.f23623d;
            if (i9 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return;
        if (!z8) {
            if (i9 == 1) {
                synchronized (this) {
                    o(4096, 0, 0, 0);
                    this.f23623d = 0;
                    h hVar = h.f23617c;
                    this.f23624f = hVar;
                    this.f23625g = hVar;
                    if (this.f23622c > 4096) {
                        RandomAccessFile randomAccessFile = this.b;
                        randomAccessFile.setLength(4096);
                        randomAccessFile.getChannel().force(true);
                    }
                    this.f23622c = 4096;
                }
            } else {
                h hVar2 = this.f23624f;
                int n2 = n(hVar2.f23618a + 4 + hVar2.b);
                k(n2, this.f23626h, 0, 4);
                int i10 = i(0, this.f23626h);
                o(this.f23622c, this.f23623d - 1, n2, this.f23625g.f23618a);
                this.f23623d--;
                this.f23624f = new h(n2, i10);
            }
            return;
        }
        throw new NoSuchElementException();
    }

    public final void k(int i9, byte[] bArr, int i10, int i11) {
        int n2 = n(i9);
        int i12 = n2 + i11;
        int i13 = this.f23622c;
        RandomAccessFile randomAccessFile = this.b;
        if (i12 <= i13) {
            randomAccessFile.seek(n2);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - n2;
        randomAccessFile.seek(n2);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void l(int i9, int i10, byte[] bArr) {
        int n2 = n(i9);
        int i11 = n2 + i10;
        int i12 = this.f23622c;
        RandomAccessFile randomAccessFile = this.b;
        if (i11 <= i12) {
            randomAccessFile.seek(n2);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - n2;
        randomAccessFile.seek(n2);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final int m() {
        if (this.f23623d == 0) {
            return 16;
        }
        h hVar = this.f23625g;
        int i9 = hVar.f23618a;
        int i10 = this.f23624f.f23618a;
        if (i9 >= i10) {
            return (i9 - i10) + 4 + hVar.b + 16;
        }
        return (((i9 + 4) + hVar.b) + this.f23622c) - i10;
    }

    public final int n(int i9) {
        int i10 = this.f23622c;
        if (i9 >= i10) {
            return (i9 + 16) - i10;
        }
        return i9;
    }

    public final void o(int i9, int i10, int i11, int i12) {
        int[] iArr = {i9, i10, i11, i12};
        int i13 = 0;
        int i14 = 0;
        while (true) {
            byte[] bArr = this.f23626h;
            if (i13 < 4) {
                p(i14, iArr[i13], bArr);
                i14 += 4;
                i13++;
            } else {
                RandomAccessFile randomAccessFile = this.b;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(k.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f23622c);
        sb.append(", size=");
        sb.append(this.f23623d);
        sb.append(", first=");
        sb.append(this.f23624f);
        sb.append(", last=");
        sb.append(this.f23625g);
        sb.append(", element lengths=[");
        try {
            c(new B3.e(sb));
        } catch (IOException e4) {
            f23621i.log(Level.WARNING, "read error", (Throwable) e4);
        }
        sb.append("]]");
        return sb.toString();
    }
}
