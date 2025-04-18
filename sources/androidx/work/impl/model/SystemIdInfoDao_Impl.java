package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import p0.a;

/* loaded from: classes3.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f22133a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f22134b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedSQLiteStatement f22135c;

    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends EntityInsertionAdapter<SystemIdInfo> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            String str = ((SystemIdInfo) obj).f22131a;
            if (str == null) {
                supportSQLiteStatement.a0(1);
            } else {
                supportSQLiteStatement.L(1, str);
            }
            supportSQLiteStatement.Q(2, r4.f22132b);
        }
    }

    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.EntityInsertionAdapter, androidx.room.SharedSQLiteStatement] */
    public SystemIdInfoDao_Impl(RoomDatabase roomDatabase) {
        this.f22133a = roomDatabase;
        a.s(roomDatabase, "database");
        this.f22134b = new SharedSQLiteStatement(roomDatabase);
        this.f22135c = new SharedSQLiteStatement(roomDatabase);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final SystemIdInfo a(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22133a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor b2 = DBUtil.b(roomDatabase, e, false);
        try {
            return b2.moveToFirst() ? new SystemIdInfo(b2.getString(CursorUtil.b(b2, "work_spec_id")), b2.getInt(CursorUtil.b(b2, "system_id"))) : null;
        } finally {
            b2.close();
            e.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final ArrayList b() {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        RoomDatabase roomDatabase = this.f22133a;
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

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void c(SystemIdInfo systemIdInfo) {
        RoomDatabase roomDatabase = this.f22133a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f22134b.e(systemIdInfo);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void d(String str) {
        RoomDatabase roomDatabase = this.f22133a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.f22135c;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        if (str == null) {
            a2.a0(1);
        } else {
            a2.L(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            a2.k();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }
}
