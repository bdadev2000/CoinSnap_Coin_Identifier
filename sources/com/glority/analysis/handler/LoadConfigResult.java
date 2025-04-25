package com.glority.analysis.handler;

import kotlin.Metadata;

/* compiled from: LoadConfigResult.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/analysis/handler/LoadConfigResult;", "", "()V", "ERROR", "", "NONE", "SUCCESS", "status", "getStatus", "()I", "setStatus", "(I)V", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class LoadConfigResult {
    public static final int ERROR = 2;
    public static final LoadConfigResult INSTANCE = new LoadConfigResult();
    public static final int NONE = 0;
    public static final int SUCCESS = 1;
    private static int status;

    private LoadConfigResult() {
    }

    public final int getStatus() {
        return status;
    }

    public final void setStatus(int i) {
        status = i;
    }
}
