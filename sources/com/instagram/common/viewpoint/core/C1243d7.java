package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.d7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1243d7 {
    public static byte[] A00;
    public static String[] A01 = {"wGfW8ZiAX", "98TYLpDb5H7FHIAHZpq8", "wurshRpA61WdSnRC2QEiiDdyeizCic8s", "6EmvqyT0A8GUtNQWPCztICrBXhcLnLDE", "uA", "uieozUeELQJ7BnvT2m7zVxZQuFK6e7wq", "WTc20BWixPig5ctZiuBGmbv8oTuxO5Xh", "dqopJSQqvI22NiiNvBghv0z0kBPWpT4p"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = (copyOfRange[i5] ^ i4) ^ 28;
            if (A01[6].charAt(9) == 'Q') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "97APORAguQeQpweI2T85fGR4lID0xZM2";
            strArr[5] = "RVlAHF7VxslCalKX2MZme1MZcTv0vxDz";
            copyOfRange[i5] = (byte) i6;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{20, 89, 65, 71, 64, 20, 90, 91, 64, 20, 86, 81, 20, 90, 65, 88, 88, 31, 19, 67, 82, 65, 82, 94, 86, 71, 86, 65, 19, 49, 38, 23, 4, 23, 27, 19, 2, 19, 4, 86, 5, 6, 19, 21, 31, 16, 31, 19, 18, 86, 23, 5, 86, 24, 25, 24, 91, 24, 3, 26, 26, 86, 31, 5, 86, 24, 3, 26, 26, 76, 86, 27, 19, 2, 30, 25, 18, 86};
    }

    static {
        A04();
    }

    public static String A01(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C1243d7.class.getName();
        int i2 = 0;
        while (!stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        while (stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        String methodName = stackTraceElement.getClassName();
        String className = stackTraceElement.getMethodName();
        return A00(30, 48, 106) + methodName + A00(29, 1, 3) + className + A00(17, 12, 47) + str;
    }

    public static <T extends Throwable> T A02(T t2) {
        return (T) A03(t2, C1243d7.class.getName());
    }

    public static <T extends Throwable> T A03(T throwable, String str) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int i2 = stackTrace.length;
        int lastIntrinsic = -1;
        for (int size = 0; size < i2; size++) {
            if (str.equals(stackTrace[size].getClassName())) {
                lastIntrinsic = size;
            }
        }
        StackTraceElement[] stackTrace2 = (StackTraceElement[]) Arrays.copyOfRange(stackTrace, lastIntrinsic + 1, i2);
        throwable.setStackTrace(stackTrace2);
        int size2 = A01[6].charAt(9);
        if (size2 == 81) {
            throw new RuntimeException();
        }
        A01[7] = "7EM55IZD6WJUcGDkvpLhGBZC82NS7r4s";
        return throwable;
    }

    public static void A05(Object obj, String str) {
        if (obj == null) {
            A08(str);
            throw null;
        }
    }

    public static void A06(Object obj, String str) {
        if (obj != null) {
        } else {
            throw ((NullPointerException) A02(new NullPointerException(str + A00(0, 17, 40))));
        }
    }

    public static void A07(Object obj, String str) {
        if (obj == null) {
            A09(str);
            throw null;
        }
    }

    public static void A08(String str) {
        throw ((NullPointerException) A02(new NullPointerException(str)));
    }

    public static void A09(String str) {
        throw ((NullPointerException) A02(new NullPointerException(A01(str))));
    }

    public static boolean A0A(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
