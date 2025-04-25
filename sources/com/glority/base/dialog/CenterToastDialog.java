package com.glority.base.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bumptech.glide.Glide;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.Args;
import com.glority.base.R;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CenterToastDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ?\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ \u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\t¨\u0006\u0014"}, d2 = {"Lcom/glority/base/dialog/CenterToastDialog;", "", "<init>", "()V", "showToast", "", "context", "Landroid/content/Context;", "icon", "", Args.title, LogEventArguments.ARG_MESSAGE, TypedValues.TransitionType.S_DURATION, "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;I)V", "showCustomToast", "layoutId", "view", "Landroid/view/View;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class CenterToastDialog {
    public static final int $stable = 0;
    public static final CenterToastDialog INSTANCE = new CenterToastDialog();

    private CenterToastDialog() {
    }

    public static /* synthetic */ void showToast$default(CenterToastDialog centerToastDialog, Context context, Integer num, Integer num2, Integer num3, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        centerToastDialog.showToast(context, num, num2, num3, i);
    }

    public final void showToast(Context context, Integer icon, Integer title, Integer message, int duration) {
        showToast(context, icon, title != null ? ResUtils.getString(title.intValue()) : null, message != null ? ResUtils.getString(message.intValue()) : null, duration);
    }

    public static /* synthetic */ void showToast$default(CenterToastDialog centerToastDialog, Context context, Integer num, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        centerToastDialog.showToast(context, num, str, str2, i);
    }

    public final void showToast(Context context, Integer icon, String title, String message, int duration) {
        String str;
        String str2;
        if (context == null) {
            return;
        }
        if (icon == null && (((str = title) == null || str.length() == 0) && ((str2 = message) == null || str2.length() == 0))) {
            LogUtils.e("To show the toast, you must provide at least one of the following information: 'icon', 'title' or 'message'. Otherwise, nothing will happen.");
            return;
        }
        if (duration != 0 && duration != 1) {
            LogUtils.e("To show the toast, parameter 'duration' provided is invalid. Please check it again.");
            return;
        }
        Toast toast = new Toast(context);
        toast.setGravity(17, 0, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_custom_toast, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_toast_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_toast_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_toast_message);
        if (icon != null) {
            imageView.setVisibility(0);
            Intrinsics.checkNotNull(Glide.with(context).load(icon).into(imageView));
        } else {
            imageView.setVisibility(8);
        }
        String str3 = title;
        if (str3 == null || str3.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str3);
            textView.setVisibility(0);
        }
        String str4 = message;
        if (str4 == null || str4.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str4);
        }
        toast.setView(inflate);
        toast.setDuration(duration);
        toast.show();
    }

    public final void showCustomToast(Context context, int layoutId, int duration) {
        if (context == null) {
            return;
        }
        if (duration != 0 && duration != 1) {
            LogUtils.e("To show the toast, parameter 'duration' provided is invalid. Please check it again.");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(layoutId, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate);
        showCustomToast(context, inflate, duration);
    }

    public final void showCustomToast(Context context, View view, int duration) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (context == null) {
            return;
        }
        if (duration != 0 && duration != 1) {
            LogUtils.e("To show the toast, parameter 'duration' provided is invalid. Please check it again.");
            return;
        }
        Toast toast = new Toast(context);
        toast.setGravity(17, 0, 0);
        toast.setView(view);
        toast.setDuration(duration);
        toast.show();
    }
}
