package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r3 implements o2 {

    /* renamed from: g, reason: collision with root package name */
    public static final o2.a f26255g = new ru(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f26256a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26258c;
    public final byte[] d;

    /* renamed from: f, reason: collision with root package name */
    private int f26259f;

    public r3(int i2, int i3, int i4, byte[] bArr) {
        this.f26256a = i2;
        this.f26257b = i3;
        this.f26258c = i4;
        this.d = bArr;
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    private static String c(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r3.class != obj.getClass()) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return this.f26256a == r3Var.f26256a && this.f26257b == r3Var.f26257b && this.f26258c == r3Var.f26258c && Arrays.equals(this.d, r3Var.d);
    }

    public int hashCode() {
        if (this.f26259f == 0) {
            this.f26259f = Arrays.hashCode(this.d) + ((((((this.f26256a + 527) * 31) + this.f26257b) * 31) + this.f26258c) * 31);
        }
        return this.f26259f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f26256a);
        sb.append(", ");
        sb.append(this.f26257b);
        sb.append(", ");
        sb.append(this.f26258c);
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r3 a(Bundle bundle) {
        return new r3(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }
}
