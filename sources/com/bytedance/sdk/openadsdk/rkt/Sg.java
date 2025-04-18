package com.bytedance.sdk.openadsdk.rkt;

import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface Sg {
    Context getContext();

    ExecutorService getExecutorService();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.rkt.Sg.YFl> list);
}
