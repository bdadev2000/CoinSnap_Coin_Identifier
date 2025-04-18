package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class FileOperator {

    @NotNull
    private final FileChannel fileChannel;

    public FileOperator(@NotNull FileChannel fileChannel) {
        a.s(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j2, @NotNull Buffer buffer, long j3) {
        a.s(buffer, "sink");
        if (j3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j3 > 0) {
            long transferTo = this.fileChannel.transferTo(j2, j3, buffer);
            j2 += transferTo;
            j3 -= transferTo;
        }
    }

    public final void write(long j2, @NotNull Buffer buffer, long j3) throws IOException {
        a.s(buffer, "source");
        if (j3 < 0 || j3 > buffer.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j3 > 0) {
            long transferFrom = this.fileChannel.transferFrom(buffer, j2, j3);
            j2 += transferFrom;
            j3 -= transferFrom;
        }
    }
}
