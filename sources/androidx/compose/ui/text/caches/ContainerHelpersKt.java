package androidx.compose.ui.text.caches;

/* loaded from: classes3.dex */
public final class ContainerHelpersKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f17173a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f17174b = new Object[0];

    public static final int a(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }
}
