package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.i;
import com.apm.insight.l.p;

/* loaded from: classes.dex */
public class a {
    private static volatile a a;

    /* renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.b.b f3069b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f3070c;

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    private void b() {
        if (this.f3069b == null) {
            a(i.g());
        }
    }

    public synchronized void a(Context context) {
        try {
            this.f3070c = new b(context).getWritableDatabase();
        } catch (Throwable th2) {
            p.b(th2);
        }
        this.f3069b = new com.apm.insight.e.b.b();
    }

    public synchronized void a(com.apm.insight.e.a.a aVar) {
        b();
        com.apm.insight.e.b.b bVar = this.f3069b;
        if (bVar != null) {
            bVar.a(this.f3070c, aVar);
        }
    }

    public synchronized boolean a(String str) {
        b();
        com.apm.insight.e.b.b bVar = this.f3069b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f3070c, str);
    }
}
