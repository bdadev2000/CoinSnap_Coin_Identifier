package com.applovin.impl;

/* loaded from: classes.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11698a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11699c;

    private v6(int i9, int i10, String str) {
        this.f11698a = i9;
        this.b = i10;
        this.f11699c = str;
    }

    public static v6 a(yg ygVar) {
        String str;
        ygVar.g(2);
        int w2 = ygVar.w();
        int i9 = w2 >> 1;
        int w9 = ((ygVar.w() >> 3) & 31) | ((w2 & 1) << 5);
        if (i9 != 4 && i9 != 5 && i9 != 7) {
            if (i9 == 8) {
                str = "hev1";
            } else if (i9 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i9);
        if (w9 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(w9);
        return new v6(i9, w9, sb.toString());
    }
}
