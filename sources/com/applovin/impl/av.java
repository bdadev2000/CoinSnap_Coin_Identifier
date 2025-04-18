package com.applovin.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class av implements cc.a, o7.h, n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f3796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3797d;

    public /* synthetic */ av(long j3, i7.i iVar) {
        this.f3795b = 2;
        this.f3796c = j3;
        this.f3797d = iVar;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        r0.G((s0.a) this.f3797d, this.f3796c, (s0) obj);
    }

    @Override // o7.h
    public final Object apply(Object obj) {
        int i10 = this.f3795b;
        long j3 = this.f3796c;
        int i11 = 1;
        Object obj2 = this.f3797d;
        switch (i10) {
            case 1:
                o7.j jVar = (o7.j) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                f7.c cVar = o7.j.f23150h;
                jVar.getClass();
                String[] strArr = {String.valueOf(j3)};
                o7.j.s(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new o7.f(jVar, i11));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                i7.i iVar = (i7.i) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                f7.c cVar2 = o7.j.f23150h;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j3));
                f7.d dVar = iVar.f19179c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{iVar.a, String.valueOf(r7.a.a(dVar))}) < 1) {
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(r7.a.a(dVar)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        ((t7.c) obj).getClass();
    }

    public /* synthetic */ av(Object obj, long j3, int i10) {
        this.f3795b = i10;
        this.f3797d = obj;
        this.f3796c = j3;
    }
}
