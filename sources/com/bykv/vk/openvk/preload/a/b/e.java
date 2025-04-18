package com.bykv.vk.openvk.preload.a.b;

/* loaded from: classes.dex */
public final class e {
    private static final int a;

    static {
        String property = System.getProperty("java.version");
        int a10 = a(property);
        if (a10 == -1) {
            a10 = b(property);
        }
        if (a10 == -1) {
            a10 = 6;
        }
        a = a10;
    }

    private static int a(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int a() {
        return a;
    }

    public static boolean b() {
        return a >= 9;
    }
}
