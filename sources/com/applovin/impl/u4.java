package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class u4 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27273a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f27274b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Set f27275c = Collections.emptySet();
    private List d = Collections.emptyList();

    public void a(Object obj) {
        synchronized (this.f27273a) {
            try {
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.add(obj);
                this.d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f27274b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f27275c);
                    hashSet.add(obj);
                    this.f27275c = Collections.unmodifiableSet(hashSet);
                }
                this.f27274b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(Object obj) {
        int intValue;
        synchronized (this.f27273a) {
            try {
                intValue = this.f27274b.containsKey(obj) ? ((Integer) this.f27274b.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public void c(Object obj) {
        synchronized (this.f27273a) {
            try {
                Integer num = (Integer) this.f27274b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(obj);
                this.d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f27274b.remove(obj);
                    HashSet hashSet = new HashSet(this.f27275c);
                    hashSet.remove(obj);
                    this.f27275c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f27274b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f27273a) {
            it = this.d.iterator();
        }
        return it;
    }

    public Set a() {
        Set set;
        synchronized (this.f27273a) {
            set = this.f27275c;
        }
        return set;
    }
}
