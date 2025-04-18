package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28650a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28652c;

    public /* synthetic */ i(TransportContext transportContext, long j2) {
        this.f28651b = j2;
        this.f28652c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object lambda$recordNextCallTime$7;
        Integer lambda$cleanUp$12;
        int i2 = this.f28650a;
        long j2 = this.f28651b;
        Object obj2 = this.f28652c;
        switch (i2) {
            case 0:
                lambda$recordNextCallTime$7 = SQLiteEventStore.lambda$recordNextCallTime$7(j2, (TransportContext) obj2, (SQLiteDatabase) obj);
                return lambda$recordNextCallTime$7;
            default:
                lambda$cleanUp$12 = ((SQLiteEventStore) obj2).lambda$cleanUp$12(j2, (SQLiteDatabase) obj);
                return lambda$cleanUp$12;
        }
    }

    public /* synthetic */ i(SQLiteEventStore sQLiteEventStore, long j2) {
        this.f28652c = sQLiteEventStore;
        this.f28651b = j2;
    }
}
