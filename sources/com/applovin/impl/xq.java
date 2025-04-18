package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;

/* loaded from: classes4.dex */
public final class xq implements o2 {

    /* renamed from: f */
    public static final xq f27975f = new xq(0, 0);

    /* renamed from: g */
    public static final o2.a f27976g = new ru(18);

    /* renamed from: a */
    public final int f27977a;

    /* renamed from: b */
    public final int f27978b;

    /* renamed from: c */
    public final int f27979c;
    public final float d;

    public xq(int i2, int i3) {
        this(i2, i3, 0, 1.0f);
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public static /* synthetic */ xq b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq)) {
            return false;
        }
        xq xqVar = (xq) obj;
        return this.f27977a == xqVar.f27977a && this.f27978b == xqVar.f27978b && this.f27979c == xqVar.f27979c && this.d == xqVar.d;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((this.f27977a + 217) * 31) + this.f27978b) * 31) + this.f27979c) * 31);
    }

    public xq(int i2, int i3, int i4, float f2) {
        this.f27977a = i2;
        this.f27978b = i3;
        this.f27979c = i4;
        this.d = f2;
    }

    public static /* synthetic */ xq a(Bundle bundle) {
        return new xq(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }
}
