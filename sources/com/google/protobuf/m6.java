package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface m6 {
    Object parseDelimitedFrom(InputStream inputStream) throws h4;

    Object parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws h4;

    Object parseFrom(h0 h0Var) throws h4;

    Object parseFrom(h0 h0Var, a2 a2Var) throws h4;

    Object parseFrom(r0 r0Var) throws h4;

    Object parseFrom(r0 r0Var, a2 a2Var) throws h4;

    Object parseFrom(InputStream inputStream) throws h4;

    Object parseFrom(InputStream inputStream, a2 a2Var) throws h4;

    Object parseFrom(ByteBuffer byteBuffer) throws h4;

    Object parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4;

    Object parseFrom(byte[] bArr) throws h4;

    Object parseFrom(byte[] bArr, int i10, int i11) throws h4;

    Object parseFrom(byte[] bArr, int i10, int i11, a2 a2Var) throws h4;

    Object parseFrom(byte[] bArr, a2 a2Var) throws h4;

    Object parsePartialDelimitedFrom(InputStream inputStream) throws h4;

    Object parsePartialDelimitedFrom(InputStream inputStream, a2 a2Var) throws h4;

    Object parsePartialFrom(h0 h0Var) throws h4;

    Object parsePartialFrom(h0 h0Var, a2 a2Var) throws h4;

    Object parsePartialFrom(r0 r0Var) throws h4;

    Object parsePartialFrom(r0 r0Var, a2 a2Var) throws h4;

    Object parsePartialFrom(InputStream inputStream) throws h4;

    Object parsePartialFrom(InputStream inputStream, a2 a2Var) throws h4;

    Object parsePartialFrom(byte[] bArr) throws h4;

    Object parsePartialFrom(byte[] bArr, int i10, int i11) throws h4;

    Object parsePartialFrom(byte[] bArr, int i10, int i11, a2 a2Var) throws h4;

    Object parsePartialFrom(byte[] bArr, a2 a2Var) throws h4;
}
