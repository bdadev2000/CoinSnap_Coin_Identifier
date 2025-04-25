package com.glority.android.picturexx.extensions;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: IntegerExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"asFormatted", "", "", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class IntegerExtKt {
    public static final String asFormatted(int i) {
        String str;
        try {
            str = NumberFormat.getInstance(Locale.getDefault()).format(Integer.valueOf(i));
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            str = null;
        }
        return str == null ? String.valueOf(i) : str;
    }
}
