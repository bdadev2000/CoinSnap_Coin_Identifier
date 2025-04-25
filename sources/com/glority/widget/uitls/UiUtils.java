package com.glority.widget.uitls;

import android.content.Context;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.glority.widget.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/glority/widget/uitls/UiUtils;", "", "()V", "getColorAccent", "", "context", "Landroid/content/Context;", "getStatusBarHeight", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class UiUtils {
    public static final UiUtils INSTANCE = new UiUtils();

    private UiUtils() {
    }

    public final int getStatusBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return (int) context.getResources().getDimension(identifier);
        }
        return 0;
    }

    public final int getColorAccent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                return ContextCompat.getColor(context, typedValue.resourceId);
            } catch (Throwable unused) {
                TypedValue typedValue2 = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue2, true);
                return ContextCompat.getColor(context, typedValue2.resourceId);
            }
        } catch (Throwable unused2) {
            return ContextCompat.getColor(context, R.color.gl_error);
        }
    }
}
