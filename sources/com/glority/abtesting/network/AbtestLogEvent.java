package com.glority.abtesting.network;

import kotlin.Metadata;

/* compiled from: AbtestLogEvent.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/glority/abtesting/network/AbtestLogEvent;", "", "()V", "ABTEST", "", "ABTEST_EXCEPTION", "ARG_API_CODE", "ARG_API_NAME", "ARG_API_TIME", "HTTP_REQUEST", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbtestLogEvent {
    public static final String ABTEST = "abtesting";
    public static final String ABTEST_EXCEPTION = "abtest_exception";
    public static final String ARG_API_CODE = "code";
    public static final String ARG_API_NAME = "api";
    public static final String ARG_API_TIME = "time";
    public static final String HTTP_REQUEST = "http_request";
    public static final AbtestLogEvent INSTANCE = new AbtestLogEvent();

    private AbtestLogEvent() {
    }
}
