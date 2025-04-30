package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class C {
    public static final C INSTANCE = new C();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static Executor uiExecutor;

    private C() {
    }

    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }

    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public final void runOnUiThread(Runnable runnable) {
        G7.j.e(runnable, "runnable");
        if (isMainThread()) {
            runnable.run();
            return;
        }
        Executor executor = uiExecutor;
        if (executor != null) {
            if (executor != null) {
                executor.execute(runnable);
                return;
            }
            return;
        }
        UI_HANDLER.post(runnable);
    }

    public final void setUiExecutor$vungle_ads_release(Executor executor) {
        uiExecutor = executor;
    }
}
