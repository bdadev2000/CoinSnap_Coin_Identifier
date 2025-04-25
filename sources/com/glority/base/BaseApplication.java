package com.glority.base;

import com.glority.android.core.app.GlApplication;
import com.glority.utils.UtilsApp;
import com.glority.utils.stability.LogUtils;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes6.dex */
public abstract class BaseApplication extends GlApplication {
    private static final X500Principal DEBUG_DN = new X500Principal("CN=Android Debug,O=Android,C=US");
    private static BaseApplication instance;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseApplication() {
        instance = this;
    }

    @Override // com.glority.android.core.app.GlApplication, android.app.Application
    public void onCreate() {
        UtilsApp.init(this);
        super.onCreate();
        LogUtils.getConfig().setLogSwitch(false);
    }

    public static BaseApplication getInstance() {
        return instance;
    }
}
