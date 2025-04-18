package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class c implements o5 {
    protected int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        b.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(h0 h0Var) throws IllegalArgumentException {
        if (h0Var.isValidUtf8()) {
        } else {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.o5, com.google.protobuf.p5, com.google.protobuf.k3
    public abstract /* synthetic */ o5 getDefaultInstanceForType();

    int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.o5
    public abstract /* synthetic */ m6 getParserForType();

    @Override // com.google.protobuf.o5
    public abstract /* synthetic */ int getSerializedSize();

    public int getSerializedSize(z6 z6Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = z6Var.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // com.google.protobuf.o5, com.google.protobuf.p5
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.o5
    public abstract /* synthetic */ n5 newBuilderForType();

    public r8 newUninitializedMessageException() {
        return new r8(this);
    }

    void setMemoizedSerializedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.o5
    public abstract /* synthetic */ n5 toBuilder();

    @Override // com.google.protobuf.o5
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            d1 newInstance = d1.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e2);
        }
    }

    @Override // com.google.protobuf.o5
    public h0 toByteString() {
        try {
            c0 newCodedBuilder = h0.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (IOException e2) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // com.google.protobuf.o5
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        d1 newInstance = d1.newInstance(outputStream, d1.computePreferredBufferSize(d1.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        newInstance.writeUInt32NoTag(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // com.google.protobuf.o5
    public abstract /* synthetic */ void writeTo(d1 d1Var) throws IOException;

    @Override // com.google.protobuf.o5
    public void writeTo(OutputStream outputStream) throws IOException {
        d1 newInstance = d1.newInstance(outputStream, d1.computePreferredBufferSize(getSerializedSize()));
        writeTo(newInstance);
        newInstance.flush();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        b.addAll((Iterable) iterable, (List) list);
    }
}
