package m5;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class a {
    public static final MessageDigest a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f21627b;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        a = messageDigest;
        f21627b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static String a(String str) {
        byte[] digest;
        MessageDigest messageDigest = a;
        if (messageDigest != null && !TextUtils.isEmpty(str)) {
            byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
            synchronized (a.class) {
                digest = messageDigest.digest(bytes);
            }
            if (digest != null && digest.length != 0) {
                char[] cArr = new char[digest.length << 1];
                int i10 = 0;
                for (byte b3 : digest) {
                    int i11 = i10 + 1;
                    char[] cArr2 = f21627b;
                    cArr[i10] = cArr2[(b3 & 240) >> 4];
                    i10 = i11 + 1;
                    cArr[i11] = cArr2[b3 & Ascii.SI];
                }
                return new String(cArr);
            }
            return null;
        }
        return "";
    }
}
