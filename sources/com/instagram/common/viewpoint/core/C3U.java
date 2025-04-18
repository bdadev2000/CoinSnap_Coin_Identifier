package com.instagram.common.viewpoint.core;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Arrays;
import okio.Utf8;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.3U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3U {
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"oH0n9xAbcML0pK3kOEyCMAjio6eGJJqD", "GHXQlAAFRKh09bddZmMmvyBDBjZAjYiv", "8JVYZEo4WjVv17g9aGlnSLFSGTnTlVlV", "9RFKXGXKeKZpKk57elbUgU5Rr7HYGf7i", "pphhsLP65zu6ZwDFb6wQsw2VBCTq4rPR", "7bQdqYtwnU89UvKxRDm92gBnYRs5HvHU", "CoVMihrSOvAeKI017KlJ1GeUcMhjoF5o", "1TwObRYenAx9Xxo2pcbqEN0Hah2BLlTA"};

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        if (A02[2].charAt(17) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "6RSw2BIRooHqNQZo6O6uqDXkY67gyuyt";
        strArr[5] = "6n2viGPYj5SHhnpzGoLQcwunY5cXqvEW";
        A01 = new byte[]{73, 101, Byte.MAX_VALUE, 102, 110, 42, 100, 101, 126, 42, 108, 99, 100, 110, 42, 103, 111, 126, 98, 101, 110, 42, 109, 111, 126, 89, 105, 107, 102, 111, 110, 89, 105, 120, 101, 102, 102, 76, 107, 105, 126, 101, 120, 34, 35, 42, 101, 100, 42, 92, 99, 111, 125, 73, 101, 100, 108, 99, 109, Byte.MAX_VALUE, 120, 107, 126, 99, 101, 100, 73, 118, 122, 104, 92, 112, 113, 121, 118, 120, 92, 112, 114, 111, 126, 107, 59, 57, 40, 15, Utf8.REPLACEMENT_BYTE, 61, 48, 57, 56, 15, Utf8.REPLACEMENT_BYTE, 46, 51, 48, 48, 26, 61, Utf8.REPLACEMENT_BYTE, 40, 51, 46};
    }

    static {
        A04();
        if (Build.VERSION.SDK_INT == 25) {
            try {
                A00 = ViewConfiguration.class.getDeclaredMethod(A03(82, 21, 102), new Class[0]);
            } catch (Exception unused) {
                Log.i(A03(66, 16, 37), A03(0, 66, 48));
            }
        }
    }

    public static float A00(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            float scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
            String[] strArr = A02;
            if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "0Ki4JXOncLynPK6ypbmoO1JP8yrdQeak";
            strArr2[1] = "cqlD2dZIdmZjhBfVp9VUMkw1vxAb5RnC";
            return scaledHorizontalScrollFactor;
        }
        return A02(viewConfiguration, context);
    }

    public static float A01(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        float A022 = A02(viewConfiguration, context);
        String[] strArr = A02;
        if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
            throw new RuntimeException();
        }
        A02[2] = "MeYqCAiPW6zL6oB0sS71srseS72Ki7Wj";
        return A022;
    }

    public static float A02(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 25 && A00 != null) {
            try {
                return ((Integer) A00.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                String A03 = A03(66, 16, 37);
                String[] strArr = A02;
                if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "k1KS2t9KIGKI4w6R1E4j5X81r1grad3n";
                strArr2[1] = "1ij9jDuHWzbgayt92o13kt38ESGEmluu";
                Log.i(A03, A03(0, 66, 48));
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
