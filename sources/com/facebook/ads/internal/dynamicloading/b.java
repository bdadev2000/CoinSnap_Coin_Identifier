package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ Context b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultithreadedBundleWrapper f13455d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f13456f;

    public b(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z8) {
        this.b = context;
        this.f13454c = z8;
        this.f13455d = multithreadedBundleWrapper;
        this.f13456f = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        DynamicLoader dynamicLoader;
        AtomicBoolean atomicBoolean;
        int i9;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.b);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoader2 = null;
            th = null;
            int i10 = 0;
            while (i10 < 3) {
                try {
                    dynamicLoader2 = DynamicLoaderFactory.doMakeLoader(this.b, false);
                    break;
                } finally {
                    if (i10 == i9) {
                        try {
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
            dynamicLoader = dynamicLoader2;
        }
        DynamicLoaderFactory.doCallInitialize(this.b, dynamicLoader, th, this.f13454c, this.f13455d, this.f13456f);
        atomicBoolean = DynamicLoaderFactory.sInitializing;
        atomicBoolean.set(false);
    }
}
