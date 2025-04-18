package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public abstract class u0 implements Map, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient b2 f12038b;

    /* renamed from: c, reason: collision with root package name */
    public transient c2 f12039c;

    /* renamed from: d, reason: collision with root package name */
    public transient d2 f12040d;

    public static u0 a(Map map) {
        int i10;
        if ((map instanceof u0) && !(map instanceof SortedMap)) {
            u0 u0Var = (u0) map;
            u0Var.getClass();
            return u0Var;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z10 = entrySet instanceof Collection;
        if (z10) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        m9.s sVar = new m9.s(i10);
        if (z10) {
            sVar.b(entrySet.size() + sVar.a);
        }
        for (Map.Entry entry : entrySet) {
            sVar.c(entry.getKey(), entry.getValue());
        }
        return sVar.a();
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b1 entrySet() {
        b2 b2Var = this.f12038b;
        if (b2Var == null) {
            e2 e2Var = (e2) this;
            b2 b2Var2 = new b2(e2Var, e2Var.f11938g, e2Var.f11939h);
            this.f12038b = b2Var2;
            return b2Var2;
        }
        return b2Var;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k0 values() {
        d2 d2Var = this.f12040d;
        if (d2Var == null) {
            e2 e2Var = (e2) this;
            d2 d2Var2 = new d2(e2Var.f11938g, 1, e2Var.f11939h);
            this.f12040d = d2Var2;
            return d2Var2;
        }
        return d2Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return c6.k.m(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return c6.c.r(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((e2) this).f11939h == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c2 c2Var = this.f12039c;
        if (c2Var == null) {
            e2 e2Var = (e2) this;
            c2 c2Var2 = new c2(e2Var, new d2(e2Var.f11938g, 0, e2Var.f11939h));
            this.f12039c = c2Var2;
            return c2Var2;
        }
        return c2Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i10 = ((e2) this).f11939h;
        a6.k.j(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public Object writeReplace() {
        return new t0(this);
    }
}
