package dc;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class i {
    public static final byte a = Byte.parseByte("01110000", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final byte f16986b = Byte.parseByte("00001111", 2);

    public static String a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b3 = array[0];
        array[16] = b3;
        array[0] = (byte) ((b3 & f16986b) | a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
