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

    /* renamed from: a, reason: collision with root package name */
    private final Object f10568a = new Object();
    private final Map b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Set f10569c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private List f10570d = Collections.emptyList();

    public void a(Object obj) {
        synchronized (this.f10568a) {
            try {
                ArrayList arrayList = new ArrayList(this.f10570d);
                arrayList.add(obj);
                this.f10570d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f10569c);
                    hashSet.add(obj);
                    this.f10569c = Collections.unmodifiableSet(hashSet);
                }
                this.b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(Object obj) {
        int i9;
        synchronized (this.f10568a) {
            try {
                if (this.b.containsKey(obj)) {
                    i9 = ((Integer) this.b.get(obj)).intValue();
                } else {
                    i9 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i9;
    }

    public void c(Object obj) {
        synchronized (this.f10568a) {
            try {
                Integer num = (Integer) this.b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f10570d);
                arrayList.remove(obj);
                this.f10570d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.b.remove(obj);
                    HashSet hashSet = new HashSet(this.f10569c);
                    hashSet.remove(obj);
                    this.f10569c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f10568a) {
            it = this.f10570d.iterator();
        }
        return it;
    }

    public Set a() {
        Set set;
        synchronized (this.f10568a) {
            set = this.f10569c;
        }
        return set;
    }
}
