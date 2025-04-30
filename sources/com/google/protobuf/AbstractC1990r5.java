package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.r5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1990r5 {
    public abstract void addFixed32(Object obj, int i9, int i10);

    public abstract void addFixed64(Object obj, int i9, long j7);

    public abstract void addGroup(Object obj, int i9, Object obj2);

    public abstract void addLengthDelimited(Object obj, int i9, H h6);

    public abstract void addVarint(Object obj, int i9, long j7);

    public abstract Object getBuilderFromMessage(Object obj);

    public abstract Object getFromMessage(Object obj);

    public abstract int getSerializedSize(Object obj);

    public abstract int getSerializedSizeAsMessageSet(Object obj);

    public abstract void makeImmutable(Object obj);

    public abstract Object merge(Object obj, Object obj2);

    public final void mergeFrom(Object obj, InterfaceC1996s4 interfaceC1996s4) throws IOException {
        U u8;
        do {
            u8 = (U) interfaceC1996s4;
            if (u8.getFieldNumber() == Integer.MAX_VALUE) {
                return;
            }
        } while (mergeOneFieldFrom(obj, u8));
    }

    public final boolean mergeOneFieldFrom(Object obj, InterfaceC1996s4 interfaceC1996s4) throws IOException {
        U u8 = (U) interfaceC1996s4;
        int tag = u8.getTag();
        int tagFieldNumber = Y5.getTagFieldNumber(tag);
        int tagWireType = Y5.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                addFixed32(obj, tagFieldNumber, u8.readFixed32());
                                return true;
                            }
                            throw C1912g3.invalidWireType();
                        }
                        return false;
                    }
                    Object newBuilder = newBuilder();
                    int makeTag = Y5.makeTag(tagFieldNumber, 4);
                    mergeFrom(newBuilder, u8);
                    if (makeTag == u8.getTag()) {
                        addGroup(obj, tagFieldNumber, toImmutable(newBuilder));
                        return true;
                    }
                    throw C1912g3.invalidEndTag();
                }
                addLengthDelimited(obj, tagFieldNumber, u8.readBytes());
                return true;
            }
            addFixed64(obj, tagFieldNumber, u8.readFixed64());
            return true;
        }
        addVarint(obj, tagFieldNumber, u8.readInt64());
        return true;
    }

    public abstract Object newBuilder();

    public abstract void setBuilderToMessage(Object obj, Object obj2);

    public abstract void setToMessage(Object obj, Object obj2);

    public abstract boolean shouldDiscardUnknownFields(InterfaceC1996s4 interfaceC1996s4);

    public abstract Object toImmutable(Object obj);

    public abstract void writeAsMessageSetTo(Object obj, a6 a6Var) throws IOException;

    public abstract void writeTo(Object obj, a6 a6Var) throws IOException;
}
