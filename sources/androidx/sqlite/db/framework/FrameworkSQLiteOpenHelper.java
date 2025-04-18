package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import b1.f0;
import com.facebook.appevents.UserDataStore;
import d0.p;
import d0.x;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21470b;

    /* renamed from: c, reason: collision with root package name */
    public final SupportSQLiteOpenHelper.Callback f21471c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21472f;

    /* renamed from: g, reason: collision with root package name */
    public final p f21473g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21474h;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static final class DBRefHolder {

        /* renamed from: a, reason: collision with root package name */
        public FrameworkSQLiteDatabase f21475a = null;
    }

    /* loaded from: classes.dex */
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f21476i = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Context f21477a;

        /* renamed from: b, reason: collision with root package name */
        public final DBRefHolder f21478b;

        /* renamed from: c, reason: collision with root package name */
        public final SupportSQLiteOpenHelper.Callback f21479c;
        public final boolean d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f21480f;

        /* renamed from: g, reason: collision with root package name */
        public final ProcessLock f21481g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f21482h;

        /* loaded from: classes.dex */
        public static final class CallbackException extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            public final CallbackName f21483a;

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f21484b;

            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                this.f21483a = callbackName;
                this.f21484b = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f21484b;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes.dex */
        public static final class CallbackName {

            /* renamed from: a, reason: collision with root package name */
            public static final CallbackName f21485a;

            /* renamed from: b, reason: collision with root package name */
            public static final CallbackName f21486b;

            /* renamed from: c, reason: collision with root package name */
            public static final CallbackName f21487c;
            public static final CallbackName d;

            /* renamed from: f, reason: collision with root package name */
            public static final CallbackName f21488f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ CallbackName[] f21489g;

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName] */
            static {
                ?? r02 = new Enum("ON_CONFIGURE", 0);
                f21485a = r02;
                ?? r1 = new Enum("ON_CREATE", 1);
                f21486b = r1;
                ?? r2 = new Enum("ON_UPGRADE", 2);
                f21487c = r2;
                ?? r3 = new Enum("ON_DOWNGRADE", 3);
                d = r3;
                ?? r4 = new Enum("ON_OPEN", 4);
                f21488f = r4;
                f21489g = new CallbackName[]{r02, r1, r2, r3, r4};
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) f21489g.clone();
            }
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public static FrameworkSQLiteDatabase a(DBRefHolder dBRefHolder, SQLiteDatabase sQLiteDatabase) {
                p0.a.s(dBRefHolder, "refHolder");
                p0.a.s(sQLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = dBRefHolder.f21475a;
                if (frameworkSQLiteDatabase != null && p0.a.g(frameworkSQLiteDatabase.f21467a, sQLiteDatabase)) {
                    return frameworkSQLiteDatabase;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sQLiteDatabase);
                dBRefHolder.f21475a = frameworkSQLiteDatabase2;
                return frameworkSQLiteDatabase2;
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final DBRefHolder dBRefHolder, final SupportSQLiteOpenHelper.Callback callback, boolean z2) {
            super(context, str, null, callback.f21458a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.b
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i2 = FrameworkSQLiteOpenHelper.OpenHelper.f21476i;
                    p0.a.s(SupportSQLiteOpenHelper.Callback.this, "$callback");
                    FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder2 = dBRefHolder;
                    p0.a.s(dBRefHolder2, "$dbRef");
                    p0.a.r(sQLiteDatabase, "dbObj");
                    FrameworkSQLiteDatabase a2 = FrameworkSQLiteOpenHelper.OpenHelper.Companion.a(dBRefHolder2, sQLiteDatabase);
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + a2 + ".path");
                    SQLiteDatabase sQLiteDatabase2 = a2.f21467a;
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            SupportSQLiteOpenHelper.Callback.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = sQLiteDatabase2.getAttachedDbs();
                        } finally {
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    p0.a.r(obj, "p.second");
                                    SupportSQLiteOpenHelper.Callback.a((String) obj);
                                }
                            } else {
                                String path2 = sQLiteDatabase2.getPath();
                                if (path2 != null) {
                                    SupportSQLiteOpenHelper.Callback.a(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        a2.close();
                    } catch (IOException unused2) {
                        if (list != null) {
                            return;
                        }
                    }
                }
            });
            p0.a.s(context, "context");
            p0.a.s(callback, "callback");
            this.f21477a = context;
            this.f21478b = dBRefHolder;
            this.f21479c = callback;
            this.d = z2;
            if (str == null) {
                str = UUID.randomUUID().toString();
                p0.a.r(str, "randomUUID().toString()");
            }
            this.f21481g = new ProcessLock(str, context.getCacheDir(), false);
        }

        public final SupportSQLiteDatabase a(boolean z2) {
            ProcessLock processLock = this.f21481g;
            try {
                processLock.a((this.f21482h || getDatabaseName() == null) ? false : true);
                this.f21480f = false;
                SQLiteDatabase h2 = h(z2);
                if (!this.f21480f) {
                    FrameworkSQLiteDatabase c2 = c(h2);
                    processLock.b();
                    return c2;
                }
                close();
                SupportSQLiteDatabase a2 = a(z2);
                processLock.b();
                return a2;
            } catch (Throwable th) {
                processLock.b();
                throw th;
            }
        }

        public final FrameworkSQLiteDatabase c(SQLiteDatabase sQLiteDatabase) {
            p0.a.s(sQLiteDatabase, "sqLiteDatabase");
            return Companion.a(this.f21478b, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            ProcessLock processLock = this.f21481g;
            try {
                processLock.a(processLock.f21497a);
                super.close();
                this.f21478b.f21475a = null;
                this.f21482h = false;
            } finally {
                processLock.b();
            }
        }

        public final SQLiteDatabase e(boolean z2) {
            if (z2) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                p0.a.r(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            p0.a.r(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase h(boolean z2) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z3 = this.f21482h;
            Context context = this.f21477a;
            if (databaseName != null && !z3 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return e(z2);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return e(z2);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        int ordinal = callbackException.f21483a.ordinal();
                        Throwable th2 = callbackException.f21484b;
                        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                            throw th2;
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else {
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                        if (databaseName == null || !this.d) {
                            throw th;
                        }
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return e(z2);
                    } catch (CallbackException e) {
                        throw e.f21484b;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            p0.a.s(sQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
            boolean z2 = this.f21480f;
            SupportSQLiteOpenHelper.Callback callback = this.f21479c;
            if (!z2 && callback.f21458a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                callback.b(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f21485a, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            p0.a.s(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f21479c.c(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f21486b, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            p0.a.s(sQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
            this.f21480f = true;
            try {
                this.f21479c.d(c(sQLiteDatabase), i2, i3);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.d, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            p0.a.s(sQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
            if (!this.f21480f) {
                try {
                    this.f21479c.e(c(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.f21488f, th);
                }
            }
            this.f21482h = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            p0.a.s(sQLiteDatabase, "sqLiteDatabase");
            this.f21480f = true;
            try {
                this.f21479c.f(c(sQLiteDatabase), i2, i3);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f21487c, th);
            }
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z2, boolean z3) {
        p0.a.s(context, "context");
        p0.a.s(callback, "callback");
        this.f21469a = context;
        this.f21470b = str;
        this.f21471c = callback;
        this.d = z2;
        this.f21472f = z3;
        this.f21473g = f0.t(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase U() {
        return ((OpenHelper) this.f21473g.getValue()).a(true);
    }

    public final SupportSQLiteDatabase a() {
        return ((OpenHelper) this.f21473g.getValue()).a(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21473g.f30142b != x.f30144a) {
            ((OpenHelper) this.f21473g.getValue()).close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.f21470b;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        if (this.f21473g.f30142b != x.f30144a) {
            OpenHelper openHelper = (OpenHelper) this.f21473g.getValue();
            p0.a.s(openHelper, "sQLiteOpenHelper");
            openHelper.setWriteAheadLoggingEnabled(z2);
        }
        this.f21474h = z2;
    }
}
