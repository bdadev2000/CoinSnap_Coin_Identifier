package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultithreadedBundleWrapper f10904d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f10905f;

    public b(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z10) {
        this.f10902b = context;
        this.f10903c = z10;
        this.f10904d = multithreadedBundleWrapper;
        this.f10905f = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2;
        DynamicLoader dynamicLoader;
        AtomicBoolean atomicBoolean;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f10902b);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoader2 = null;
            th2 = null;
            int i10 = 0;
            while (i10 < 3) {
                try {
                    dynamicLoader2 = DynamicLoaderFactory.doMakeLoader(this.f10902b, false);
                    break;
                } finally {
                }
            }
            dynamicLoader = dynamicLoader2;
        }
        DynamicLoaderFactory.doCallInitialize(this.f10902b, dynamicLoader, th2, this.f10903c, this.f10904d, this.f10905f);
        atomicBoolean = DynamicLoaderFactory.sInitializing;
        atomicBoolean.set(false);
    }
}
