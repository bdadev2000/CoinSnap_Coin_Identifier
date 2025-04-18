package n4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class b0 implements e4.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22402b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f22403c;

    public b0(int i10) {
        this.f22402b = i10;
        if (i10 != 1) {
            this.f22403c = ByteBuffer.allocate(8);
        } else {
            this.f22403c = ByteBuffer.allocate(4);
        }
    }

    @Override // e4.k
    public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f22402b) {
            case 0:
                Long l10 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f22403c) {
                    this.f22403c.position(0);
                    messageDigest.update(this.f22403c.putLong(l10.longValue()).array());
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    messageDigest.update(bArr);
                    synchronized (this.f22403c) {
                        this.f22403c.position(0);
                        messageDigest.update(this.f22403c.putInt(num.intValue()).array());
                    }
                    return;
                }
                return;
        }
    }
}
