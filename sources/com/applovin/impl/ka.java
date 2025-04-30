package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    public final List f8613a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8614c;

    private ka(List list, int i9, String str) {
        this.f8613a = list;
        this.b = i9;
        this.f8614c = str;
    }

    public static ka a(yg ygVar) {
        List singletonList;
        try {
            ygVar.g(21);
            int w2 = ygVar.w() & 3;
            int w9 = ygVar.w();
            int d2 = ygVar.d();
            int i9 = 0;
            for (int i10 = 0; i10 < w9; i10++) {
                ygVar.g(1);
                int C8 = ygVar.C();
                for (int i11 = 0; i11 < C8; i11++) {
                    int C9 = ygVar.C();
                    i9 += C9 + 4;
                    ygVar.g(C9);
                }
            }
            ygVar.f(d2);
            byte[] bArr = new byte[i9];
            int i12 = 0;
            String str = null;
            for (int i13 = 0; i13 < w9; i13++) {
                int w10 = ygVar.w() & 127;
                int C10 = ygVar.C();
                for (int i14 = 0; i14 < C10; i14++) {
                    int C11 = ygVar.C();
                    byte[] bArr2 = uf.f11591a;
                    System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
                    int length = i12 + bArr2.length;
                    System.arraycopy(ygVar.c(), ygVar.d(), bArr, length, C11);
                    if (w10 == 33 && i14 == 0) {
                        str = m3.a(new zg(bArr, length, length + C11));
                    }
                    i12 = length + C11;
                    ygVar.g(C11);
                }
            }
            if (i9 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new ka(singletonList, w2 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw ah.a("Error parsing HEVC config", e4);
        }
    }
}
