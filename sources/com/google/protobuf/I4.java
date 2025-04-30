package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class I4 implements Iterator {
    private Iterator<Map.Entry<Comparable<Object>, Object>> lazyOverflowIterator;
    private boolean nextCalledBeforeRemove;
    private int pos;
    final /* synthetic */ K4 this$0;

    private I4(K4 k42) {
        this.this$0 = k42;
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
        int i9 = this.pos + 1;
        list = this.this$0.entryList;
        if (i9 >= list.size()) {
            map = this.this$0.overflowEntries;
            if (!map.isEmpty() && getOverflowIterator().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        List list;
        if (this.nextCalledBeforeRemove) {
            this.nextCalledBeforeRemove = false;
            this.this$0.checkMutable();
            int i9 = this.pos;
            list = this.this$0.entryList;
            if (i9 < list.size()) {
                K4 k42 = this.this$0;
                int i10 = this.pos;
                this.pos = i10 - 1;
                k42.removeArrayEntryAt(i10);
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
        int i9 = this.pos + 1;
        this.pos = i9;
        list = this.this$0.entryList;
        if (i9 < list.size()) {
            list2 = this.this$0.entryList;
            return (Map.Entry) list2.get(this.pos);
        }
        return getOverflowIterator().next();
    }

    public /* synthetic */ I4(K4 k42, B4 b42) {
        this(k42);
    }
}
