package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.appevents.UserDataStore;
import com.safedk.android.utils.i;
import e0.w;
import e0.x;
import e0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes.dex */
public abstract class RoomDatabase {

    @NotNull
    public static final Companion Companion = new Object();

    @RestrictTo
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private AutoCloser autoCloser;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @RestrictTo
    @Nullable
    protected List<? extends Callback> mCallbacks;

    @Nullable
    protected volatile SupportSQLiteDatabase mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final InvalidationTracker invalidationTracker = createInvalidationTracker();

    @NotNull
    private Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static class Builder<T extends RoomDatabase> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f21322a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f21323b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21324c;
        public final ArrayList d;
        public final ArrayList e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f21325f;

        /* renamed from: g, reason: collision with root package name */
        public Executor f21326g;

        /* renamed from: h, reason: collision with root package name */
        public Executor f21327h;

        /* renamed from: i, reason: collision with root package name */
        public SupportSQLiteOpenHelper.Factory f21328i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f21329j;

        /* renamed from: k, reason: collision with root package name */
        public final JournalMode f21330k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f21331l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f21332m;

        /* renamed from: n, reason: collision with root package name */
        public final long f21333n;

        /* renamed from: o, reason: collision with root package name */
        public final MigrationContainer f21334o;

        /* renamed from: p, reason: collision with root package name */
        public final LinkedHashSet f21335p;

        /* renamed from: q, reason: collision with root package name */
        public HashSet f21336q;

        /* renamed from: r, reason: collision with root package name */
        public String f21337r;

        public Builder(Context context, Class cls, String str) {
            p0.a.s(context, "context");
            this.f21322a = context;
            this.f21323b = cls;
            this.f21324c = str;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f21325f = new ArrayList();
            this.f21330k = JournalMode.f21338a;
            this.f21331l = true;
            this.f21333n = -1L;
            this.f21334o = new MigrationContainer();
            this.f21335p = new LinkedHashSet();
        }

