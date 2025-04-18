package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class p6 implements m2 {

    /* renamed from: d */
    public static final p6 f6910d = new p6(0, 0, 0);

    /* renamed from: f */
    public static final m2.a f6911f = new lu(2);
    public final int a;

    /* renamed from: b */
    public final int f6912b;

    /* renamed from: c */
    public final int f6913c;

    public p6(int i10, int i11, int i12) {
        this.a = i10;
        this.f6912b = i11;
        this.f6913c = i12;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ p6 b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        if (this.a == p6Var.a && this.f6912b == p6Var.f6912b && this.f6913c == p6Var.f6913c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a + 527) * 31) + this.f6912b) * 31) + this.f6913c;
    }

    public static /* synthetic */ p6 a(Bundle bundle) {
        return new p6(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }
}
