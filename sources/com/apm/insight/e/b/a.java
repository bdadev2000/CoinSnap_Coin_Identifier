package com.apm.insight.e.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.c;
import com.apm.insight.l.p;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a<T> {
    protected final String a = "_id";

    /* renamed from: b, reason: collision with root package name */
    protected final String f3072b;

    public a(String str) {
        this.f3072b = str;
    }

    public abstract ContentValues a(T t5);

    public abstract HashMap<String, String> a();

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(this.f3072b);
            sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a = a();
            if (a != null) {
                for (String str : a.keySet()) {
                    sb2.append(str);
                    sb2.append(" ");
                    sb2.append(a.get(str));
                    sb2.append(",");
                }
                sb2.delete(sb2.length() - 1, sb2.length());
                sb2.append(")");
                sQLiteDatabase.execSQL(sb2.toString());
            }
        } catch (Throwable th2) {
            c.a().a("NPTH_CATCH", th2);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t5) {
        if (sQLiteDatabase == null || t5 == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f3072b, null, a((a<T>) t5));
        } catch (Throwable th2) {
            p.b(th2);
        }
    }
}
