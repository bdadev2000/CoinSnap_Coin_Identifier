package com.google.protobuf;

/* loaded from: classes4.dex */
public final class n4 extends o4 {
    private final o5 defaultInstance;

    public n4(o5 o5Var, a2 a2Var, h0 h0Var) {
        super(a2Var, h0Var);
        this.defaultInstance = o5Var;
    }

    @Override // com.google.protobuf.o4
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.defaultInstance;
    }

    @Override // com.google.protobuf.o4
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public o5 getValue() {
        return getValue(this.defaultInstance);
    }

    @Override // com.google.protobuf.o4
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
