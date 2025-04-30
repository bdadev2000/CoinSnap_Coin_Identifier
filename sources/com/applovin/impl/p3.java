package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p3 implements InterfaceC0725m2 {

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC0725m2.a f9968g = new C1(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f9969a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9970c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9971d;

    /* renamed from: f, reason: collision with root package name */
    private int f9972f;

    public p3(int i9, int i10, int i11, byte[] bArr) {
        this.f9969a = i9;
        this.b = i10;
        this.f9970c = i11;
        this.f9971d = bArr;
    }

    public static int a(int i9) {
        if (i9 == 1) {
            return 1;
        }
        if (i9 != 9) {
            return (i9 == 4 || i9 == 5 || i9 == 6 || i9 == 7) ? 2 : -1;
        }
        return 6;
    }

    private static String c(int i9) {
        return Integer.toString(i9, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p3.class != obj.getClass()) {
            return false;
        }
        p3 p3Var = (p3) obj;
        if (this.f9969a == p3Var.f9969a && this.b == p3Var.b && this.f9970c == p3Var.f9970c && Arrays.equals(this.f9971d, p3Var.f9971d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f9972f == 0) {
            this.f9972f = Arrays.hashCode(this.f9971d) + ((((((this.f9969a + 527) * 31) + this.b) * 31) + this.f9970c) * 31);
        }
        return this.f9972f;
    }

    public String toString() {
        boolean z8;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f9969a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.f9970c);
        sb.append(", ");
        if (this.f9971d != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        sb.append(z8);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p3 a(Bundle bundle) {
        return new p3(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i9) {
        if (i9 == 1) {
            return 3;
        }
        if (i9 == 16) {
            return 6;
        }
        if (i9 != 18) {
            return (i9 == 6 || i9 == 7) ? 3 : -1;
        }
        return 7;
    }
}
