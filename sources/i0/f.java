package I0;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: f, reason: collision with root package name */
    public final SQLiteStatement f1407f;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f1407f = sQLiteStatement;
    }

    public final void p() {
        this.f1407f.executeUpdateDelete();
    }
}
