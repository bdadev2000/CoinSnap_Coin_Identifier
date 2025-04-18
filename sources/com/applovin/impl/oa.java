package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class oa {

    /* renamed from: a, reason: collision with root package name */
    public final List f25818a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25819b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25820c;

    private oa(List list, int i2, String str) {
        this.f25818a = list;
        this.f25819b = i2;
        this.f25820c = str;
    }

    public static oa a(bh bhVar) {
        try {
            bhVar.g(21);
            int w = bhVar.w() & 3;
            int w2 = bhVar.w();
            int d = bhVar.d();
            int i2 = 0;
            for (int i3 = 0; i3 < w2; i3++) {
                bhVar.g(1);
                int C = bhVar.C();
                for (int i4 = 0; i4 < C; i4++) {
                    int C2 = bhVar.C();
                    i2 += C2 + 4;
                    bhVar.g(C2);
                }
            }
            bhVar.f(d);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            String str = null;
            for (int i6 = 0; i6 < w2; i6++) {
                int w3 = bhVar.w() & 127;
                int C3 = bhVar.C();
                for (int i7 = 0; i7 < C3; i7++) {
                    int C4 = bhVar.C();
                    byte[] bArr2 = zf.f28330a;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(bhVar.c(), bhVar.d(), bArr, length, C4);
                    if (w3 == 33 && i7 == 0) {
                        str = o3.a(new ch(bArr, length, length + C4));
                    }
                    i5 = length + C4;
                    bhVar.g(C4);
                }
            }
            return new oa(i2 == 0 ? null : Collections.singletonList(bArr), w + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw dh.a("Error parsing HEVC config", e);
        }
    }
}
