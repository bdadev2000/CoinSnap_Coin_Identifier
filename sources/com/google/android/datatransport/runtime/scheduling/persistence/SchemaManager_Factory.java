package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes2.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final c0.a contextProvider;
    private final c0.a dbNameProvider;
    private final c0.a schemaVersionProvider;

    public SchemaManager_Factory(c0.a aVar, c0.a aVar2, c0.a aVar3) {
        this.contextProvider = aVar;
        this.dbNameProvider = aVar2;
        this.schemaVersionProvider = aVar3;
    }

    public static SchemaManager_Factory create(c0.a aVar, c0.a aVar2, c0.a aVar3) {
        return new SchemaManager_Factory(aVar, aVar2, aVar3);
    }

    public static SchemaManager newInstance(Context context, String str, int i2) {
        return new SchemaManager(context, str, i2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, c0.a
    public SchemaManager get() {
        return newInstance((Context) this.contextProvider.get(), (String) this.dbNameProvider.get(), ((Integer) this.schemaVersionProvider.get()).intValue());
    }
}
