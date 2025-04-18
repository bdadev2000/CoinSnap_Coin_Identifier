package com.facebook.appevents;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum p {
    EXPLICIT,
    TIMER,
    /* JADX INFO: Fake field, exist only in values array */
    SESSION_CHANGE,
    /* JADX INFO: Fake field, exist only in values array */
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static p[] valuesCustom() {
        return (p[]) Arrays.copyOf(values(), 6);
    }
}
