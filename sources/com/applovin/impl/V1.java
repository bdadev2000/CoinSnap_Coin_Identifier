package com.applovin.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import r3.C2666i;
import r3.InterfaceC2664g;
import s3.InterfaceC2697b;
import w4.C2891m0;

/* loaded from: classes.dex */
public final /* synthetic */ class V1 implements cc.a, Continuation, InterfaceC2697b, InterfaceC2664g, N4.a {
    public final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6504d;

    public /* synthetic */ V1(Object obj, long j7, Object obj2) {
        this.f6503c = obj;
        this.b = j7;
        this.f6504d = obj2;
    }

    @Override // com.applovin.impl.cc.a
    public void a(Object obj) {
        ((InterfaceC0746s0) obj).a((InterfaceC0746s0.a) this.f6503c, this.f6504d, this.b);
    }

    @Override // r3.InterfaceC2664g
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        n3.c cVar = (n3.c) this.f6504d;
        String num = Integer.toString(cVar.b);
        String str = (String) this.f6503c;
        boolean booleanValue = ((Boolean) C2666i.l(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num}), new p4.i(10))).booleanValue();
        long j7 = this.b;
        int i9 = cVar.b;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i9));
            contentValues.put("events_dropped_count", Long.valueOf(j7));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL(L.j("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j7, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i9)});
        }
        return null;
    }

    @Override // s3.InterfaceC2697b
    public Object execute() {
        q3.h hVar = (q3.h) this.f6503c;
        long a6 = hVar.f22772g.a() + this.b;
        C2666i c2666i = (C2666i) hVar.f22768c;
        c2666i.getClass();
        c2666i.c(new C2(a6, (k3.j) this.f6504d));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((l5.g) this.f6503c).b(task, this.b, (HashMap) ((Map) this.f6504d));
    }

    public /* synthetic */ V1(Object obj, Object obj2, long j7) {
        this.f6503c = obj;
        this.f6504d = obj2;
        this.b = j7;
    }

    @Override // N4.a
    public void a(N4.b bVar) {
        ((r4.a) bVar.get()).d((String) this.f6503c, this.b, (C2891m0) this.f6504d);
    }
}
