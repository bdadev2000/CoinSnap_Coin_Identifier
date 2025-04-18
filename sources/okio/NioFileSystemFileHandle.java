package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class NioFileSystemFileHandle extends FileHandle {

    @NotNull
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z2, @NotNull FileChannel fileChannel) {
        super(z2);
        p0.a.s(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.fileChannel.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long j2, @NotNull byte[] bArr, int i2, int i3) {
        p0.a.s(bArr, "array");
        this.fileChannel.position(j2);
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, i3);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int read = this.fileChannel.read(wrap);
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
                this.fileChannel.truncate(j2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okio.FileHandle
    public synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long j2, @NotNull byte[] bArr, int i2, int i3) {
        p0.a.s(bArr, "array");
        this.fileChannel.position(j2);
        this.fileChannel.write(ByteBuffer.wrap(bArr, i2, i3));
    }
}
