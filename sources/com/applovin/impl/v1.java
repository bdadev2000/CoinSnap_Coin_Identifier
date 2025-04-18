package com.applovin.impl;

import com.applovin.impl.uf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v1 {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8447b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8448c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8449d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8450e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8451f;

    private v1(List list, int i10, int i11, int i12, float f10, String str) {
        this.a = list;
        this.f8447b = i10;
        this.f8448c = i11;
        this.f8449d = i12;
        this.f8450e = f10;
        this.f8451f = str;
    }

    private static byte[] a(yg ygVar) {
        int C = ygVar.C();
        int d10 = ygVar.d();
        ygVar.g(C);
        return m3.a(ygVar.c(), d10, C);
    }

    public static v1 b(yg ygVar) {
        int i10;
        int i11;
        float f10;
        String str;
        try {
            ygVar.g(4);
            int w10 = (ygVar.w() & 3) + 1;
            if (w10 != 3) {
                ArrayList arrayList = new ArrayList();
                int w11 = ygVar.w() & 31;
                for (int i12 = 0; i12 < w11; i12++) {
                    arrayList.add(a(ygVar));
                }
                int w12 = ygVar.w();
                for (int i13 = 0; i13 < w12; i13++) {
                    arrayList.add(a(ygVar));
                }
                if (w11 > 0) {
                    uf.b c10 = uf.c((byte[]) arrayList.get(0), w10, ((byte[]) arrayList.get(0)).length);
                    int i14 = c10.f8383e;
                    int i15 = c10.f8384f;
                    float f11 = c10.f8385g;
                    str = m3.a(c10.a, c10.f8380b, c10.f8381c);
                    i10 = i14;
                    i11 = i15;
                    f10 = f11;
                } else {
                    i10 = -1;
                    i11 = -1;
                    f10 = 1.0f;
                    str = null;
                }
                return new v1(arrayList, w10, i10, i11, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ah.a("Error parsing AVC config", e2);
        }
    }
}
