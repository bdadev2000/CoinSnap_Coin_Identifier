package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28854a;

    public /* synthetic */ g(int i2) {
        this.f28854a = i2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f28854a) {
            case 0:
                return ExecutorsRegistrar.g();
            case 1:
                return ExecutorsRegistrar.d();
            case 2:
                return ExecutorsRegistrar.c();
            case 3:
                return ExecutorsRegistrar.b();
            default:
                return RemoteConfigComponent.a();
        }
    }
}
