package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1880c implements N3 {
    protected int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC1873b.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(H h6) throws IllegalArgumentException {
        if (h6.isValidUtf8()) {
        } else {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.N3, com.google.protobuf.O3
    public abstract /* synthetic */ N3 getDefaultInstanceForType();

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.N3
    public abstract /* synthetic */ InterfaceC1948l4 getParserForType();

    @Override // com.google.protobuf.N3
    public abstract /* synthetic */ int getSerializedSize();

    public int getSerializedSize(InterfaceC2038y4 interfaceC2038y4) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = interfaceC2038y4.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // com.google.protobuf.N3, com.google.protobuf.O3
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.N3
    public abstract /* synthetic */ M3 newBuilderForType();

    public C1984q5 newUninitializedMessageException() {
        return new C1984q5(this);
    }

    public void setMemoizedSerializedSize(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.N3
    public abstract /* synthetic */ M3 toBuilder();

    @Override // com.google.protobuf.N3
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC1895e0 newInstance = AbstractC1895e0.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e4);
        }
    }

    @Override // com.google.protobuf.N3
    public H toByteString() {
        try {
            C newCodedBuilder = H.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (IOException e4) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e4);
        }
    }

    @Override // com.google.protobuf.N3
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        AbstractC1895e0 newInstance = AbstractC1895e0.newInstance(outputStream, AbstractC1895e0.computePreferredBufferSize(AbstractC1895e0.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        newInstance.writeUInt32NoTag(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // com.google.protobuf.N3
    public abstract /* synthetic */ void writeTo(AbstractC1895e0 abstractC1895e0) throws IOException;

    @Override // com.google.protobuf.N3
    public void writeTo(OutputStream outputStream) throws IOException {
        AbstractC1895e0 newInstance = AbstractC1895e0.newInstance(outputStream, AbstractC1895e0.computePreferredBufferSize(getSerializedSize()));
        writeTo(newInstance);
        newInstance.flush();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC1873b.addAll((Iterable) iterable, (List) list);
    }
}
