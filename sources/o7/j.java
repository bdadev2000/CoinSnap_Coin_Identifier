package o7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class j implements d, p7.c, c {

    /* renamed from: h, reason: collision with root package name */
    public static final f7.c f23150h = new f7.c("proto");

    /* renamed from: b, reason: collision with root package name */
    public final m f23151b;

    /* renamed from: c, reason: collision with root package name */
    public final q7.a f23152c;

    /* renamed from: d, reason: collision with root package name */
    public final q7.a f23153d;

    /* renamed from: f, reason: collision with root package name */
    public final a f23154f;

    /* renamed from: g, reason: collision with root package name */
    public final rh.a f23155g;

    public j(q7.a aVar, q7.a aVar2, a aVar3, m mVar, rh.a aVar4) {
        this.f23151b = mVar;
        this.f23152c = aVar;
        this.f23153d = aVar2;
        this.f23154f = aVar3;
        this.f23155g = aVar4;
    }

    public static Long g(SQLiteDatabase sQLiteDatabase, i7.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.a, String.valueOf(r7.a.a(iVar.f19179c))));
        byte[] bArr = iVar.f19178b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) s(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new com.facebook.appevents.m(14));
    }

    public static String r(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object s(Cursor cursor, h hVar) {
        try {
            return hVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23151b.close();
    }

    public final SQLiteDatabase d() {
        m mVar = this.f23151b;
        Objects.requireNonNull(mVar);
        return (SQLiteDatabase) p(new androidx.core.app.h(mVar, 13), new com.facebook.appevents.m(10));
    }

    public final Object j(h hVar) {
        SQLiteDatabase d10 = d();
        d10.beginTransaction();
        try {
            Object apply = hVar.apply(d10);
            d10.setTransactionSuccessful();
            return apply;
        } finally {
            d10.endTransaction();
        }
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, i7.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long g10 = g(sQLiteDatabase, iVar);
        if (g10 == null) {
            return arrayList;
        }
        s(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{g10.toString()}, null, null, null, String.valueOf(i10)), new f2.i(5, this, arrayList, iVar));
        return arrayList;
    }

    public final Object p(androidx.core.app.h hVar, com.facebook.appevents.m mVar) {
        q7.b bVar = (q7.b) this.f23153d;
        long a = bVar.a();
        while (true) {
            try {
                int i10 = hVar.f1188b;
                Object obj = hVar.f1189c;
                switch (i10) {
                    case 13:
                        return ((m) obj).getWritableDatabase();
                    default:
                        ((SQLiteDatabase) obj).beginTransaction();
                        return null;
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (bVar.a() >= this.f23154f.f23137c + a) {
                    return mVar.apply(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object q(p7.b bVar) {
        SQLiteDatabase d10 = d();
        p(new androidx.core.app.h(d10, 14), new com.facebook.appevents.m(12));
        try {
            Object execute = bVar.execute();
            d10.setTransactionSuccessful();
            return execute;
        } finally {
            d10.endTransaction();
        }
    }
}
