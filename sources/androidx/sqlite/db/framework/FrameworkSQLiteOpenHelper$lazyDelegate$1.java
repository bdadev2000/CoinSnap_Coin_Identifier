package androidx.sqlite.db.framework;

import android.content.Context;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameworkSQLiteOpenHelper f21490a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.f21490a = frameworkSQLiteOpenHelper;
    }

    @Override // q0.a
    public final Object invoke() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = this.f21490a;
        if (frameworkSQLiteOpenHelper.f21470b == null || !frameworkSQLiteOpenHelper.d) {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.f21469a, frameworkSQLiteOpenHelper.f21470b, new FrameworkSQLiteOpenHelper.DBRefHolder(), frameworkSQLiteOpenHelper.f21471c, frameworkSQLiteOpenHelper.f21472f);
        } else {
            Context context = frameworkSQLiteOpenHelper.f21469a;
            p0.a.s(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            p0.a.r(noBackupFilesDir, "context.noBackupFilesDir");
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.f21469a, new File(noBackupFilesDir, frameworkSQLiteOpenHelper.f21470b).getAbsolutePath(), new FrameworkSQLiteOpenHelper.DBRefHolder(), frameworkSQLiteOpenHelper.f21471c, frameworkSQLiteOpenHelper.f21472f);
        }
        openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.f21474h);
        return openHelper;
    }
}
