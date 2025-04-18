package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
/* loaded from: classes2.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final c0.a contextProvider;

    public EventStoreModule_PackageNameFactory(c0.a aVar) {
        this.contextProvider = aVar;
    }

    public static EventStoreModule_PackageNameFactory create(c0.a aVar) {
        return new EventStoreModule_PackageNameFactory(aVar);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNullFromProvides(EventStoreModule.packageName(context));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, c0.a
    public String get() {
        return packageName((Context) this.contextProvider.get());
    }
}
