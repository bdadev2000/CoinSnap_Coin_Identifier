package com.google.protobuf;

/* loaded from: classes3.dex */
public abstract class F2 extends D2 implements H2 {
    public F2(GeneratedMessageLite$ExtendableMessage<Object, Object> generatedMessageLite$ExtendableMessage) {
        super(generatedMessageLite$ExtendableMessage);
    }

    private C2001t2 ensureExtensionsAreMutable() {
        C2001t2 c2001t2 = ((GeneratedMessageLite$ExtendableMessage) this.instance).extensions;
        if (c2001t2.isImmutable()) {
            C2001t2 m2clone = c2001t2.m2clone();
            ((GeneratedMessageLite$ExtendableMessage) this.instance).extensions = m2clone;
            return m2clone;
        }
        return c2001t2;
    }

    private void verifyExtensionContainingType(J2 j22) {
        if (j22.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public final <Type> F2 addExtension(S1 s1, Type type) {
        J2 checkIsLite;
        checkIsLite = L2.checkIsLite(s1);
        verifyExtensionContainingType(checkIsLite);
        copyOnWrite();
        ensureExtensionsAreMutable().addRepeatedField(checkIsLite.descriptor, checkIsLite.singularToFieldSetType(type));
        return this;
    }

    public final F2 clearExtension(S1 s1) {
        J2 checkIsLite;
        checkIsLite = L2.checkIsLite(s1);
        verifyExtensionContainingType(checkIsLite);
        copyOnWrite();
        ensureExtensionsAreMutable().clearField(checkIsLite.descriptor);
        return this;
    }

    @Override // com.google.protobuf.D2
    public void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        if (((GeneratedMessageLite$ExtendableMessage) this.instance).extensions != C2001t2.emptySet()) {
            L2 l2 = this.instance;
            ((GeneratedMessageLite$ExtendableMessage) l2).extensions = ((GeneratedMessageLite$ExtendableMessage) l2).extensions.m2clone();
        }
    }

    @Override // com.google.protobuf.H2
    public final <Type> Type getExtension(S1 s1) {
        return (Type) ((GeneratedMessageLite$ExtendableMessage) this.instance).getExtension(s1);
    }

    @Override // com.google.protobuf.H2
    public final <Type> int getExtensionCount(S1 s1) {
        return ((GeneratedMessageLite$ExtendableMessage) this.instance).getExtensionCount(s1);
    }

    @Override // com.google.protobuf.H2
    public final <Type> boolean hasExtension(S1 s1) {
        return ((GeneratedMessageLite$ExtendableMessage) this.instance).hasExtension(s1);
    }

    public void internalSetExtensionSet(C2001t2 c2001t2) {
        copyOnWrite();
        ((GeneratedMessageLite$ExtendableMessage) this.instance).extensions = c2001t2;
    }

    public final <Type> F2 setExtension(S1 s1, Type type) {
        J2 checkIsLite;
        checkIsLite = L2.checkIsLite(s1);
        verifyExtensionContainingType(checkIsLite);
        copyOnWrite();
        ensureExtensionsAreMutable().setField(checkIsLite.descriptor, checkIsLite.toFieldSetType(type));
        return this;
    }

    @Override // com.google.protobuf.H2
    public final <Type> Type getExtension(S1 s1, int i9) {
        return (Type) ((GeneratedMessageLite$ExtendableMessage) this.instance).getExtension(s1, i9);
    }

    @Override // com.google.protobuf.D2, com.google.protobuf.AbstractC1873b, com.google.protobuf.M3
    public final GeneratedMessageLite$ExtendableMessage<Object, Object> buildPartial() {
        if (!((GeneratedMessageLite$ExtendableMessage) this.instance).isMutable()) {
            return (GeneratedMessageLite$ExtendableMessage) this.instance;
        }
        ((GeneratedMessageLite$ExtendableMessage) this.instance).extensions.makeImmutable();
        return (GeneratedMessageLite$ExtendableMessage) super.buildPartial();
    }

    public final <Type> F2 setExtension(S1 s1, int i9, Type type) {
        J2 checkIsLite;
        checkIsLite = L2.checkIsLite(s1);
        verifyExtensionContainingType(checkIsLite);
        copyOnWrite();
        ensureExtensionsAreMutable().setRepeatedField(checkIsLite.descriptor, i9, checkIsLite.singularToFieldSetType(type));
        return this;
    }
}
