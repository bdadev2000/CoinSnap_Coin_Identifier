package com.pgl.ssdk;

/* loaded from: classes3.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public static int f19525a = -1;

    public static String a() {
        int i9 = f19525a;
        if (i9 != 0) {
            if (i9 != 1) {
                return "";
            }
            return "https://ssdk-va.pangle.io/ssdk/v2/r";
        }
        return "https://ssdk-sg.pangle.io/ssdk/v2/r";
    }

    public static String b() {
        int i9 = f19525a;
        if (i9 != 0) {
            if (i9 != 1) {
                return "";
            }
            return "https://ssdk-va.pangle.io/ssdk/sd/token";
        }
        return "https://ssdk-sg.pangle.io/ssdk/sd/token";
    }
}
