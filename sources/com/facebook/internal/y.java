package com.facebook.internal;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum y {
    NOT_LOADED,
    LOADING,
    SUCCESS,
    ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static y[] valuesCustom() {
        return (y[]) Arrays.copyOf(values(), 4);
    }
}
