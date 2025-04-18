package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
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
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        File file = new File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, DOWNLOADS_FOLDER);
        this.downloadsDir = file2;
        File file3 = new File(file, JS_FOLDER);
        this.jsDir = file3;
        File file4 = new File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file4;
        for (File file5 : CollectionsKt.listOf((Object[]) new File[]{file, file2, file3, file4})) {
            if (!file5.exists()) {
                file5.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new StatFs(path).getAvailableBytes();
        } catch (IllegalArgumentException e2) {
            v.Companion.w("PathProvider", "Failed to get available bytes " + e2.getMessage());
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
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        File downloadDir = getDownloadDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(downloadDir.getPath());
        File file = new File(vd.e.h(sb2, File.separator, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getJsAssetDir(String jsVersion) {
        Intrinsics.checkNotNullParameter(jsVersion, "jsVersion");
        File file = new File(getJsDir(), jsVersion);
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
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "{\n        context.noBackupFilesDir\n    }");
        return noBackupFilesDir;
    }

    public final File getUnclosedAdFile(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new File(getSharedPrefsDir(), name);
    }

    public final File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}
