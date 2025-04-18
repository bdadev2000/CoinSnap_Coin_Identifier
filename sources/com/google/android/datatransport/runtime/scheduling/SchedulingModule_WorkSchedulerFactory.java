package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import c0.a;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final a clockProvider;
    private final a configProvider;
    private final a contextProvider;
    private final a eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(a aVar, a aVar2, a aVar3, a aVar4) {
        this.contextProvider = aVar;
        this.eventStoreProvider = aVar2;
        this.configProvider = aVar3;
        this.clockProvider = aVar4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(a aVar, a aVar2, a aVar3, a aVar4) {
        return new SchedulingModule_WorkSchedulerFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNullFromProvides(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, c0.a
    public WorkScheduler get() {
        return workScheduler((Context) this.contextProvider.get(), (EventStore) this.eventStoreProvider.get(), (SchedulerConfig) this.configProvider.get(), (Clock) this.clockProvider.get());
    }
}
