package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class d0 extends h0 {
    public abstract boolean equalsRange(h0 h0Var, int i10, int i11);

    @Override // com.google.protobuf.h0
    public final int getTreeDepth() {
        return 0;
    }

    @Override // com.google.protobuf.h0
    public final boolean isBalanced() {
        return true;
    }

    @Override // com.google.protobuf.h0, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.protobuf.h0
    public void writeToReverse(u uVar) throws IOException {
        writeTo(uVar);
    }
}
