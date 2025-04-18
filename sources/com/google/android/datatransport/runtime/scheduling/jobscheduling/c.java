package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements SynchronizationGuard.CriticalSection, Deferred.DeferredHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28630c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Uploader uploader, Iterable iterable, TransportContext transportContext, long j2) {
        this.f28630c = uploader;
        this.d = iterable;
        this.e = transportContext;
        this.f28629b = j2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$logAndUpdateState$4;
        lambda$logAndUpdateState$4 = ((Uploader) this.f28630c).lambda$logAndUpdateState$4((Iterable) this.d, (TransportContext) this.e, this.f28629b);
        return lambda$logAndUpdateState$4;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.b((String) this.f28630c, (String) this.d, this.f28629b, (StaticSessionData) this.e, provider);
    }

    public /* synthetic */ c(String str, String str2, long j2, StaticSessionData staticSessionData) {
        this.f28630c = str;
        this.d = str2;
        this.f28629b = j2;
        this.e = staticSessionData;
    }
}
