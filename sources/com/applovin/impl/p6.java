package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;

/* loaded from: classes.dex */
public final class p6 implements InterfaceC0725m2 {

    /* renamed from: d, reason: collision with root package name */
    public static final p6 f9980d = new p6(0, 0, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC0725m2.a f9981f = new C1(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f9982a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9983c;

    public p6(int i9, int i10, int i11) {
        this.f9982a = i9;
        this.b = i10;
        this.f9983c = i11;
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        if (this.f9982a == p6Var.f9982a && this.b == p6Var.b && this.f9983c == p6Var.f9983c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9982a + 527) * 31) + this.b) * 31) + this.f9983c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p6 a(Bundle bundle) {
        return new p6(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }
}
