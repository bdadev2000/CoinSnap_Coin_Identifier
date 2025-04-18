package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import p0.a;

/* loaded from: classes3.dex */
public final class DependencyDao_Impl implements DependencyDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f22125a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f22126b;

    /* renamed from: androidx.work.impl.model.DependencyDao_Impl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends EntityInsertionAdapter<Dependency> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            Dependency dependency = (Dependency) obj;
            String str = dependency.f22123a;
            if (str == null) {
                supportSQLiteStatement.a0(1);
            } else {
                supportSQLiteStatement.L(1, str);
            }
            String str2 = dependency.f22124b;
            if (str2 == null) {
                supportSQLiteStatement.a0(2);
            } else {
                supportSQLiteStatement.L(2, str2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.EntityInsertionAdapter, androidx.room.SharedSQLiteStatement] */
    public DependencyDao_Impl(RoomDatabase roomDatabase) {
        this.f22125a = roomDatabase;
        a.s(roomDatabase, "database");
        this.f22126b = new SharedSQLiteStatement(roomDatabase);
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final void a(Dependency dependency) {
        RoomDatabase roomDatabase = this.f22125a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f22126b.e(dependency);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final ArrayList b(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22125a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean c(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22125a;
        roomDatabase.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            if (b2.moveToFirst()) {
                z2 = b2.getInt(0) != 0;
            }
            return z2;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean d(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22125a;
        roomDatabase.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            if (b2.moveToFirst()) {
                z2 = b2.getInt(0) != 0;
            }
            return z2;
        } finally {
            b2.close();
            e.release();
        }
    }
}
