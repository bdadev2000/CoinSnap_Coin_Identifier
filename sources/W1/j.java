package W1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class j implements m, N1.g {
    public final ByteBuffer b;

    public j() {
        this.b = ByteBuffer.allocate(8);
    }

    @Override // N1.g
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.b) {
            this.b.position(0);
            messageDigest.update(this.b.putLong(l.longValue()).array());
        }
    }

    @Override // W1.m
    public int b() {
        return (e() << 8) | e();
    }

    @Override // W1.m
    public short e() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new l();
    }

    @Override // W1.m
    public int j(int i9, byte[] bArr) {
        ByteBuffer byteBuffer = this.b;
        int min = Math.min(i9, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // W1.m
    public long skip(long j7) {
        ByteBuffer byteBuffer = this.b;
        int min = (int) Math.min(byteBuffer.remaining(), j7);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    public j(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
