package p4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.impl.C2;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.C2426o;
import r3.C2666i;
import s3.InterfaceC2697b;

/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2544b implements g, InterfaceC2697b {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22222d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22224g;

    public /* synthetic */ C2544b(f fVar, Object obj, long j7, TimeUnit timeUnit, int i9) {
        this.b = i9;
        this.f22221c = fVar;
        this.f22224g = obj;
        this.f22222d = j7;
        this.f22223f = timeUnit;
    }

    @Override // p4.g
    public ScheduledFuture a(C2426o c2426o) {
        switch (this.b) {
            case 0:
                f fVar = (f) this.f22221c;
                fVar.getClass();
                return fVar.f22235c.schedule(new e(fVar, (Runnable) this.f22224g, c2426o, 1), this.f22222d, (TimeUnit) this.f22223f);
            default:
                f fVar2 = (f) this.f22221c;
                fVar2.getClass();
                return fVar2.f22235c.schedule(new v1.j(fVar2, (Callable) this.f22224g, c2426o, 2), this.f22222d, (TimeUnit) this.f22223f);
        }
    }

    @Override // s3.InterfaceC2697b
    public Object execute() {
        q3.h hVar = (q3.h) this.f22221c;
        C2666i c2666i = (C2666i) hVar.f22768c;
        c2666i.getClass();
        Iterable iterable = (Iterable) this.f22224g;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C2666i.k(iterable);
            SQLiteDatabase a6 = c2666i.a();
            a6.beginTransaction();
            try {
                a6.compileStatement(str).execute();
                Cursor rawQuery = a6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        c2666i.i(rawQuery.getInt(0), n3.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a6.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a6.setTransactionSuccessful();
            } finally {
                a6.endTransaction();
            }
        }
        c2666i.c(new C2(hVar.f22772g.a() + this.f22222d, (k3.j) this.f22223f));
        return null;
    }

    public /* synthetic */ C2544b(q3.h hVar, Iterable iterable, k3.j jVar, long j7) {
        this.b = 2;
        this.f22221c = hVar;
        this.f22224g = iterable;
        this.f22223f = jVar;
        this.f22222d = j7;
    }
}
