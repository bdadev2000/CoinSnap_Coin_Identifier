package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* loaded from: classes.dex */
public class EH {
    private boolean Sg;
    private final com.bytedance.sdk.openadsdk.utils.YFl YFl = new com.bytedance.sdk.openadsdk.utils.YFl();

    /* loaded from: classes.dex */
    public static class YFl {
        private static final EH YFl = new EH();
    }

    public static EH YFl() {
        return YFl.YFl;
    }

    public boolean AlY() {
        return this.YFl.YFl();
    }

    public void Sg() {
        try {
            Context YFl2 = lG.YFl();
            if (YFl2 instanceof Application) {
                ((Application) YFl2).registerActivityLifecycleCallbacks(this.YFl);
                this.Sg = true;
            } else if (YFl2 != null && YFl2.getApplicationContext() != null) {
                ((Application) YFl2.getApplicationContext()).registerActivityLifecycleCallbacks(this.YFl);
                this.Sg = true;
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th2);
        }
    }

    public boolean tN() {
        return this.Sg;
    }

    public com.bytedance.sdk.openadsdk.utils.YFl wN() {
        return this.YFl;
    }

    public boolean YFl(boolean z10) {
        return this.YFl.YFl(z10);
    }
}
