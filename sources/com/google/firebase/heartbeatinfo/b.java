package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28898b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f28897a = i2;
        this.f28898b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        DefaultHeartBeatController lambda$component$3;
        int i2 = this.f28897a;
        Object obj = this.f28898b;
        switch (i2) {
            case 0:
                lambda$component$3 = DefaultHeartBeatController.lambda$component$3((Qualified) obj, componentContainer);
                return lambda$component$3;
            case 1:
                return RemoteConfigRegistrar.a((Qualified) obj, componentContainer);
            default:
                return CrashlyticsRegistrar.a((CrashlyticsRegistrar) obj, componentContainer);
        }
    }
}
