package com.glority.utils.store;

import android.os.Environment;
import com.glority.utils.UtilsApp;
import java.io.File;

/* loaded from: classes9.dex */
public final class PathUtils {
    public static String getRootPath() {
        return Environment.getRootDirectory().getAbsolutePath();
    }

    public static String getDataPath() {
        return Environment.getDataDirectory().getAbsolutePath();
    }

    public static String getDownloadCachePath() {
        return Environment.getDownloadCacheDirectory().getAbsolutePath();
    }

    public static String getInternalAppDataPath() {
        return UtilsApp.getApp().getDataDir().getAbsolutePath();
    }

    public static String getInternalAppCodeCacheDir() {
        return UtilsApp.getApp().getCodeCacheDir().getAbsolutePath();
    }

    public static String getInternalAppCachePath() {
        return UtilsApp.getApp().getCacheDir().getAbsolutePath();
    }

    public static String getInternalAppDbPath() {
        return UtilsApp.getApp().getApplicationInfo().dataDir + "/databases";
    }

    public static String getInternalAppDbPath(String str) {
        return UtilsApp.getApp().getDatabasePath(str).getAbsolutePath();
    }

    public static String getInternalAppFilesPath() {
        return UtilsApp.getApp().getFilesDir().getAbsolutePath();
    }

    public static String getInternalAppSpPath() {
        return UtilsApp.getApp().getApplicationInfo().dataDir + "shared_prefs";
    }

    public static String getInternalAppNoBackupFilesPath() {
        return UtilsApp.getApp().getNoBackupFilesDir().getAbsolutePath();
    }

    public static String getExternalStoragePath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String getExternalMusicPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath();
    }

    public static String getExternalPodcastsPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS).getAbsolutePath();
    }

    public static String getExternalRingtonesPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath();
    }

    public static String getExternalAlarmsPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS).getAbsolutePath();
    }

    public static String getExternalNotificationsPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS).getAbsolutePath();
    }

    public static String getExternalPicturesPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
    }

    public static String getExternalMoviesPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath();
    }

    public static String getExternalDownloadsPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
    }

    public static String getExternalDcimPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
    }

    public static String getExternalDocumentsPath() {
        return isExternalStorageDisable() ? "" : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath();
    }

    public static String getExternalAppDataPath() {
        File externalCacheDir;
        return (isExternalStorageDisable() || (externalCacheDir = UtilsApp.getApp().getExternalCacheDir()) == null) ? "" : externalCacheDir.getParentFile().getAbsolutePath();
    }

    public static String getExternalAppCachePath() {
        File externalCacheDir;
        return (isExternalStorageDisable() || (externalCacheDir = UtilsApp.getApp().getExternalCacheDir()) == null) ? "" : externalCacheDir.getAbsolutePath();
    }

    public static String getExternalAppFilesPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(null).getAbsolutePath();
    }

    public static String getExternalAppMusicPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_MUSIC).getAbsolutePath();
    }

    public static String getExternalAppPodcastsPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_PODCASTS).getAbsolutePath();
    }

    public static String getExternalAppRingtonesPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_RINGTONES).getAbsolutePath();
    }

    public static String getExternalAppAlarmsPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_ALARMS).getAbsolutePath();
    }

    public static String getExternalAppNotificationsPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_NOTIFICATIONS).getAbsolutePath();
    }

    public static String getExternalAppPicturesPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath();
    }

    public static String getExternalAppMoviesPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
    }

    public static String getExternalAppDownloadPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
    }

    public static String getExternalAppDcimPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_DCIM).getAbsolutePath();
    }

    public static String getExternalAppDocumentsPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath();
    }

    public static String getExternalAppObbPath() {
        return isExternalStorageDisable() ? "" : UtilsApp.getApp().getObbDir().getAbsolutePath();
    }

    private static boolean isExternalStorageDisable() {
        return !"mounted".equals(Environment.getExternalStorageState());
    }

    private PathUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
