package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.internal.util.x;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements d {
    private static final String AD_ID_KEY = "AD_ID_KEY";
    public static final a Companion = new a(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final x pathProvider;

    public c(Context context, x pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new b(this.context));
        int i10 = m58checkIfSdkUpgraded$lambda3(lazy).getInt("VERSION_CODE", -1);
        if (i10 < 70302) {
            if (i10 < 70000) {
                dropV6Data();
            }
            if (i10 < 70100) {
                dropV700Data();
            }
            if (i10 < 70301) {
                dropV730TempData();
            }
            m58checkIfSdkUpgraded$lambda3(lazy).put("VERSION_CODE", 70302).apply();
        }
    }

    /* renamed from: checkIfSdkUpgraded$lambda-3, reason: not valid java name */
    private static final eh.b m58checkIfSdkUpgraded$lambda3(Lazy<eh.b> lazy) {
        return lazy.getValue();
    }

    private final void dropV6Data() {
        com.vungle.ads.internal.util.v.Companion.d(TAG, "CleanupJob: drop old files data");
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            com.vungle.ads.internal.util.n.delete(file);
            com.vungle.ads.internal.util.n.delete(new File(file.getPath() + "-journal"));
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        String string = this.context.getSharedPreferences("com.vungle.sdk", 0).getString("cache_path", null);
        this.context.deleteSharedPreferences("com.vungle.sdk");
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "{\n            context.noBackupFilesDir\n        }");
        com.vungle.ads.internal.util.n.delete(new File(noBackupFilesDir, "vungle_settings"));
        if (string != null) {
            com.vungle.ads.internal.util.n.delete(new File(string));
        }
    }

    private final void dropV700Data() {
        com.vungle.ads.internal.util.n.delete(new File(this.context.getApplicationInfo().dataDir, "vungle"));
    }

    private final void dropV730TempData() {
        try {
            com.vungle.ads.internal.util.n.delete(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"));
            com.vungle.ads.internal.util.n.delete(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"));
        } catch (Exception unused) {
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final x getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.d
    public int onRunJob(Bundle bundle, j jobRunner) {
        File file;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        File downloadDir = this.pathProvider.getDownloadDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (file = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            file = downloadDir;
        }
        com.vungle.ads.internal.util.v.Companion.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (Intrinsics.areEqual(file, downloadDir)) {
                checkIfSdkUpgraded();
                com.vungle.ads.internal.util.n.deleteContents(file);
                return 0;
            }
            com.vungle.ads.internal.util.n.delete(file);
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
