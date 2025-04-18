package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class s4 implements Iterable {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f7444b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Set f7445c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private List f7446d = Collections.emptyList();

    public void a(Object obj) {
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList(this.f7446d);
            arrayList.add(obj);
            this.f7446d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f7444b.get(obj);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f7445c);
                hashSet.add(obj);
                this.f7445c = Collections.unmodifiableSet(hashSet);
            }
            this.f7444b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int b(Object obj) {
        int i10;
        synchronized (this.a) {
            if (this.f7444b.containsKey(obj)) {
                i10 = ((Integer) this.f7444b.get(obj)).intValue();
            } else {
                i10 = 0;
            }
        }
        return i10;
    }

    public void c(Object obj) {
        synchronized (this.a) {
            Integer num = (Integer) this.f7444b.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f7446d);
            arrayList.remove(obj);
            this.f7446d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f7444b.remove(obj);
                HashSet hashSet = new HashSet(this.f7445c);
                hashSet.remove(obj);
                this.f7445c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f7444b.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.f7446d.iterator();
        }
        return it;
    }

    public Set a() {
        Set set;
        synchronized (this.a) {
            set = this.f7445c;
        }
        return set;
    }
}
