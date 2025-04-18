package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements SQLiteEventStore.Function, SQLiteEventStore.Producer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28633b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f28632a = i2;
        this.f28633b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object lambda$loadMetadata$16;
        lambda$loadMetadata$16 = SQLiteEventStore.lambda$loadMetadata$16((Map) this.f28633b, (Cursor) obj);
        return lambda$loadMetadata$16;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public final Object produce() {
        Object lambda$ensureBeginTransaction$24;
        int i2 = this.f28632a;
        Object obj = this.f28633b;
        switch (i2) {
            case 1:
                return ((SchemaManager) obj).getWritableDatabase();
            default:
                lambda$ensureBeginTransaction$24 = SQLiteEventStore.lambda$ensureBeginTransaction$24((SQLiteDatabase) obj);
                return lambda$ensureBeginTransaction$24;
        }
    }
}
