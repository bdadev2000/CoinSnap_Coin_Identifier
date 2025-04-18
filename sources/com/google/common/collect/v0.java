package com.google.common.collect;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class v0 extends q2 {

    /* renamed from: b, reason: collision with root package name */
    public final q2 f12042b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12043c = null;

    /* renamed from: d, reason: collision with root package name */
    public q2 f12044d = l1.f11996g;

    public v0(y0 y0Var) {
        this.f12042b = y0Var.f12056f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12044d.hasNext() || this.f12042b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12044d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f12042b.next();
            this.f12043c = entry.getKey();
            this.f12044d = ((k0) entry.getValue()).iterator();
        }
        Object obj = this.f12043c;
        Objects.requireNonNull(obj);
        return new l0(obj, this.f12044d.next());
    }
}
