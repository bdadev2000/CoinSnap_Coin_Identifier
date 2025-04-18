package androidx.compose.runtime;

import com.google.common.primitives.Ints;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SlotTableKt {
    public static final boolean a(int i2, int[] iArr) {
        return (iArr[(i2 * 5) + 1] & 67108864) != 0;
    }

    public static final int b(int i2, int[] iArr) {
        return iArr[(i2 * 5) + 4];
    }

    public static final int c(int i2, int[] iArr) {
        return iArr[(i2 * 5) + 3];
    }

    public static final boolean d(int i2, int[] iArr) {
        return (iArr[(i2 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean e(int i2, int[] iArr) {
        return (iArr[(i2 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean f(int i2, int[] iArr) {
        return (iArr[(i2 * 5) + 1] & Ints.MAX_POWER_OF_TWO) != 0;
    }

    public static final int g(ArrayList arrayList, int i2, int i3) {
        int n2 = n(arrayList, i2, i3);
        return n2 >= 0 ? n2 : -(n2 + 1);
    }

    public static final int h(int i2, int[] iArr) {
        return iArr[(i2 * 5) + 1] & 67108863;
    }

    public static final int i(int i2, int[] iArr) {
        return iArr[(i2 * 5) + 2];
    }

    public static final int j(int i2, int[] iArr) {
        int i3 = i2 * 5;
        return m(iArr[i3 + 1] >> 28) + iArr[i3 + 4];
    }

    public static final void k(int i2, int i3, int[] iArr) {
        ComposerKt.h(i3 >= 0);
        iArr[(i2 * 5) + 3] = i3;
    }

    public static final void l(int i2, int i3, int[] iArr) {
        ComposerKt.h(i3 >= 0 && i3 < 67108863);
        int i4 = (i2 * 5) + 1;
        iArr[i4] = i3 | (iArr[i4] & (-67108864));
    }

    public static final int m(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int n(ArrayList arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int i6 = ((Anchor) arrayList.get(i5)).f13675a;
            if (i6 < 0) {
                i6 += i3;
            }
            int E = p0.a.E(i6, i2);
            if (E < 0) {
                i4 = i5 + 1;
            } else {
                if (E <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }
}
