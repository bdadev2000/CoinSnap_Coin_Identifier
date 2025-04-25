package com.glority.app;

import com.glority.base.BaseApplication;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes4.dex */
public abstract class Hilt_MyApplication extends BaseApplication implements GeneratedComponentManagerHolder {
    private boolean injected = false;
    private final ApplicationComponentManager componentManager = new ApplicationComponentManager(new ComponentSupplier() { // from class: com.glority.app.Hilt_MyApplication.1
        @Override // dagger.hilt.android.internal.managers.ComponentSupplier
        public Object get() {
            return DaggerMyApplication_HiltComponents_SingletonC.builder().applicationContextModule(new ApplicationContextModule(Hilt_MyApplication.this)).build();
        }
    });

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ApplicationComponentManager componentManager() {
        return this.componentManager;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // com.glority.base.BaseApplication, com.glority.android.core.app.GlApplication, android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    protected void hiltInternalInject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((MyApplication_GeneratedInjector) generatedComponent()).injectMyApplication((MyApplication) UnsafeCasts.unsafeCast(this));
    }
}
