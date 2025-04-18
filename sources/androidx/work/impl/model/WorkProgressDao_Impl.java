package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import p0.a;

/* loaded from: classes3.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f22142a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f22143b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedSQLiteStatement f22144c;
    public final SharedSQLiteStatement d;

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkProgress> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            WorkProgress workProgress = (WorkProgress) obj;
            String str = workProgress.f22140a;
            if (str == null) {
                supportSQLiteStatement.a0(1);
            } else {
                supportSQLiteStatement.L(1, str);
            }
            byte[] c2 = Data.c(workProgress.f22141b);
            if (c2 == null) {
                supportSQLiteStatement.a0(2);
            } else {
                supportSQLiteStatement.T(2, c2);
            }
        }
    }

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.EntityInsertionAdapter, androidx.room.SharedSQLiteStatement] */
    public WorkProgressDao_Impl(RoomDatabase roomDatabase) {
        this.f22142a = roomDatabase;
        a.s(roomDatabase, "database");
        this.f22143b = new SharedSQLiteStatement(roomDatabase);
        this.f22144c = new SharedSQLiteStatement(roomDatabase);
        this.d = new SharedSQLiteStatement(roomDatabase);
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void a(String str) {
        RoomDatabase roomDatabase = this.f22142a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.f22144c;
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

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void b() {
        RoomDatabase roomDatabase = this.f22142a;
        roomDatabase.assertNotSuspendingTransaction();
        SharedSQLiteStatement sharedSQLiteStatement = this.d;
        SupportSQLiteStatement a2 = sharedSQLiteStatement.a();
        roomDatabase.beginTransaction();
        try {
            a2.k();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            sharedSQLiteStatement.c(a2);
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void c(WorkProgress workProgress) {
        RoomDatabase roomDatabase = this.f22142a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f22143b.e(workProgress);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }
}
