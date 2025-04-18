package com.applovin.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
class db extends g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f23444a;

    /* renamed from: b, reason: collision with root package name */
    final Object f23445b;

    public db(Object obj, Object obj2) {
        this.f23444a = obj;
        this.f23445b = obj2;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final Object getKey() {
        return this.f23444a;
    }

    @Override // com.applovin.impl.g, java.util.Map.Entry
    public final Object getValue() {
        return this.f23445b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
