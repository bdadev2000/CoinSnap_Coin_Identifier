package com.glority.base.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.utils.UtilsApp;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatusBarUtil.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¨\u0006\u0017"}, d2 = {"Lcom/glority/base/utils/StatusBarUtil;", "", "<init>", "()V", "setImmerseLayout", "", "window", "Landroid/view/Window;", "setStatusBarLightMode", "isLightMode", "", "requestFitSystemWindow", "view", "Landroid/view/View;", "getStatusBarHeight", "", "setFullScreen", "clearFullScreen", "setStatusBarColor", "color", "isDisplayCutout", "context", "Landroid/content/Context;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class StatusBarUtil {
    public static final int $stable = 0;
    public static final StatusBarUtil INSTANCE = new StatusBarUtil();

    private StatusBarUtil() {
    }

    public final void setImmerseLayout(Window window) {
        if (window == null) {
            return;
        }
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public final void setStatusBarLightMode(Window window, boolean isLightMode) {
        if (window == null) {
            return;
        }
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(isLightMode ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public final void requestFitSystemWindow(View view) {
        if (view == null) {
            return;
        }
        view.setPadding(0, getStatusBarHeight(), 0, 0);
    }

    public final void requestFitSystemWindow(Window window) {
        if (window == null) {
            return;
        }
        window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    public final int getStatusBarHeight() {
        int identifier = UtilsApp.getApp().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return (int) ResUtils.getDimension(identifier);
        }
        return 0;
    }

    public final void setFullScreen(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 4);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        window.setAttributes(attributes);
    }

    public final void clearFullScreen(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-5));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = 0;
        window.setAttributes(attributes);
    }

    public final void setStatusBarColor(Window window, int color) {
        if (window == null) {
            return;
        }
        window.setStatusBarColor(color);
    }

    public final boolean isDisplayCutout(Context context) {
        if (context != null) {
            try {
            } catch (Throwable unused) {
                return false;
            }
        }
        return !TextUtils.isEmpty(context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", TypedValues.Custom.S_STRING, "android") > 0 ? r5.getString(r1) : null);
    }
}
