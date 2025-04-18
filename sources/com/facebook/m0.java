package com.facebook;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum m0 {
    REQUESTS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    /* JADX INFO: Fake field, exist only in values array */
    CACHE,
    APP_EVENTS,
    DEVELOPER_ERRORS,
    GRAPH_API_DEBUG_WARNING,
    GRAPH_API_DEBUG_INFO;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static m0[] valuesCustom() {
        return (m0[]) Arrays.copyOf(values(), 8);
    }
}
