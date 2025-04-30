package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class S3 implements InterfaceC2038y4 {
    private final N3 defaultInstance;
    private final X1 extensionSchema;
    private final boolean hasExtensions;
    private final AbstractC1990r5 unknownFieldSchema;

    private S3(AbstractC1990r5 abstractC1990r5, X1 x12, N3 n32) {
        this.unknownFieldSchema = abstractC1990r5;
        this.hasExtensions = x12.hasExtensions(n32);
        this.extensionSchema = x12;
        this.defaultInstance = n32;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(AbstractC1990r5 abstractC1990r5, Object obj) {
        return abstractC1990r5.getSerializedSizeAsMessageSet(abstractC1990r5.getFromMessage(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends InterfaceC1994s2> void mergeFromHelper(AbstractC1990r5 abstractC1990r5, X1 x12, Object obj, InterfaceC1996s4 interfaceC1996s4, W1 w1) throws IOException {
        U u8;
        Object builderFromMessage = abstractC1990r5.getBuilderFromMessage(obj);
        C2001t2 mutableExtensions = x12.getMutableExtensions(obj);
        do {
            try {
                u8 = (U) interfaceC1996s4;
                if (u8.getFieldNumber() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC1990r5.setBuilderToMessage(obj, builderFromMessage);
            }
        } while (parseMessageSetItemOrUnknownField(u8, w1, x12, mutableExtensions, abstractC1990r5, builderFromMessage));
    }

    public static <T> S3 newSchema(AbstractC1990r5 abstractC1990r5, X1 x12, N3 n32) {
        return new S3(abstractC1990r5, x12, n32);
    }

    private <UT, UB, ET extends InterfaceC1994s2> boolean parseMessageSetItemOrUnknownField(InterfaceC1996s4 interfaceC1996s4, W1 w1, X1 x12, C2001t2 c2001t2, AbstractC1990r5 abstractC1990r5, UB ub) throws IOException {
        U u8 = (U) interfaceC1996s4;
        int tag = u8.getTag();
        if (tag != Y5.MESSAGE_SET_ITEM_TAG) {
            if (Y5.getTagWireType(tag) == 2) {
                Object findExtensionByNumber = x12.findExtensionByNumber(w1, this.defaultInstance, Y5.getTagFieldNumber(tag));
                if (findExtensionByNumber != null) {
                    x12.parseLengthPrefixedMessageSetItem(u8, findExtensionByNumber, w1, c2001t2);
                    return true;
                }
                return abstractC1990r5.mergeOneFieldFrom(ub, u8);
            }
            return u8.skipField();
        }
        Object obj = null;
        int i9 = 0;
        H h6 = null;
        while (u8.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = u8.getTag();
            if (tag2 == Y5.MESSAGE_SET_TYPE_ID_TAG) {
                i9 = u8.readUInt32();
                obj = x12.findExtensionByNumber(w1, this.defaultInstance, i9);
            } else if (tag2 == Y5.MESSAGE_SET_MESSAGE_TAG) {
                if (obj != null) {
                    x12.parseLengthPrefixedMessageSetItem(u8, obj, w1, c2001t2);
                } else {
                    h6 = u8.readBytes();
                }
            } else if (!u8.skipField()) {
                break;
            }
        }
        if (u8.getTag() == Y5.MESSAGE_SET_ITEM_END_TAG) {
            if (h6 != null) {
                if (obj != null) {
                    x12.parseMessageSetItem(h6, obj, w1, c2001t2);
                } else {
                    abstractC1990r5.addLengthDelimited(ub, i9, h6);
                }
            }
            return true;
        }
        throw C1912g3.invalidEndTag();
    }

    private <UT, UB> void writeUnknownFieldsHelper(AbstractC1990r5 abstractC1990r5, Object obj, a6 a6Var) throws IOException {
        abstractC1990r5.writeAsMessageSetTo(abstractC1990r5.getFromMessage(obj), a6Var);
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public boolean equals(Object obj, Object obj2) {
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public int hashCode(Object obj) {
        int hashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode();
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public final boolean isInitialized(Object obj) {
        return this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void mergeFrom(Object obj, Object obj2) {
        A4.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            A4.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public Object newInstance() {
        N3 n32 = this.defaultInstance;
        if (n32 instanceof L2) {
            return ((L2) n32).newMutableInstance();
        }
        return n32.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void writeTo(Object obj, a6 a6Var) throws IOException {
        Iterator<Map.Entry<InterfaceC1994s2, Object>> it = this.extensionSchema.getExtensions(obj).iterator();
        while (it.hasNext()) {
            Map.Entry<InterfaceC1994s2, Object> next = it.next();
            I2 i22 = (I2) next.getKey();
            if (i22.getLiteJavaType() == T5.MESSAGE && !i22.isRepeated() && !i22.isPacked()) {
                if (next instanceof C1940k3) {
                    ((C1909g0) a6Var).writeMessageSetItem(i22.getNumber(), ((C1940k3) next).getField().toByteString());
                } else {
                    ((C1909g0) a6Var).writeMessageSetItem(i22.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, obj, a6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[EDGE_INSN: B:24:0x00cb->B:25:0x00cb BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC2038y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.protobuf.C1957n r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.L2 r0 = (com.google.protobuf.L2) r0
            com.google.protobuf.s5 r1 = r0.unknownFields
            com.google.protobuf.s5 r2 = com.google.protobuf.C1997s5.getDefaultInstance()
            if (r1 != r2) goto L11
            com.google.protobuf.s5 r1 = com.google.protobuf.C1997s5.newInstance()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite$ExtendableMessage) r11
            com.google.protobuf.t2 r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.C1964o.decodeVarint32(r12, r13, r15)
            int r13 = r15.int1
            int r3 = com.google.protobuf.Y5.MESSAGE_SET_ITEM_TAG
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.Y5.getTagWireType(r13)
            if (r3 != r5) goto L66
            com.google.protobuf.X1 r2 = r10.extensionSchema
            com.google.protobuf.W1 r3 = r15.extensionRegistry
            com.google.protobuf.N3 r5 = r10.defaultInstance
            int r6 = com.google.protobuf.Y5.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.findExtensionByNumber(r3, r5, r6)
            r8 = r2
            com.google.protobuf.J2 r8 = (com.google.protobuf.J2) r8
            if (r8 == 0) goto L5c
            com.google.protobuf.o4 r13 = com.google.protobuf.C1969o4.getInstance()
            com.google.protobuf.N3 r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.y4 r13 = r13.schemaFor(r2)
            int r13 = com.google.protobuf.C1964o.decodeMessageField(r13, r12, r4, r14, r15)
            com.google.protobuf.I2 r2 = r8.descriptor
            java.lang.Object r3 = r15.object1
            r11.setField(r2, r3)
        L5a:
            r2 = r8
            goto L19
        L5c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.C1964o.decodeUnknownField(r2, r3, r4, r5, r6, r7)
            goto L5a
        L66:
            int r13 = com.google.protobuf.C1964o.skipField(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.C1964o.decodeVarint32(r12, r4, r15)
            int r6 = r15.int1
            int r7 = com.google.protobuf.Y5.getTagFieldNumber(r6)
            int r8 = com.google.protobuf.Y5.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.protobuf.o4 r6 = com.google.protobuf.C1969o4.getInstance()
            com.google.protobuf.N3 r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.y4 r6 = r6.schemaFor(r7)
            int r4 = com.google.protobuf.C1964o.decodeMessageField(r6, r12, r4, r14, r15)
            com.google.protobuf.I2 r6 = r2.descriptor
            java.lang.Object r7 = r15.object1
            r11.setField(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.C1964o.decodeBytes(r12, r4, r15)
            java.lang.Object r3 = r15.object1
            com.google.protobuf.H r3 = (com.google.protobuf.H) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.C1964o.decodeVarint32(r12, r4, r15)
            int r13 = r15.int1
            com.google.protobuf.X1 r2 = r10.extensionSchema
            com.google.protobuf.W1 r6 = r15.extensionRegistry
            com.google.protobuf.N3 r7 = r10.defaultInstance
            java.lang.Object r2 = r2.findExtensionByNumber(r6, r7, r13)
            com.google.protobuf.J2 r2 = (com.google.protobuf.J2) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.Y5.MESSAGE_SET_ITEM_END_TAG
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.C1964o.skipField(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.Y5.makeTag(r13, r5)
            r1.storeField(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.protobuf.g3 r11 = com.google.protobuf.C1912g3.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.S3.mergeFrom(java.lang.Object, byte[], int, int, com.google.protobuf.n):void");
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void mergeFrom(Object obj, InterfaceC1996s4 interfaceC1996s4, W1 w1) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, interfaceC1996s4, w1);
    }
}
