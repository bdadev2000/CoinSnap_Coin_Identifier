package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
/* loaded from: classes3.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final c0.a clockProvider;
    private final c0.a configProvider;
    private final c0.a packageNameProvider;
    private final c0.a schemaManagerProvider;
    private final c0.a wallClockProvider;

    public SQLiteEventStore_Factory(c0.a aVar, c0.a aVar2, c0.a aVar3, c0.a aVar4, c0.a aVar5) {
        this.wallClockProvider = aVar;
        this.clockProvider = aVar2;
        this.configProvider = aVar3;
        this.schemaManagerProvider = aVar4;
        this.packageNameProvider = aVar5;
    }

    public static SQLiteEventStore_Factory create(c0.a aVar, c0.a aVar2, c0.a aVar3, c0.a aVar4, c0.a aVar5) {
        return new SQLiteEventStore_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, c0.a aVar) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, aVar);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, c0.a
    public SQLiteEventStore get() {
        return newInstance((Clock) this.wallClockProvider.get(), (Clock) this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}
