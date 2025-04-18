package okio;

import java.io.RandomAccessFile;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class JvmFileHandle extends FileHandle {

    @NotNull
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z2, @NotNull RandomAccessFile randomAccessFile) {
        super(z2);
        p0.a.s(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long j2, @NotNull byte[] bArr, int i2, int i3) {
        p0.a.s(bArr, "array");
        this.randomAccessFile.seek(j2);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int read = this.randomAccessFile.read(bArr, i2, i3 - i4);
            if (read != -1) {
                i4 += read;
            } else if (i4 == 0) {
                return -1;
            }
        }
        return i4;
    }

    @Override // okio.FileHandle
    public synchronized void protectedResize(long j2) {
        try {
            long size = size();
            long j3 = j2 - size;
            if (j3 > 0) {
                int i2 = (int) j3;
                protectedWrite(size, new byte[i2], 0, i2);
            } else {
                this.randomAccessFile.setLength(j2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long j2, @NotNull byte[] bArr, int i2, int i3) {
        p0.a.s(bArr, "array");
        this.randomAccessFile.seek(j2);
        this.randomAccessFile.write(bArr, i2, i3);
    }
}
