package com.google.protobuf;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1891d3 extends List, RandomAccess {
    boolean isModifiable();

    void makeImmutable();

    InterfaceC1891d3 mutableCopyWithCapacity(int i9);
}
