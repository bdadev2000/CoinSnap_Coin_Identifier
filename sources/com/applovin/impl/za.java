package com.applovin.impl;

import java.io.Serializable;

/* loaded from: classes.dex */
class za extends g implements Serializable {
    final Object a;

    /* renamed from: b, reason: collision with root package name */
    final Object f9361b;

    public za(Object obj, Object obj2) {
        this.a = obj;
        this.f9361b = obj2;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final Object getValue() {
        return this.f9361b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
