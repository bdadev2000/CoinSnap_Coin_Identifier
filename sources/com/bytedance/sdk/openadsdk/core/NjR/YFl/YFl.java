package com.bytedance.sdk.openadsdk.core.NjR.YFl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class YFl implements Application.ActivityLifecycleCallbacks {
    private static volatile YFl YFl;
    private final Sg Sg;

    private YFl(Application application) {
        this.Sg = Sg.YFl(application);
    }

    public static YFl YFl(Application application) {
        if (YFl == null) {
            synchronized (YFl.class) {
                if (YFl == null) {
                    YFl = new YFl(application);
                    application.registerActivityLifecycleCallbacks(YFl);
                }
            }
        }
        return YFl;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Sg sg2 = this.Sg;
        if (sg2 != null) {
            sg2.YFl(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Sg sg2 = this.Sg;
        if (sg2 != null) {
            sg2.Sg(activity);
        }
    }

    public String YFl(String str, long j3, int i10) {
        Sg sg2 = this.Sg;
        return sg2 != null ? sg2.YFl(str, j3, i10) : AbstractJsonLexerKt.NULL;
    }
}
