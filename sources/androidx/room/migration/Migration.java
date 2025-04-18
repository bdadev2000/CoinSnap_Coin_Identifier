package androidx.room.migration;

import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* loaded from: classes4.dex */
public abstract class Migration {

    /* renamed from: a, reason: collision with root package name */
    public final int f21411a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21412b;

    public Migration(int i2, int i3) {
        this.f21411a = i2;
        this.f21412b = i3;
    }

    public abstract void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase);
}
