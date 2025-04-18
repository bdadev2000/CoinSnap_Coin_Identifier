package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class Uploader_Factory implements Factory<Uploader> {
    private final c0.a backendRegistryProvider;
    private final c0.a clientHealthMetricsStoreProvider;
    private final c0.a clockProvider;
    private final c0.a contextProvider;
    private final c0.a eventStoreProvider;
    private final c0.a executorProvider;
    private final c0.a guardProvider;
    private final c0.a uptimeClockProvider;
    private final c0.a workSchedulerProvider;

    public Uploader_Factory(c0.a aVar, c0.a aVar2, c0.a aVar3, c0.a aVar4, c0.a aVar5, c0.a aVar6, c0.a aVar7, c0.a aVar8, c0.a aVar9) {
        this.contextProvider = aVar;
        this.backendRegistryProvider = aVar2;
        this.eventStoreProvider = aVar3;
        this.workSchedulerProvider = aVar4;
        this.executorProvider = aVar5;
        this.guardProvider = aVar6;
        this.clockProvider = aVar7;
        this.uptimeClockProvider = aVar8;
        this.clientHealthMetricsStoreProvider = aVar9;
    }

    public static Uploader_Factory create(c0.a aVar, c0.a aVar2, c0.a aVar3, c0.a aVar4, c0.a aVar5, c0.a aVar6, c0.a aVar7, c0.a aVar8, c0.a aVar9) {
        return new Uploader_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, c0.a
    public Uploader get() {
        return newInstance((Context) this.contextProvider.get(), (BackendRegistry) this.backendRegistryProvider.get(), (EventStore) this.eventStoreProvider.get(), (WorkScheduler) this.workSchedulerProvider.get(), (Executor) this.executorProvider.get(), (SynchronizationGuard) this.guardProvider.get(), (Clock) this.clockProvider.get(), (Clock) this.uptimeClockProvider.get(), (ClientHealthMetricsStore) this.clientHealthMetricsStoreProvider.get());
    }
}
