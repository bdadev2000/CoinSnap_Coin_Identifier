package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p3 implements m2 {

    /* renamed from: g, reason: collision with root package name */
    public static final m2.a f6898g = new lu(1);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6899b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6900c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6901d;

    /* renamed from: f, reason: collision with root package name */
    private int f6902f;

    public p3(int i10, int i11, int i12, byte[] bArr) {
        this.a = i10;
        this.f6899b = i11;
        this.f6900c = i12;
        this.f6901d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p3.class != obj.getClass()) {
            return false;
        }
        p3 p3Var = (p3) obj;
        if (this.a == p3Var.a && this.f6899b == p3Var.f6899b && this.f6900c == p3Var.f6900c && Arrays.equals(this.f6901d, p3Var.f6901d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f6902f == 0) {
            this.f6902f = Arrays.hashCode(this.f6901d) + ((((((this.a + 527) * 31) + this.f6899b) * 31) + this.f6900c) * 31);
        }
        return this.f6902f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.f6899b);
        sb2.append(", ");
        sb2.append(this.f6900c);
        sb2.append(", ");
        sb2.append(this.f6901d != null);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p3 a(Bundle bundle) {
        return new p3(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }
}
