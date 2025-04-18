package com.mbridge.msdk.thrid.okhttp.internal.cache2;

import com.mbridge.msdk.thrid.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void read(long j3, Buffer buffer, long j10) throws IOException {
        if (j10 >= 0) {
            while (j10 > 0) {
                long transferTo = this.fileChannel.transferTo(j3, j10, buffer);
                j3 += transferTo;
                j10 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void write(long j3, Buffer buffer, long j10) throws IOException {
        if (j10 >= 0 && j10 <= buffer.size()) {
            while (j10 > 0) {
                long transferFrom = this.fileChannel.transferFrom(buffer, j3, j10);
                j3 += transferFrom;
                j10 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
