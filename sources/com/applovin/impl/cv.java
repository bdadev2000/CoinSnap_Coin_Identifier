package com.applovin.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.impl.cc;
import com.applovin.impl.s0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class cv implements cc.a, p7.b, o7.h, n9.l, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4159d;

    public /* synthetic */ cv(Object obj, long j3, Object obj2) {
        this.f4158c = obj;
        this.f4159d = obj2;
        this.f4157b = j3;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        ((s0) obj).a((s0.a) this.f4158c, this.f4159d, this.f4157b);
    }

    @Override // o7.h
    public final Object apply(Object obj) {
        String str = (String) this.f4158c;
        l7.c cVar = (l7.c) this.f4159d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        f7.c cVar2 = o7.j.f23150h;
        boolean booleanValue = ((Boolean) o7.j.s(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(cVar.f21152b)}), new com.facebook.appevents.m(15))).booleanValue();
        long j3 = this.f4157b;
        int i10 = cVar.f21152b;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j3));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL(a4.j.f("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j3, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
        }
        return null;
    }

    @Override // p7.b
    public final Object execute() {
        n7.i iVar = (n7.i) this.f4158c;
        i7.i iVar2 = (i7.i) this.f4159d;
        long a = ((q7.b) iVar.f22491g).a() + this.f4157b;
        o7.j jVar = (o7.j) iVar.f22487c;
        jVar.getClass();
        jVar.j(new av(a, iVar2));
        return null;
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        ((t7.c) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        mc.i iVar = (mc.i) this.f4158c;
        Map map = (Map) this.f4159d;
        int[] iArr = mc.i.f22181k;
        return iVar.b(this.f4157b, task, map);
    }

    public /* synthetic */ cv(mc.i iVar, long j3, HashMap hashMap) {
        this.f4158c = iVar;
        this.f4157b = j3;
        this.f4159d = hashMap;
    }
}
