package W1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class k implements N1.g, com.bumptech.glide.load.data.g {
    public final ByteBuffer b;

    public k(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }

    @Override // N1.g
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.b) {
                this.b.position(0);
                messageDigest.update(this.b.putInt(num.intValue()).array());
            }
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public Object c() {
        ByteBuffer byteBuffer = this.b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public short d(int i9) {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer.remaining() - i9 >= 2) {
            return byteBuffer.getShort(i9);
        }
        return (short) -1;
    }

    public k() {
        this.b = ByteBuffer.allocate(4);
    }

    public k(byte[] bArr, int i9) {
        this.b = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i9);
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
    }
}
