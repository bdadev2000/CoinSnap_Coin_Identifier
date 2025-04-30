package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;

/* loaded from: classes.dex */
public final class yq implements InterfaceC0725m2 {

    /* renamed from: f */
    public static final yq f12463f = new yq(0, 0);

    /* renamed from: g */
    public static final InterfaceC0725m2.a f12464g = new C1(17);

    /* renamed from: a */
    public final int f12465a;
    public final int b;

    /* renamed from: c */
    public final int f12466c;

    /* renamed from: d */
    public final float f12467d;

    public yq(int i9, int i10) {
        this(i9, i10, 0, 1.0f);
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
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
        if (this.f12465a == yqVar.f12465a && this.b == yqVar.b && this.f12466c == yqVar.f12466c && this.f12467d == yqVar.f12467d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f12467d) + ((((((this.f12465a + 217) * 31) + this.b) * 31) + this.f12466c) * 31);
    }

    public yq(int i9, int i10, int i11, float f9) {
        this.f12465a = i9;
        this.b = i10;
        this.f12466c = i11;
        this.f12467d = f9;
    }

    public static /* synthetic */ yq a(Bundle bundle) {
        return new yq(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }
}
