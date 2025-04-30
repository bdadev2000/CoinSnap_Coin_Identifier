package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.internal.util.x;
import f7.C2275b;
import java.io.File;
import java.io.IOException;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class c implements d {
    private static final String AD_ID_KEY = "AD_ID_KEY";
    public static final a Companion = new a(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final x pathProvider;

    public c(Context context, x xVar) {
        G7.j.e(context, "context");
        G7.j.e(xVar, "pathProvider");
        this.context = context;
        this.pathProvider = xVar;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        InterfaceC2717f c9 = AbstractC2712a.c(EnumC2718g.b, new b(this.context));
        int i9 = m78checkIfSdkUpgraded$lambda3(c9).getInt("VERSION_CODE", -1);
        if (i9 < 70302) {
            if (i9 < 70000) {
                dropV6Data();
            }
            if (i9 < 70100) {
                dropV700Data();
            }
            if (i9 < 70301) {
                dropV730TempData();
            }
            m78checkIfSdkUpgraded$lambda3(c9).put("VERSION_CODE", 70302).apply();
        }
    }

    /* renamed from: checkIfSdkUpgraded$lambda-3, reason: not valid java name */
    private static final C2275b m78checkIfSdkUpgraded$lambda3(InterfaceC2717f interfaceC2717f) {
        return (C2275b) interfaceC2717f.getValue();
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
        G7.j.d(noBackupFilesDir, "{\n            context.noBackupFilesDir\n        }");
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
    public int onRunJob(Bundle bundle, j jVar) {
        File file;
        G7.j.e(bundle, "bundle");
        G7.j.e(jVar, "jobRunner");
        File downloadDir = this.pathProvider.getDownloadDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (file = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            file = downloadDir;
        }
        com.vungle.ads.internal.util.v.Companion.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (G7.j.a(file, downloadDir)) {
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
