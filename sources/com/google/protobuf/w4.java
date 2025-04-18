package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class w4 {
    private static final w4 FULL_INSTANCE;
    private static final w4 LITE_INSTANCE;

    static {
        t4 t4Var = null;
        FULL_INSTANCE = new u4();
        LITE_INSTANCE = new v4();
    }

    private w4() {
    }

    public static w4 full() {
        return FULL_INSTANCE;
    }

    public static w4 lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj, long j3);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j3);

    public abstract <L> List<L> mutableListAt(Object obj, long j3);
}
