package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class l0 extends s implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11994b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11995c;

    public l0(Object obj, Object obj2) {
        this.f11994b = obj;
        this.f11995c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11994b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11995c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
