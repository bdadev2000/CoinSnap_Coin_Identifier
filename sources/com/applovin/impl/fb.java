package com.applovin.impl;

import com.applovin.impl.gb;
import com.applovin.impl.hb;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class fb extends hb implements fc {

    /* loaded from: classes2.dex */
    public static final class a extends hb.b {
        @Override // com.applovin.impl.hb.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj, Iterable iterable) {
            super.a(obj, iterable);
            return this;
        }

        public fb c() {
            return (fb) super.a();
        }

        public a b(Object obj, Object... objArr) {
            super.a(obj, objArr);
            return this;
        }
    }

    public fb(gb gbVar, int i2) {
        super(gbVar, i2);
    }

    public static fb a(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return l();
        }
        gb.a aVar = new gb.a(collection.size());
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            eb a2 = comparator == null ? eb.a(collection2) : eb.a(comparator, (Iterable) collection2);
            if (!a2.isEmpty()) {
                aVar.a(key, a2);
                i2 += a2.size();
            }
        }
        return new fb(aVar.a(), i2);
    }

    public static a k() {
        return new a();
    }

    public static fb l() {
        return r7.f26270g;
    }

    public eb b(Object obj) {
        eb ebVar = (eb) this.d.get(obj);
        return ebVar == null ? eb.h() : ebVar;
    }
}
