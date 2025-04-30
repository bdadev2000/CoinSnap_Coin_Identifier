package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1887d implements InterfaceC1948l4 {
    private static final W1 EMPTY_REGISTRY = W1.getEmptyRegistry();

    private N3 checkMessageInitialized(N3 n32) throws C1912g3 {
        if (n32 != null && !n32.isInitialized()) {
            throw newUninitializedMessageException(n32).asInvalidProtocolBufferException().setUnfinishedMessage(n32);
        }
        return n32;
    }

    private C1984q5 newUninitializedMessageException(N3 n32) {
        if (n32 instanceof AbstractC1880c) {
            return ((AbstractC1880c) n32).newUninitializedMessageException();
        }
        return new C1984q5(n32);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public abstract /* synthetic */ Object parsePartialFrom(S s5, W1 w1) throws C1912g3;

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseDelimitedFrom(InputStream inputStream, W1 w1) throws C1912g3 {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, w1));
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialDelimitedFrom(InputStream inputStream, W1 w1) throws C1912g3 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new C1866a(inputStream, S.readRawVarint32(read, inputStream)), w1);
        } catch (IOException e4) {
            throw new C1912g3(e4);
        }
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseDelimitedFrom(InputStream inputStream) throws C1912g3 {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialDelimitedFrom(InputStream inputStream) throws C1912g3 {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(S s5) throws C1912g3 {
        return (N3) parsePartialFrom(s5, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(H h6, W1 w1) throws C1912g3 {
        S newCodedInput = h6.newCodedInput();
        N3 n32 = (N3) parsePartialFrom(newCodedInput, w1);
        try {
            newCodedInput.checkLastTagWas(0);
            return n32;
        } catch (C1912g3 e4) {
            throw e4.setUnfinishedMessage(n32);
        }
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(S s5, W1 w1) throws C1912g3 {
        return checkMessageInitialized((N3) parsePartialFrom(s5, w1));
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(S s5) throws C1912g3 {
        return parseFrom(s5, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(H h6, W1 w1) throws C1912g3 {
        return checkMessageInitialized(parsePartialFrom(h6, w1));
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(H h6) throws C1912g3 {
        return parsePartialFrom(h6, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(H h6) throws C1912g3 {
        return parseFrom(h6, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(byte[] bArr, int i9, int i10, W1 w1) throws C1912g3 {
        S newInstance = S.newInstance(bArr, i9, i10);
        N3 n32 = (N3) parsePartialFrom(newInstance, w1);
        try {
            newInstance.checkLastTagWas(0);
            return n32;
        } catch (C1912g3 e4) {
            throw e4.setUnfinishedMessage(n32);
        }
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        S newInstance = S.newInstance(byteBuffer);
        N3 n32 = (N3) parsePartialFrom(newInstance, w1);
        try {
            newInstance.checkLastTagWas(0);
            return checkMessageInitialized(n32);
        } catch (C1912g3 e4) {
            throw e4.setUnfinishedMessage(n32);
        }
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(byte[] bArr, int i9, int i10) throws C1912g3 {
        return parsePartialFrom(bArr, i9, i10, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return parsePartialFrom(bArr, 0, bArr.length, w1);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(byte[] bArr) throws C1912g3 {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(byte[] bArr, int i9, int i10, W1 w1) throws C1912g3 {
        return checkMessageInitialized(parsePartialFrom(bArr, i9, i10, w1));
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(InputStream inputStream, W1 w1) throws C1912g3 {
        S newInstance = S.newInstance(inputStream);
        N3 n32 = (N3) parsePartialFrom(newInstance, w1);
        try {
            newInstance.checkLastTagWas(0);
            return n32;
        } catch (C1912g3 e4) {
            throw e4.setUnfinishedMessage(n32);
        }
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(byte[] bArr, int i9, int i10) throws C1912g3 {
        return parseFrom(bArr, i9, i10, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return parseFrom(bArr, 0, bArr.length, w1);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(byte[] bArr) throws C1912g3 {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(InputStream inputStream, W1 w1) throws C1912g3 {
        return checkMessageInitialized(parsePartialFrom(inputStream, w1));
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parsePartialFrom(InputStream inputStream) throws C1912g3 {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.InterfaceC1948l4
    public N3 parseFrom(InputStream inputStream) throws C1912g3 {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
