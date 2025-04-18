package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class r extends u implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: f, reason: collision with root package name */
    public transient Map f12024f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f12025g;

    public r(Map map) {
        v8.u0.f(map.isEmpty());
        this.f12024f = map;
    }

    @Override // com.google.common.collect.r1
    public final void clear() {
        Iterator it = this.f12024f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f12024f.clear();
        this.f12025g = 0;
    }

    @Override // com.google.common.collect.u
    public final Iterator f() {
        return new d(this, 1);
    }

    @Override // com.google.common.collect.u
    public final Iterator g() {
        return new d(this, 0);
    }

    public final Collection h() {
        return new t(this, 0);
    }

    public final Collection i() {
        Collection collection = this.f12036c;
        if (collection == null) {
            Collection h10 = h();
            this.f12036c = h10;
            return h10;
        }
        return collection;
    }

    @Override // com.google.common.collect.r1
    public final int size() {
        return this.f12025g;
    }
}
