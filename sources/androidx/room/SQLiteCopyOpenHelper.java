package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import com.facebook.appevents.UserDataStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.q;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes3.dex */
public final class SQLiteCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21375a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21376b;

    /* renamed from: c, reason: collision with root package name */
    public final File f21377c;
    public final Callable d;

    /* renamed from: f, reason: collision with root package name */
    public final int f21378f;

    /* renamed from: g, reason: collision with root package name */
    public final SupportSQLiteOpenHelper f21379g;

    /* renamed from: h, reason: collision with root package name */
    public DatabaseConfiguration f21380h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21381i;

    public SQLiteCopyOpenHelper(Context context, String str, File file, Callable callable, int i2, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        p0.a.s(context, "context");
        p0.a.s(supportSQLiteOpenHelper, "delegate");
        this.f21375a = context;
        this.f21376b = str;
        this.f21377c = file;
        this.d = callable;
        this.f21378f = i2;
        this.f21379g = supportSQLiteOpenHelper;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase U() {
        if (!this.f21381i) {
            e(true);
            this.f21381i = true;
        }
        return this.f21379g.U();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final SupportSQLiteOpenHelper a() {
        return this.f21379g;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory, java.lang.Object] */
    public final void c(File file, boolean z2) {
        ReadableByteChannel newChannel;
        Context context = this.f21375a;
        String str = this.f21376b;
        if (str != null) {
            newChannel = Channels.newChannel(context.getAssets().open(str));
            p0.a.r(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else {
            File file2 = this.f21377c;
            if (file2 != null) {
                newChannel = new FileInputStream(file2).getChannel();
                p0.a.r(newChannel, "FileInputStream(copyFromFile).channel");
            } else {
                Callable callable = this.d;
                if (callable == null) {
                    throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
                }
                try {
                    newChannel = Channels.newChannel((InputStream) callable.call());
                    p0.a.r(newChannel, "newChannel(inputStream)");
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        p0.a.r(channel, AgentOptions.OUTPUT);
        try {
            channel.transferFrom(newChannel, 0L, Long.MAX_VALUE);
            channel.force(false);
            newChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            DatabaseConfiguration databaseConfiguration = this.f21380h;
            if (databaseConfiguration == null) {
                p0.a.B0("databaseConfiguration");
                throw null;
            }
            if (databaseConfiguration.f21261o != null) {
                try {
                    final int c2 = DBUtil.c(createTempFile);
                    ?? obj = new Object();
                    SupportSQLiteOpenHelper.Configuration.Builder a2 = SupportSQLiteOpenHelper.Configuration.Companion.a(context);
                    a2.f21463b = createTempFile.getAbsolutePath();
                    final int i2 = c2 >= 1 ? c2 : 1;
                    a2.f21464c = new SupportSQLiteOpenHelper.Callback(i2) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                        public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
                        }

                        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                        public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
                            int i3 = c2;
                            if (i3 < 1) {
                                frameworkSQLiteDatabase.K(i3);
                            }
                        }

                        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                        public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i3, int i4) {
                        }
                    };
                    SupportSQLiteOpenHelper a3 = obj.a(a2.a());
                    try {
                        SupportSQLiteDatabase U = z2 ? ((FrameworkSQLiteOpenHelper) a3).U() : ((FrameworkSQLiteOpenHelper) a3).a();
                        DatabaseConfiguration databaseConfiguration2 = this.f21380h;
                        if (databaseConfiguration2 == null) {
                            p0.a.B0("databaseConfiguration");
                            throw null;
                        }
                        p0.a.p(databaseConfiguration2.f21261o);
                        p0.a.s(U, UserDataStore.DATE_OF_BIRTH);
                        q.b(a3, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            q.b(a3, th);
                            throw th2;
                        }
                    }
                } catch (IOException e2) {
                    throw new RuntimeException("Malformed database file, unable to read version.", e2);
                }
            }
            if (createTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th3) {
            newChannel.close();
            channel.close();
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f21379g.close();
        this.f21381i = false;
    }

    public final void e(boolean z2) {
        String databaseName = this.f21379g.getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Context context = this.f21375a;
        File databasePath = context.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.f21380h;
        if (databaseConfiguration == null) {
            p0.a.B0("databaseConfiguration");
            throw null;
        }
        File filesDir = context.getFilesDir();
        boolean z3 = databaseConfiguration.f21264r;
        ProcessLock processLock = new ProcessLock(databaseName, filesDir, z3);
        try {
            processLock.a(z3);
            if (!databasePath.exists()) {
                try {
                    c(databasePath, z2);
                    processLock.b();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                int c2 = DBUtil.c(databasePath);
                int i2 = this.f21378f;
                if (c2 == i2) {
                    processLock.b();
                    return;
                }
                DatabaseConfiguration databaseConfiguration2 = this.f21380h;
                if (databaseConfiguration2 == null) {
                    p0.a.B0("databaseConfiguration");
                    throw null;
                }
                if (databaseConfiguration2.a(c2, i2)) {
                    processLock.b();
                    return;
                }
                if (context.deleteDatabase(databaseName)) {
                    try {
                        c(databasePath, z2);
                    } catch (IOException e2) {
                        Log.w("ROOM", "Unable to copy database file.", e2);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                processLock.b();
                return;
            } catch (IOException e3) {
                Log.w("ROOM", "Unable to read database version.", e3);
                processLock.b();
                return;
            }
        } catch (Throwable th) {
            processLock.b();
            throw th;
        }
        processLock.b();
        throw th;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.f21379g.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        this.f21379g.setWriteAheadLoggingEnabled(z2);
    }
}
