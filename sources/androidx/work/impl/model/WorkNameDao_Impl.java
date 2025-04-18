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

/* loaded from: classes4.dex */
public final class WorkNameDao_Impl implements WorkNameDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f22138a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f22139b;

    /* renamed from: androidx.work.impl.model.WorkNameDao_Impl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkName> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            WorkName workName = (WorkName) obj;
            String str = workName.f22136a;
            if (str == null) {
                supportSQLiteStatement.a0(1);
            } else {
                supportSQLiteStatement.L(1, str);
            }
            String str2 = workName.f22137b;
            if (str2 == null) {
                supportSQLiteStatement.a0(2);
            } else {
                supportSQLiteStatement.L(2, str2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.EntityInsertionAdapter, androidx.room.SharedSQLiteStatement] */
    public WorkNameDao_Impl(RoomDatabase roomDatabase) {
        this.f22138a = roomDatabase;
        a.s(roomDatabase, "database");
        this.f22139b = new SharedSQLiteStatement(roomDatabase);
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final void a(WorkName workName) {
        RoomDatabase roomDatabase = this.f22138a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f22139b.e(workName);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final ArrayList b(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22138a;
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
}
