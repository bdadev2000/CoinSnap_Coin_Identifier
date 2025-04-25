package com.glority.utils.ui;

import android.os.Handler;
import android.os.Looper;
import com.glority.utils.UtilsApp;
import com.glority.widget.GlToast;

/* loaded from: classes9.dex */
public final class ToastUtils {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private static final String NULL = "null";
    private static GlToast.BaseGlToastBuilder sToast;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public enum Type {
        normal,
        success,
        notice,
        error
    }

    public static GlToast.GlToastBuilder make(String str) {
        return GlToast.INSTANCE.make(UtilsApp.getApp(), str);
    }

    public static GlToast.GlToastBuilder make(int i) {
        return GlToast.INSTANCE.make(UtilsApp.getApp(), i);
    }

    public static void showShort(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        show(charSequence, 0, Type.normal);
    }

    public static void showShort(int i) {
        show(i, 0, Type.normal);
    }

    public static void showShort(int i, Object... objArr) {
        show(i, 0, Type.normal, objArr);
    }

    public static void showShort(String str, Object... objArr) {
        show(str, 0, Type.normal, objArr);
    }

    public static void showLong(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        show(charSequence, 1, Type.normal);
    }

    public static void showLong(int i) {
        show(i, 1, Type.normal);
    }

    public static void showLong(int i, Object... objArr) {
        show(i, 1, Type.normal, objArr);
    }

    public static void showLong(String str, Object... objArr) {
        show(str, 1, Type.normal, objArr);
    }

    public static void showSuccess(int i, Object... objArr) {
        show(i, 0, Type.success, objArr);
    }

    public static void showNotice(int i, Object... objArr) {
        show(i, 0, Type.notice, objArr);
    }

    public static void showError(int i, Object... objArr) {
        show(i, 0, Type.error, objArr);
    }

    public static void showSuccess(String str, Object... objArr) {
        show(str, 0, Type.success, objArr);
    }

    public static void showNotice(String str, Object... objArr) {
        show(str, 0, Type.notice, objArr);
    }

    public static void showError(String str, Object... objArr) {
        show(str, 0, Type.error, objArr);
    }

    public static void cancel() {
        GlToast.BaseGlToastBuilder baseGlToastBuilder = sToast;
        if (baseGlToastBuilder != null) {
            baseGlToastBuilder.cancel();
        }
    }

    private static void show(int i, int i2, Type type) {
        show(UtilsApp.getApp().getResources().getText(i).toString(), i2, type);
    }

    private static void show(int i, int i2, Type type, Object... objArr) {
        show(String.format(UtilsApp.getApp().getResources().getString(i), objArr), i2, type);
    }

    private static void show(String str, int i, Type type, Object... objArr) {
        String format;
        String str2 = "null";
        if (str != null && (format = String.format(str, objArr)) != null) {
            str2 = format;
        }
        show(str2, i, type);
    }

    private static void show(final CharSequence charSequence, final int i, final Type type) {
        HANDLER.post(new Runnable() { // from class: com.glority.utils.ui.ToastUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ToastUtils.cancel();
                if (Type.this == Type.success) {
                    GlToast.BaseGlToastBuilder unused = ToastUtils.sToast = GlToast.INSTANCE.makeSuccessful(UtilsApp.getApp(), charSequence.toString());
                } else if (Type.this == Type.error) {
                    GlToast.BaseGlToastBuilder unused2 = ToastUtils.sToast = GlToast.INSTANCE.makeError(UtilsApp.getApp(), charSequence.toString());
                } else if (Type.this == Type.notice) {
                    GlToast.BaseGlToastBuilder unused3 = ToastUtils.sToast = GlToast.INSTANCE.makeNotice(UtilsApp.getApp(), charSequence.toString());
                } else {
                    GlToast.BaseGlToastBuilder unused4 = ToastUtils.sToast = GlToast.INSTANCE.make(UtilsApp.getApp(), charSequence.toString());
                }
                ToastUtils.sToast.show(i == 0 ? GlToast.Duration.SHORT : GlToast.Duration.LONG);
            }
        });
    }

    private ToastUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
