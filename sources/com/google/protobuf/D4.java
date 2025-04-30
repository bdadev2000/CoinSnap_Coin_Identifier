package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class D4 extends J4 {
    final /* synthetic */ K4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private D4(K4 k42) {
        super(k42, null);
        this.this$0 = k42;
    }

    @Override // com.google.protobuf.J4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new C4(this.this$0, null);
    }

    public /* synthetic */ D4(K4 k42, B4 b42) {
        this(k42);
    }
}