        public final void a(Migration... migrationArr) {
            if (this.f21336q == null) {
                this.f21336q = new HashSet();
            }
            for (Migration migration : migrationArr) {
                HashSet hashSet = this.f21336q;
                p0.a.p(hashSet);
                hashSet.add(Integer.valueOf(migration.f21411a));
                HashSet hashSet2 = this.f21336q;
                p0.a.p(hashSet2);
                hashSet2.add(Integer.valueOf(migration.f21412b));
            }
            this.f21334o.a((Migration[]) Arrays.copyOf(migrationArr, migrationArr.length));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final RoomDatabase b() {
            SupportSQLiteOpenHelper.Factory sQLiteCopyOpenHelperFactory;
            String str;
            Executor executor = this.f21326g;
            if (executor == null && this.f21327h == null) {
                androidx.arch.core.executor.a aVar = ArchTaskExecutor.f1302c;
                this.f21327h = aVar;
                this.f21326g = aVar;
            } else if (executor != null && this.f21327h == null) {
                this.f21327h = executor;
            } else if (executor == null) {
                this.f21326g = this.f21327h;
            }
            HashSet hashSet = this.f21336q;
            LinkedHashSet linkedHashSet = this.f21335p;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (!(!linkedHashSet.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(android.support.v4.media.d.i("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory factory = this.f21328i;
            SupportSQLiteOpenHelper.Factory factory2 = factory;
            if (factory == null) {
                factory2 = new Object();
            }
            long j2 = this.f21333n;
            String str2 = this.f21324c;
            if (j2 > 0) {
                if (str2 != null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
            }
            String str3 = this.f21337r;
            if (str3 == null) {
                sQLiteCopyOpenHelperFactory = factory2;
            } else {
                if (str2 == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                }
                sQLiteCopyOpenHelperFactory = new SQLiteCopyOpenHelperFactory(str3, factory2);
            }
            MigrationContainer migrationContainer = this.f21334o;
            ArrayList arrayList = this.d;
            boolean z2 = this.f21329j;
            JournalMode journalMode = this.f21330k;
            journalMode.getClass();
            Context context = this.f21322a;
            p0.a.s(context, "context");
            if (journalMode == JournalMode.f21338a) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? JournalMode.f21339b : JournalMode.f21340c;
            }
            JournalMode journalMode2 = journalMode;
            Executor executor2 = this.f21326g;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor3 = this.f21327h;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, sQLiteCopyOpenHelperFactory, migrationContainer, arrayList, z2, journalMode2, executor2, executor3, this.f21331l, this.f21332m, linkedHashSet, this.e, this.f21325f);
            Class cls = this.f21323b;
            p0.a.s(cls, "klass");
            Package r3 = cls.getPackage();
            p0.a.p(r3);
            String name = r3.getName();
            String canonicalName = cls.getCanonicalName();
            p0.a.p(canonicalName);
            p0.a.r(name, "fullPackage");
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
                p0.a.r(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String concat = m.j1(canonicalName, '.', '_').concat("_Impl");
            try {
                if (name.length() == 0) {
                    str = concat;
                } else {
                    str = name + '.' + concat;
                }
                Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
                p0.a.q(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                RoomDatabase roomDatabase = (RoomDatabase) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                roomDatabase.init(databaseConfiguration);
                return roomDatabase;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Callback {
        public void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class JournalMode {

        /* renamed from: a, reason: collision with root package name */
        public static final JournalMode f21338a;

        /* renamed from: b, reason: collision with root package name */
        public static final JournalMode f21339b;

        /* renamed from: c, reason: collision with root package name */
        public static final JournalMode f21340c;
        public static final /* synthetic */ JournalMode[] d;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.RoomDatabase$JournalMode, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.room.RoomDatabase$JournalMode, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [androidx.room.RoomDatabase$JournalMode, java.lang.Enum] */
        static {
            ?? r02 = new Enum("AUTOMATIC", 0);
            f21338a = r02;
            ?? r1 = new Enum("TRUNCATE", 1);
            f21339b = r1;
            ?? r2 = new Enum("WRITE_AHEAD_LOGGING", 2);
            f21340c = r2;
            d = new JournalMode[]{r02, r1, r2};
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) d.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class MigrationContainer {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f21341a = new LinkedHashMap();

        public final void a(Migration... migrationArr) {
            p0.a.s(migrationArr, "migrations");
            for (Migration migration : migrationArr) {
                int i2 = migration.f21411a;
                LinkedHashMap linkedHashMap = this.f21341a;
                Integer valueOf = Integer.valueOf(i2);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new TreeMap();
                    linkedHashMap.put(valueOf, obj);
                }
                TreeMap treeMap = (TreeMap) obj;
                int i3 = migration.f21412b;
                if (treeMap.containsKey(Integer.valueOf(i3))) {
                    Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i3)) + " with " + migration);
                }
                treeMap.put(Integer.valueOf(i3), migration);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class PrepackagedDatabaseCallback {
    }

    /* loaded from: classes.dex */
    public interface QueryCallback {
        void a();
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        p0.a.r(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static final void access$internalBeginTransaction(RoomDatabase roomDatabase) {
        roomDatabase.assertNotMainThread();
        SupportSQLiteDatabase U = roomDatabase.getOpenHelper().U();
        roomDatabase.getInvalidationTracker().f(U);
        if (U.d0()) {
            U.q();
        } else {
            U.d();
        }
    }

    public static Object b(Class cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return b(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).a());
        }
        return null;
    }

    @d0.a
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @d0.a
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i2 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    public final void a() {
        getOpenHelper().U().x();
        if (inTransaction()) {
            return;
        }
        InvalidationTracker invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f21279g.compareAndSet(false, true)) {
            if (invalidationTracker.f21278f != null) {
                throw null;
            }
            invalidationTracker.f21275a.getQueryExecutor().execute(invalidationTracker.f21287o);
        }
    }

    @RestrictTo
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && !(!isMainThread$room_runtime_release())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    @RestrictTo
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw null;
     */
    @d0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void beginTransaction() {
        /*
            r2 = this;
            r2.assertNotMainThread()
            androidx.room.AutoCloser r0 = r2.autoCloser
            if (r0 != 0) goto L27
            r2.assertNotMainThread()
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r2.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.U()
            androidx.room.InvalidationTracker r1 = r2.getInvalidationTracker()
            r1.f(r0)
            boolean r1 = r0.d0()
            if (r1 == 0) goto L23
            r0.q()
            goto L26
        L23:
            r0.d()
        L26:
            return
        L27:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L29
        L29:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.beginTransaction():void");
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            p0.a.r(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().e();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String str) {
        p0.a.s(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().U().M(str);
    }

    @NotNull
    public abstract InvalidationTracker createInvalidationTracker();

    @NotNull
    public abstract SupportSQLiteOpenHelper createOpenHelper(@NotNull DatabaseConfiguration databaseConfiguration);

    @d0.a
    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            a();
        } else {
            autoCloser.b(new RoomDatabase$endTransaction$1(this));
        }
    }

    @RestrictTo
    @NotNull
    public final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @RestrictTo
    @NotNull
    public List<Migration> getAutoMigrations(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        p0.a.s(map, "autoMigrationSpecs");
        return w.f30218a;
    }

    @RestrictTo
    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        p0.a.r(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    @NotNull
    public InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        p0.a.B0("internalOpenHelper");
        throw null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        p0.a.B0("internalQueryExecutor");
        throw null;
    }

    @RestrictTo
    @NotNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return y.f30220a;
    }

    @RestrictTo
    @NotNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return x.f30219a;
    }

    @RestrictTo
    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        p0.a.B0("internalTransactionExecutor");
        throw null;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> cls) {
        p0.a.s(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return getOpenHelper().U().c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public void init(@NotNull DatabaseConfiguration databaseConfiguration) {
        p0.a.s(databaseConfiguration, i.f30073c);
        this.internalOpenHelper = createOpenHelper(databaseConfiguration);
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i2 = -1;
            List list = databaseConfiguration.f21263q;
            if (hasNext) {
                Class<? extends AutoMigrationSpec> next = it.next();
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = size - 1;
                        if (next.isAssignableFrom(list.get(size).getClass())) {
                            bitSet.set(size);
                            i2 = size;
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size = i3;
                        }
                    }
                }
                if (i2 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, list.get(i2));
            } else {
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i4 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i4 < 0) {
                            break;
                        } else {
                            size2 = i4;
                        }
                    }
                }
                Iterator<Migration> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Migration next2 = it2.next();
                    int i5 = next2.f21411a;
                    MigrationContainer migrationContainer = databaseConfiguration.d;
                    LinkedHashMap linkedHashMap = migrationContainer.f21341a;
                    if (linkedHashMap.containsKey(Integer.valueOf(i5))) {
                        Map map = (Map) linkedHashMap.get(Integer.valueOf(i5));
                        if (map == null) {
                            map = x.f30219a;
                        }
                        if (!map.containsKey(Integer.valueOf(next2.f21412b))) {
                        }
                    }
                    migrationContainer.a(next2);
                }
                SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (SQLiteCopyOpenHelper) b(SQLiteCopyOpenHelper.class, getOpenHelper());
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.f21380h = databaseConfiguration;
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) b(AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    autoClosingRoomOpenHelper.getClass();
                    this.autoCloser = null;
                    InvalidationTracker invalidationTracker = getInvalidationTracker();
                    invalidationTracker.getClass();
                    p0.a.s(null, "autoCloser");
                    invalidationTracker.f21278f = null;
                    throw null;
                }
                boolean z2 = databaseConfiguration.f21253g == JournalMode.f21340c;
                getOpenHelper().setWriteAheadLoggingEnabled(z2);
                this.mCallbacks = databaseConfiguration.e;
                this.internalQueryExecutor = databaseConfiguration.f21254h;
                this.internalTransactionExecutor = new TransactionExecutor(databaseConfiguration.f21255i);
                this.allowMainThreadQueries = databaseConfiguration.f21252f;
                this.writeAheadLoggingEnabled = z2;
                Intent intent = databaseConfiguration.f21256j;
                if (intent != null) {
                    String str = databaseConfiguration.f21250b;
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    InvalidationTracker invalidationTracker2 = getInvalidationTracker();
                    invalidationTracker2.getClass();
                    Context context = databaseConfiguration.f21249a;
                    p0.a.s(context, "context");
                    invalidationTracker2.f21284l = new MultiInstanceInvalidationClient(context, str, intent, invalidationTracker2, invalidationTracker2.f21275a.getQueryExecutor());
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    List list2 = databaseConfiguration.f21262p;
                    if (hasNext2) {
                        Map.Entry<Class<?>, List<Class<?>>> next3 = it3.next();
                        Class<?> key = next3.getKey();
                        for (Class<?> cls : next3.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i6 = size3 - 1;
                                    if (cls.isAssignableFrom(list2.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i6 < 0) {
                                        break;
                                    } else {
                                        size3 = i6;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            this.typeConverters.put(cls, list2.get(size3));
                        }
                    } else {
                        int size4 = list2.size() - 1;
                        if (size4 < 0) {
                            return;
                        }
                        while (true) {
                            int i7 = size4 - 1;
                            if (!bitSet2.get(size4)) {
                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i7 < 0) {
                                return;
                            } else {
                                size4 = i7;
                            }
                        }
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        InvalidationTracker invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        synchronized (invalidationTracker.f21286n) {
            if (invalidationTracker.f21280h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase.g("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase.g("PRAGMA recursive_triggers='ON';");
            supportSQLiteDatabase.g("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.f(supportSQLiteDatabase);
            invalidationTracker.f21281i = supportSQLiteDatabase.M("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f21280h = true;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            autoCloser.getClass();
            isOpen = !false;
        } else {
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase == null) {
                bool = null;
                return p0.a.g(bool, Boolean.TRUE);
            }
            isOpen = supportSQLiteDatabase.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return p0.a.g(bool, Boolean.TRUE);
    }

    @RestrictTo
    public final boolean isOpenInternal() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    @NotNull
    public final Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery) {
        p0.a.s(supportSQLiteQuery, "query");
        return query$default(this, supportSQLiteQuery, null, 2, null);
    }

    public void runInTransaction(@NotNull Runnable runnable) {
        p0.a.s(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @RestrictTo
    public final void setAutoMigrationSpecs(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        p0.a.s(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @d0.a
    public void setTransactionSuccessful() {
        getOpenHelper().U().m();
    }

    @NotNull
    public Cursor query(@NotNull String str, @Nullable Object[] objArr) {
        p0.a.s(str, "query");
        return getOpenHelper().U().A(new SimpleSQLiteQuery(str, objArr));
    }

    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery, @Nullable CancellationSignal cancellationSignal) {
        p0.a.s(supportSQLiteQuery, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().U().l(supportSQLiteQuery, cancellationSignal);
        }
        return getOpenHelper().U().A(supportSQLiteQuery);
    }

    public <V> V runInTransaction(@NotNull Callable<V> callable) {
        p0.a.s(callable, "body");
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
