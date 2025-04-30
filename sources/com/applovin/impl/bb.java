package com.applovin.impl;

import com.applovin.impl.cb;
import com.applovin.impl.db;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class bb extends db implements ac {

    /* loaded from: classes.dex */
    public static final class a extends db.b {
        @Override // com.applovin.impl.db.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj, Iterable iterable) {
            super.a(obj, iterable);
            return this;
        }

        public bb c() {
            return (bb) super.a();
        }

        public a b(Object obj, Object... objArr) {
            super.a(obj, objArr);
            return this;
        }
    }

    public bb(cb cbVar, int i9) {
        super(cbVar, i9);
    }

    public static bb a(Collection collection, Comparator comparator) {
        ab a6;
        if (collection.isEmpty()) {
            return l();
        }
        cb.a aVar = new cb.a(collection.size());
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                a6 = ab.a(collection2);
            } else {
                a6 = ab.a(comparator, (Iterable) collection2);
            }
            if (!a6.isEmpty()) {
                aVar.a(key, a6);
                i9 += a6.size();
            }
        }
        return new bb(aVar.a(), i9);
    }

    public static a k() {
        return new a();
    }

    public static bb l() {
        return p7.f9984g;
    }

    public ab b(Object obj) {
        ab abVar = (ab) this.f7269d.get(obj);
        if (abVar == null) {
            return ab.h();
        }
        return abVar;
    }
}
