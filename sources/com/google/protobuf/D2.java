package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class D2 extends AbstractC1873b {
    private final L2 defaultInstance;
    protected L2 instance;

    public D2(L2 l2) {
        this.defaultInstance = l2;
        if (!l2.isMutable()) {
            this.instance = newMutableInstance();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
        C1969o4.getInstance().schemaFor((C1969o4) messagetype).mergeFrom(messagetype, messagetype2);
    }

    private L2 newMutableInstance() {
        return this.defaultInstance.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (!this.instance.isMutable()) {
            copyOnWriteInternal();
        }
    }

    public void copyOnWriteInternal() {
        L2 newMutableInstance = newMutableInstance();
        mergeFromInstance(newMutableInstance, this.instance);
        this.instance = newMutableInstance;
    }

    @Override // com.google.protobuf.AbstractC1873b, com.google.protobuf.M3, com.google.protobuf.O3
    public final boolean isInitialized() {
        return L2.isInitialized(this.instance, false);
    }

    @Override // com.google.protobuf.AbstractC1873b, com.google.protobuf.M3
    public final L2 build() {
        L2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC1873b.newUninitializedMessageException(buildPartial);
    }

    @Override // com.google.protobuf.AbstractC1873b, com.google.protobuf.M3
    public L2 buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    @Override // com.google.protobuf.AbstractC1873b, com.google.protobuf.M3
    public final D2 clear() {
        if (!this.defaultInstance.isMutable()) {
            this.instance = newMutableInstance();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.protobuf.AbstractC1873b, com.google.protobuf.M3, com.google.protobuf.O3
    public L2 getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.AbstractC1873b
    public D2 internalMergeFrom(L2 l2) {
        return mergeFrom(l2);
    }

    @Override // com.google.protobuf.AbstractC1873b
    /* renamed from: clone */
    public D2 mo1clone() {
        D2 newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.instance = buildPartial();
        return newBuilderForType;
    }

    public D2 mergeFrom(L2 l2) {
        if (getDefaultInstanceForType().equals(l2)) {
            return this;
        }
        copyOnWrite();
        mergeFromInstance(this.instance, l2);
        return this;
    }

    @Override // com.google.protobuf.AbstractC1873b, com.google.protobuf.M3
    public D2 mergeFrom(byte[] bArr, int i9, int i10, W1 w1) throws C1912g3 {
        copyOnWrite();
        try {
            C1969o4.getInstance().schemaFor((C1969o4) this.instance).mergeFrom(this.instance, bArr, i9, i9 + i10, new C1957n(w1));
            return this;
        } catch (C1912g3 e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw C1912g3.truncatedMessage();
        }
    }

    @Override // com.google.protobuf.AbstractC1873b, com.google.protobuf.M3
    public D2 mergeFrom(byte[] bArr, int i9, int i10) throws C1912g3 {
        return mergeFrom(bArr, i9, i10, W1.getEmptyRegistry());
    }

    @Override // com.google.protobuf.AbstractC1873b, com.google.protobuf.M3
    public D2 mergeFrom(S s5, W1 w1) throws IOException {
        copyOnWrite();
        try {
            C1969o4.getInstance().schemaFor((C1969o4) this.instance).mergeFrom(this.instance, U.forCodedInput(s5), w1);
            return this;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof IOException) {
                throw ((IOException) e4.getCause());
            }
            throw e4;
        }
    }
}
