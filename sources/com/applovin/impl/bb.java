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

    public bb(cb cbVar, int i10) {
        super(cbVar, i10);
    }

    public static bb a(Collection collection, Comparator comparator) {
        ab a10;
        if (collection.isEmpty()) {
            return l();
        }
        cb.a aVar = new cb.a(collection.size());
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                a10 = ab.a(collection2);
            } else {
                a10 = ab.a(comparator, (Iterable) collection2);
            }
            if (!a10.isEmpty()) {
                aVar.a(key, a10);
                i10 += a10.size();
            }
        }
        return new bb(aVar.a(), i10);
    }

    public static a k() {
        return new a();
    }

    public static bb l() {
        return p7.f6914g;
    }

    public ab b(Object obj) {
        ab abVar = (ab) this.f4285d.get(obj);
        if (abVar == null) {
            return ab.h();
        }
        return abVar;
    }
}
