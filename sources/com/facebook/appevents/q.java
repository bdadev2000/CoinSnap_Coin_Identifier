package com.facebook.appevents;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum q {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static q[] valuesCustom() {
        return (q[]) Arrays.copyOf(values(), 4);
    }
}
