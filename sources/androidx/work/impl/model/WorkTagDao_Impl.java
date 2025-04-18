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

/* loaded from: classes2.dex */
public final class WorkTagDao_Impl implements WorkTagDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f22173a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f22174b;

    /* renamed from: androidx.work.impl.model.WorkTagDao_Impl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkTag> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            WorkTag workTag = (WorkTag) obj;
            String str = workTag.f22171a;
            if (str == null) {
                supportSQLiteStatement.a0(1);
            } else {
                supportSQLiteStatement.L(1, str);
            }
            String str2 = workTag.f22172b;
            if (str2 == null) {
                supportSQLiteStatement.a0(2);
            } else {
                supportSQLiteStatement.L(2, str2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.EntityInsertionAdapter, androidx.room.SharedSQLiteStatement] */
    public WorkTagDao_Impl(RoomDatabase roomDatabase) {
        this.f22173a = roomDatabase;
        a.s(roomDatabase, "database");
        this.f22174b = new SharedSQLiteStatement(roomDatabase);
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public final ArrayList a(String str) {
        RoomSQLiteQuery e = RoomSQLiteQuery.e(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            e.a0(1);
        } else {
            e.L(1, str);
        }
        RoomDatabase roomDatabase = this.f22173a;
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

    @Override // androidx.work.impl.model.WorkTagDao
    public final void b(WorkTag workTag) {
        RoomDatabase roomDatabase = this.f22173a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f22174b.e(workTag);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }
}
