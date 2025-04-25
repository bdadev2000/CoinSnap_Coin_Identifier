package com.glority.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlProgressDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/glority/widget/GlProgressDialog;", "", "()V", "show", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "cancelable", "", "view", "Landroid/view/View;", "delayDismiss", "", "msgResId", "", NotificationCompat.CATEGORY_MESSAGE, "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlProgressDialog {
    public static final GlProgressDialog INSTANCE = new GlProgressDialog();

    public final Dialog show(Context context, boolean z) {
        return show$default(this, context, z, (String) null, 0L, 12, (Object) null);
    }

    public final Dialog show(Context context, boolean z, int i) {
        return show$default(this, context, z, i, 0L, 8, (Object) null);
    }

    public final Dialog show(Context context, boolean z, View view) {
        return show$default(this, context, z, view, 0L, 8, (Object) null);
    }

    public final Dialog show(Context context, boolean z, String str) {
        return show$default(this, context, z, str, 0L, 8, (Object) null);
    }

    private GlProgressDialog() {
    }

    public static /* synthetic */ Dialog show$default(GlProgressDialog glProgressDialog, Context context, boolean z, int i, long j, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            j = 0;
        }
        return glProgressDialog.show(context, z, i, j);
    }

    public final Dialog show(Context context, boolean cancelable, int msgResId, long delayDismiss) {
        Intrinsics.checkNotNullParameter(context, "context");
        return show(context, cancelable, context.getString(msgResId), delayDismiss);
    }

    public static /* synthetic */ Dialog show$default(GlProgressDialog glProgressDialog, Context context, boolean z, String str, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            j = 0;
        }
        return glProgressDialog.show(context, z, str2, j);
    }

    public final Dialog show(Context context, boolean cancelable, String msg, long delayDismiss) {
        Intrinsics.checkNotNullParameter(context, "context");
        Handler handler = new Handler(Looper.getMainLooper());
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        String str = msg;
        if (str == null || str.length() == 0) {
            builder.setView(R.layout.item_gl_toast_loading);
        } else {
            builder.setView(R.layout.item_gl_toast_loading_with_msg);
        }
        builder.setCancelable(cancelable);
        final AlertDialog show = builder.show();
        TextView textView = (TextView) show.findViewById(R.id.gl_tv);
        if (textView != null) {
            textView.setText(str);
        }
        Intrinsics.checkNotNullExpressionValue(show, "show");
        Window window = show.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        if (cancelable) {
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.dimAmount = 0.0f;
            }
            if (window != null) {
                window.setAttributes(attributes);
            }
        }
        if (delayDismiss > 0) {
            handler.postDelayed(new Runnable() { // from class: com.glority.widget.GlProgressDialog$show$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AlertDialog.this.dismiss();
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        if (AppContext.INSTANCE.isDebugMode()) {
                            LogUtils.e(Log.getStackTraceString(e));
                        }
                    }
                }
            }, delayDismiss);
        }
        return show;
    }

    public static /* synthetic */ Dialog show$default(GlProgressDialog glProgressDialog, Context context, boolean z, View view, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            j = 0;
        }
        return glProgressDialog.show(context, z, view, j);
    }

    public final Dialog show(Context context, boolean cancelable, View view, long delayDismiss) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Handler handler = new Handler(Looper.getMainLooper());
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(view);
        builder.setCancelable(cancelable);
        final AlertDialog show = builder.show();
        Intrinsics.checkNotNullExpressionValue(show, "show");
        Window window = show.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        if (cancelable) {
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.dimAmount = 0.0f;
            }
            if (window != null) {
                window.setAttributes(attributes);
            }
        }
        if (delayDismiss > 0) {
            handler.postDelayed(new Runnable() { // from class: com.glority.widget.GlProgressDialog$show$2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AlertDialog.this.dismiss();
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        if (AppContext.INSTANCE.isDebugMode()) {
                            LogUtils.e(Log.getStackTraceString(e));
                        }
                    }
                }
            }, delayDismiss);
        }
        return show;
    }
}
