package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class yq implements m2 {

    /* renamed from: f */
    public static final yq f9267f = new yq(0, 0);

    /* renamed from: g */
    public static final m2.a f9268g = new lu(16);
    public final int a;

    /* renamed from: b */
    public final int f9269b;

    /* renamed from: c */
    public final int f9270c;

    /* renamed from: d */
    public final float f9271d;

    public yq(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ yq b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq)) {
            return false;
        }
        yq yqVar = (yq) obj;
        if (this.a == yqVar.a && this.f9269b == yqVar.f9269b && this.f9270c == yqVar.f9270c && this.f9271d == yqVar.f9271d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f9271d) + ((((((this.a + 217) * 31) + this.f9269b) * 31) + this.f9270c) * 31);
    }

    public yq(int i10, int i11, int i12, float f10) {
        this.a = i10;
        this.f9269b = i11;
        this.f9270c = i12;
        this.f9271d = f10;
    }

    public static /* synthetic */ yq a(Bundle bundle) {
        return new yq(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }
}
