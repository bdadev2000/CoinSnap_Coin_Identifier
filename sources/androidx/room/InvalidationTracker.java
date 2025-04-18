package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.util.Log;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import b1.f0;
import e0.e0;
import e0.u;
import e0.y;
import f0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.q;
import z0.m;

/* loaded from: classes2.dex */
public class InvalidationTracker {

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f21274p = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f21275a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f21276b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f21277c;
    public final LinkedHashMap d;
    public final String[] e;

    /* renamed from: f, reason: collision with root package name */
    public AutoCloser f21278f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f21279g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f21280h;

    /* renamed from: i, reason: collision with root package name */
    public volatile SupportSQLiteStatement f21281i;

    /* renamed from: j, reason: collision with root package name */
    public final ObservedTableTracker f21282j;

    /* renamed from: k, reason: collision with root package name */
    public final SafeIterableMap f21283k;

    /* renamed from: l, reason: collision with root package name */
    public MultiInstanceInvalidationClient f21284l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f21285m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f21286n;

    /* renamed from: o, reason: collision with root package name */
    public final InvalidationTracker$refreshRunnable$1 f21287o;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static String a(String str, String str2) {
            p0.a.s(str, "tableName");
            p0.a.s(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* loaded from: classes2.dex */
    public static final class ObservedTableTracker {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f21288a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f21289b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f21290c;
        public boolean d;

        /* loaded from: classes2.dex */
        public static final class Companion {
        }

        public ObservedTableTracker(int i2) {
            this.f21288a = new long[i2];
            this.f21289b = new boolean[i2];
            this.f21290c = new int[i2];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.d) {
                        return null;
                    }
                    long[] jArr = this.f21288a;
                    int length = jArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int i4 = i3 + 1;
                        int i5 = 1;
                        boolean z2 = jArr[i2] > 0;
                        boolean[] zArr = this.f21289b;
                        if (z2 != zArr[i3]) {
                            int[] iArr = this.f21290c;
                            if (!z2) {
                                i5 = 2;
                            }
                            iArr[i3] = i5;
                        } else {
                            this.f21290c[i3] = 0;
                        }
                        zArr[i3] = z2;
                        i2++;
                        i3 = i4;
                    }
                    this.d = false;
                    return (int[]) this.f21290c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Observer {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f21291a;

        public Observer(String[] strArr) {
            p0.a.s(strArr, "tables");
            this.f21291a = strArr;
        }

        public abstract void a(Set set);
    }

    /* loaded from: classes2.dex */
    public static final class ObserverWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final Observer f21292a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f21293b;

        /* renamed from: c, reason: collision with root package name */
        public final String[] f21294c;
        public final Set d;

        public ObserverWrapper(Observer observer, int[] iArr, String[] strArr) {
            p0.a.s(observer, "observer");
            this.f21292a = observer;
            this.f21293b = iArr;
            this.f21294c = strArr;
            this.d = (strArr.length == 0) ^ true ? f0.B(strArr[0]) : y.f30220a;
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final void a(Set set) {
            p0.a.s(set, "invalidatedTablesIds");
            int[] iArr = this.f21293b;
            int length = iArr.length;
            Set set2 = y.f30220a;
            if (length != 0) {
                int i2 = 0;
                if (length != 1) {
                    l lVar = new l();
                    int length2 = iArr.length;
                    int i3 = 0;
                    while (i2 < length2) {
                        int i4 = i3 + 1;
                        if (set.contains(Integer.valueOf(iArr[i2]))) {
                            lVar.add(this.f21294c[i3]);
                        }
                        i2++;
                        i3 = i4;
                    }
                    set2 = f0.f(lVar);
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    set2 = this.d;
                }
            }
            if (!set2.isEmpty()) {
                this.f21292a.a(set2);
            }
        }

        public final void b(String[] strArr) {
            String[] strArr2 = this.f21294c;
            int length = strArr2.length;
            Set set = y.f30220a;
            if (length != 0) {
                if (length != 1) {
                    l lVar = new l();
                    for (String str : strArr) {
                        for (String str2 : strArr2) {
                            if (m.S0(str2, str, true)) {
                                lVar.add(str2);
                            }
                        }
                    }
                    set = f0.f(lVar);
                } else {
                    int length2 = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        if (m.S0(strArr[i2], strArr2[0], true)) {
                            set = this.d;
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (!set.isEmpty()) {
                this.f21292a.a(set);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WeakObserver extends Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        public final void a(Set set) {
            p0.a.s(set, "tables");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.room.InvalidationTracker$refreshRunnable$1] */
    public InvalidationTracker(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        p0.a.s(roomDatabase, "database");
        this.f21275a = roomDatabase;
        this.f21276b = hashMap;
        this.f21277c = hashMap2;
        this.f21279g = new AtomicBoolean(false);
        this.f21282j = new ObservedTableTracker(strArr.length);
        new InvalidationLiveDataContainer(roomDatabase);
        this.f21283k = new SafeIterableMap();
        this.f21285m = new Object();
        this.f21286n = new Object();
        this.d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr[i2];
            Locale locale = Locale.US;
            p0.a.r(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            p0.a.r(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(lowerCase, Integer.valueOf(i2));
            String str3 = (String) this.f21276b.get(strArr[i2]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                p0.a.r(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i2] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.f21276b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            p0.a.r(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            p0.a.r(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                p0.a.r(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.d;
                linkedHashMap.put(lowerCase3, e0.r(lowerCase2, linkedHashMap));
            }
        }
        this.f21287o = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            public final l a() {
                InvalidationTracker invalidationTracker = InvalidationTracker.this;
                l lVar = new l();
                Cursor query$default = RoomDatabase.query$default(invalidationTracker.f21275a, new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
                while (query$default.moveToNext()) {
                    try {
                        lVar.add(Integer.valueOf(query$default.getInt(0)));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            q.b(query$default, th);
                            throw th2;
                        }
                    }
                }
                q.b(query$default, null);
                l f2 = f0.f(lVar);
                if (!f2.f30449a.isEmpty()) {
                    if (InvalidationTracker.this.f21281i == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    SupportSQLiteStatement supportSQLiteStatement = InvalidationTracker.this.f21281i;
                    if (supportSQLiteStatement == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    supportSQLiteStatement.k();
                }
                return f2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Set set;
                Lock closeLock$room_runtime_release = InvalidationTracker.this.f21275a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                    } catch (SQLiteException e) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                        set = y.f30220a;
                        closeLock$room_runtime_release.unlock();
                        if (InvalidationTracker.this.f21278f != null) {
                            throw null;
                        }
                    } catch (IllegalStateException e2) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                        set = y.f30220a;
                        closeLock$room_runtime_release.unlock();
                        if (InvalidationTracker.this.f21278f != null) {
                            throw null;
                        }
                    }
                    if (!InvalidationTracker.this.b()) {
                        closeLock$room_runtime_release.unlock();
                        if (InvalidationTracker.this.f21278f != null) {
                            throw null;
                        }
                        return;
                    }
                    if (!InvalidationTracker.this.f21279g.compareAndSet(true, false)) {
                        closeLock$room_runtime_release.unlock();
                        if (InvalidationTracker.this.f21278f != null) {
                            throw null;
                        }
                        return;
                    }
                    if (InvalidationTracker.this.f21275a.inTransaction()) {
                        closeLock$room_runtime_release.unlock();
                        if (InvalidationTracker.this.f21278f != null) {
                            throw null;
                        }
                        return;
                    }
                    SupportSQLiteDatabase U = InvalidationTracker.this.f21275a.getOpenHelper().U();
                    U.q();
                    try {
                        set = a();
                        U.m();
                        closeLock$room_runtime_release.unlock();
                        if (InvalidationTracker.this.f21278f != null) {
                            throw null;
                        }
                        if (!set.isEmpty()) {
                            InvalidationTracker invalidationTracker = InvalidationTracker.this;
                            synchronized (invalidationTracker.f21283k) {
                                Iterator it = invalidationTracker.f21283k.iterator();
                                while (it.hasNext()) {
                                    ((InvalidationTracker.ObserverWrapper) ((Map.Entry) it.next()).getValue()).a(set);
                                }
                            }
                        }
                    } finally {
                        U.x();
                    }
                } catch (Throwable th) {
                    closeLock$room_runtime_release.unlock();
                    if (InvalidationTracker.this.f21278f == null) {
                        throw th;
                    }
                    throw null;
                }
            }
        };
    }

    public final void a(Observer observer) {
        ObserverWrapper observerWrapper;
        boolean z2;
        p0.a.s(observer, "observer");
        String[] strArr = observer.f21291a;
        l lVar = new l();
        for (String str : strArr) {
            Locale locale = Locale.US;
            p0.a.r(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            p0.a.r(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Map map = this.f21277c;
            if (map.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(locale);
                p0.a.r(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map.get(lowerCase2);
                p0.a.p(obj);
                lVar.addAll((Collection) obj);
            } else {
                lVar.add(str);
            }
        }
        String[] strArr2 = (String[]) f0.f(lVar).toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            LinkedHashMap linkedHashMap = this.d;
            Locale locale2 = Locale.US;
            p0.a.r(locale2, "US");
            String lowerCase3 = str2.toLowerCase(locale2);
            p0.a.r(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase3);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] Y0 = u.Y0(arrayList);
        ObserverWrapper observerWrapper2 = new ObserverWrapper(observer, Y0, strArr2);
        synchronized (this.f21283k) {
            observerWrapper = (ObserverWrapper) this.f21283k.b(observer, observerWrapper2);
        }
        if (observerWrapper == null) {
            ObservedTableTracker observedTableTracker = this.f21282j;
            int[] copyOf = Arrays.copyOf(Y0, Y0.length);
            observedTableTracker.getClass();
            p0.a.s(copyOf, "tableIds");
            synchronized (observedTableTracker) {
                z2 = false;
                for (int i2 : copyOf) {
                    long[] jArr = observedTableTracker.f21288a;
                    long j2 = jArr[i2];
                    jArr[i2] = 1 + j2;
                    if (j2 == 0) {
                        z2 = true;
                        observedTableTracker.d = true;
                    }
                }
            }
            if (z2) {
                RoomDatabase roomDatabase = this.f21275a;
                if (roomDatabase.isOpenInternal()) {
                    f(roomDatabase.getOpenHelper().U());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.f21275a.isOpenInternal()) {
            return false;
        }
        if (!this.f21280h) {
            this.f21275a.getOpenHelper().U();
        }
        if (this.f21280h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(Observer observer) {
        ObserverWrapper observerWrapper;
        boolean z2;
        p0.a.s(observer, "observer");
        synchronized (this.f21283k) {
            observerWrapper = (ObserverWrapper) this.f21283k.c(observer);
        }
        if (observerWrapper != null) {
            ObservedTableTracker observedTableTracker = this.f21282j;
            int[] iArr = observerWrapper.f21293b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            observedTableTracker.getClass();
            p0.a.s(copyOf, "tableIds");
            synchronized (observedTableTracker) {
                z2 = false;
                for (int i2 : copyOf) {
                    long[] jArr = observedTableTracker.f21288a;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        z2 = true;
                        observedTableTracker.d = true;
                    }
                }
            }
            if (z2) {
                RoomDatabase roomDatabase = this.f21275a;
                if (roomDatabase.isOpenInternal()) {
                    f(roomDatabase.getOpenHelper().U());
                }
            }
        }
    }

    public final void d(SupportSQLiteDatabase supportSQLiteDatabase, int i2) {
        supportSQLiteDatabase.g("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.e[i2];
        String[] strArr = f21274p;
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = strArr[i3];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i2 + " AND invalidated = 0; END";
            p0.a.r(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.g(str3);
        }
    }

    public final void e() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f21284l;
        if (multiInstanceInvalidationClient != null && multiInstanceInvalidationClient.f21302i.compareAndSet(false, true)) {
            Observer observer = multiInstanceInvalidationClient.f21299f;
            if (observer == null) {
                p0.a.B0("observer");
                throw null;
            }
            multiInstanceInvalidationClient.f21297b.c(observer);
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f21300g;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.Q(multiInstanceInvalidationClient.f21301h, multiInstanceInvalidationClient.e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            multiInstanceInvalidationClient.d.unbindService(multiInstanceInvalidationClient.f21303j);
        }
        this.f21284l = null;
    }

    public final void f(SupportSQLiteDatabase supportSQLiteDatabase) {
        p0.a.s(supportSQLiteDatabase, "database");
        if (supportSQLiteDatabase.c0()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f21275a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f21285m) {
                    int[] a2 = this.f21282j.a();
                    if (a2 == null) {
                        return;
                    }
                    if (supportSQLiteDatabase.d0()) {
                        supportSQLiteDatabase.q();
                    } else {
                        supportSQLiteDatabase.d();
                    }
                    try {
                        int length = a2.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = a2[i2];
                            int i5 = i3 + 1;
                            if (i4 == 1) {
                                d(supportSQLiteDatabase, i3);
                            } else if (i4 == 2) {
                                String str = this.e[i3];
                                String[] strArr = f21274p;
                                for (int i6 = 0; i6 < 3; i6++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + Companion.a(str, strArr[i6]);
                                    p0.a.r(str2, "StringBuilder().apply(builderAction).toString()");
                                    supportSQLiteDatabase.g(str2);
                                }
                            }
                            i2++;
                            i3 = i5;
                        }
                        supportSQLiteDatabase.m();
                        supportSQLiteDatabase.x();
                    } catch (Throwable th) {
                        supportSQLiteDatabase.x();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
