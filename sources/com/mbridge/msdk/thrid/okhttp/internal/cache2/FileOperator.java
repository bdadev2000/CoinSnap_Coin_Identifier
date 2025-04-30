package com.mbridge.msdk.thrid.okhttp.internal.cache2;

import com.mbridge.msdk.thrid.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void read(long j7, Buffer buffer, long j9) throws IOException {
        if (j9 >= 0) {
            while (j9 > 0) {
                long transferTo = this.fileChannel.transferTo(j7, j9, buffer);
                j7 += transferTo;
                j9 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void write(long j7, Buffer buffer, long j9) throws IOException {
        if (j9 >= 0 && j9 <= buffer.size()) {
            while (j9 > 0) {
                long transferFrom = this.fileChannel.transferFrom(buffer, j7, j9);
                j7 += transferFrom;
                j9 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
