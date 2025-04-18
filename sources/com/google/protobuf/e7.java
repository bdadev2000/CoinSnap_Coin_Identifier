package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class e7 extends k7 {
    final /* synthetic */ l7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private e7(l7 l7Var) {
        super(l7Var, null);
        this.this$0 = l7Var;
    }

    @Override // com.google.protobuf.k7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new d7(this.this$0, null);
    }

    public /* synthetic */ e7(l7 l7Var, c7 c7Var) {
        this(l7Var);
    }
}
