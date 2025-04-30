package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2004t5 extends AbstractC1990r5 {
    @Override // com.google.protobuf.AbstractC1990r5
    public void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public boolean shouldDiscardUnknownFields(InterfaceC1996s4 interfaceC1996s4) {
        return false;
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void addFixed32(C1997s5 c1997s5, int i9, int i10) {
        c1997s5.storeField(Y5.makeTag(i9, 5), Integer.valueOf(i10));
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void addFixed64(C1997s5 c1997s5, int i9, long j7) {
        c1997s5.storeField(Y5.makeTag(i9, 1), Long.valueOf(j7));
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void addGroup(C1997s5 c1997s5, int i9, C1997s5 c1997s52) {
        c1997s5.storeField(Y5.makeTag(i9, 3), c1997s52);
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void addLengthDelimited(C1997s5 c1997s5, int i9, H h6) {
        c1997s5.storeField(Y5.makeTag(i9, 2), h6);
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void addVarint(C1997s5 c1997s5, int i9, long j7) {
        c1997s5.storeField(Y5.makeTag(i9, 0), Long.valueOf(j7));
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public C1997s5 getBuilderFromMessage(Object obj) {
        C1997s5 fromMessage = getFromMessage(obj);
        if (fromMessage != C1997s5.getDefaultInstance()) {
            return fromMessage;
        }
        C1997s5 newInstance = C1997s5.newInstance();
        setToMessage(obj, newInstance);
        return newInstance;
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public C1997s5 getFromMessage(Object obj) {
        return ((L2) obj).unknownFields;
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public int getSerializedSize(C1997s5 c1997s5) {
        return c1997s5.getSerializedSize();
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public int getSerializedSizeAsMessageSet(C1997s5 c1997s5) {
        return c1997s5.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public C1997s5 merge(C1997s5 c1997s5, C1997s5 c1997s52) {
        if (C1997s5.getDefaultInstance().equals(c1997s52)) {
            return c1997s5;
        }
        if (C1997s5.getDefaultInstance().equals(c1997s5)) {
            return C1997s5.mutableCopyOf(c1997s5, c1997s52);
        }
        return c1997s5.mergeFrom(c1997s52);
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public C1997s5 newBuilder() {
        return C1997s5.newInstance();
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void setBuilderToMessage(Object obj, C1997s5 c1997s5) {
        setToMessage(obj, c1997s5);
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void setToMessage(Object obj, C1997s5 c1997s5) {
        ((L2) obj).unknownFields = c1997s5;
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public C1997s5 toImmutable(C1997s5 c1997s5) {
        c1997s5.makeImmutable();
        return c1997s5;
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void writeAsMessageSetTo(C1997s5 c1997s5, a6 a6Var) throws IOException {
        c1997s5.writeAsMessageSetTo(a6Var);
    }

    @Override // com.google.protobuf.AbstractC1990r5
    public void writeTo(C1997s5 c1997s5, a6 a6Var) throws IOException {
        c1997s5.writeTo(a6Var);
    }
}
