package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class t5 implements z6 {
    private final o5 defaultInstance;
    private final b2 extensionSchema;
    private final boolean hasExtensions;
    private final s8 unknownFieldSchema;

    private t5(s8 s8Var, b2 b2Var, o5 o5Var) {
        this.unknownFieldSchema = s8Var;
        this.hasExtensions = b2Var.hasExtensions(o5Var);
        this.extensionSchema = b2Var;
        this.defaultInstance = o5Var;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(s8 s8Var, Object obj) {
        return s8Var.getSerializedSizeAsMessageSet(s8Var.getFromMessage(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends w2> void mergeFromHelper(s8 s8Var, b2 b2Var, Object obj, t6 t6Var, a2 a2Var) throws IOException {
        t0 t0Var;
        Object builderFromMessage = s8Var.getBuilderFromMessage(obj);
        x2 mutableExtensions = b2Var.getMutableExtensions(obj);
        do {
            try {
                t0Var = (t0) t6Var;
                if (t0Var.getFieldNumber() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                s8Var.setBuilderToMessage(obj, builderFromMessage);
            }
        } while (parseMessageSetItemOrUnknownField(t0Var, a2Var, b2Var, mutableExtensions, s8Var, builderFromMessage));
    }

    public static <T> t5 newSchema(s8 s8Var, b2 b2Var, o5 o5Var) {
        return new t5(s8Var, b2Var, o5Var);
    }

    private <UT, UB, ET extends w2> boolean parseMessageSetItemOrUnknownField(t6 t6Var, a2 a2Var, b2 b2Var, x2 x2Var, s8 s8Var, UB ub2) throws IOException {
        t0 t0Var = (t0) t6Var;
        int tag = t0Var.getTag();
        if (tag != z9.MESSAGE_SET_ITEM_TAG) {
            if (z9.getTagWireType(tag) == 2) {
                Object findExtensionByNumber = b2Var.findExtensionByNumber(a2Var, this.defaultInstance, z9.getTagFieldNumber(tag));
                if (findExtensionByNumber != null) {
                    b2Var.parseLengthPrefixedMessageSetItem(t0Var, findExtensionByNumber, a2Var, x2Var);
                    return true;
                }
                return s8Var.mergeOneFieldFrom(ub2, t0Var);
            }
            return t0Var.skipField();
        }
        Object obj = null;
        int i10 = 0;
        h0 h0Var = null;
        while (t0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = t0Var.getTag();
            if (tag2 == z9.MESSAGE_SET_TYPE_ID_TAG) {
                i10 = t0Var.readUInt32();
                obj = b2Var.findExtensionByNumber(a2Var, this.defaultInstance, i10);
            } else if (tag2 == z9.MESSAGE_SET_MESSAGE_TAG) {
                if (obj != null) {
                    b2Var.parseLengthPrefixedMessageSetItem(t0Var, obj, a2Var, x2Var);
                } else {
                    h0Var = t0Var.readBytes();
                }
            } else if (!t0Var.skipField()) {
                break;
            }
        }
        if (t0Var.getTag() == z9.MESSAGE_SET_ITEM_END_TAG) {
            if (h0Var != null) {
                if (obj != null) {
                    b2Var.parseMessageSetItem(h0Var, obj, a2Var, x2Var);
                } else {
                    s8Var.addLengthDelimited(ub2, i10, h0Var);
                }
            }
            return true;
        }
        throw h4.invalidEndTag();
    }

    private <UT, UB> void writeUnknownFieldsHelper(s8 s8Var, Object obj, ba baVar) throws IOException {
        s8Var.writeAsMessageSetTo(s8Var.getFromMessage(obj), baVar);
    }

    @Override // com.google.protobuf.z6
    public boolean equals(Object obj, Object obj2) {
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.z6
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj) + 0;
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.z6
    public int hashCode(Object obj) {
        int hashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode();
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.z6
    public final boolean isInitialized(Object obj) {
        return this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // com.google.protobuf.z6
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    @Override // com.google.protobuf.z6
    public void mergeFrom(Object obj, Object obj2) {
        b7.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            b7.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // com.google.protobuf.z6
    public Object newInstance() {
        o5 o5Var = this.defaultInstance;
        if (o5Var instanceof o3) {
            return ((o3) o5Var).newMutableInstance();
        }
        return ((h3) o5Var.newBuilderForType()).buildPartial();
    }

    @Override // com.google.protobuf.z6
    public void writeTo(Object obj, ba baVar) throws IOException {
        Iterator<Map.Entry<w2, Object>> it = this.extensionSchema.getExtensions(obj).iterator();
        while (it.hasNext()) {
            Map.Entry<w2, Object> next = it.next();
            l3 l3Var = (l3) next.getKey();
            if (l3Var.getLiteJavaType() == u9.MESSAGE && !l3Var.isRepeated() && !l3Var.isPacked()) {
                if (next instanceof l4) {
                    ((f1) baVar).writeMessageSetItem(l3Var.getNumber(), ((l4) next).getField().toByteString());
                } else {
                    ((f1) baVar).writeMessageSetItem(l3Var.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, obj, baVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[EDGE_INSN: B:24:0x00cb->B:25:0x00cb BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // com.google.protobuf.z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.protobuf.n r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.o3 r0 = (com.google.protobuf.o3) r0
            com.google.protobuf.t8 r1 = r0.unknownFields
            com.google.protobuf.t8 r2 = com.google.protobuf.t8.getDefaultInstance()
            if (r1 != r2) goto L11
            com.google.protobuf.t8 r1 = com.google.protobuf.t8.newInstance()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite$ExtendableMessage) r11
            com.google.protobuf.x2 r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.o.decodeVarint32(r12, r13, r15)
            int r13 = r15.int1
            int r3 = com.google.protobuf.z9.MESSAGE_SET_ITEM_TAG
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.z9.getTagWireType(r13)
            if (r3 != r5) goto L66
            com.google.protobuf.b2 r2 = r10.extensionSchema
            com.google.protobuf.a2 r3 = r15.extensionRegistry
            com.google.protobuf.o5 r5 = r10.defaultInstance
            int r6 = com.google.protobuf.z9.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.findExtensionByNumber(r3, r5, r6)
            r8 = r2
            com.google.protobuf.m3 r8 = (com.google.protobuf.m3) r8
            if (r8 == 0) goto L5b
            com.google.protobuf.p6 r13 = com.google.protobuf.p6.getInstance()
            com.google.protobuf.o5 r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.z6 r13 = r13.schemaFor(r2)
            int r13 = com.google.protobuf.o.decodeMessageField(r13, r12, r4, r14, r15)
            com.google.protobuf.l3 r2 = r8.descriptor
            java.lang.Object r3 = r15.object1
            r11.setField(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.o.decodeUnknownField(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.protobuf.o.skipField(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.o.decodeVarint32(r12, r4, r15)
            int r6 = r15.int1
            int r7 = com.google.protobuf.z9.getTagFieldNumber(r6)
            int r8 = com.google.protobuf.z9.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.protobuf.p6 r6 = com.google.protobuf.p6.getInstance()
            com.google.protobuf.o5 r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.z6 r6 = r6.schemaFor(r7)
            int r4 = com.google.protobuf.o.decodeMessageField(r6, r12, r4, r14, r15)
            com.google.protobuf.l3 r6 = r2.descriptor
            java.lang.Object r7 = r15.object1
            r11.setField(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.o.decodeBytes(r12, r4, r15)
            java.lang.Object r3 = r15.object1
            com.google.protobuf.h0 r3 = (com.google.protobuf.h0) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.o.decodeVarint32(r12, r4, r15)
            int r13 = r15.int1
            com.google.protobuf.b2 r2 = r10.extensionSchema
            com.google.protobuf.a2 r6 = r15.extensionRegistry
            com.google.protobuf.o5 r7 = r10.defaultInstance
            java.lang.Object r2 = r2.findExtensionByNumber(r6, r7, r13)
            com.google.protobuf.m3 r2 = (com.google.protobuf.m3) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.z9.MESSAGE_SET_ITEM_END_TAG
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.o.skipField(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.z9.makeTag(r13, r5)
            r1.storeField(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.protobuf.h4 r11 = com.google.protobuf.h4.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t5.mergeFrom(java.lang.Object, byte[], int, int, com.google.protobuf.n):void");
    }

    @Override // com.google.protobuf.z6
    public void mergeFrom(Object obj, t6 t6Var, a2 a2Var) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, t6Var, a2Var);
    }
}
