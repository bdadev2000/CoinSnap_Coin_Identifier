package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class h3 extends b {
    private final o3 defaultInstance;
    protected o3 instance;

    public h3(o3 o3Var) {
        this.defaultInstance = o3Var;
        if (!o3Var.isMutable()) {
            this.instance = newMutableInstance();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
        p6.getInstance().schemaFor((p6) messagetype).mergeFrom(messagetype, messagetype2);
    }

    private o3 newMutableInstance() {
        return this.defaultInstance.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (!this.instance.isMutable()) {
            copyOnWriteInternal();
        }
    }

    public void copyOnWriteInternal() {
        o3 newMutableInstance = newMutableInstance();
        mergeFromInstance(newMutableInstance, this.instance);
        this.instance = newMutableInstance;
    }

    @Override // com.google.protobuf.b, com.google.protobuf.n5, com.google.protobuf.p5
    public final boolean isInitialized() {
        return o3.isInitialized(this.instance, false);
    }

    @Override // com.google.protobuf.b, com.google.protobuf.n5
    public final o3 build() {
        o3 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw b.newUninitializedMessageException(buildPartial);
    }

    @Override // com.google.protobuf.b, com.google.protobuf.n5
    public o3 buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    @Override // com.google.protobuf.b, com.google.protobuf.n5
    public final h3 clear() {
        if (!this.defaultInstance.isMutable()) {
            this.instance = newMutableInstance();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.protobuf.b, com.google.protobuf.n5, com.google.protobuf.p5, com.google.protobuf.k3
    public o3 getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.b
    public h3 internalMergeFrom(o3 o3Var) {
        return mergeFrom(o3Var);
    }

    @Override // com.google.protobuf.b
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public h3 mo4clone() {
        h3 newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.instance = buildPartial();
        return newBuilderForType;
    }

    public h3 mergeFrom(o3 o3Var) {
        if (getDefaultInstanceForType().equals(o3Var)) {
            return this;
        }
        copyOnWrite();
        mergeFromInstance(this.instance, o3Var);
        return this;
    }

    @Override // com.google.protobuf.b, com.google.protobuf.n5
    public h3 mergeFrom(byte[] bArr, int i10, int i11, a2 a2Var) throws h4 {
        copyOnWrite();
        try {
            p6.getInstance().schemaFor((p6) this.instance).mergeFrom(this.instance, bArr, i10, i10 + i11, new n(a2Var));
            return this;
        } catch (h4 e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw h4.truncatedMessage();
        }
    }

    @Override // com.google.protobuf.b, com.google.protobuf.n5
    public h3 mergeFrom(byte[] bArr, int i10, int i11) throws h4 {
        return mergeFrom(bArr, i10, i11, a2.getEmptyRegistry());
    }

    @Override // com.google.protobuf.b, com.google.protobuf.n5
    public h3 mergeFrom(r0 r0Var, a2 a2Var) throws IOException {
        copyOnWrite();
        try {
            p6.getInstance().schemaFor((p6) this.instance).mergeFrom(this.instance, t0.forCodedInput(r0Var), a2Var);
            return this;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw e2;
        }
    }
}
