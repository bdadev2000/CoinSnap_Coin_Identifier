package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class p0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f12015b;

    public p0(Object[] objArr) {
        this.f12015b = objArr;
    }

    public Object readResolve() {
        return r0.l(this.f12015b);
    }
}
