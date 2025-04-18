package com.google.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class k7 extends AbstractSet {
    final /* synthetic */ l7 this$0;

    private k7(l7 l7Var) {
        this.this$0 = l7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.this$0.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new j7(this.this$0, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.this$0.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.this$0.size();
    }

    public /* synthetic */ k7(l7 l7Var, c7 c7Var) {
        this(l7Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<Comparable<Object>, Object> entry) {
        if (contains(entry)) {
            return false;
        }
        this.this$0.put(entry.getKey(), entry.getValue());
        return true;
    }
}
