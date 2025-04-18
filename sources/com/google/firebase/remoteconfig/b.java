package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28909c;

    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        this.f28907a = i2;
        this.f28908b = obj;
        this.f28909c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void lambda$setConfigSettingsAsync$5;
        int i2 = this.f28907a;
        Object obj = this.f28909c;
        Object obj2 = this.f28908b;
        switch (i2) {
            case 0:
                lambda$setConfigSettingsAsync$5 = ((FirebaseRemoteConfig) obj2).lambda$setConfigSettingsAsync$5((FirebaseRemoteConfigSettings) obj);
                return lambda$setConfigSettingsAsync$5;
            default:
                return ConfigCacheClient.a((ConfigCacheClient) obj2, (ConfigContainer) obj);
        }
    }
}
