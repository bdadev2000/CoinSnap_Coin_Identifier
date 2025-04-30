package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2016v3 {
    private static final AbstractC2016v3 FULL_INSTANCE;
    private static final AbstractC2016v3 LITE_INSTANCE;

    static {
        AbstractC1995s3 abstractC1995s3 = null;
        FULL_INSTANCE = new C2002t3();
        LITE_INSTANCE = new C2009u3();
    }

    public static AbstractC2016v3 full() {
        return FULL_INSTANCE;
    }

    public static AbstractC2016v3 lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj, long j7);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j7);

    public abstract <L> List<L> mutableListAt(Object obj, long j7);

    private AbstractC2016v3() {
    }
}
