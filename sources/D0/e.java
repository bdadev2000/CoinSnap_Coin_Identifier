package D0;

import Q7.n0;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.C2689f;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f594j = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;

    /* renamed from: c, reason: collision with root package name */
    public final j f596c;

    /* renamed from: f, reason: collision with root package name */
    public volatile I0.f f599f;

    /* renamed from: g, reason: collision with root package name */
    public final c f600g;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f597d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f598e = false;

    /* renamed from: h, reason: collision with root package name */
    public final C2689f f601h = new C2689f();

    /* renamed from: i, reason: collision with root package name */
    public final B3.k f602i = new B3.k(this, 1);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f595a = new HashMap();

    public e(j jVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f596c = jVar;
        this.f600g = new c(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.b = new String[length];
        for (int i9 = 0; i9 < length; i9++) {
            String str = strArr[i9];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f595a.put(lowerCase, Integer.valueOf(i9));
            String str2 = (String) hashMap.get(strArr[i9]);
            if (str2 != null) {
                this.b[i9] = str2.toLowerCase(locale);
            } else {
                this.b[i9] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f595a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.f595a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        boolean z8;
        I0.b bVar = this.f596c.f615a;
        if (bVar != null && ((SQLiteDatabase) bVar.f1397c).isOpen()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        if (!this.f598e) {
            this.f596c.f616c.getWritableDatabase();
        }
        if (this.f598e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(I0.b bVar, int i9) {
        bVar.l(n0.f(i9, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.b[i9];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f594j;
        for (int i10 = 0; i10 < 3; i10++) {
            String str2 = strArr[i10];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            AbstractC2914a.j(sb, str, "_", str2, "`");
            AbstractC2914a.j(sb, " AFTER ", str2, " ON `", str);
            AbstractC2914a.j(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            AbstractC2914a.j(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i9);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.l(sb.toString());
        }
    }

    public final void c(I0.b bVar) {
        if (((SQLiteDatabase) bVar.f1397c).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f596c.f621h.readLock();
                readLock.lock();
                try {
                    int[] a6 = this.f600g.a();
                    if (a6 == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = a6.length;
                    bVar.a();
                    for (int i9 = 0; i9 < length; i9++) {
                        try {
                            int i10 = a6[i9];
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    String str = this.b[i9];
                                    StringBuilder sb = new StringBuilder();
                                    String[] strArr = f594j;
                                    for (int i11 = 0; i11 < 3; i11++) {
                                        String str2 = strArr[i11];
                                        sb.setLength(0);
                                        sb.append("DROP TRIGGER IF EXISTS ");
                                        sb.append("`");
                                        sb.append("room_table_modification_trigger_");
                                        sb.append(str);
                                        sb.append("_");
                                        sb.append(str2);
                                        sb.append("`");
                                        bVar.l(sb.toString());
                                    }
                                }
                            } else {
                                b(bVar, i9);
                            }
                        } catch (Throwable th) {
                            bVar.k();
                            throw th;
                        }
                    }
                    bVar.o();
                    bVar.k();
                    c cVar = this.f600g;
                    synchronized (cVar) {
                        cVar.f593e = false;
                    }
                    readLock.unlock();
                } catch (Throwable th2) {
                    readLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e4) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
                return;
            }
        }
    }
}
