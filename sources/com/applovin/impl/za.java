package com.applovin.impl;

import java.io.Serializable;

/* loaded from: classes.dex */
class za extends AbstractC0697g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f12544a;
    final Object b;

    public za(Object obj, Object obj2) {
        this.f12544a = obj;
        this.b = obj2;
    }

    @Override // com.applovin.impl.AbstractC0697g, java.util.Map.Entry
    public final Object getKey() {
        return this.f12544a;
    }

    @Override // com.applovin.impl.AbstractC0697g, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
