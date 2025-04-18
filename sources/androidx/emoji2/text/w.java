package androidx.emoji2.text;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class w implements n4.k {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f1548b;

    public w(int i10, ByteBuffer byteBuffer) {
        if (i10 != 1) {
            this.f1548b = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        } else {
            this.f1548b = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    public final long a() {
        return this.f1548b.getInt() & 4294967295L;
    }

    public final void b(int i10) {
        ByteBuffer byteBuffer = this.f1548b;
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // n4.k
    public final int d() {
        return (r() << 8) | r();
    }

    @Override // n4.k
    public final int j(int i10, byte[] bArr) {
        ByteBuffer byteBuffer = this.f1548b;
        int min = Math.min(i10, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // n4.k
    public final short r() {
        ByteBuffer byteBuffer = this.f1548b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & UByte.MAX_VALUE);
        }
        throw new n4.j();
    }

    @Override // n4.k
    public final long skip(long j3) {
        ByteBuffer byteBuffer = this.f1548b;
        int min = (int) Math.min(byteBuffer.remaining(), j3);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }
}
