package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* loaded from: classes.dex */
public class rV {
    private boolean lMd;
    private final com.bytedance.sdk.openadsdk.utils.zp zp = new com.bytedance.sdk.openadsdk.utils.zp();

    /* loaded from: classes.dex */
    public static class zp {
        private static final rV zp = new rV();
    }

    public static rV zp() {
        return zp.zp;
    }

    public com.bytedance.sdk.openadsdk.utils.zp COT() {
        return this.zp;
    }

    public boolean KS() {
        return this.lMd;
    }

    public boolean jU() {
        return this.zp.zp();
    }

    public void lMd() {
        try {
            Context zp2 = KVG.zp();
            if (zp2 instanceof Application) {
                ((Application) zp2).registerActivityLifecycleCallbacks(this.zp);
                this.lMd = true;
            } else if (zp2 != null && zp2.getApplicationContext() != null) {
                ((Application) zp2.getApplicationContext()).registerActivityLifecycleCallbacks(this.zp);
                this.lMd = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean zp(boolean z8) {
        return this.zp.zp(z8);
    }
}
