package o7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.impl.cv;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f23146c;

    public /* synthetic */ f(j jVar, int i10) {
        this.f23145b = i10;
        this.f23146c = jVar;
    }

    @Override // o7.h
    public final Object apply(Object obj) {
        int i10 = this.f23145b;
        j jVar = this.f23146c;
        switch (i10) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                jVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((q7.b) jVar.f23152c).a()).execute();
                return null;
            case 1:
                Cursor cursor = (Cursor) obj;
                jVar.getClass();
                while (cursor.moveToNext()) {
                    jVar.j(new cv(cursor.getString(1), cursor.getInt(0), l7.c.MESSAGE_TOO_OLD));
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                jVar.getClass();
                while (cursor2.moveToNext()) {
                    jVar.j(new cv(cursor2.getString(1), cursor2.getInt(0), l7.c.MAX_RETRIES_REACHED));
                }
                return null;
        }
    }
}
