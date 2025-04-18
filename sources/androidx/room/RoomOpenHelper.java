package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import com.facebook.appevents.UserDataStore;
import com.safedk.android.utils.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;

@RestrictTo
/* loaded from: classes3.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    /* renamed from: b, reason: collision with root package name */
    public DatabaseConfiguration f21363b;

    /* renamed from: c, reason: collision with root package name */
    public final Delegate f21364c;
    public final String d;
    public final String e;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @RestrictTo
    /* loaded from: classes3.dex */
    public static abstract class Delegate {
        public final int version;

        public Delegate(int i2) {
            this.version = i2;
        }

        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            validateMigration(supportSQLiteDatabase);
            return new ValidationResult(true, null);
        }

        @d0.a
        public void validateMigration(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
            p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @RestrictTo
    /* loaded from: classes3.dex */
    public static class ValidationResult {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21365a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21366b;

        public ValidationResult(boolean z2, String str) {
            this.f21365a = z2;
            this.f21366b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str, String str2) {
        super(delegate.version);
        p0.a.s(databaseConfiguration, i.f30073c);
        this.f21363b = databaseConfiguration;
        this.f21364c = delegate;
        this.d = str;
        this.e = str2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        Cursor W = frameworkSQLiteDatabase.W("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (W.moveToFirst()) {
                if (W.getInt(0) == 0) {
                    z2 = true;
                }
            }
            q.b(W, null);
            Delegate delegate = this.f21364c;
            delegate.createAllTables(frameworkSQLiteDatabase);
            if (!z2) {
                ValidationResult onValidateSchema = delegate.onValidateSchema(frameworkSQLiteDatabase);
                if (!onValidateSchema.f21365a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f21366b);
                }
            }
            g(frameworkSQLiteDatabase);
            delegate.onCreate(frameworkSQLiteDatabase);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q.b(W, th);
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3) {
        f(frameworkSQLiteDatabase, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.sqlite.db.framework.FrameworkSQLiteDatabase r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.W(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r6 = move-exception
            goto L8c
        L18:
            r1 = r2
        L19:
            r3 = 0
            kotlin.jvm.internal.q.b(r0, r3)
            androidx.room.RoomOpenHelper$Delegate r0 = r5.f21364c
            if (r1 == 0) goto L62
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.A(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L39
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L37
            goto L3a
        L37:
            r6 = move-exception
            goto L5c
        L39:
            r2 = r3
        L3a:
            kotlin.jvm.internal.q.b(r1, r3)
            java.lang.String r1 = r5.d
            boolean r4 = p0.a.g(r1, r2)
            if (r4 != 0) goto L70
            java.lang.String r4 = r5.e
            boolean r4 = p0.a.g(r4, r2)
            if (r4 == 0) goto L4e
            goto L70
        L4e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r3 = ", found: "
            java.lang.String r0 = androidx.compose.foundation.text.input.a.l(r0, r1, r3, r2)
            r6.<init>(r0)
            throw r6
        L5c:
            throw r6     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            kotlin.jvm.internal.q.b(r1, r6)
            throw r0
        L62:
            androidx.room.RoomOpenHelper$ValidationResult r1 = r0.onValidateSchema(r6)
            boolean r2 = r1.f21365a
            if (r2 == 0) goto L76
            r0.onPostMigrate(r6)
            r5.g(r6)
        L70:
            r0.onOpen(r6)
            r5.f21363b = r3
            return
        L76:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f21366b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L8c:
            throw r6     // Catch: java.lang.Throwable -> L8d
        L8d:
            r1 = move-exception
            kotlin.jvm.internal.q.b(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomOpenHelper.e(androidx.sqlite.db.framework.FrameworkSQLiteDatabase):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003b A[EDGE_INSN: B:61:0x003b->B:44:0x003b BREAK  A[LOOP:1: B:23:0x0025->B:45:?], SYNTHETIC] */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.sqlite.db.framework.FrameworkSQLiteDatabase r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomOpenHelper.f(androidx.sqlite.db.framework.FrameworkSQLiteDatabase, int, int):void");
    }

    public final void g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.d;
        p0.a.s(str, "hash");
        frameworkSQLiteDatabase.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
