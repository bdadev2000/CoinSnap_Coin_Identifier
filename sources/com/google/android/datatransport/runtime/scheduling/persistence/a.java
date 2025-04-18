package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteEventStore.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28631a;

    public /* synthetic */ a(int i2) {
        this.f28631a = i2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f28631a) {
            case 0:
                return SQLiteEventStore.s((SQLiteDatabase) obj);
            case 1:
                return SQLiteEventStore.o((Cursor) obj);
            case 2:
                return SQLiteEventStore.k0((SQLiteDatabase) obj);
            case 3:
                return SQLiteEventStore.l0((Cursor) obj);
            case 4:
                return SQLiteEventStore.a((Throwable) obj);
            case 5:
                return SQLiteEventStore.E((Cursor) obj);
            case 6:
                return SQLiteEventStore.c((Throwable) obj);
            case 7:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 8:
                return SQLiteEventStore.u((Cursor) obj);
            default:
                return SQLiteEventStore.N((Cursor) obj);
        }
    }
}
