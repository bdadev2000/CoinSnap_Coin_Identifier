package com.glority.utils.ui;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.glority.utils.UtilsApp;

/* loaded from: classes9.dex */
public final class ViewUtils {

    /* loaded from: classes9.dex */
    public interface onGetSizeListener {
        void onGetSize(View view);
    }

    public static int dp2px(float f) {
        return (int) ((f * UtilsApp.getApp().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2dp(float f) {
        return (int) ((f / UtilsApp.getApp().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int sp2px(float f) {
        return (int) ((f * UtilsApp.getApp().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int px2sp(float f) {
        return (int) ((f / UtilsApp.getApp().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void forceGetViewSize(final View view, final onGetSizeListener ongetsizelistener) {
        view.post(new Runnable() { // from class: com.glority.utils.ui.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                onGetSizeListener ongetsizelistener2 = onGetSizeListener.this;
                if (ongetsizelistener2 != null) {
                    ongetsizelistener2.onGetSize(view);
                }
            }
        });
    }

    public static void setAlpha(View view, float f) {
        view.setAlpha(f);
    }

    public static int getScreenWidth() {
        WindowManager windowManager = (WindowManager) UtilsApp.getApp().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getScreenHeight() {
        WindowManager windowManager = (WindowManager) UtilsApp.getApp().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        if (!isShowNavigationBar()) {
            return i;
        }
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static Bitmap captureScreenWithoutStatusBar(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        decorView.setDrawingCacheEnabled(true);
        decorView.buildDrawingCache();
        Bitmap drawingCache = decorView.getDrawingCache();
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache, 0, i, getScreenWidth(), getScreenHeight() - i);
        decorView.destroyDrawingCache();
        return createBitmap;
    }

    public static void showSoftInput(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
            currentFocus.setFocusable(true);
            currentFocus.setFocusableInTouchMode(true);
            currentFocus.requestFocus();
        }
        inputMethodManager.showSoftInput(currentFocus, 2);
    }

    public static void showSoftInput(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) UtilsApp.getApp().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 2);
    }

    public static void hideSoftInput(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static void hideSoftInput(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) UtilsApp.getApp().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void toggleSoftInput() {
        toggleSoftInput(null);
    }

    public static void toggleSoftInput(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) UtilsApp.getApp().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        if (view != null) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
        inputMethodManager.toggleSoftInput(2, 0);
    }

    public static boolean isSoftInputVisible(Activity activity) {
        return isSoftInputVisible(activity, 200);
    }

    public static boolean isSoftInputVisible(Activity activity, int i) {
        return getContentViewInvisibleHeight(activity) >= i;
    }

    private static int getContentViewInvisibleHeight(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(R.id.content)).getChildAt(0);
        Rect rect = new Rect();
        childAt.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getContentViewInvisibleHeight: " + (childAt.getBottom() - rect.bottom));
        return childAt.getBottom() - rect.bottom;
    }

    private ViewUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }

    private static boolean isShowNavigationBar() {
        Resources resources = UtilsApp.getApp().getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        return identifier > 0 && resources.getBoolean(identifier);
    }
}
