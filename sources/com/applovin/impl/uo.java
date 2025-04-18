package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class uo {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    private final to[] f8430b;

    /* renamed from: c, reason: collision with root package name */
    private int f8431c;

    public uo(to... toVarArr) {
        this.f8430b = toVarArr;
        this.a = toVarArr.length;
    }

    public to a(int i10) {
        return this.f8430b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uo.class == obj.getClass()) {
            return Arrays.equals(this.f8430b, ((uo) obj).f8430b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f8431c == 0) {
            this.f8431c = Arrays.hashCode(this.f8430b) + 527;
        }
        return this.f8431c;
    }
}
