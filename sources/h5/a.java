package H5;

import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public abstract class a extends AbstractC2947c {
    public static final char[] b = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1378c = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean z(char[] cArr, char c9) {
        for (char c10 : cArr) {
            if (c10 == c9) {
                return true;
            }
        }
        return false;
    }
}
