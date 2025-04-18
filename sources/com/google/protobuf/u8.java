package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class u8 extends s8 {
    @Override // com.google.protobuf.s8
    public void makeImmutable(Object obj) {
        getFromMessage(obj).makeImmutable();
    }

    @Override // com.google.protobuf.s8
    public boolean shouldDiscardUnknownFields(t6 t6Var) {
        return false;
    }

    @Override // com.google.protobuf.s8
    public void addFixed32(t8 t8Var, int i10, int i11) {
        t8Var.storeField(z9.makeTag(i10, 5), Integer.valueOf(i11));
    }

    @Override // com.google.protobuf.s8
    public void addFixed64(t8 t8Var, int i10, long j3) {
        t8Var.storeField(z9.makeTag(i10, 1), Long.valueOf(j3));
    }

    @Override // com.google.protobuf.s8
    public void addGroup(t8 t8Var, int i10, t8 t8Var2) {
        t8Var.storeField(z9.makeTag(i10, 3), t8Var2);
    }

    @Override // com.google.protobuf.s8
    public void addLengthDelimited(t8 t8Var, int i10, h0 h0Var) {
        t8Var.storeField(z9.makeTag(i10, 2), h0Var);
    }

    @Override // com.google.protobuf.s8
    public void addVarint(t8 t8Var, int i10, long j3) {
        t8Var.storeField(z9.makeTag(i10, 0), Long.valueOf(j3));
    }

    @Override // com.google.protobuf.s8
    public t8 getBuilderFromMessage(Object obj) {
        t8 fromMessage = getFromMessage(obj);
        if (fromMessage != t8.getDefaultInstance()) {
            return fromMessage;
        }
        t8 newInstance = t8.newInstance();
        setToMessage(obj, newInstance);
        return newInstance;
    }

    @Override // com.google.protobuf.s8
    public t8 getFromMessage(Object obj) {
        return ((o3) obj).unknownFields;
    }

    @Override // com.google.protobuf.s8
    public int getSerializedSize(t8 t8Var) {
        return t8Var.getSerializedSize();
    }

    @Override // com.google.protobuf.s8
    public int getSerializedSizeAsMessageSet(t8 t8Var) {
        return t8Var.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.protobuf.s8
    public t8 merge(t8 t8Var, t8 t8Var2) {
        if (t8.getDefaultInstance().equals(t8Var2)) {
            return t8Var;
        }
        if (t8.getDefaultInstance().equals(t8Var)) {
            return t8.mutableCopyOf(t8Var, t8Var2);
        }
        return t8Var.mergeFrom(t8Var2);
    }

    @Override // com.google.protobuf.s8
    public t8 newBuilder() {
        return t8.newInstance();
    }

    @Override // com.google.protobuf.s8
    public void setBuilderToMessage(Object obj, t8 t8Var) {
        setToMessage(obj, t8Var);
    }

    @Override // com.google.protobuf.s8
    public void setToMessage(Object obj, t8 t8Var) {
        ((o3) obj).unknownFields = t8Var;
    }

    @Override // com.google.protobuf.s8
    public t8 toImmutable(t8 t8Var) {
        t8Var.makeImmutable();
        return t8Var;
    }

    @Override // com.google.protobuf.s8
    public void writeAsMessageSetTo(t8 t8Var, ba baVar) throws IOException {
        t8Var.writeAsMessageSetTo(baVar);
    }

    @Override // com.google.protobuf.s8
    public void writeTo(t8 t8Var, ba baVar) throws IOException {
        t8Var.writeTo(baVar);
    }
}
