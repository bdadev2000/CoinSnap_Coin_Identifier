package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.rkt.Sg;
import com.bytedance.sdk.openadsdk.rkt.Sg.YFl;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class BusMonitorDependWrapper implements Sg {
    private Handler Sg;
    private Sg YFl;

    public BusMonitorDependWrapper(Sg sg2) {
        this.YFl = sg2;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.Sg
    public Context getContext() {
        Sg sg2 = this.YFl;
        if (sg2 != null && sg2.getContext() != null) {
            return this.YFl.getContext();
        }
        return getReflectContext();
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.Sg
    public ExecutorService getExecutorService() {
        Sg sg2 = this.YFl;
        if (sg2 != null && sg2.getExecutorService() != null) {
            return this.YFl.getExecutorService();
        }
        return Executors.newFixedThreadPool(2);
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.Sg
    public Handler getHandler() {
        Sg sg2 = this.YFl;
        if (sg2 != null && sg2.getHandler() != null) {
            return this.YFl.getHandler();
        }
        if (this.Sg == null) {
            HandlerThread handlerThread = new HandlerThread("pag_monitor");
            handlerThread.start();
            this.Sg = new Handler(handlerThread.getLooper());
        }
        return this.Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.Sg
    public int getOnceLogCount() {
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.Sg
    public int getOnceLogInterval() {
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.Sg
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        Sg sg2 = this.YFl;
        if (sg2 == null || (uploadIntervalTime = sg2.getUploadIntervalTime()) < 1800000) {
            return Constants.THIRTY_MINUTES;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.Sg
    public boolean isMonitorOpen() {
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.rkt.Sg
    public void onMonitorUpload(List<YFl> list) {
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.onMonitorUpload(list);
        }
    }
}
