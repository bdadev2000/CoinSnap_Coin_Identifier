package com.google.protobuf;

/* loaded from: classes3.dex */
public final class B3 implements L3 {
    private L3[] factories;

    public B3(L3... l3Arr) {
        this.factories = l3Arr;
    }

    @Override // com.google.protobuf.L3
    public boolean isSupported(Class<?> cls) {
        for (L3 l32 : this.factories) {
            if (l32.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.L3
    public K3 messageInfoFor(Class<?> cls) {
        for (L3 l32 : this.factories) {
            if (l32.isSupported(cls)) {
                return l32.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
