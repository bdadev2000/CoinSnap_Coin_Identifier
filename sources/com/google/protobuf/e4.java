package com.google.protobuf;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public interface e4 extends List, RandomAccess {
    boolean isModifiable();

    void makeImmutable();

    e4 mutableCopyWithCapacity(int i10);
}
