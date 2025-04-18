package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import b1.f0;
import d0.p;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class SharedSQLiteStatement {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f21386a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f21387b;

    /* renamed from: c, reason: collision with root package name */
    public final p f21388c;

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        p0.a.s(roomDatabase, "database");
        this.f21386a = roomDatabase;
        this.f21387b = new AtomicBoolean(false);
        this.f21388c = f0.t(new SharedSQLiteStatement$stmt$2(this));
    }

    public final SupportSQLiteStatement a() {
        RoomDatabase roomDatabase = this.f21386a;
        roomDatabase.assertNotMainThread();
        return this.f21387b.compareAndSet(false, true) ? (SupportSQLiteStatement) this.f21388c.getValue() : roomDatabase.compileStatement(b());
    }

    public abstract String b();

    public final void c(SupportSQLiteStatement supportSQLiteStatement) {
        p0.a.s(supportSQLiteStatement, "statement");
        if (supportSQLiteStatement == ((SupportSQLiteStatement) this.f21388c.getValue())) {
            this.f21387b.set(false);
        }
    }
}
