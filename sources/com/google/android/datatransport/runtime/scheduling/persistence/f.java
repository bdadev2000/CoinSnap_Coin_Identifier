package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f28643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransportContext f28644c;

    public /* synthetic */ f(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, int i2) {
        this.f28642a = i2;
        this.f28643b = sQLiteEventStore;
        this.f28644c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Boolean lambda$hasPendingEventsFor$6;
        List lambda$loadBatch$8;
        int i2 = this.f28642a;
        SQLiteEventStore sQLiteEventStore = this.f28643b;
        TransportContext transportContext = this.f28644c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        switch (i2) {
            case 0:
                lambda$hasPendingEventsFor$6 = sQLiteEventStore.lambda$hasPendingEventsFor$6(transportContext, sQLiteDatabase);
                return lambda$hasPendingEventsFor$6;
            default:
                lambda$loadBatch$8 = sQLiteEventStore.lambda$loadBatch$8(transportContext, sQLiteDatabase);
                return lambda$loadBatch$8;
        }
    }
}
