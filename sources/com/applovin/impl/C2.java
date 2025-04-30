package com.applovin.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;
import r3.InterfaceC2664g;
import u3.AbstractC2753a;

/* loaded from: classes.dex */
public final /* synthetic */ class C2 implements cc.a, InterfaceC2664g {
    public final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6374c;

    public /* synthetic */ C2(long j7, k3.j jVar) {
        this.b = j7;
        this.f6374c = jVar;
    }

    @Override // com.applovin.impl.cc.a
    public void a(Object obj) {
        ((InterfaceC0746s0) obj).a((InterfaceC0746s0.a) this.f6374c, this.b);
    }

    @Override // r3.InterfaceC2664g
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        k3.j jVar = (k3.j) this.f6374c;
        String str = jVar.f21433a;
        h3.d dVar = jVar.f21434c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC2753a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.f21433a);
            contentValues.put("priority", Integer.valueOf(AbstractC2753a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public /* synthetic */ C2(InterfaceC0746s0.a aVar, long j7) {
        this.f6374c = aVar;
        this.b = j7;
    }
}
