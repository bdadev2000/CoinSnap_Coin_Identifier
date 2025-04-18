package v1;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f0 {
    public static final d0 Companion = new d0();
    private boolean allowMainThreadQueries;
    private final Map<String, Object> backingFieldMap;
    private z1.g internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @JvmField
    protected List<? extends m2.f> mCallbacks;

    @JvmField
    protected volatile z1.a mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final u invalidationTracker = createInvalidationTracker();
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public f0() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static /* synthetic */ Cursor query$default(f0 f0Var, z1.i iVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return f0Var.query(iVar, cancellationSignal);
    }

    public final void a() {
        assertNotMainThread();
        z1.a d10 = ((a2.h) getOpenHelper()).d();
        getInvalidationTracker().g(d10);
        if (d10.R()) {
            d10.H();
        } else {
            d10.A();
        }
    }

    public void assertNotMainThread() {
        if (this.allowMainThreadQueries || (!isMainThread$room_runtime_release())) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!(inTransaction() || this.suspendingTransactionId.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void b() {
        ((a2.h) getOpenHelper()).d().J();
        if (!inTransaction()) {
            u invalidationTracker = getInvalidationTracker();
            if (invalidationTracker.f25944f.compareAndSet(false, true)) {
                invalidationTracker.a.getQueryExecutor().execute(invalidationTracker.f25952n);
            }
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        a();
    }

    public z1.j compileStatement(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return ((a2.h) getOpenHelper()).d().N(sql);
    }

    public abstract u createInvalidationTracker();

    public abstract z1.g createOpenHelper(j jVar);

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        b();
    }

    @JvmSuppressWildcards
    public List<w1.a> getAutoMigrations(Map<Class<Object>, Object> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public u getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public z1.g getOpenHelper() {
        z1.g gVar = this.internalOpenHelper;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return SetsKt.emptySet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.emptyMap();
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    public boolean inTransaction() {
        return ((a2.h) getOpenHelper()).d().Q();
    }

    @CallSuper
    public void init(j configuration) {
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i10 = -1;
            boolean z13 = true;
            if (it.hasNext()) {
                Class<Object> next = it.next();
                int size = configuration.f25905p.size() - 1;
                List list = configuration.f25905p;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(list.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    z13 = false;
                }
                if (z13) {
                    this.autoMigrationSpecs.put(next, list.get(i10));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = configuration.f25905p.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (bitSet.get(size2)) {
                            if (i12 < 0) {
                                break;
                            } else {
                                size2 = i12;
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                    }
                }
                for (w1.a aVar : getAutoMigrations(this.autoMigrationSpecs)) {
                    int i13 = aVar.a;
                    androidx.work.g gVar = configuration.f25893d;
                    HashMap hashMap = gVar.a;
                    if (hashMap.containsKey(Integer.valueOf(i13))) {
                        Map map = (Map) hashMap.get(Integer.valueOf(i13));
                        if (map == null) {
                            map = MapsKt.emptyMap();
                        }
                        z12 = map.containsKey(Integer.valueOf(aVar.f26667b));
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        gVar.a(aVar);
                    }
                }
                z1.g openHelper = getOpenHelper();
                z1.g gVar2 = null;
                if (!m0.class.isInstance(openHelper)) {
                    openHelper = null;
                }
                a4.j.t(openHelper);
                z1.g openHelper2 = getOpenHelper();
                if (b.class.isInstance(openHelper2)) {
                    gVar2 = openHelper2;
                }
                a4.j.t(gVar2);
                if (configuration.f25896g == e0.WRITE_AHEAD_LOGGING) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a2.h hVar = (a2.h) getOpenHelper();
                Lazy lazy = hVar.f73h;
                if (lazy.isInitialized()) {
                    a2.g sQLiteOpenHelper = (a2.g) lazy.getValue();
                    Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
                    sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
                }
                hVar.f74i = z10;
                this.mCallbacks = configuration.f25894e;
                this.internalQueryExecutor = configuration.f25897h;
                this.internalTransactionExecutor = new h.p0(configuration.f25898i, 1);
                this.allowMainThreadQueries = configuration.f25895f;
                this.writeAheadLoggingEnabled = z10;
                if (configuration.f25899j != null) {
                    if (configuration.f25891b != null) {
                        u invalidationTracker = getInvalidationTracker();
                        Context context = configuration.a;
                        String name = configuration.f25891b;
                        Intent serviceIntent = configuration.f25899j;
                        invalidationTracker.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
                        new y(context, name, serviceIntent, invalidationTracker, invalidationTracker.a.getQueryExecutor());
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it2 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    List list2 = configuration.f25904o;
                    if (hasNext) {
                        Map.Entry<Class<?>, List<Class<?>>> next2 = it2.next();
                        Class<?> key = next2.getKey();
                        for (Class<?> cls : next2.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i14 = size3 - 1;
                                    if (cls.isAssignableFrom(list2.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i14 < 0) {
                                        break;
                                    } else {
                                        size3 = i14;
                                    }
                                }
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.typeConverters.put(cls, list2.get(size3));
                            } else {
                                throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                        }
                    } else {
                        int size4 = list2.size() - 1;
                        if (size4 < 0) {
                            return;
                        }
                        while (true) {
                            int i15 = size4 - 1;
                            if (bitSet2.get(size4)) {
                                if (i15 >= 0) {
                                    size4 = i15;
                                } else {
                                    return;
                                }
                            } else {
                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                        }
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(z1.a database) {
        Intrinsics.checkNotNullParameter(database, "db");
        u invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (invalidationTracker.f25951m) {
            if (invalidationTracker.f25945g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.C("PRAGMA temp_store = MEMORY;");
            database.C("PRAGMA recursive_triggers='ON';");
            database.C("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.g(database);
            invalidationTracker.f25946h = database.N("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f25945g = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean isOpenInternal() {
        z1.a aVar = this.mDatabase;
        return aVar != null && aVar.isOpen();
    }

    @JvmOverloads
    public Cursor query(z1.i query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return ((a2.h) getOpenHelper()).d().I(query, cancellationSignal);
        }
        return ((a2.h) getOpenHelper()).d().K(query);
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        ((a2.h) getOpenHelper()).d().F();
    }
}
