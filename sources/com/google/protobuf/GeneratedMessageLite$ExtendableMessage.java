package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends o3 implements k3 {
    protected x2 extensions = x2.emptySet();

    private void eagerlyMergeMessageSetExtension(r0 r0Var, m3 m3Var, a2 a2Var, int i10) throws IOException {
        parseExtension(r0Var, a2Var, m3Var, z9.makeTag(i10, 2), i10);
    }

    private void mergeMessageSetExtensionFromBytes(h0 h0Var, a2 a2Var, m3 m3Var) throws IOException {
        n5 n5Var;
        o5 o5Var = (o5) this.extensions.getField(m3Var.descriptor);
        if (o5Var != null) {
            n5Var = o5Var.toBuilder();
        } else {
            n5Var = null;
        }
        if (n5Var == null) {
            n5Var = m3Var.getMessageDefaultInstance().newBuilderForType();
        }
        b bVar = (b) n5Var;
        bVar.mergeFrom(h0Var, a2Var);
        ensureExtensionsAreMutable().setField(m3Var.descriptor, m3Var.singularToFieldSetType(((h3) bVar).build()));
    }

    private <MessageType extends o5> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, r0 r0Var, a2 a2Var) throws IOException {
        int i10 = 0;
        h0 h0Var = null;
        m3 m3Var = null;
        while (true) {
            int readTag = r0Var.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == z9.MESSAGE_SET_TYPE_ID_TAG) {
                i10 = r0Var.readUInt32();
                if (i10 != 0) {
                    m3Var = a2Var.findLiteExtensionByNumber(messagetype, i10);
                }
            } else if (readTag == z9.MESSAGE_SET_MESSAGE_TAG) {
                if (i10 != 0 && m3Var != null) {
                    eagerlyMergeMessageSetExtension(r0Var, m3Var, a2Var, i10);
                    h0Var = null;
                } else {
                    h0Var = r0Var.readBytes();
                }
            } else if (!r0Var.skipField(readTag)) {
                break;
            }
        }
        r0Var.checkLastTagWas(z9.MESSAGE_SET_ITEM_END_TAG);
        if (h0Var != null && i10 != 0) {
            if (m3Var != null) {
                mergeMessageSetExtensionFromBytes(h0Var, a2Var, m3Var);
            } else {
                mergeLengthDelimitedField(i10, h0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean parseExtension(com.google.protobuf.r0 r6, com.google.protobuf.a2 r7, com.google.protobuf.m3 r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite$ExtendableMessage.parseExtension(com.google.protobuf.r0, com.google.protobuf.a2, com.google.protobuf.m3, int, int):boolean");
    }

    private void verifyExtensionContainingType(m3 m3Var) {
        if (m3Var.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public x2 ensureExtensionsAreMutable() {
        if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.m5clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.isInitialized();
    }

    public int extensionsSerializedSize() {
        return this.extensions.getSerializedSize();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.getMessageSetSerializedSize();
    }

    @Override // com.google.protobuf.o3, com.google.protobuf.c, com.google.protobuf.o5, com.google.protobuf.p5, com.google.protobuf.k3
    public /* bridge */ /* synthetic */ o5 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.k3
    public final <Type> Type getExtension(w1 w1Var) {
        m3 access$000 = o3.access$000(w1Var);
        verifyExtensionContainingType(access$000);
        Object field = this.extensions.getField(access$000.descriptor);
        if (field == null) {
            return (Type) access$000.defaultValue;
        }
        return (Type) access$000.fromFieldSetType(field);
    }

    @Override // com.google.protobuf.k3
    public final <Type> int getExtensionCount(w1 w1Var) {
        m3 access$000 = o3.access$000(w1Var);
        verifyExtensionContainingType(access$000);
        return this.extensions.getRepeatedFieldCount(access$000.descriptor);
    }

    @Override // com.google.protobuf.k3
    public final <Type> boolean hasExtension(w1 w1Var) {
        m3 access$000 = o3.access$000(w1Var);
        verifyExtensionContainingType(access$000);
        return this.extensions.hasField(access$000.descriptor);
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.m5clone();
        }
        this.extensions.mergeFrom(messagetype.extensions);
    }

    @Override // com.google.protobuf.o3, com.google.protobuf.c, com.google.protobuf.o5
    public /* bridge */ /* synthetic */ n5 newBuilderForType() {
        return super.newBuilderForType();
    }

    public j3 newExtensionWriter() {
        return new j3(this, false, null);
    }

    public j3 newMessageSetExtensionWriter() {
        return new j3(this, true, null);
    }

    public <MessageType extends o5> boolean parseUnknownField(MessageType messagetype, r0 r0Var, a2 a2Var, int i10) throws IOException {
        int tagFieldNumber = z9.getTagFieldNumber(i10);
        return parseExtension(r0Var, a2Var, a2Var.findLiteExtensionByNumber(messagetype, tagFieldNumber), i10, tagFieldNumber);
    }

    public <MessageType extends o5> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, r0 r0Var, a2 a2Var, int i10) throws IOException {
        if (i10 == z9.MESSAGE_SET_ITEM_TAG) {
            mergeMessageSetExtensionFromCodedStream(messagetype, r0Var, a2Var);
            return true;
        }
        if (z9.getTagWireType(i10) == 2) {
            return parseUnknownField(messagetype, r0Var, a2Var, i10);
        }
        return r0Var.skipField(i10);
    }

    @Override // com.google.protobuf.o3, com.google.protobuf.c, com.google.protobuf.o5
    public /* bridge */ /* synthetic */ n5 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.k3
    public final <Type> Type getExtension(w1 w1Var, int i10) {
        m3 access$000 = o3.access$000(w1Var);
        verifyExtensionContainingType(access$000);
        return (Type) access$000.singularFromFieldSetType(this.extensions.getRepeatedField(access$000.descriptor, i10));
    }
}
