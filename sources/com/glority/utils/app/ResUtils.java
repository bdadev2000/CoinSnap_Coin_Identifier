package com.glority.utils.app;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.glority.utils.UtilsApp;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class ResUtils {
    public static int[] getIntArray(int i) {
        return UtilsApp.getApp().getResources().getIntArray(i);
    }

    public static CharSequence[] getTextArray(int i) {
        return UtilsApp.getApp().getResources().getTextArray(i);
    }

    public static String[] getStringArray(int i) {
        return UtilsApp.getApp().getResources().getStringArray(i);
    }

    public static int getColor(int i) {
        return UtilsApp.getApp().getResources().getColor(i);
    }

    public static String getString(int i) {
        return UtilsApp.getApp().getResources().getString(i);
    }

    public static String getString(int i, Object... objArr) {
        return UtilsApp.getApp().getResources().getString(i, objArr);
    }

    public static CharSequence getText(int i) {
        return UtilsApp.getApp().getResources().getText(i);
    }

    public static CharSequence getQuantityText(int i, int i2) {
        return UtilsApp.getApp().getResources().getQuantityText(i, i2);
    }

    public static String getQuantityString(int i, int i2) {
        return UtilsApp.getApp().getResources().getQuantityString(i, i2);
    }

    public static String getQuantityString(int i, int i2, Object... objArr) {
        return UtilsApp.getApp().getResources().getQuantityString(i, i2, objArr);
    }

    public static Drawable getDrawable(int i) {
        return UtilsApp.getApp().getResources().getDrawable(i);
    }

    public static Typeface getFont(int i) {
        return UtilsApp.getApp().getResources().getFont(i);
    }

    public static float getDimension(int i) {
        return UtilsApp.getApp().getResources().getDimension(i);
    }

    public static boolean getBoolean(int i) {
        return UtilsApp.getApp().getResources().getBoolean(i);
    }

    public static int getInteger(int i) {
        return UtilsApp.getApp().getResources().getInteger(i);
    }

    public static InputStream openRawResource(int i) {
        return UtilsApp.getApp().getResources().openRawResource(i);
    }

    public static AssetFileDescriptor openRawResourceFd(int i) {
        return UtilsApp.getApp().getResources().openRawResourceFd(i);
    }

    public static AssetManager getAssets() {
        return UtilsApp.getApp().getResources().getAssets();
    }

    private ResUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
