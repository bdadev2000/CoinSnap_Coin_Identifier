package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import p0.a;

/* loaded from: classes3.dex */
public final class PreferenceDao_Impl implements PreferenceDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f22129a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f22130b;

    /* renamed from: androidx.work.impl.model.PreferenceDao_Impl$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends EntityInsertionAdapter<Preference> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            Preference preference = (Preference) obj;
            String str = preference.f22127a;
            if (str == null) {
                supportSQLiteStatement.a0(1);
            } else {
                supportSQLiteStatement.L(1, str);
            }
            Long l2 = preference.f22128b;
            if (l2 == null) {
                supportSQLiteStatement.a0(2);
            } else {
                supportSQLiteStatement.Q(2, l2.longValue());
            }
        }
    }

    /* renamed from: androidx.work.impl.model.PreferenceDao_Impl$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements Callable<Long> {
        @Override // java.util.concurrent.Callable
        public final Long call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.EntityInsertionAdapter, androidx.room.SharedSQLiteStatement] */
    public PreferenceDao_Impl(WorkDatabase workDatabase) {
        this.f22129a = workDatabase;
        a.s(workDatabase, "database");
        this.f22130b = new SharedSQLiteStatement(workDatabase);
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final void a(Preference preference) {
        RoomDatabase roomDatabase = this.f22129a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f22130b.e(preference);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final Long b(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT long_value FROM Preference where `key`=?");
        e.L(1, str);
        RoomDatabase roomDatabase = this.f22129a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            Long l2 = null;
            if (b2.moveToFirst() && !b2.isNull(0)) {
                l2 = Long.valueOf(b2.getLong(0));
            }
            return l2;
        } finally {
            b2.close();
            e.release();
        }
    }
}
