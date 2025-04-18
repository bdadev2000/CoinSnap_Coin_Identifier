package com.applovin.impl;

/* loaded from: classes2.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27865b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27866c;

    private x6(int i2, int i3, String str) {
        this.f27864a = i2;
        this.f27865b = i3;
        this.f27866c = str;
    }

    public static x6 a(bh bhVar) {
        String str;
        bhVar.g(2);
        int w = bhVar.w();
        int i2 = w >> 1;
        int w2 = ((bhVar.w() >> 3) & 31) | ((w & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(w2 >= 10 ? "." : ".0");
        sb.append(w2);
        return new x6(i2, w2, sb.toString());
    }
}
