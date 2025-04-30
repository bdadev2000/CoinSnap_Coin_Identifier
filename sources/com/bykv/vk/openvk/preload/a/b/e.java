package com.bykv.vk.openvk.preload.a.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f13021a;

    static {
        String property = System.getProperty("java.version");
        int a6 = a(property);
        if (a6 == -1) {
            a6 = b(property);
        }
        if (a6 == -1) {
            a6 = 6;
        }
        f13021a = a6;
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
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < str.length(); i9++) {
                char charAt = str.charAt(i9);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int a() {
        return f13021a;
    }

    public static boolean b() {
        return f13021a >= 9;
    }
}
