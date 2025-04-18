package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class SQLiteCopyOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final String f21383a;

    /* renamed from: b, reason: collision with root package name */
    public final File f21384b = null;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f21385c = null;
    public final SupportSQLiteOpenHelper.Factory d;

    public SQLiteCopyOpenHelperFactory(String str, SupportSQLiteOpenHelper.Factory factory) {
        this.f21383a = str;
        this.d = factory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public final SupportSQLiteOpenHelper a(SupportSQLiteOpenHelper.Configuration configuration) {
        return new SQLiteCopyOpenHelper(configuration.f21459a, this.f21383a, this.f21384b, this.f21385c, configuration.f21461c.f21458a, this.d.a(configuration));
    }
}
