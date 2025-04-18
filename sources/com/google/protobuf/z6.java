package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface z6 {
    boolean equals(Object obj, Object obj2);

    int getSerializedSize(Object obj);

    int hashCode(Object obj);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, t6 t6Var, a2 a2Var) throws IOException;

    void mergeFrom(Object obj, Object obj2);

    void mergeFrom(Object obj, byte[] bArr, int i10, int i11, n nVar) throws IOException;

    Object newInstance();

    void writeTo(Object obj, ba baVar) throws IOException;
}
