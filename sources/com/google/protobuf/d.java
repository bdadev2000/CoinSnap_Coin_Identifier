package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class d implements m6 {
    private static final a2 EMPTY_REGISTRY = a2.getEmptyRegistry();

    private o5 checkMessageInitialized(o5 o5Var) throws h4 {
        if (o5Var != null && !o5Var.isInitialized()) {
            throw newUninitializedMessageException(o5Var).asInvalidProtocolBufferException().setUnfinishedMessage(o5Var);
        }
        return o5Var;
    }

    private r8 newUninitializedMessageException(o5 o5Var) {
        if (o5Var instanceof c) {
            return ((c) o5Var).newUninitializedMessageException();
        }
        return new r8(o5Var);
    }

    @Override // com.google.protobuf.m6
    public abstract /* synthetic */ Object parsePartialFrom(r0 r0Var, a2 a2Var) throws h4;

    @Override // com.google.protobuf.m6
    public o5 parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws h4 {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, a2Var));
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialDelimitedFrom(InputStream inputStream, a2 a2Var) throws h4 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new a(inputStream, r0.readRawVarint32(read, inputStream)), a2Var);
        } catch (IOException e2) {
            throw new h4(e2);
        }
    }

    @Override // com.google.protobuf.m6
    public o5 parseDelimitedFrom(InputStream inputStream) throws h4 {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialDelimitedFrom(InputStream inputStream) throws h4 {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(r0 r0Var) throws h4 {
        return (o5) parsePartialFrom(r0Var, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(h0 h0Var, a2 a2Var) throws h4 {
        r0 newCodedInput = h0Var.newCodedInput();
        o5 o5Var = (o5) parsePartialFrom(newCodedInput, a2Var);
        try {
            newCodedInput.checkLastTagWas(0);
            return o5Var;
        } catch (h4 e2) {
            throw e2.setUnfinishedMessage(o5Var);
        }
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(r0 r0Var, a2 a2Var) throws h4 {
        return checkMessageInitialized((o5) parsePartialFrom(r0Var, a2Var));
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(r0 r0Var) throws h4 {
        return parseFrom(r0Var, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return checkMessageInitialized(parsePartialFrom(h0Var, a2Var));
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(h0 h0Var) throws h4 {
        return parsePartialFrom(h0Var, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(h0 h0Var) throws h4 {
        return parseFrom(h0Var, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(byte[] bArr, int i10, int i11, a2 a2Var) throws h4 {
        r0 newInstance = r0.newInstance(bArr, i10, i11);
        o5 o5Var = (o5) parsePartialFrom(newInstance, a2Var);
        try {
            newInstance.checkLastTagWas(0);
            return o5Var;
        } catch (h4 e2) {
            throw e2.setUnfinishedMessage(o5Var);
        }
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        r0 newInstance = r0.newInstance(byteBuffer);
        o5 o5Var = (o5) parsePartialFrom(newInstance, a2Var);
        try {
            newInstance.checkLastTagWas(0);
            return checkMessageInitialized(o5Var);
        } catch (h4 e2) {
            throw e2.setUnfinishedMessage(o5Var);
        }
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(byte[] bArr, int i10, int i11) throws h4 {
        return parsePartialFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(byte[] bArr, a2 a2Var) throws h4 {
        return parsePartialFrom(bArr, 0, bArr.length, a2Var);
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(ByteBuffer byteBuffer) throws h4 {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(byte[] bArr) throws h4 {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(byte[] bArr, int i10, int i11, a2 a2Var) throws h4 {
        return checkMessageInitialized(parsePartialFrom(bArr, i10, i11, a2Var));
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(InputStream inputStream, a2 a2Var) throws h4 {
        r0 newInstance = r0.newInstance(inputStream);
        o5 o5Var = (o5) parsePartialFrom(newInstance, a2Var);
        try {
            newInstance.checkLastTagWas(0);
            return o5Var;
        } catch (h4 e2) {
            throw e2.setUnfinishedMessage(o5Var);
        }
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(byte[] bArr, int i10, int i11) throws h4 {
        return parseFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return parseFrom(bArr, 0, bArr.length, a2Var);
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(byte[] bArr) throws h4 {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(InputStream inputStream, a2 a2Var) throws h4 {
        return checkMessageInitialized(parsePartialFrom(inputStream, a2Var));
    }

    @Override // com.google.protobuf.m6
    public o5 parsePartialFrom(InputStream inputStream) throws h4 {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.m6
    public o5 parseFrom(InputStream inputStream) throws h4 {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
