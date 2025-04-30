package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.i;
import com.apm.insight.l.q;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f5749a;
    private com.apm.insight.e.b.b b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f5750c;

    private a() {
    }

    public static a a() {
        if (f5749a == null) {
            synchronized (a.class) {
                try {
                    if (f5749a == null) {
                        f5749a = new a();
                    }
                } finally {
                }
            }
        }
        return f5749a;
    }

    private void b() {
        if (this.b == null) {
            a(i.g());
        }
    }

    public synchronized void a(Context context) {
        try {
            this.f5750c = new b(context).getWritableDatabase();
        } catch (Throwable th) {
            q.b(th);
        }
        this.b = new com.apm.insight.e.b.b();
    }

    public synchronized void a(com.apm.insight.e.a.a aVar) {
        b();
        com.apm.insight.e.b.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.f5750c, aVar);
        }
    }

    public synchronized boolean a(String str) {
        b();
        com.apm.insight.e.b.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f5750c, str);
    }
}
