package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d7 implements Iterator {
    private Iterator<Map.Entry<Comparable<Object>, Object>> lazyOverflowIterator;
    private int pos;
    final /* synthetic */ l7 this$0;

    private d7(l7 l7Var) {
        List list;
        this.this$0 = l7Var;
        list = l7Var.entryList;
        this.pos = list.size();
    }

    private Iterator<Map.Entry<Comparable<Object>, Object>> getOverflowIterator() {
        Map map;
        if (this.lazyOverflowIterator == null) {
            map = this.this$0.overflowEntriesDescending;
            this.lazyOverflowIterator = map.entrySet().iterator();
        }
        return this.lazyOverflowIterator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 > r1.size()) goto L6;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasNext() {
        /*
            r2 = this;
            int r0 = r2.pos
            if (r0 <= 0) goto L10
            com.google.protobuf.l7 r1 = r2.this$0
            java.util.List r1 = com.google.protobuf.l7.access$600(r1)
            int r1 = r1.size()
            if (r0 <= r1) goto L1a
        L10:
            java.util.Iterator r0 = r2.getOverflowIterator()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d7.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public Map.Entry<Comparable<Object>, Object> next() {
        List list;
        if (getOverflowIterator().hasNext()) {
            return getOverflowIterator().next();
        }
        list = this.this$0.entryList;
        int i10 = this.pos - 1;
        this.pos = i10;
        return (Map.Entry) list.get(i10);
    }

    public /* synthetic */ d7(l7 l7Var, c7 c7Var) {
        this(l7Var);
    }
}
