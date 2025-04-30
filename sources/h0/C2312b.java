package h0;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.AbstractC2816g;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2312b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f20569a;
    public final AtomicBoolean b;

    public C2312b(Map map, boolean z8) {
        G7.j.e(map, "preferencesMap");
        this.f20569a = map;
        this.b = new AtomicBoolean(z8);
    }

    public final void a() {
        if (!this.b.get()) {
        } else {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final Object b(f fVar) {
        G7.j.e(fVar, "key");
        return this.f20569a.get(fVar);
    }

    public final void c(f fVar, Object obj) {
        G7.j.e(fVar, "key");
        a();
        Map map = this.f20569a;
        if (obj == null) {
            a();
            map.remove(fVar);
        } else {
            if (obj instanceof Set) {
                Set unmodifiableSet = Collections.unmodifiableSet(AbstractC2816g.V((Iterable) obj));
                G7.j.d(unmodifiableSet, "unmodifiableSet(value.toSet())");
                map.put(fVar, unmodifiableSet);
                return;
            }
            map.put(fVar, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2312b) {
            return G7.j.a(this.f20569a, ((C2312b) obj).f20569a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20569a.hashCode();
    }

    public final String toString() {
        return AbstractC2816g.O(this.f20569a.entrySet(), ",\n", "{\n", "\n}", C2311a.b, 24);
    }

    public /* synthetic */ C2312b(boolean z8) {
        this(new LinkedHashMap(), z8);
    }
}
