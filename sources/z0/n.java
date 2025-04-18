package z0;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class n extends m {
    public static String A1(int i2, String str) {
        p0.a.s(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.j("Requested character count ", i2, " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String substring = str.substring(0, i2);
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public static char z1(CharSequence charSequence) {
        p0.a.s(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m.T0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
