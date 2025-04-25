package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* loaded from: classes12.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {
    @Override // javax.inject.Provider
    public EventStoreConfig get() {
        return storeConfig();
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventStoreConfig storeConfig() {
        return (EventStoreConfig) Preconditions.checkNotNullFromProvides(EventStoreModule.storeConfig());
    }

    /* loaded from: classes12.dex */
    private static final class InstanceHolder {
        private static final EventStoreModule_StoreConfigFactory INSTANCE = new EventStoreModule_StoreConfigFactory();

        private InstanceHolder() {
        }
    }
}
