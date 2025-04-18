package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class s8 {
    public abstract void addFixed32(Object obj, int i10, int i11);

    public abstract void addFixed64(Object obj, int i10, long j3);

    public abstract void addGroup(Object obj, int i10, Object obj2);

    public abstract void addLengthDelimited(Object obj, int i10, h0 h0Var);

    public abstract void addVarint(Object obj, int i10, long j3);

    public abstract Object getBuilderFromMessage(Object obj);

    public abstract Object getFromMessage(Object obj);

    public abstract int getSerializedSize(Object obj);

    public abstract int getSerializedSizeAsMessageSet(Object obj);

    public abstract void makeImmutable(Object obj);

    public abstract Object merge(Object obj, Object obj2);

    public final void mergeFrom(Object obj, t6 t6Var) throws IOException {
        t0 t0Var;
        do {
            t0Var = (t0) t6Var;
            if (t0Var.getFieldNumber() == Integer.MAX_VALUE) {
                return;
            }
        } while (mergeOneFieldFrom(obj, t0Var));
    }

    public final boolean mergeOneFieldFrom(Object obj, t6 t6Var) throws IOException {
        t0 t0Var = (t0) t6Var;
        int tag = t0Var.getTag();
        int tagFieldNumber = z9.getTagFieldNumber(tag);
        int tagWireType = z9.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                addFixed32(obj, tagFieldNumber, t0Var.readFixed32());
                                return true;
                            }
                            throw h4.invalidWireType();
                        }
                        return false;
                    }
                    Object newBuilder = newBuilder();
                    int makeTag = z9.makeTag(tagFieldNumber, 4);
                    mergeFrom(newBuilder, t0Var);
                    if (makeTag == t0Var.getTag()) {
                        addGroup(obj, tagFieldNumber, toImmutable(newBuilder));
                        return true;
                    }
                    throw h4.invalidEndTag();
                }
                addLengthDelimited(obj, tagFieldNumber, t0Var.readBytes());
                return true;
            }
            addFixed64(obj, tagFieldNumber, t0Var.readFixed64());
            return true;
        }
        addVarint(obj, tagFieldNumber, t0Var.readInt64());
        return true;
    }

    public abstract Object newBuilder();

    public abstract void setBuilderToMessage(Object obj, Object obj2);

    public abstract void setToMessage(Object obj, Object obj2);

    public abstract boolean shouldDiscardUnknownFields(t6 t6Var);

    public abstract Object toImmutable(Object obj);

    public abstract void writeAsMessageSetTo(Object obj, ba baVar) throws IOException;

    public abstract void writeTo(Object obj, ba baVar) throws IOException;
}
