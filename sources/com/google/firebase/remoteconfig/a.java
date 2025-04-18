package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseRemoteConfig f28906b;

    public /* synthetic */ a(FirebaseRemoteConfig firebaseRemoteConfig, int i2) {
        this.f28905a = i2;
        this.f28906b = firebaseRemoteConfig;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2 = this.f28905a;
        FirebaseRemoteConfig firebaseRemoteConfig = this.f28906b;
        switch (i2) {
            case 0:
                return FirebaseRemoteConfig.d(firebaseRemoteConfig);
            default:
                return firebaseRemoteConfig.getInfo();
        }
    }
}
