package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import com.facebook.appevents.UserDataStore;
import java.util.concurrent.TimeUnit;
import p0.a;

@TypeConverters
@Database
@RestrictTo
/* loaded from: classes2.dex */
public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    public static final long f21948a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21949b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.WorkDatabase$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 extends RoomDatabase.Callback {
        @Override // androidx.room.RoomDatabase.Callback
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
            supportSQLiteDatabase.d();
            try {
                int i2 = WorkDatabase.f21949b;
                supportSQLiteDatabase.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f21948a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                supportSQLiteDatabase.m();
            } finally {
                supportSQLiteDatabase.x();
            }
        }
    }

    public abstract DependencyDao c();

    public abstract PreferenceDao d();

    public abstract SystemIdInfoDao e();

    public abstract WorkNameDao f();

    public abstract WorkProgressDao g();

    public abstract WorkSpecDao h();

    public abstract WorkTagDao i();
}
