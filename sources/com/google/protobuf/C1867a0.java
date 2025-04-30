package com.google.protobuf;

import java.io.IOException;
import x0.AbstractC2914a;

/* renamed from: com.google.protobuf.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1867a0 extends IOException {
    private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
    private static final long serialVersionUID = -6947486886997889499L;

    public C1867a0() {
        super(MESSAGE);
    }

    public C1867a0(String str) {
        super(AbstractC2914a.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
    }

    public C1867a0(Throwable th) {
        super(MESSAGE, th);
    }

    public C1867a0(String str, Throwable th) {
        super(AbstractC2914a.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }
}
