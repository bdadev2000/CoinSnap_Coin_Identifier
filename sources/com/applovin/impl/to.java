package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class to {

    /* renamed from: a, reason: collision with root package name */
    public final int f27200a;

    /* renamed from: b, reason: collision with root package name */
    private final so[] f27201b;

    /* renamed from: c, reason: collision with root package name */
    private int f27202c;

    public to(so... soVarArr) {
        this.f27201b = soVarArr;
        this.f27200a = soVarArr.length;
    }

    public so a(int i2) {
        return this.f27201b[i2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || to.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f27201b, ((to) obj).f27201b);
    }

    public int hashCode() {
        if (this.f27202c == 0) {
            this.f27202c = Arrays.hashCode(this.f27201b) + 527;
        }
        return this.f27202c;
    }
}
