package com.glority.network.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: NetworkLogEvents.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/network/util/NetworkLogEvents;", "", "()V", "API_WORKFLOW_TIME", "", "ARG_HTTP_CALL_STATE", "ARG_HTTP_ELAPSE_TIME_DNS", "ARG_HTTP_ELAPSE_TIME_ESTABLISH", "ARG_HTTP_ELAPSE_TIME_MS", "ARG_HTTP_ELAPSE_TIME_RES_BODY", "ARG_HTTP_ELAPSE_TIME_RES_HEADER", "ARG_HTTP_URL", "CLIENT_ERROR", "HTTP_REQUEST", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class NetworkLogEvents {
    public static final String API_WORKFLOW_TIME = "api_workflow_time";
    public static final String ARG_HTTP_CALL_STATE = "status";
    public static final String ARG_HTTP_ELAPSE_TIME_DNS = "double1";
    public static final String ARG_HTTP_ELAPSE_TIME_ESTABLISH = "double2";
    public static final String ARG_HTTP_ELAPSE_TIME_MS = "time";
    public static final String ARG_HTTP_ELAPSE_TIME_RES_BODY = "double4";
    public static final String ARG_HTTP_ELAPSE_TIME_RES_HEADER = "double3";
    public static final String ARG_HTTP_URL = "id";
    public static final String CLIENT_ERROR = "client_error";
    public static final String HTTP_REQUEST = "http_request";
    public static final NetworkLogEvents INSTANCE = new NetworkLogEvents();

    private NetworkLogEvents() {
    }
}
