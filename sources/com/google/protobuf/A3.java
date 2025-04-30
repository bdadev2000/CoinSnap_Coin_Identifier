package com.google.protobuf;

/* loaded from: classes3.dex */
public final class A3 implements L3 {
    @Override // com.google.protobuf.L3
    public boolean isSupported(Class<?> cls) {
        return false;
    }

    @Override // com.google.protobuf.L3
    public K3 messageInfoFor(Class<?> cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
