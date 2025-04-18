package v1;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f25939o = {"UPDATE", "DELETE", "INSERT"};
    public final f0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f25940b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f25941c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f25942d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f25943e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25944f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f25945g;

    /* renamed from: h, reason: collision with root package name */
    public volatile z1.j f25946h;

    /* renamed from: i, reason: collision with root package name */
    public final q f25947i;

    /* renamed from: j, reason: collision with root package name */
    public final d3.g f25948j;

    /* renamed from: k, reason: collision with root package name */
    public final m.g f25949k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f25950l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f25951m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.activity.i f25952n;

    public u(f0 database, HashMap shadowTablesMap, HashMap viewTables, String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.a = database;
        this.f25940b = shadowTablesMap;
        this.f25941c = viewTables;
        this.f25944f = new AtomicBoolean(false);
        this.f25947i = new q(tableNames.length);
        this.f25948j = new d3.g(database);
        this.f25949k = new m.g();
        this.f25950l = new Object();
        this.f25951m = new Object();
        this.f25942d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = tableNames[i10];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f25942d.put(lowerCase, Integer.valueOf(i10));
            String str3 = (String) this.f25940b.get(tableNames[i10]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i10] = lowerCase;
        }
        this.f25943e = strArr;
        for (Map.Entry entry : this.f25940b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f25942d.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = str5.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f25942d;
                linkedHashMap.put(lowerCase3, MapsKt.getValue(linkedHashMap, lowerCase2));
            }
        }
        this.f25952n = new androidx.activity.i(this, 7);
    }

    public final void a(r observer) {
        int[] intArray;
        s sVar;
        boolean z10;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] e2 = e(observer.a);
        ArrayList arrayList = new ArrayList(e2.length);
        for (String str : e2) {
            LinkedHashMap linkedHashMap = this.f25942d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
        }
        intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        s sVar2 = new s(observer, intArray, e2);
        synchronized (this.f25949k) {
            sVar = (s) this.f25949k.b(observer, sVar2);
        }
        if (sVar == null) {
            q qVar = this.f25947i;
            int[] tableIds = Arrays.copyOf(intArray, intArray.length);
            qVar.getClass();
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (qVar) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = qVar.a;
                    long j3 = jArr[i10];
                    jArr[i10] = 1 + j3;
                    if (j3 == 0) {
                        z10 = true;
                        qVar.f25933d = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z10) {
                f0 f0Var = this.a;
                if (f0Var.isOpenInternal()) {
                    g(((a2.h) f0Var.getOpenHelper()).d());
                }
            }
        }
    }

    public final l0 b(String[] tableNames, Callable computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        String[] tableNames2 = e(tableNames);
        for (String str : tableNames2) {
            LinkedHashMap linkedHashMap = this.f25942d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!linkedHashMap.containsKey(lowerCase)) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        d3.g gVar = this.f25948j;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(tableNames2, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new l0((f0) gVar.f16812c, gVar, computeFunction, tableNames2);
    }

    public final boolean c() {
        if (!this.a.isOpenInternal()) {
            return false;
        }
        if (!this.f25945g) {
            ((a2.h) this.a.getOpenHelper()).d();
        }
        if (!this.f25945g) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final void d(r observer) {
        s sVar;
        boolean z10;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f25949k) {
            sVar = (s) this.f25949k.c(observer);
        }
        if (sVar != null) {
            q qVar = this.f25947i;
            int[] iArr = sVar.f25934b;
            int[] tableIds = Arrays.copyOf(iArr, iArr.length);
            qVar.getClass();
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (qVar) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = qVar.a;
                    long j3 = jArr[i10];
                    jArr[i10] = j3 - 1;
                    if (j3 == 1) {
                        z10 = true;
                        qVar.f25933d = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z10) {
                f0 f0Var = this.a;
                if (f0Var.isOpenInternal()) {
                    g(((a2.h) f0Var.getOpenHelper()).d());
                }
            }
        }
    }

    public final String[] e(String[] strArr) {
        Set createSetBuilder = SetsKt.createSetBuilder();
        for (String str : strArr) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Map map = this.f25941c;
            if (map.containsKey(lowerCase)) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map.get(lowerCase2);
                Intrinsics.checkNotNull(obj);
                createSetBuilder.addAll((Collection) obj);
            } else {
                createSetBuilder.add(str);
            }
        }
        return (String[]) SetsKt.build(createSetBuilder).toArray(new String[0]);
    }

    public final void f(z1.a aVar, int i10) {
        aVar.C("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f25943e[i10];
        String[] strArr = f25939o;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + ka.e.l(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            aVar.C(str3);
        }
    }

    public final void g(z1.a database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.Q()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f25950l) {
                    int[] a = this.f25947i.a();
                    if (a == null) {
                        return;
                    }
                    Intrinsics.checkNotNullParameter(database, "database");
                    if (database.R()) {
                        database.H();
                    } else {
                        database.A();
                    }
                    try {
                        int length = a.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = a[i10];
                            int i13 = i11 + 1;
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    String str = this.f25943e[i11];
                                    String[] strArr = f25939o;
                                    for (int i14 = 0; i14 < 3; i14++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + ka.e.l(str, strArr[i14]);
                                        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.C(str2);
                                    }
                                }
                            } else {
                                f(database, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.F();
                        database.J();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        database.J();
                        throw th2;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        } catch (IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
