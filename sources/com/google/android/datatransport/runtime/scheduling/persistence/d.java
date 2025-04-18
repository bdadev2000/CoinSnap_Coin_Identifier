package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28638b;

    public /* synthetic */ d(long j2, int i2) {
        this.f28637a = i2;
        this.f28638b = j2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        TimeWindow lambda$getTimeWindow$22;
        TimeWindow lambda$getTimeWindow$21;
        int i2 = this.f28637a;
        long j2 = this.f28638b;
        switch (i2) {
            case 0:
                lambda$getTimeWindow$22 = SQLiteEventStore.lambda$getTimeWindow$22(j2, (SQLiteDatabase) obj);
                return lambda$getTimeWindow$22;
            default:
                lambda$getTimeWindow$21 = SQLiteEventStore.lambda$getTimeWindow$21(j2, (Cursor) obj);
                return lambda$getTimeWindow$21;
        }
    }
}
