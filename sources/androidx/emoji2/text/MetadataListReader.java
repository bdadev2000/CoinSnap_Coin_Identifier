package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import androidx.emoji2.text.flatbuffer.Table;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

@AnyThread
@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
class MetadataListReader {

    /* loaded from: classes.dex */
    public static class ByteBufferReader implements OpenTypeReader {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f19551a;

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.f19551a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() {
            return this.f19551a.position();
        }

        public final int b() {
            return this.f19551a.getShort() & 65535;
        }

        public final void c(int i2) {
            ByteBuffer byteBuffer = this.f19551a;
            byteBuffer.position(byteBuffer.position() + i2);
        }
    }

    /* loaded from: classes.dex */
    public static class InputStreamOpenTypeReader implements OpenTypeReader {
    }

    /* loaded from: classes.dex */
    public static class OffsetInfo {
    }

    /* loaded from: classes.dex */
    public interface OpenTypeReader {
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.emoji2.text.flatbuffer.MetadataList, androidx.emoji2.text.flatbuffer.Table] */
    public static MetadataList a(MappedByteBuffer mappedByteBuffer) {
        ByteBuffer byteBuffer;
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        ByteBufferReader byteBufferReader = new ByteBufferReader(duplicate);
        byteBufferReader.c(4);
        int b2 = byteBufferReader.b();
        if (b2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferReader.c(6);
        int i2 = 0;
        while (true) {
            byteBuffer = byteBufferReader.f19551a;
            if (i2 >= b2) {
                j2 = -1;
                break;
            }
            int i3 = byteBuffer.getInt();
            byteBufferReader.c(4);
            j2 = byteBuffer.getInt() & 4294967295L;
            byteBufferReader.c(4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            byteBufferReader.c((int) (j2 - byteBufferReader.a()));
            byteBufferReader.c(12);
            long j3 = byteBuffer.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = byteBuffer.getInt();
                long j4 = byteBuffer.getInt() & 4294967295L;
                byteBuffer.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j4 + j2));
                    ?? table = new Table();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    table.f19585b = duplicate;
                    table.f19584a = position;
                    int i6 = position - duplicate.getInt(position);
                    table.f19586c = i6;
                    table.d = table.f19585b.getShort(i6);
                    return table;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
