package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final c0.a executorProvider;
    private final c0.a guardProvider;
    private final c0.a schedulerProvider;
    private final c0.a storeProvider;

    public WorkInitializer_Factory(c0.a aVar, c0.a aVar2, c0.a aVar3, c0.a aVar4) {
        this.executorProvider = aVar;
        this.storeProvider = aVar2;
        this.schedulerProvider = aVar3;
        this.guardProvider = aVar4;
    }

    public static WorkInitializer_Factory create(c0.a aVar, c0.a aVar2, c0.a aVar3, c0.a aVar4) {
        return new WorkInitializer_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, c0.a
    public WorkInitializer get() {
        return newInstance((Executor) this.executorProvider.get(), (EventStore) this.storeProvider.get(), (WorkScheduler) this.schedulerProvider.get(), (SynchronizationGuard) this.guardProvider.get());
    }
}
