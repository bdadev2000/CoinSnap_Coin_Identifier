package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class D extends H {
    public abstract boolean equalsRange(H h6, int i9, int i10);

    @Override // com.google.protobuf.H
    public final int getTreeDepth() {
        return 0;
    }

    @Override // com.google.protobuf.H
    public final boolean isBalanced() {
        return true;
    }

    @Override // com.google.protobuf.H, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.protobuf.H
    public void writeToReverse(AbstractC2005u abstractC2005u) throws IOException {
        writeTo(abstractC2005u);
    }
}
