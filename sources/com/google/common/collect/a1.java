package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class a1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11901b;

    public a1(Object[] objArr) {
        this.f11901b = objArr;
    }

    public Object readResolve() {
        return b1.m(this.f11901b);
    }
}
