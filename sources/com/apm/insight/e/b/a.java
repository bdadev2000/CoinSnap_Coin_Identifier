package com.apm.insight.e.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.c;
import com.apm.insight.l.q;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final String f5752a = "_id";
    protected final String b;

    public a(String str) {
        this.b = str;
    }

    public abstract ContentValues a(T t9);

    public abstract HashMap<String, String> a();

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a6 = a();
            if (a6 != null) {
                for (String str : a6.keySet()) {
                    sb.append(str);
                    sb.append(" ");
                    sb.append(a6.get(str));
                    sb.append(",");
                }
                sb.delete(sb.length() - 1, sb.length());
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            }
        } catch (Throwable th) {
            c.a().a("NPTH_CATCH", th);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t9) {
        if (sQLiteDatabase == null || t9 == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.b, null, a((a<T>) t9));
        } catch (Throwable th) {
            q.b(th);
        }
    }
}
