package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class z0 extends IOException {
    private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
    private static final long serialVersionUID = -6947486886997889499L;

    public z0(String str) {
        super(vd.e.e("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
    }

    public z0(String str, Throwable th2) {
        super(vd.e.e("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th2);
    }

    public z0() {
        super(MESSAGE);
    }

    public z0(Throwable th2) {
        super(MESSAGE, th2);
    }
}
