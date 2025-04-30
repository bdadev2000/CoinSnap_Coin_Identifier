package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2038y4 {
    boolean equals(Object obj, Object obj2);

    int getSerializedSize(Object obj);

    int hashCode(Object obj);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, InterfaceC1996s4 interfaceC1996s4, W1 w1) throws IOException;

    void mergeFrom(Object obj, Object obj2);

    void mergeFrom(Object obj, byte[] bArr, int i9, int i10, C1957n c1957n) throws IOException;

    Object newInstance();

    void writeTo(Object obj, a6 a6Var) throws IOException;
}
