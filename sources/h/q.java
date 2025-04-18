package h;

import com.google.common.primitives.UnsignedBytes;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSource;

/* loaded from: classes4.dex */
public final class q extends ForwardingSource {

    /* renamed from: b, reason: collision with root package name */
    public static final ByteString f30692b = ByteString.Companion.decodeHex("0021F904");

    /* renamed from: a, reason: collision with root package name */
    public final Buffer f30693a;

    public q(BufferedSource bufferedSource) {
        super(bufferedSource);
        this.f30693a = new Buffer();
    }

    public final boolean a(long j2) {
        Buffer buffer = this.f30693a;
        if (buffer.size() >= j2) {
            return true;
        }
        long size = j2 - buffer.size();
        return super.read(buffer, size) == size;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j2) {
        long j3;
        a(j2);
        Buffer buffer2 = this.f30693a;
        long j4 = -1;
        if (buffer2.size() == 0) {
            return j2 == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long j6 = j4;
            while (true) {
                ByteString byteString = f30692b;
                j6 = buffer2.indexOf(byteString.getByte(0), j6 + 1);
                if (j6 == j4 || (a(byteString.size()) && buffer2.rangeEquals(j6, byteString))) {
                    break;
                }
                j4 = -1;
            }
            if (j6 == j4) {
                break;
            }
            j5 += p0.a.w(buffer2.read(buffer, j6 + 4), 0L);
            if (a(5L) && buffer2.getByte(4L) == 0) {
                if (((buffer2.getByte(1L) & UnsignedBytes.MAX_VALUE) | ((buffer2.getByte(2L) & UnsignedBytes.MAX_VALUE) << 8)) < 2) {
                    buffer.writeByte((int) buffer2.getByte(0L));
                    buffer.writeByte(10);
                    buffer.writeByte(0);
                    buffer2.skip(3L);
                }
            }
            j4 = -1;
        }
        if (j5 < j2) {
            j3 = 0;
            j5 += p0.a.w(buffer2.read(buffer, j2 - j5), 0L);
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
