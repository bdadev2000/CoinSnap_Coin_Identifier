package com.google.protobuf;

/* loaded from: classes4.dex */
public final class c5 implements m5 {
    private m5[] factories;

    public c5(m5... m5VarArr) {
        this.factories = m5VarArr;
    }

    @Override // com.google.protobuf.m5
    public boolean isSupported(Class<?> cls) {
        for (m5 m5Var : this.factories) {
            if (m5Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.m5
    public l5 messageInfoFor(Class<?> cls) {
        for (m5 m5Var : this.factories) {
            if (m5Var.isSupported(cls)) {
                return m5Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
