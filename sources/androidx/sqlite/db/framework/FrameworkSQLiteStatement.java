package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;

/* loaded from: classes4.dex */
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f21492b;

    public FrameworkSQLiteStatement(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f21492b = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long I() {
        return this.f21492b.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long J() {
        return this.f21492b.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        this.f21492b.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int k() {
        return this.f21492b.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final String t() {
        return this.f21492b.simpleQueryForString();
    }
}
