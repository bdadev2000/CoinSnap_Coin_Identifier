package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.d;
import android.util.Log;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import p0.a;
import z0.m;

/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class Callback {

        /* renamed from: a, reason: collision with root package name */
        public final int f21458a;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public Callback(int i2) {
            this.f21458a = i2;
        }

        public static void a(String str) {
            if (m.S0(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = a.E(str.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public abstract void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3) {
            throw new SQLiteException(d.k("Can't downgrade database from version ", i2, " to ", i3));
        }

        public void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public abstract void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static final class Configuration {

        /* renamed from: a, reason: collision with root package name */
        public final Context f21459a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21460b;

        /* renamed from: c, reason: collision with root package name */
        public final Callback f21461c;
        public final boolean d;
        public final boolean e;

        /* loaded from: classes.dex */
        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public final Context f21462a;

            /* renamed from: b, reason: collision with root package name */
            public String f21463b;

            /* renamed from: c, reason: collision with root package name */
            public Callback f21464c;
            public boolean d;

            public Builder(Context context) {
                a.s(context, "context");
                this.f21462a = context;
            }

            public final Configuration a() {
                String str;
                Callback callback = this.f21464c;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.d && ((str = this.f21463b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new Configuration(this.f21462a, this.f21463b, callback, this.d);
            }
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public static Builder a(Context context) {
                a.s(context, "context");
                return new Builder(context);
            }
        }

        public Configuration(Context context, String str, Callback callback, boolean z2) {
            a.s(context, "context");
            this.f21459a = context;
            this.f21460b = str;
            this.f21461c = callback;
            this.d = z2;
            this.e = false;
        }
    }

    /* loaded from: classes.dex */
    public interface Factory {
        SupportSQLiteOpenHelper a(Configuration configuration);
    }

    SupportSQLiteDatabase U();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z2);
}
