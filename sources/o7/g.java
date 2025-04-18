package o7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.emoji2.text.x;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23148c;

    public /* synthetic */ g(long j3, int i10) {
        this.f23147b = i10;
        this.f23148c = j3;
    }

    @Override // o7.h
    public final Object apply(Object obj) {
        int i10 = this.f23147b;
        long j3 = this.f23148c;
        switch (i10) {
            case 0:
                return (l7.h) j.s(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new g(j3, 1));
            default:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                long j10 = cursor.getLong(0);
                x xVar = new x(0);
                xVar.a = j10;
                xVar.f1549b = j3;
                return new l7.h(j10, j3);
        }
    }
}
