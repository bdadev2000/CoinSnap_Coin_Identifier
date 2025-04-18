package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ka {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5641b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5642c;

    private ka(List list, int i10, String str) {
        this.a = list;
        this.f5641b = i10;
        this.f5642c = str;
    }

    public static ka a(yg ygVar) {
        List singletonList;
        try {
            ygVar.g(21);
            int w10 = ygVar.w() & 3;
            int w11 = ygVar.w();
            int d10 = ygVar.d();
            int i10 = 0;
            for (int i11 = 0; i11 < w11; i11++) {
                ygVar.g(1);
                int C = ygVar.C();
                for (int i12 = 0; i12 < C; i12++) {
                    int C2 = ygVar.C();
                    i10 += C2 + 4;
                    ygVar.g(C2);
                }
            }
            ygVar.f(d10);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            String str = null;
            for (int i14 = 0; i14 < w11; i14++) {
                int w12 = ygVar.w() & 127;
                int C3 = ygVar.C();
                for (int i15 = 0; i15 < C3; i15++) {
                    int C4 = ygVar.C();
                    byte[] bArr2 = uf.a;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(ygVar.c(), ygVar.d(), bArr, length, C4);
                    if (w12 == 33 && i15 == 0) {
                        str = m3.a(new zg(bArr, length, length + C4));
                    }
                    i13 = length + C4;
                    ygVar.g(C4);
                }
            }
            if (i10 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new ka(singletonList, w10 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ah.a("Error parsing HEVC config", e2);
        }
    }
}
