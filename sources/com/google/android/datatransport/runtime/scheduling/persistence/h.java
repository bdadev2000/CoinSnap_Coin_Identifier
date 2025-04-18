package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f28649b;

    public /* synthetic */ h(SQLiteEventStore sQLiteEventStore, int i2) {
        this.f28648a = i2;
        this.f28649b = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        int i2 = this.f28648a;
        SQLiteEventStore sQLiteEventStore = this.f28649b;
        switch (i2) {
            case 0:
                return sQLiteEventStore.lambda$recordFailure$3((Cursor) obj);
            case 1:
                return sQLiteEventStore.lambda$resetClientMetrics$23((SQLiteDatabase) obj);
            default:
                return sQLiteEventStore.lambda$cleanUp$11((Cursor) obj);
        }
    }
}
