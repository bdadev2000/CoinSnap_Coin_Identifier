package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;

/* loaded from: classes2.dex */
public final class r6 implements o2 {
    public static final r6 d = new r6(0, 0, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final o2.a f26266f = new ru(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f26267a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26268b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26269c;

    public r6(int i2, int i3, int i4) {
        this.f26267a = i2;
        this.f26268b = i3;
        this.f26269c = i4;
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return this.f26267a == r6Var.f26267a && this.f26268b == r6Var.f26268b && this.f26269c == r6Var.f26269c;
    }

    public int hashCode() {
        return ((((this.f26267a + 527) * 31) + this.f26268b) * 31) + this.f26269c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r6 a(Bundle bundle) {
        return new r6(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }
}
