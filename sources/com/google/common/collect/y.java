package com.google.common.collect;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class y extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f12055c;

    public /* synthetic */ y(AbstractMap abstractMap, int i10) {
        this.f12054b = i10;
        this.f12055c = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f12054b) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((androidx.datastore.preferences.protobuf.m1) this.f12055c).n((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f12054b;
        AbstractMap abstractMap = this.f12055c;
        switch (i10) {
            case 0:
                ((c0) abstractMap).clear();
                return;
            case 1:
                ((c0) abstractMap).clear();
                return;
            default:
                ((androidx.datastore.preferences.protobuf.m1) abstractMap).clear();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (v8.u0.t(r3.l(r0), r6.getValue()) != false) goto L18;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f12054b
            r1 = 1
            r2 = 0
            java.util.AbstractMap r3 = r5.f12055c
            switch(r0) {
                case 0: goto L11;
                case 1: goto La;
                default: goto L9;
            }
        L9:
            goto L45
        La:
            com.google.common.collect.c0 r3 = (com.google.common.collect.c0) r3
            boolean r6 = r3.containsKey(r6)
            return r6
        L11:
            com.google.common.collect.c0 r3 = (com.google.common.collect.c0) r3
            java.util.Map r0 = r3.a()
            if (r0 == 0) goto L22
            java.util.Set r0 = r0.entrySet()
            boolean r6 = r0.contains(r6)
            goto L44
        L22:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L42
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            int r0 = r3.b(r0)
            r4 = -1
            if (r0 == r4) goto L42
            java.lang.Object r0 = r3.l(r0)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = v8.u0.t(r0, r6)
            if (r6 == 0) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            r6 = r1
        L44:
            return r6
        L45:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            androidx.datastore.preferences.protobuf.m1 r3 = (androidx.datastore.preferences.protobuf.m1) r3
            java.lang.Object r0 = r6.getKey()
            java.lang.Object r0 = r3.get(r0)
            java.lang.Object r6 = r6.getValue()
            if (r0 == r6) goto L61
            if (r0 == 0) goto L60
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L60
            goto L61
        L60:
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.y.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i10 = this.f12054b;
        AbstractMap abstractMap = this.f12055c;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) abstractMap;
                Map a = c0Var.a();
                if (a != null) {
                    return a.entrySet().iterator();
                }
                return new x(c0Var, 1);
            case 1:
                c0 c0Var2 = (c0) abstractMap;
                Map a10 = c0Var2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new x(c0Var2, 0);
            default:
                return new androidx.datastore.preferences.protobuf.q1((androidx.datastore.preferences.protobuf.m1) abstractMap);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10 = this.f12054b;
        AbstractMap abstractMap = this.f12055c;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) abstractMap;
                Map a = c0Var.a();
                if (a != null) {
                    return a.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0Var.f()) {
                        int i11 = (1 << (c0Var.f11918g & 31)) - 1;
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0Var.f11914b;
                        Objects.requireNonNull(obj2);
                        int u = c6.k.u(key, value, i11, obj2, c0Var.h(), c0Var.i(), c0Var.j());
                        if (u != -1) {
                            c0Var.e(u, i11);
                            c0Var.f11919h--;
                            c0Var.f11918g += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                c0 c0Var2 = (c0) abstractMap;
                Map a10 = c0Var2.a();
                if (a10 != null) {
                    return a10.keySet().remove(obj);
                }
                if (c0Var2.g(obj) != c0.f11913l) {
                    return true;
                }
                return false;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((androidx.datastore.preferences.protobuf.m1) abstractMap).remove(entry2.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f12054b;
        AbstractMap abstractMap = this.f12055c;
        switch (i10) {
            case 0:
                return ((c0) abstractMap).size();
            case 1:
                return ((c0) abstractMap).size();
            default:
                return ((androidx.datastore.preferences.protobuf.m1) abstractMap).size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(androidx.datastore.preferences.protobuf.m1 m1Var) {
        this(m1Var, 2);
        this.f12054b = 2;
    }
}
