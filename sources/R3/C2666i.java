package r3;

import M0.C0218i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.applovin.impl.V1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import s3.InterfaceC2697b;
import s3.InterfaceC2698c;
import s7.InterfaceC2701a;
import t3.C2707b;
import u3.AbstractC2753a;

/* renamed from: r3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2666i implements InterfaceC2661d, InterfaceC2698c, InterfaceC2660c {

    /* renamed from: h, reason: collision with root package name */
    public static final h3.c f22827h = new h3.c("proto");
    public final C2668k b;

    /* renamed from: c, reason: collision with root package name */
    public final C2707b f22828c;

    /* renamed from: d, reason: collision with root package name */
    public final C2707b f22829d;

    /* renamed from: f, reason: collision with root package name */
    public final C2658a f22830f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2701a f22831g;

    public C2666i(C2707b c2707b, C2707b c2707b2, C2658a c2658a, C2668k c2668k, InterfaceC2701a interfaceC2701a) {
        this.b = c2668k;
        this.f22828c = c2707b;
        this.f22829d = c2707b2;
        this.f22830f = c2658a;
        this.f22831g = interfaceC2701a;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, k3.j jVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f21433a, String.valueOf(AbstractC2753a.a(jVar.f21434c))));
        byte[] bArr = jVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String k(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C2659b) it.next()).f22822a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object l(Cursor cursor, InterfaceC2664g interfaceC2664g) {
        try {
            return interfaceC2664g.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        C2668k c2668k = this.b;
        Objects.requireNonNull(c2668k);
        C2707b c2707b = this.f22829d;
        long a6 = c2707b.a();
        while (true) {
            try {
                return c2668k.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (c2707b.a() < this.f22830f.f22819c + a6) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e4);
                }
            }
        }
    }

    public final Object c(InterfaceC2664g interfaceC2664g) {
        SQLiteDatabase a6 = a();
        a6.beginTransaction();
        try {
            Object apply = interfaceC2664g.apply(a6);
            a6.setTransactionSuccessful();
            return apply;
        } finally {
            a6.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, k3.j jVar, int i9) {
        ArrayList arrayList = new ArrayList();
        Long b = b(sQLiteDatabase, jVar);
        if (b == null) {
            return arrayList;
        }
        l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(i9)), new C0218i(this, arrayList, jVar, 8));
        return arrayList;
    }

    public final void i(long j7, n3.c cVar, String str) {
        c(new V1(str, cVar, j7));
    }

    public final Object j(InterfaceC2697b interfaceC2697b) {
        SQLiteDatabase a6 = a();
        C2707b c2707b = this.f22829d;
        long a9 = c2707b.a();
        while (true) {
            try {
                a6.beginTransaction();
                try {
                    Object execute = interfaceC2697b.execute();
                    a6.setTransactionSuccessful();
                    return execute;
                } finally {
                    a6.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (c2707b.a() < this.f22830f.f22819c + a9) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e4);
                }
            }
        }
    }
}
