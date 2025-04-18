package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class hv implements hc.a, SynchronizationGuard.CriticalSection, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24365c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hv(ConfigFetchHandler configFetchHandler, long j2, HashMap hashMap) {
        this.f24365c = configFetchHandler;
        this.f24364b = j2;
        this.d = hashMap;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        ((s0) obj).a((s0.a) this.f24365c, this.d, this.f24364b);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$logAndUpdateState$8;
        lambda$logAndUpdateState$8 = ((Uploader) this.f24365c).lambda$logAndUpdateState$8((TransportContext) this.d, this.f24364b);
        return lambda$logAndUpdateState$8;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Task lambda$fetch$0;
        lambda$fetch$0 = ((ConfigFetchHandler) this.f24365c).lambda$fetch$0(this.f24364b, (Map) this.d, task);
        return lambda$fetch$0;
    }

    public /* synthetic */ hv(Object obj, long j2, Object obj2) {
        this.f24365c = obj;
        this.d = obj2;
        this.f24364b = j2;
    }
}
