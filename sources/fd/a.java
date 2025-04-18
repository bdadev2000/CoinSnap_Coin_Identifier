package fd;

/* loaded from: classes4.dex */
public abstract class a extends com.facebook.internal.i {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f17795e = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f17796f = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean J(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }
}
