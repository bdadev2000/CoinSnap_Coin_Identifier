package com.applovin.impl;

import com.applovin.impl.zf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f27657a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27658b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27659c;
    public final int d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27660f;

    private w1(List list, int i2, int i3, int i4, float f2, String str) {
        this.f27657a = list;
        this.f27658b = i2;
        this.f27659c = i3;
        this.d = i4;
        this.e = f2;
        this.f27660f = str;
    }

    private static byte[] a(bh bhVar) {
        int C = bhVar.C();
        int d = bhVar.d();
        bhVar.g(C);
        return o3.a(bhVar.c(), d, C);
    }

    public static w1 b(bh bhVar) {
        int i2;
        int i3;
        float f2;
        String str;
        try {
            bhVar.g(4);
            int w = (bhVar.w() & 3) + 1;
            if (w == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int w2 = bhVar.w() & 31;
            for (int i4 = 0; i4 < w2; i4++) {
                arrayList.add(a(bhVar));
            }
            int w3 = bhVar.w();
            for (int i5 = 0; i5 < w3; i5++) {
                arrayList.add(a(bhVar));
            }
            if (w2 > 0) {
                zf.b c2 = zf.c((byte[]) arrayList.get(0), w, ((byte[]) arrayList.get(0)).length);
                int i6 = c2.e;
                int i7 = c2.f28339f;
                float f3 = c2.f28340g;
                str = o3.a(c2.f28336a, c2.f28337b, c2.f28338c);
                i2 = i6;
                i3 = i7;
                f2 = f3;
            } else {
                i2 = -1;
                i3 = -1;
                f2 = 1.0f;
                str = null;
            }
            return new w1(arrayList, w, i2, i3, f2, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw dh.a("Error parsing AVC config", e);
        }
    }
}
