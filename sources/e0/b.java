package e0;

import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public final class b {
    public static void a(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(android.support.v4.media.d.k("index: ", i2, ", size: ", i3));
        }
    }

    public static void b(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(android.support.v4.media.d.k("index: ", i2, ", size: ", i3));
        }
    }

    public static void c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder u2 = android.support.v4.media.d.u("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
            u2.append(i4);
            throw new IndexOutOfBoundsException(u2.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(android.support.v4.media.d.k("fromIndex: ", i2, " > toIndex: ", i3));
        }
    }

    public static int d(int i2, int i3) {
        int i4 = i2 + (i2 >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 <= 0) {
            return i4;
        }
        if (i3 > 2147483639) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return 2147483639;
    }
}
