package okio.internal;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes3.dex */
public final class FixedLengthSource extends ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(@NotNull Source source, long j2, boolean z2) {
        super(source);
        a.s(source, "delegate");
        this.size = j2;
        this.truncate = z2;
    }

    private final void truncateToSize(Buffer buffer, long j2) {
        Buffer buffer2 = new Buffer();
        buffer2.writeAll(buffer);
        buffer.write(buffer2, j2);
        buffer2.clear();
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer buffer, long j2) {
        a.s(buffer, "sink");
        long j3 = this.bytesReceived;
        long j4 = this.size;
        if (j3 > j4) {
            j2 = 0;
        } else if (this.truncate) {
            long j5 = j4 - j3;
            if (j5 == 0) {
                return -1L;
            }
            j2 = Math.min(j2, j5);
        }
        long read = super.read(buffer, j2);
        if (read != -1) {
            this.bytesReceived += read;
        }
        long j6 = this.bytesReceived;
        long j7 = this.size;
        if ((j6 >= j7 || read != -1) && j6 <= j7) {
            return read;
        }
        if (read > 0 && j6 > j7) {
            truncateToSize(buffer, buffer.size() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
