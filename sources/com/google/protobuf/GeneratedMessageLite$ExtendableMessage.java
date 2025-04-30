package com.google.protobuf;

import com.google.protobuf.F2;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType extends F2> extends L2 implements H2 {
    protected C2001t2 extensions = C2001t2.emptySet();

    private void eagerlyMergeMessageSetExtension(S s5, J2 j22, W1 w1, int i9) throws IOException {
        parseExtension(s5, w1, j22, Y5.makeTag(i9, 2), i9);
    }

    private void mergeMessageSetExtensionFromBytes(H h6, W1 w1, J2 j22) throws IOException {
        M3 m32;
        N3 n32 = (N3) this.extensions.getField(j22.descriptor);
        if (n32 != null) {
            m32 = n32.toBuilder();
        } else {
            m32 = null;
        }
        if (m32 == null) {
            m32 = j22.getMessageDefaultInstance().newBuilderForType();
        }
        AbstractC1873b abstractC1873b = (AbstractC1873b) m32;
        abstractC1873b.mergeFrom(h6, w1);
        ensureExtensionsAreMutable().setField(j22.descriptor, j22.singularToFieldSetType(((D2) abstractC1873b).build()));
    }

    private <MessageType extends N3> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, S s5, W1 w1) throws IOException {
        int i9 = 0;
        H h6 = null;
        J2 j22 = null;
        while (true) {
            int readTag = s5.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == Y5.MESSAGE_SET_TYPE_ID_TAG) {
                i9 = s5.readUInt32();
                if (i9 != 0) {
                    j22 = w1.findLiteExtensionByNumber(messagetype, i9);
                }
            } else if (readTag == Y5.MESSAGE_SET_MESSAGE_TAG) {
                if (i9 != 0 && j22 != null) {
                    eagerlyMergeMessageSetExtension(s5, j22, w1, i9);
                    h6 = null;
                } else {
                    h6 = s5.readBytes();
                }
            } else if (!s5.skipField(readTag)) {
                break;
            }
        }
        s5.checkLastTagWas(Y5.MESSAGE_SET_ITEM_END_TAG);
        if (h6 != null && i9 != 0) {
            if (j22 != null) {
                mergeMessageSetExtensionFromBytes(h6, w1, j22);
            } else {
                mergeLengthDelimitedField(i9, h6);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean parseExtension(com.google.protobuf.S r6, com.google.protobuf.W1 r7, com.google.protobuf.J2 r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite$ExtendableMessage.parseExtension(com.google.protobuf.S, com.google.protobuf.W1, com.google.protobuf.J2, int, int):boolean");
    }

    private void verifyExtensionContainingType(J2 j22) {
        if (j22.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public C2001t2 ensureExtensionsAreMutable() {
        if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.m2clone();
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

    @Override // com.google.protobuf.L2, com.google.protobuf.AbstractC1880c, com.google.protobuf.N3, com.google.protobuf.O3
    public /* bridge */ /* synthetic */ N3 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.H2
    public final <Type> Type getExtension(S1 s1) {
        J2 checkIsLite;
        checkIsLite = L2.checkIsLite(s1);
        verifyExtensionContainingType(checkIsLite);
        Object field = this.extensions.getField(checkIsLite.descriptor);
        if (field == null) {
            return (Type) checkIsLite.defaultValue;
        }
        return (Type) checkIsLite.fromFieldSetType(field);
    }

    @Override // com.google.protobuf.H2
    public final <Type> int getExtensionCount(S1 s1) {
        J2 checkIsLite;
        checkIsLite = L2.checkIsLite(s1);
        verifyExtensionContainingType(checkIsLite);
        return this.extensions.getRepeatedFieldCount(checkIsLite.descriptor);
    }

    @Override // com.google.protobuf.H2
    public final <Type> boolean hasExtension(S1 s1) {
        J2 checkIsLite;
        checkIsLite = L2.checkIsLite(s1);
        verifyExtensionContainingType(checkIsLite);
        return this.extensions.hasField(checkIsLite.descriptor);
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.m2clone();
        }
        this.extensions.mergeFrom(messagetype.extensions);
    }

    @Override // com.google.protobuf.L2, com.google.protobuf.AbstractC1880c, com.google.protobuf.N3
    public /* bridge */ /* synthetic */ M3 newBuilderForType() {
        return newBuilderForType();
    }

    public G2 newExtensionWriter() {
        return new G2(this, false, null);
    }

    public G2 newMessageSetExtensionWriter() {
        return new G2(this, true, null);
    }

    public <MessageType extends N3> boolean parseUnknownField(MessageType messagetype, S s5, W1 w1, int i9) throws IOException {
        int tagFieldNumber = Y5.getTagFieldNumber(i9);
        return parseExtension(s5, w1, w1.findLiteExtensionByNumber(messagetype, tagFieldNumber), i9, tagFieldNumber);
    }

    public <MessageType extends N3> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, S s5, W1 w1, int i9) throws IOException {
        if (i9 == Y5.MESSAGE_SET_ITEM_TAG) {
            mergeMessageSetExtensionFromCodedStream(messagetype, s5, w1);
            return true;
        }
        if (Y5.getTagWireType(i9) == 2) {
            return parseUnknownField(messagetype, s5, w1, i9);
        }
        return s5.skipField(i9);
    }

    @Override // com.google.protobuf.L2, com.google.protobuf.AbstractC1880c, com.google.protobuf.N3
    public /* bridge */ /* synthetic */ M3 toBuilder() {
        return toBuilder();
    }

    @Override // com.google.protobuf.H2
    public final <Type> Type getExtension(S1 s1, int i9) {
        J2 checkIsLite;
        checkIsLite = L2.checkIsLite(s1);
        verifyExtensionContainingType(checkIsLite);
        return (Type) checkIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(checkIsLite.descriptor, i9));
    }
}
