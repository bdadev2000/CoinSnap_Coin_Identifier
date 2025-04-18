package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import c0.a;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final a applicationContextProvider;
    private final a monotonicClockProvider;
    private final a wallClockProvider;

    public CreationContextFactory_Factory(a aVar, a aVar2, a aVar3) {
        this.applicationContextProvider = aVar;
        this.wallClockProvider = aVar2;
        this.monotonicClockProvider = aVar3;
    }

    public static CreationContextFactory_Factory create(a aVar, a aVar2, a aVar3) {
        return new CreationContextFactory_Factory(aVar, aVar2, aVar3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, c0.a
    public CreationContextFactory get() {
        return newInstance((Context) this.applicationContextProvider.get(), (Clock) this.wallClockProvider.get(), (Clock) this.monotonicClockProvider.get());
    }
}
