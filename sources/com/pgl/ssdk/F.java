package com.pgl.ssdk;

/* loaded from: classes4.dex */
public class F {
    public static int a = -1;

    public static String a() {
        int i10 = a;
        return i10 != 0 ? i10 != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/v2/r" : "https://ssdk-sg.pangle.io/ssdk/v2/r";
    }

    public static String b() {
        int i10 = a;
        return i10 != 0 ? i10 != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/sd/token" : "https://ssdk-sg.pangle.io/ssdk/sd/token";
    }
}
