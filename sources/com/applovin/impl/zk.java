package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class zk extends gi {

    /* renamed from: d */
    public static final m2.a f9467d = new lu(19);

    /* renamed from: b */
    private final int f9468b;

    /* renamed from: c */
    private final float f9469c;

    public zk(int i10) {
        a1.a(i10 > 0, "maxStars must be a positive integer");
        this.f9468b = i10;
        this.f9469c = -1.0f;
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static zk b(Bundle bundle) {
        boolean z10 = false;
        if (bundle.getInt(a(0), -1) == 2) {
            z10 = true;
        }
        a1.a(z10);
        int i10 = bundle.getInt(a(1), 5);
        float f10 = bundle.getFloat(a(2), -1.0f);
        if (f10 == -1.0f) {
            return new zk(i10);
        }
        return new zk(i10, f10);
    }

    public static /* synthetic */ zk d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        if (this.f9468b != zkVar.f9468b || this.f9469c != zkVar.f9469c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f9468b), Float.valueOf(this.f9469c));
    }

    public zk(int i10, float f10) {
        a1.a(i10 > 0, "maxStars must be a positive integer");
        a1.a(f10 >= 0.0f && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f9468b = i10;
        this.f9469c = f10;
    }
}
