package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j7 implements Iterator {
    private Iterator<Map.Entry<Comparable<Object>, Object>> lazyOverflowIterator;
    private boolean nextCalledBeforeRemove;
    private int pos;
    final /* synthetic */ l7 this$0;

    private j7(l7 l7Var) {
        this.this$0 = l7Var;
        this.pos = -1;
    }

    private Iterator<Map.Entry<Comparable<Object>, Object>> getOverflowIterator() {
        Map map;
        if (this.lazyOverflowIterator == null) {
            map = this.this$0.overflowEntries;
            this.lazyOverflowIterator = map.entrySet().iterator();
        }
        return this.lazyOverflowIterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        List list;
        Map map;
        int i10 = this.pos + 1;
        list = this.this$0.entryList;
        if (i10 < list.size()) {
            return true;
        }
        map = this.this$0.overflowEntries;
        if (!map.isEmpty() && getOverflowIterator().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        List list;
        if (this.nextCalledBeforeRemove) {
            this.nextCalledBeforeRemove = false;
            this.this$0.checkMutable();
            int i10 = this.pos;
            list = this.this$0.entryList;
            if (i10 < list.size()) {
                l7 l7Var = this.this$0;
                int i11 = this.pos;
                this.pos = i11 - 1;
                l7Var.removeArrayEntryAt(i11);
                return;
            }
            getOverflowIterator().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        List list;
        List list2;
        this.nextCalledBeforeRemove = true;
        int i10 = this.pos + 1;
        this.pos = i10;
        list = this.this$0.entryList;
        if (i10 < list.size()) {
            list2 = this.this$0.entryList;
            return (Map.Entry) list2.get(this.pos);
        }
        return getOverflowIterator().next();
    }

    public /* synthetic */ j7(l7 l7Var, c7 c7Var) {
        this(l7Var);
    }
}
