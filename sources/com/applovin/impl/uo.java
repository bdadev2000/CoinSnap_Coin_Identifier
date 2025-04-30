package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class uo {

    /* renamed from: a, reason: collision with root package name */
    public final int f11645a;
    private final to[] b;

    /* renamed from: c, reason: collision with root package name */
    private int f11646c;

    public uo(to... toVarArr) {
        this.b = toVarArr;
        this.f11645a = toVarArr.length;
    }

    public to a(int i9) {
        return this.b[i9];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uo.class == obj.getClass()) {
            return Arrays.equals(this.b, ((uo) obj).b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f11646c == 0) {
            this.f11646c = Arrays.hashCode(this.b) + 527;
        }
        return this.f11646c;
    }
}
