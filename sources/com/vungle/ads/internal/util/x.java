package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import u7.AbstractC2817h;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class x {
    private static final String CLEVER_CACHE_FOLDER = "clever_cache";
    public static final w Companion = new w(null);
    private static final String DOWNLOADS_FOLDER = "downloads";
    private static final String JS_FOLDER = "js";
    private static final long UNKNOWN_SIZE = -1;
    private static final String VUNGLE_FOLDER = "vungle_cache";
    private final File cleverCacheDir;
    private final Context context;
    private final File downloadsDir;
    private final File jsDir;
    private final File vungleDir;

    public x(Context context) {
        G7.j.e(context, "context");
        this.context = context;
        File file = new File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, DOWNLOADS_FOLDER);
        this.downloadsDir = file2;
        File file3 = new File(file, JS_FOLDER);
        this.jsDir = file3;
        File file4 = new File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file4;
        for (File file5 : AbstractC2817h.B(file, file2, file3, file4)) {
            if (!file5.exists()) {
                file5.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(String str) {
        G7.j.e(str, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        try {
            return new StatFs(str).getAvailableBytes();
        } catch (IllegalArgumentException e4) {
            v.Companion.w("PathProvider", "Failed to get available bytes " + e4.getMessage());
            return -1L;
        }
    }

    public final File getCleverCacheDir() {
        if (!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    public final Context getContext() {
        return this.context;
    }

    public final File getDownloadDir() {
        if (!this.downloadsDir.exists()) {
            this.downloadsDir.mkdirs();
        }
        return this.downloadsDir;
    }

    public final File getDownloadsDirForAd(String str) {
        if (str != null && str.length() != 0) {
            File downloadDir = getDownloadDir();
            StringBuilder sb = new StringBuilder();
            sb.append(downloadDir.getPath());
            File file = new File(AbstractC2914a.h(sb, File.separator, str));
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    public final File getJsAssetDir(String str) {
        G7.j.e(str, "jsVersion");
        File file = new File(getJsDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getJsDir() {
        if (!this.jsDir.exists()) {
            this.jsDir.mkdirs();
        }
        return this.jsDir;
    }

    public final File getSharedPrefsDir() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        G7.j.d(noBackupFilesDir, "{\n        context.noBackupFilesDir\n    }");
        return noBackupFilesDir;
    }

    public final File getUnclosedAdFile(String str) {
        G7.j.e(str, "name");
        return new File(getSharedPrefsDir(), str);
    }

    public final File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}
