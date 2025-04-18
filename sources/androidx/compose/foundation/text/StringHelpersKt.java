package androidx.compose.foundation.text;

/* loaded from: classes4.dex */
public final class StringHelpersKt {
    public static final int a(int i2, String str) {
        int length = str.length();
        while (i2 < length) {
            if (str.charAt(i2) == '\n') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static final int b(int i2, String str) {
        while (i2 > 0) {
            if (str.charAt(i2 - 1) == '\n') {
                return i2;
            }
            i2--;
        }
        return 0;
    }
}
