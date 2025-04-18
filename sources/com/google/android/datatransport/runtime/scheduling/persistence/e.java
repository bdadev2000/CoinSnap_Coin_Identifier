package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f28640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28641c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(SQLiteEventStore sQLiteEventStore, Object obj, Object obj2, int i2) {
        this.f28639a = i2;
        this.f28640b = sQLiteEventStore;
        this.f28641c = obj;
        this.d = obj2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        ClientMetrics lambda$loadClientMetrics$19;
        Long lambda$persist$1;
        Object lambda$loadEvents$14;
        Object lambda$recordFailure$4;
        int i2 = this.f28639a;
        SQLiteEventStore sQLiteEventStore = this.f28640b;
        Object obj2 = this.d;
        Object obj3 = this.f28641c;
        switch (i2) {
            case 0:
                lambda$loadClientMetrics$19 = sQLiteEventStore.lambda$loadClientMetrics$19((Map) obj3, (ClientMetrics.Builder) obj2, (Cursor) obj);
                return lambda$loadClientMetrics$19;
            case 1:
                lambda$persist$1 = sQLiteEventStore.lambda$persist$1((EventInternal) obj3, (TransportContext) obj2, (SQLiteDatabase) obj);
                return lambda$persist$1;
            case 2:
                lambda$loadEvents$14 = sQLiteEventStore.lambda$loadEvents$14((List) obj3, (TransportContext) obj2, (Cursor) obj);
                return lambda$loadEvents$14;
            default:
                lambda$recordFailure$4 = sQLiteEventStore.lambda$recordFailure$4((String) obj3, (String) obj2, (SQLiteDatabase) obj);
                return lambda$recordFailure$4;
        }
    }
}
