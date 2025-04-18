package com.facebook;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum t {
    LOGIN_RECOVERABLE,
    OTHER,
    TRANSIENT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static t[] valuesCustom() {
        return (t[]) Arrays.copyOf(values(), 3);
    }
}
