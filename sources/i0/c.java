package I0;

import D0.l;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1398a;
    public final /* synthetic */ b[] b;

    public c(l lVar, b[] bVarArr) {
        this.f1398a = lVar;
        this.b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b a6 = d.a(this.b, sQLiteDatabase);
        this.f1398a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) a6.f1397c).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) a6.f1397c;
        if (!sQLiteDatabase2.isOpen()) {
            l.d(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase2.getAttachedDbs();
            } finally {
                if (list != null) {
                    Iterator<Pair<String, String>> it = list.iterator();
                    while (it.hasNext()) {
                        l.d((String) it.next().second);
                    }
                } else {
                    l.d(sQLiteDatabase2.getPath());
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            a6.close();
        } catch (IOException unused2) {
        }
    }
}
