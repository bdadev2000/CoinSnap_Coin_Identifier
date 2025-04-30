package com.google.protobuf;

/* renamed from: com.google.protobuf.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1954m3 extends C1961n3 {
    private final N3 defaultInstance;

    public C1954m3(N3 n32, W1 w1, H h6) {
        super(w1, h6);
        this.defaultInstance = n32;
    }

    @Override // com.google.protobuf.C1961n3
    public boolean containsDefaultInstance() {
        if (!super.containsDefaultInstance() && this.value != this.defaultInstance) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.C1961n3
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public N3 getValue() {
        return getValue(this.defaultInstance);
    }

    @Override // com.google.protobuf.C1961n3
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
