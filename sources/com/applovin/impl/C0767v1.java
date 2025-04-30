package com.applovin.impl;

import com.applovin.impl.uf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767v1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f11654a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11656d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11657e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11658f;

    private C0767v1(List list, int i9, int i10, int i11, float f9, String str) {
        this.f11654a = list;
        this.b = i9;
        this.f11655c = i10;
        this.f11656d = i11;
        this.f11657e = f9;
        this.f11658f = str;
    }

    private static byte[] a(yg ygVar) {
        int C8 = ygVar.C();
        int d2 = ygVar.d();
        ygVar.g(C8);
        return m3.a(ygVar.c(), d2, C8);
    }

    public static C0767v1 b(yg ygVar) {
        int i9;
        int i10;
        float f9;
        String str;
        try {
            ygVar.g(4);
            int w2 = (ygVar.w() & 3) + 1;
            if (w2 != 3) {
                ArrayList arrayList = new ArrayList();
                int w9 = ygVar.w() & 31;
                for (int i11 = 0; i11 < w9; i11++) {
                    arrayList.add(a(ygVar));
                }
                int w10 = ygVar.w();
                for (int i12 = 0; i12 < w10; i12++) {
                    arrayList.add(a(ygVar));
                }
                if (w9 > 0) {
                    uf.b c9 = uf.c((byte[]) arrayList.get(0), w2, ((byte[]) arrayList.get(0)).length);
                    int i13 = c9.f11599e;
                    int i14 = c9.f11600f;
                    float f10 = c9.f11601g;
                    str = m3.a(c9.f11596a, c9.b, c9.f11597c);
                    i9 = i13;
                    i10 = i14;
                    f9 = f10;
                } else {
                    i9 = -1;
                    i10 = -1;
                    f9 = 1.0f;
                    str = null;
                }
                return new C0767v1(arrayList, w2, i9, i10, f9, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw ah.a("Error parsing AVC config", e4);
        }
    }
}
