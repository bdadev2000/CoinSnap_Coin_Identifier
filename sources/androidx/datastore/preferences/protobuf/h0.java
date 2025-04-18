package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class h0 {
    public static final Charset a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1371b;

    static {
        Charset.forName(C.ASCII_NAME);
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f1371b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new l(bArr, 0, 0, false).e(0);
        } catch (j0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int a(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
